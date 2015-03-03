package net.chlab.sandbox;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

@Stateless
public class SecondBackendService extends AbstractBackendService {

    @Resource
    protected DataSource dataSource;

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }
}
