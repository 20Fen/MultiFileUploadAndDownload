package com.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Description:
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    
    @Override
    protected Object determineCurrentLookupKey() {
        DataSourceType.DataBaseType dataBaseType = DataSourceType.getDataBaseType();
        return dataBaseType;
    }
}
