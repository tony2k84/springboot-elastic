package com.springelastic.springelastic;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

@Configuration
public class ESConfiguration {

	@Value("${elasticsearch.host}")
    private String EsHost;

    @Value("${elasticsearch.port}")
    private int EsPort;
    
    @Bean
    public RestHighLevelClient client() {
        ClientConfiguration clientConfiguration 
            = ClientConfiguration.builder()
                .connectedTo(this.EsHost + ":" + this.EsPort)
                .build();

        return RestClients.create(clientConfiguration).rest();
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
    	System.out.println("Configured....");
        return new ElasticsearchRestTemplate(client());
    }
}
