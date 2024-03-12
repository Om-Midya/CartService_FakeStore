package org.midya.cartservice.controllers;

import org.midya.cartservice.models.Cart;
import org.midya.cartservice.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    private CartService cartService;
    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping("/status")
    public String status() {
        return "Cart Service is up and running";
    }

    @GetMapping("")
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    @GetMapping("/cart/{id}")
    public Cart getCartById(@PathVariable("id") Long id){
        return cartService.getCartById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Cart> getCartsByUserId(@PathVariable("userId") Long userId){
        return cartService.getCartsByUserId(userId);
    }

    @GetMapping("/")
    public List<Cart> getCartsInDateRange(@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate){
        return cartService.getCartsInDateRange(startDate, endDate);
    }


    @PostMapping("")
    public Cart addCart(@RequestBody Cart cart){
        return cartService.addCart(cart);
    }

    @PutMapping("/cart/{id}")
    public String updateCart(@PathVariable("id") Long id, @RequestBody Cart cart){
        return cartService.updateCart(id, cart);
    }

    @DeleteMapping("/cart/{id}")
    public String deleteCart(@PathVariable("id") Long id){
        return cartService.deleteCart(id);
    }
}
