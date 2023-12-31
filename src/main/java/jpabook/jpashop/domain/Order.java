package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.collection.internal.PersistentList;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;


    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems= new ArrayList<>();

    @OneToOne
    private Delivery delivery;

    private LocalDateTime orderDate; //주문시간

    private OrderStatus orderStatus; //주문상태



}
