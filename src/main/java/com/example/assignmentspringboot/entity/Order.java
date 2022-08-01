package com.example.assignmentspringboot.entity;

import com.example.asmspringboot.entity.base.BaseEntity;
import com.example.asmspringboot.entity.entityEnum.OrderStatus;
import com.example.asmspringboot.entity.entityEnum.PaymentMethod;
import com.example.asmspringboot.entity.entityEnum.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
@Inheritance
public class Order extends BaseEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull(message = "User Id cannot null")
    private long userId;
    @NotEmpty(message = "Customer name cannot be empty")
    private String customerName;
    @NotEmpty(message = "Customer email cannot be empty")
    private String customerEmail;
    @NotEmpty(message = "Customer name cannot be empty")
    private String customerPhone;
    @NotEmpty(message = "Customer address cannot be empty")
    private String customerAddress;
    @Column(columnDefinition = "text")
    private String note;
    private OrderStatus status;
    private PaymentStatus paymentStatus;
    private PaymentMethod paymentMethod;
    private double totalMoney;
    @JsonManagedReference
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<OrderDetail> orderDetails;
    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;
}
