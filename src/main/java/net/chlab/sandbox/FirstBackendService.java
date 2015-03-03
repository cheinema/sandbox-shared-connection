package net.chlab.sandbox;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

@Stateless
public class FirstBackendService extends AbstractBackendService {

    @Resource
    protected DataSource dataSource;

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }
}
