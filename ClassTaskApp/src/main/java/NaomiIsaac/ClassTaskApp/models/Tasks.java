package NaomiIsaac.ClassTaskApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

// Lombok generates getter and setter methods for us, Nice
@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Tasks implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;
    private Boolean completed;
    private LocalDate creationDate;
    private LocalDate updateDate;
    private LocalDate deadline;

    @Override
    public String toString() {
        return "Tasks [id=" + id + ", title=" + title + ", description=" + description + ", completed=";
    }
}
