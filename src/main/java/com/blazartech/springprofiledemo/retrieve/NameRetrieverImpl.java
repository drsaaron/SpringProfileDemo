/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.springprofiledemo.retrieve;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 * @author AAR1069
 */
@Component
@Profile("prod")
public class NameRetrieverImpl implements NameRetriever {

    /**
     * this should get the value out of application-prod.properties
     */
    @Value("${name.retriever.value}")
    private String value;
    
    @Override
    public String retrieveName() {
        return value;
    }
    
}
