package vines.mybatis.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogBack {
    private static Logger logger= LoggerFactory.getLogger(TestLogBack.class);
    public static void main(String[] args){
        logger.info("info_");
        logger.debug("debug");
    }
}

