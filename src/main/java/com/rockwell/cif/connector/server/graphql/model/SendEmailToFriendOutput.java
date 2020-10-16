/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import java.util.List;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("SendEmailToFriendOutput")
public class SendEmailToFriendOutput  {

	public SendEmailToFriendOutput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "recipients", graphQLTypeName = "SendEmailToFriendRecipient", javaClass = SendEmailToFriendRecipient.class)
	List<SendEmailToFriendRecipient> recipients;


	@GraphQLNonScalar(fieldName = "sender", graphQLTypeName = "SendEmailToFriendSender", javaClass = SendEmailToFriendSender.class)
	SendEmailToFriendSender sender;



	public void setRecipients(List<SendEmailToFriendRecipient> recipients) {
		this.recipients = recipients;
	}

	public List<SendEmailToFriendRecipient> getRecipients() {
		return recipients;
	}

	public void setSender(SendEmailToFriendSender sender) {
		this.sender = sender;
	}

	public SendEmailToFriendSender getSender() {
		return sender;
	}

    public String toString() {
        return "SendEmailToFriendOutput {"
				+ "recipients: " + recipients
				+ ", "
				+ "sender: " + sender
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Recipients("recipients"),
		Sender("sender");

		private String fieldName;

		Field(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldName() {
			return fieldName;
		}

		public Class<?> getGraphQLType() {
			return this.getClass().getDeclaringClass();
		}

	}

	public static Builder builder() {
			return new Builder();
		}



	/**
	 * Builder
	 */
	public static class Builder {
		private List<SendEmailToFriendRecipient> recipients;
		private SendEmailToFriendSender sender;


		public Builder withRecipients(List<SendEmailToFriendRecipient> recipients) {
			this.recipients = recipients;
			return this;
		}
		public Builder withSender(SendEmailToFriendSender sender) {
			this.sender = sender;
			return this;
		}

		public SendEmailToFriendOutput build() {
			SendEmailToFriendOutput _object = new SendEmailToFriendOutput();
			_object.setRecipients(recipients);
			_object.setSender(sender);
			return _object;
		}
	}
}
