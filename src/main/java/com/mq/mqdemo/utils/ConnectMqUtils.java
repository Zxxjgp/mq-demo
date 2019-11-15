package com.mq.mqdemo.utils;

import com.rabbitmq.client.*;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName ConnectMqUtils
 * @date 2019/11/13  17:38
 */
public class ConnectMqUtils {

    /**
     *
     *
     * 测试地址
     * rabbitmq：192.168.1.206  slave1：192.168.1.233  slave2：192.168.1.219
     * 换地址发送消息
     *  页面web页面192.168.1.206:15627
     * @return
     * @throws IOException
     * @throws TimeoutException
     */


    public static Connection getConnect() throws IOException, TimeoutException {
        ConnectionFactory factory =new ConnectionFactory();
        factory.setHost("192.168.1.219");
        factory.setPort(5672);
        factory.setVirtualHost("/jgp_db");

        factory.setUsername("admin");
        factory.setPassword("admin");

        return factory.newConnection();

    }
}
