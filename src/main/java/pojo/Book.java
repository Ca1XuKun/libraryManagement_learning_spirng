package pojo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "book_info")
public class Book implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "publish")
    private String publish;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "introduction")
    private String introduction;

    @Column(name = "language")
    private String language;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "pubdate")
    private Date pubdate;

    @Column(name = "class_id")
    private int classId;

    @Column(name = "pressmark")
    private int pressmark;

    @Column(name = "state")
    private int state;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPressmark(int pressmark) {
        this.pressmark = pressmark;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public long getBookId() {
        return bookId;
    }

    public int getClassId() {
        return classId;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public String getAuthor() {
        return author;
    }

    public String getIntroduction() {
        return introduction;
    }

    public int getPressmark() {
        return pressmark;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getLanguage() {
        return language;
    }

    public int getState() {
        return state;
    }

    public String getPublish() {
        return publish;
    }

    @Override
    public String toString() {
        return "这本书的信息为"+pressmark+pubdate+bookId+name+author+publish+isbn+introduction+language+price+classId+state;
    }
}
