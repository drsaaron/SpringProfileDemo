/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.springprofiledemo;

import com.blazartech.springprofiledemo.retrieve.NameRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author AAR1069
 */
@Component
public class NamePABImpl implements NamePAB {

    @Autowired
    private NameRetriever retriever;
    
    @Override
    public String getName() {
        return retriever.retrieveName();
    }
    
}
