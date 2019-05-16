package guo.ping.ioc.bean;

import guo.ping.ioc.eventlistener.TestEvent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: guoping wang
 * @date: 2018/10/5 21:13
 * @project: spring
 * ApplicationListener的实现的过程开发
 * 当程序运行时，Spring会将发出的TestEvent事件转给我们自定义的TestListener监听器进行进一步处理，这个时典型的
 * 观察者模式，可以将比较关系的事件结束后及时处理
 */
public class EventListenerTest {

	@Test
	public void testEventListener() {
		ApplicationContext context = new ClassPathXmlApplicationContext("eventListener-Test.xml");
		TestEvent event = new TestEvent("hello", "msg");
		context.publishEvent(event);
	}
}
