package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.LendService;
import pojo.Lend;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lends")
public class LendController {

    @Autowired
    private LendService lendService;

    @GetMapping
    public ResponseEntity<List<Lend>> getAllLends() {
        List<Lend> lends = lendService.findAll();
        return ResponseEntity.ok(lends);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lend> getLendById(@PathVariable Long id) {
        Optional<Lend> lend = lendService.findById(id);
        return lend.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Lend> createLend(@RequestBody Lend lend) {
        Lend savedLend = lendService.save(lend);
        return ResponseEntity.ok(savedLend);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLend(@PathVariable Long id) {
        lendService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}