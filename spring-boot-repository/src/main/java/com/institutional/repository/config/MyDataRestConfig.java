package com.institutional.repository.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.institutional.repository.entity.Author;
import com.institutional.repository.entity.Category;
import com.institutional.repository.entity.Document;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
    
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		 HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        // disable HTTP methods for Document: PUT, POST and DELETE
        config.getExposureConfiguration()
                .forDomainType(Document.class)
                .withItemExposure((metdata, httpMethods)-> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods)-> httpMethods.disable(theUnsupportedActions));

        // disable HTTP methods for Category: PUT, POST and DELETE
        config.getExposureConfiguration()
                .forDomainType(Category.class)
                .withItemExposure((metdata, httpMethods)-> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods)-> httpMethods.disable(theUnsupportedActions));
        
        // disable HTTP methods for Author: PUT, POST and DELETE
        config.getExposureConfiguration()
                .forDomainType(Author.class)
                .withItemExposure((metdata, httpMethods)-> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods)-> httpMethods.disable(theUnsupportedActions));
	}

}
