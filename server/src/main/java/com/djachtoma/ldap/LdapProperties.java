package com.djachtoma.ldap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("ldap")
public class LdapProperties {

    private String url;
}
