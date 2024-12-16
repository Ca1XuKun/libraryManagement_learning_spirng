package pojo;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "reader_card")
public class ReaderCard implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reader_id")
    private int readerId;

    @Column(name = "name")
    private String name;

    @Column(name = "passwd")
    private String passwd;

    @Column(name = "card_state")
    private int cardState;

    // Getters and Setters
    public void setCardState(int cardState) {
        this.cardState = cardState;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public int getReaderId() {
        return readerId;
    }

    public int getCardState() {
        return cardState;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return passwd;
    }
}