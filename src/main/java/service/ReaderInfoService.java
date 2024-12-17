package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ReaderInfoRepository;
import pojo.ReaderInfo;

import java.util.List;
import java.util.Optional;

@Service
public class ReaderInfoService {

    @Autowired
    private ReaderInfoRepository readerInfoRepository;

    public List<ReaderInfo> findAll() {
        return readerInfoRepository.findAll();
    }

    public Optional<ReaderInfo> findById(int id) {
        return readerInfoRepository.findById(id);
    }

    public ReaderInfo save(ReaderInfo readerInfo) {
        return readerInfoRepository.save(readerInfo);
    }

    public void deleteById(int id) {
        readerInfoRepository.deleteById(id);
    }
}