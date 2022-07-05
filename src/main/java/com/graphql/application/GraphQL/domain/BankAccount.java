package com.graphql.application.GraphQL.domain;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class BankAccount {
    UUID id ;
    Client  client;
    Currency currency;


}