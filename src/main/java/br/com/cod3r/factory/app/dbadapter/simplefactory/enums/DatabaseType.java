package br.com.cod3r.factory.app.dbadapter.simplefactory.enums;

public enum DatabaseType {

    ORACLE("Oracle"),
    POSTGRES("PostgreSQL");

    private String databaseName;

    DatabaseType(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }
}
