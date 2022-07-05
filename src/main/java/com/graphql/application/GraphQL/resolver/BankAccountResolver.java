package com.graphql.application.GraphQL.resolver;


import com.graphql.application.GraphQL.domain.BankAccount;
import com.graphql.application.GraphQL.domain.Client;
import com.graphql.application.GraphQL.domain.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id){

        log.info("Bank Account Id {}",id);
        UUID uuid = UUID. randomUUID();
        Client client = Client.builder().firstName("Suraj").lastName("Nair").id(uuid).build();
        return BankAccount.builder().id(id).currency(Currency.USD).client(client).build();
    }
}
