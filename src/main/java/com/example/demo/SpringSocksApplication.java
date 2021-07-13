package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.log.LogAccessor;

@SpringBootApplication
public class SpringSocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSocksApplication.class, args);
	}


	private static final List<String> LOGS = Arrays.asList(
			"""
  #####  ######  ######  ### #     #  #####      #####  #######  #####  #    #  ##### 
 #     # #     # #     #  #  ##    # #     #    #     # #     # #     # #   #  #     #
 #       #     # #     #  #  # #   # #          #       #     # #       #  #   #      
  #####  ######  ######   #  #  #  # #  ####     #####  #     # #       ###     ##### 
       # #       #   #    #  #   # # #     #          # #     # #       #  #         #
 #     # #       #    #   #  #    ## #     #    #     # #     # #     # #   #  #     #
  #####  #       #     # ### #     #  #####      #####  #######  #####  #    #  ##### 
  """,
			"This should work...",
			"This should not be called!",
			"1...2...3...",
			"Foo Bar",
			"""
			org.springframework.springsocks.SockNotFoundException: 
			
			DO NOT IGNORE THE FOLLOWING TEXT:
			
			!!!! WARNING !!!! THIS EXCEPTION SHOULD BE IGNORED. WE CAN'T REMOVE IT CAUSE THE TESTS FAIL OTHERWISE... :( !!!! WARNING !!!!
			
					        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1786) ~[spring-beans-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:602) ~[spring-beans-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:524) ~[spring-beans-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:944) ~[spring-beans-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918) ~[spring-context-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583) ~[spring-context-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754) ~[spring-boot-2.6.0-SNAPSHOT.jar:2.6.0-SNAPSHOT]
					        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[spring-boot-2.6.0-SNAPSHOT.jar:2.6.0-SNAPSHOT]
					        at org.springframework.boot.SpringApplication.run(SpringApplication.java:338) ~[spring-boot-2.6.0-SNAPSHOT.jar:2.6.0-SNAPSHOT]
					        at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:123) ~[spring-boot-test-2.6.0-SNAPSHOT.jar:2.6.0-SNAPSHOT]
					        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:99) ~[spring-test-5.3.9-SNAPSHOT.jar:5.3.9-SNAPSHOT]
					""",
			"""
			com.fasterxml.jackson.databind.exc.MismatchedInputException: Cannot deserialize value of type `java.lang.String` from Object value (token `JsonToken.START_OBJECT`)
					 at [Source: (StringReader); line: 2, column: 3] (through reference chain: java.util.LinkedHashMap["amqp"])""",
				"Decorating onLast operator instrumentation",
			"Context [1b0e031b] is either not refreshed or is closed",
			"Context is not ready - won't do anything",
			"Sending a request",
			"Getting a response",
			"Before a method",
			"After the method",
			"Don't remove this log line",
			"Condition SamplerCondition on org.springframework.cloud.sleuth.autoconfig.brave.BraveSamplerConfiguration$NonRefreshScopeSamplerConfiguration matched due to AnyNestedCondition 1 matched 2 did not; NestedCondition on SamplerCondition.TracingCustomizerAvailable @ConditionalOnBean (types: brave.TracingCustomizer; SearchStrategy: all) did not find any beans of type brave.TracingCustomizer; NestedCondition on SamplerCondition.SpanHandlerAvailable More than one handler present; NestedCondition on SamplerCondition.ReporterAvailable @ConditionalOnBean (types: zipkin2.reporter.Reporter; SearchStrategy: all) did not find any beans of type zipkin2.reporter.Reporter",
			"athPatternParserServerWebExchangeMatcher : Request 'GET /' doesn't match 'null /oauth2/authorization/{registrationId}'",
	"athPatternParserServerWebExchangeMatcher : Request 'GET /' doesn't match 'null /login/oauth2/code/{registrationId}'",
	"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : Trying to match using PathMatcherServerWebExchangeMatcher{pattern='/login',\", method=GET}",
	"athPatternParserServerWebExchangeMatcher : Request 'GET /' doesn't match 'GET /login'",
	"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : No matches found",
	"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : Trying to match using PathMatcherServerWebExchangeMatcher{pattern='/login', method=GET}",
	"athPatternParserServerWebExchangeMatcher : Request 'GET /' doesn't match 'GET /login'",
	"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : No matches found",
	"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : Trying to match using PathMatcherServerWebExchangeMatcher{pattern='/logout', method=GET}",
	"athPatternParserServerWebExchangeMatcher : Request 'GET /' doesn't match 'GET /logout'",
	"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : No matches found",
	"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : Trying to match using PathMatcherServerWebExchangeMatcher{pattern='/logout', method=POST}",
	"athPatternParserServerWebExchangeMatcher : Request 'GET /' doesn't match 'POST /logout'",
	"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : No matches found",
	"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : Trying to match using org.springframework.boot.autoconfigure.security.reactive.StaticResourceRequest$StaticResourceServerWebExchange@13e22ad3",
	"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : Trying to match using PathMatcherServerWebExchangeMatcher{pattern='/css/**', method=null}",
	"athPatternParserServerWebExchangeMatcher : Request 'GET /' doesn't match 'null /css/**'",
			"o.s.s.w.s.u.m.OrServerWebExchangeMatcher : Trying to match using PathMatcherServerWebExchangeMatcher{pattern='/js/**', method=null}"
	);

	private static final LogAccessor log = new LogAccessor(CommandLineRunner.class);

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			Random random = new Random();
			while (true) {
				Thread.sleep(random.nextInt(100));
				log.info(LOGS.get(random.nextInt(LOGS.size() - 1)));
			}
		};
	}
}
