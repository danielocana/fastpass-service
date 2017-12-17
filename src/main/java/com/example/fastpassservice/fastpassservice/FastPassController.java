package com.example.fastpassservice.fastpassservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
public class FastPassController {

    List<FastPassCustomer> list;

    public FastPassController() {
        FastPassCustomer customer1= new FastPassCustomer("100",  "Daniel Ocana", "12345", new BigDecimal("40"));
        FastPassCustomer customer15= new FastPassCustomer("200",  "Dell Pre", "12345", new BigDecimal("40"));
        FastPassCustomer customer2= new FastPassCustomer("300",  "Suzel Ocana", "67890", new BigDecimal("40"));
        FastPassCustomer customer3= new FastPassCustomer("600",  "Yessica Ocana", "345678", new BigDecimal("40"));
        FastPassCustomer customer4= new FastPassCustomer("800",  "Mirta Ocana", "09834", new BigDecimal("40"));
        list = Arrays.asList(customer1, customer15, customer2,customer3,customer4);
    }

    @GetMapping(value = "/fastpass", params = {"fastpassid"})
    public FastPassCustomer getFastPassCustomerById (@RequestParam String fastpassid) {
        return list.stream()
                .filter(x -> x.getFastPassId().equals(fastpassid))
                .findAny()
                .orElseThrow(() -> new FastPassNotFound(fastpassid));
    }

    @GetMapping(value = "/fastpass", params = {"phone"})
    public FastPassCustomer getFastPassCustomerByPhone (@PathVariable String phone) {
        return list.stream()
                .filter(x -> x.getFastPassPhone().equals(phone))
                .findAny()
                .orElseThrow(() -> new FastPassNotFound(phone));
    }
}
