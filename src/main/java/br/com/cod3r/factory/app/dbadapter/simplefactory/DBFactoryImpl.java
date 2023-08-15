package br.com.cod3r.factory.app.dbadapter.simplefactory;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;
import br.com.cod3r.factory.app.dbadapter.simplefactory.enums.DatabaseType;

public class DBFactoryImpl implements DBFactory {

    @Override
    public DB getDatabase(DatabaseType databaseType) {
        if (databaseType == DatabaseType.ORACLE) {
            return new OracleDB();
        } else if (databaseType == DatabaseType.POSTGRES) {
            return new PostgresDB();
        }

        throw new RuntimeException("Banco de Dados não suportado!");
    }
}
