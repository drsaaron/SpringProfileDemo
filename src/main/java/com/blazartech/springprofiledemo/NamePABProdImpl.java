/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.springprofiledemo;

import com.blazartech.springprofiledemo.retrieve.NameRetriever;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 * @author aar1069
 */
@Component
@Profile("prod")
public class NamePABProdImpl implements NamePAB {
    
    private static final Logger log = LoggerFactory.getLogger(NamePABProdImpl.class);
    
    @Autowired
    private NameRetriever retriever;
    
    @Override
    public String getName() {
        log.info("getting name in prod profile");
        return retriever.retrieveName();
    }
}
