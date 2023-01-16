package org.spring.TravelAgencyClone.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DupCheckEntity {


    @Id
    @Column(nullable = false)
    private String mobileNumber;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String birth;

    @Column(unique = true, nullable = false)
    private String AuthNum;
}
