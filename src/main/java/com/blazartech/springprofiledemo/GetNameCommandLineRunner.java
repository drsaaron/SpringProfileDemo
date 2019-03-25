/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.springprofiledemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author AAR1069
 */
@Component
public class GetNameCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(GetNameCommandLineRunner.class);
    
    @Autowired
    private NamePAB pab;
    
    @Value("${name.retriever.value}")
    private String value;
    
    @Override
    public void run(String... args) throws Exception {
        logger.info("getting name");
        
        logger.info("name = " + pab.getName());
        logger.info("property value = " + value);
    }
    
}
