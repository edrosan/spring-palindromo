package com.PracticaPropuesta1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {

    @GetMapping("/palindromo/{word}")
    public String palindrome(@PathVariable String word ) {
        if(isPalindrome(word)){
            return "La palabra " + word + " es un palindromo";
        }
        return "La palabra " + word + " no es un palindromo";
    }

    private boolean isPalindrome(String word) {
        int length = word.length();

        for (int i = 0; i < length/2; i++) {
            if(word.charAt(i) != word.charAt(length-1-i)) {
                return false;
            }
        }

        return true;
    }
}
