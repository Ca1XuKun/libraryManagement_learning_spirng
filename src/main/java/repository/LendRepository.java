package repository;

import pojo.Lend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LendRepository extends JpaRepository<Lend, Long> {
    List<Lend> findByBookId(long bookId);
    List<Lend> findByReaderId(int readerId);
    long countByBookId(long bookId);
    long countByReaderId(int readerId);
}