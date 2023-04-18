package org.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Contact {
    private Long id;
    private String contactName;
    private String phoneNumber;

}
