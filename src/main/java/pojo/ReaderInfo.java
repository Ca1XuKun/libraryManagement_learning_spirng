package pojo;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reader_info")
public class ReaderInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reader_id")
    private int readerId;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private String sex;

    @Column(name = "birth")
    private Date birth;

    @Column(name = "address")
    private String address;

    @Column(name = "telcode")
    private String telcode;

    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setTelcode(String telcode) {
        this.telcode = telcode;
    }

    public String getName() {
        return name;
    }

    public int getReaderId() {
        return readerId;
    }

    public Date getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public String getTelcode() {
        return telcode;
    }
}