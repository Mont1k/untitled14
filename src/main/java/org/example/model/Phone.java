package org.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Phone {
    private Long id;
    private String model;
    private String brand;
    private int price;
}
