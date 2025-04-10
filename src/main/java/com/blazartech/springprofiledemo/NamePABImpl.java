/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author AAR1069
 */
@Component
@Profile("integration | test")
public class NamePABImpl implements NamePAB {

    private static final Logger log = LoggerFactory.getLogger(NamePABImpl.class);
    
    @Autowired
    private NameRetriever retriever;
    
    @Override
    public String getName() {
        log.info("getting name for either integration or test profile");
        return retriever.retrieveName();
    }
    
}
