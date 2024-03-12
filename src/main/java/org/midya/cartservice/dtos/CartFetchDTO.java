package org.midya.cartservice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CartFetchDTO {
    private Long id;
    private Long userId;
    private String date;
    private List<ProductFetchDTO> products;
}
