package kg.itacademy.lastexamm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "requests")
@Entity
public class Request  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_name",nullable = false)
    private String bookName;
    @Column(name = "genre",nullable = false)
    private String genre;
    @Column(name = "condition")
    private String condition;
    @Column(name = "to_change",nullable = false)
    private String toChange;
    @Column(name = "how_contact",nullable = false)
    private String howContact;

    public Request(String bookName, String genre, String condition, String whatChange, String howContact) {
        this.bookName = bookName;
        this.genre = genre;
        this.condition = condition;
        this.toChange = whatChange;
        this.howContact = howContact;
    }
}
