package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.SendEmailToFriendOutput;
import com.rockwell.cif.connector.server.graphql.model.SendEmailToFriendRecipient;
import com.rockwell.cif.connector.server.graphql.model.SendEmailToFriendSender;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateSendEmailToFriendOutputImpl implements DataFetchersDelegateSendEmailToFriendOutput {
    @Override
    public List<SendEmailToFriendRecipient> recipients(DataFetchingEnvironment dataFetchingEnvironment, SendEmailToFriendOutput origin) {
        return null;
    }

    @Override
    public SendEmailToFriendSender sender(DataFetchingEnvironment dataFetchingEnvironment, SendEmailToFriendOutput origin) {
        return null;
    }
}
