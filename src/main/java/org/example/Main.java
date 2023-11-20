package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main{
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public void seuMetodo() {
       
        logger.info("Isso é uma mensagem de informação.");
        logger.debug("Isso é uma mensagem de depuração.");
        logger.error("Isso é uma mensagem de erro.");
    }
}
