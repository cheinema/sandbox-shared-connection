package net.chlab.sandbox;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ejb.EJBException;
import javax.sql.DataSource;

public abstract class AbstractBackendService {

    private static final String SQL = "CALL SESSION_ID()";
    
    public String connectionInfo() {
        String info = null;
        try (final Connection conn = getDataSource().getConnection()) {
            try (final CallableStatement stmt = conn.prepareCall(SQL)) {
                try (final ResultSet rset = stmt.executeQuery()) {
                    if (rset.next()) {
                        info = Integer.toString(rset.getInt(1));
                    }
                }
            }
        } catch (SQLException e) {
            throw new EJBException(e);
        }
        return info;
    }

    protected abstract DataSource getDataSource();    
}
