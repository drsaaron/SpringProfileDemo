package com.blazartech.springprofiledemo.retrieve;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AAR1069
 */
@Component
@Profile("integration")
public class NameRetrieverIntegrationImpl implements NameRetriever {

    @Override
    public String retrieveName() {
        return "integration name";
    }
    
}
