package com.akash.kafka.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Author: akash
 * Date: 16/2/25
 */

@Getter
@Setter
@ToString
public class Employee {

    private String id;
    private String firstName;
    private String lastName;
}
