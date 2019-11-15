测试步骤
   测试脑裂问题
       rabbitmq.config 已经修改过了       备注：/修改配置文件成为{cluster_partition_handling, pause_minority}
       将219的网络断开，之后再重新连接即可测试(配置参数参考https://blog.csdn.net/u013256816/article/details/73757884)

   测试修改脑裂问题后的数据有没有丢失问题
        在ConfirmSend修改队列名称---
                                 QUEUE_NAME = "queueue_confirm_219"，
                                 QUEUE_NAME = "queueue_confirm_206"，
                                 QUEUE_NAME = "queueue_confirm_233"
        在ConnectMqUtils类中修改测试地址为192.168.1.219
                                      192.168.1.206
                                      192.168.1.233

        将219的网络断开，登陆192.168.1.206或者192.168.1.233既可看到消息的情况
                      在之后再重新连接即可测试消息有没有丢失。



