/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@SpringBootApplication(scanBasePackages = { "com.rockwell.cif.connector", "com.graphql_java_generator" ,"org.forum.server.impl","org.forum.server.jpa" })
@EnableConfigurationProperties
public class GraphQLServerMain extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(GraphQLServerMain.class, args);
	}

}
