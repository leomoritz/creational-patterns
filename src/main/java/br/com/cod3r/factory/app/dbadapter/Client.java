package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.DBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.OracleDBFactoryImpl;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresDBFactoryImpl;
import br.com.cod3r.factory.app.dbadapter.simplefactory.DBFactoryImpl;
import br.com.cod3r.factory.app.dbadapter.simplefactory.enums.DatabaseType;

public class Client {

	public static void main(String[] args) {

		// USANDO FACTORY
		DB postgresClient = new PostgresDBFactoryImpl().getDatabase();
		DB oracleClient = new OracleDBFactoryImpl().getDatabase();

		// Executando consultas de acordo com a implementação de cada banco
		postgresClient.query("SELECT * FROM PRODUCT P WHERE P.CATEGORY = 'E-BOOKS' LIMIT 10 OFFSET 1");
		oracleClient.query("SELECT * FROM PRODUCT P WHERE P.CATEGORY = 'E-BOOKS' OFFSET 1 FETCH NEXT 10 ROWS ONLY");


		//USANDO SIMPLE FACTORY
		DB postgresClientSF = new DBFactoryImpl().getDatabase(DatabaseType.POSTGRES);
		DB oracleClientSF = new DBFactoryImpl().getDatabase(DatabaseType.ORACLE);

		// Executando consultas de acordo com a implementação de cada banco
		postgresClientSF.query("SELECT * FROM PRODUCT P WHERE P.CATEGORY = 'E-BOOKS' LIMIT 10 OFFSET 1");
		oracleClientSF.query("SELECT * FROM PRODUCT P WHERE P.CATEGORY = 'E-BOOKS' OFFSET 1 FETCH NEXT 10 ROWS ONLY");
	}
}
