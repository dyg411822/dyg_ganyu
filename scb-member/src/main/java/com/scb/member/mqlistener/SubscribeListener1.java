package com.scb.member.mqlistener;

import java.io.IOException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.scb.common.rabbitmq.po.Mail;


@Component
public class SubscribeListener1 {
	@RabbitListener(queues = "queue1")
	public void subscribe(Mail mail) throws IOException {
		System.out.println("订阅者1收到消息"+mail.toString());
	}
}
