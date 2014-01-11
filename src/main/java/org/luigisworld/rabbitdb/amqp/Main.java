package org.luigisworld.rabbitdb.amqp;

import org.apache.log4j.Logger;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public final class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class);

	private Main() { }

	public static void main(final String... args) {

		LOGGER.info("Enter a museum and press return\nExample:\nLouvre::France::The museum is housed in the Louvre Palace (Palais du Louvre), originally built as a fortress in the late 12th century..." );

		//Loads the pipeline
		final AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:META-INF/spring/integration/*-context.xml");

		//Calls the relevant destroy methods.
		context.registerShutdownHook();
	}
}
