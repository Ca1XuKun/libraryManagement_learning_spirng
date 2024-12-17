package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ReaderInfoService;
import pojo.ReaderInfo;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/readerinfo")
public class ReaderInfoController {

    @Autowired
    private ReaderInfoService readerInfoService;

    @GetMapping
    public ResponseEntity<List<ReaderInfo>> getAllReaderInfo() {
        List<ReaderInfo> readerInfoList = readerInfoService.findAll();
        return ResponseEntity.ok(readerInfoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReaderInfo> getReaderInfoById(@PathVariable int id) {
        Optional<ReaderInfo> readerInfo = readerInfoService.findById(id);
        return readerInfo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ReaderInfo> createReaderInfo(@RequestBody ReaderInfo readerInfo) {
        ReaderInfo savedReaderInfo = readerInfoService.save(readerInfo);
        return ResponseEntity.ok(savedReaderInfo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReaderInfo(@PathVariable int id) {
        readerInfoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}