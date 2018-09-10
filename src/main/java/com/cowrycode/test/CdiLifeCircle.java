/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

/**
 *
 * @author JavaEE
 */

public class CdiLifeCircle {
 
    @Inject
    Logger logger;
    
    @PostConstruct
    private void  init(){
        logger.log(Level.SEVERE, "****** Initialized*******");
    }
    
    @PreDestroy
    private void kill(){
        logger.log(Level.SEVERE, "*********** End of bean life");
    }
    
    
    
}
