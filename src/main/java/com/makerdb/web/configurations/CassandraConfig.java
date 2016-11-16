package com.makerdb.web.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cassandra.config.CassandraCqlClusterFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;

/**
 * Created by sukhanna on 11/16/16.
 */
@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Value("${com.makerdb.web.cassandraKeyspace}")
    private String keyspaceName;

    @Value("${com.makerdb.web.cassandraPort}")
    private int port;

    @Value("${com.makerdb.web.cassandraHost}")
    private String host;

    @Override
    protected String getKeyspaceName() {
        return "inventory";
    }

    @Override
    public CassandraCqlClusterFactoryBean cluster() {
        CassandraCqlClusterFactoryBean cluster = new CassandraCqlClusterFactoryBean();
        cluster.setPort(port);
        cluster.setContactPoints(host);
        return cluster;
    }
}
