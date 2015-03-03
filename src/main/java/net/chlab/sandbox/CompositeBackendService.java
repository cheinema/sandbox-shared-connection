package net.chlab.sandbox;

import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CompositeBackendService {

    @Inject
    FirstBackendService firstBackendService;

    @Inject
    SecondBackendService secondBackendService;

    public String connectionInfo() {
        final String firstConnection = firstBackendService.connectionInfo();
        final String secondConnection = secondBackendService.connectionInfo();
        if (!firstConnection.equals(secondConnection)) {
            throw new EJBException("Connections differ!");
        }
        return firstConnection + ", " + secondConnection;
    }
}
