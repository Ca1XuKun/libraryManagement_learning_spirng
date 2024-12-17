package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ReaderCardRepository;
import pojo.ReaderCard;

import java.util.List;
import java.util.Optional;

@Service
public class ReaderCardService {

    @Autowired
    private ReaderCardRepository readerCardRepository;

    public List<ReaderCard> findAll() {
        return readerCardRepository.findAll();
    }

    public Optional<ReaderCard> findById(int id) {
        return readerCardRepository.findById(id);
    }

    public ReaderCard save(ReaderCard readerCard) {
        return readerCardRepository.save(readerCard);
    }

    public void deleteById(int id) {
        readerCardRepository.deleteById(id);
    }
}