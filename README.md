# shared-connections #

This is a demonstration of shared connections from JDBC `DataSource` in JTA transactions.

## How to run ##

1. Build and run with `mvn wildfly:run`
2. Open `http://localhost:8080/shared-connection-1.0-SNAPSHOT/connection` in your browser

You should put some load with JMeter to the URL!
