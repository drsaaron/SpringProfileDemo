/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.springprofiledemo.retrieve;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 * @author AAR1069
 */
@Component
@Profile("test")
public class NameRetrieverTestImpl implements NameRetriever {

    @Override
    public String retrieveName() {
        return "test name";
    }
    
}
