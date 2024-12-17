package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LendRepository;
import pojo.Lend;

import java.util.List;
import java.util.Optional;

@Service
public class LendService {

    @Autowired
    private LendRepository lendRepository;

    public List<Lend> findAll() {
        return lendRepository.findAll();
    }

    public Optional<Lend> findById(Long id) {
        return lendRepository.findById(id);
    }

    public Lend save(Lend lend) {
        return lendRepository.save(lend);
    }

    public void deleteById(Long id) {
        lendRepository.deleteById(id);
    }
}