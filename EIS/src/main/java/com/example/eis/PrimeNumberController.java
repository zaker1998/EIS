package com.example.eis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberController {
    @GetMapping("/isPrime")
    public String isPrime(@RequestParam(value = "number") int number) {
        return (isPrimeNumber(number)) ? number + " is a prime number." : number + " is not a prime number.";
    }

    private boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
