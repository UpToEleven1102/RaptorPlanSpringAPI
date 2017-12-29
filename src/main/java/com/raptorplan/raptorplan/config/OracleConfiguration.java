package com.raptorplan.raptorplan.config;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;
import java.sql.SQLException;


//@Configuration
//@ConfigurationProperties("oracle")
public class OracleConfiguration {
//    private final String USERNAME = "cmsc269001aw";
//    private final String CONNECTION_NAME = "cms269001aw";
//    private final String PASSWORD = "aw";
//    private final String HOST_NAME = "acoracle.montgomerycollege.edu";
//    private final String URL = "jdbc:oracle:thsin:@acoracle.montgomerycollege.edu:15521:acoradb";
//    private final Integer PORT = 15521;
    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String url;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    @Bean
    DataSource dataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setURL(url);
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }
}
