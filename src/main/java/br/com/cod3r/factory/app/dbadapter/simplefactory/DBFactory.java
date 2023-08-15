package br.com.cod3r.factory.app.dbadapter.simplefactory;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.simplefactory.enums.DatabaseType;

public interface DBFactory {

    DB getDatabase(DatabaseType databaseType);

}
