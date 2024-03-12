package org.midya.cartservice.service;

import org.midya.cartservice.models.Cart;

import java.util.List;

public interface CartService {
    public List<Cart> getAllCarts();
    public Cart getCartById(Long id);
    public List<Cart> getCartsByUserId(Long userId);
    public List<Cart> getCartsInDateRange(String startDate, String endDate);
    public Cart addCart(Cart cart);
    public String updateCart(Long id, Cart cart);
    public String deleteCart(Long id);
}
