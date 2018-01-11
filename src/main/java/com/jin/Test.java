package com.jin;


//import org.apache.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description
 * @auth jhj
 * @date 17-12-19 下午3:09
 */
public class Test {

    //    private Logger logger = Logger.getLogger(Test.class);
    private final static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void f() {
        try {
            Integer i = 1;
            if (i == 1) {
                i = null;
            }
            i = i + 1;
        } catch (Exception e) {
            logger.error("test excptions", e);
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {

        f();
    }
}
