package controller;


import entities.Sales;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SalesController {

    @GetMapping("/record-sale")
    public Sales recordSale(){
        return null;
    }
}