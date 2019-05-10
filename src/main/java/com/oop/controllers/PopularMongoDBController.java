package com.oop.controllers;


import com.oop.PopularMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/popularmongodb")
public class PopularMongoDBController {

        @Autowired
        private PopularMongoDB popularMongoDB;


        @GetMapping
        public String popularMongoDB(){

            popularMongoDB.popularMongoDB();
            return "OK";
        }
}
