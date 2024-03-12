package org.midya.cartservice.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductFetchDTO {
    private Long productId;
    private Long quantity;
}
