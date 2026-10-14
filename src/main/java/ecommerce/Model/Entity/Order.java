package ecommerce.Model.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private LocalDateTime orderDate;

    @OneToMany(mappedBy = "order")
    private List<Product> products;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User orderedBy;




}
