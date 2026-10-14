package ecommerce.Model.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String message;







}
