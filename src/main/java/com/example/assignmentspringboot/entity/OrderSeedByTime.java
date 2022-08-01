package com.example.assignmentspringboot.entity;

import com.example.assignmentspringboot.entity.enums.OrderSeedByType;
import com.example.assignmentspringboot.entity.enums.OrderStatus;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderSeedByTime {
    private OrderSeedByType seedByType;
    private int year;
    private int month;
    private int day;
    private int countOrder;
    private OrderStatus orderStatus;
}
