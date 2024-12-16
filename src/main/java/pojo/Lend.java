package pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

import  pojo.Lend;
@Entity
@Table(name = "lend")
public class Lend implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "sernum")
        private long sernum;

        @Column(name = "book_id")
        private long bookId;

        @Column(name = "reader_id")
        private int readerId;

        @Column(name = "lend_date")
        private Date lendDate;

        @Column(name = "back_date")
        private Date backDate;

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }

    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    public void setSernum(long sernum) {
        this.sernum = sernum;
    }

    public int getReaderId() {
        return readerId;
    }

    public long getBookId() {
        return bookId;
    }

    public Date getBackDate() {
        return backDate;
    }

    public Date getLendDate() {
        return lendDate;
    }

    public long getSernum() {
        return sernum;
    }
}
