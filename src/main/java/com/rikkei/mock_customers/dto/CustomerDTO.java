package com.rikkei.mock_customers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
    private int id;
    private String name;
    private Long sumOfPrice;
}
