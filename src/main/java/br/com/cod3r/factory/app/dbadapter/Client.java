package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.DBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.OracleDBFactoryImpl;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresDBFactoryImpl;

public class Client {

	public static void main(String[] args) {

		DB postgresClient = new PostgresDBFactoryImpl().getDatabase();
		DB oracleClient = new OracleDBFactoryImpl().getDatabase();

		// Executando consultas de acordo com a implementação de cada banco
		postgresClient.query("SELECT * FROM PRODUCT P WHERE P.CATEGORY = 'E-BOOKS' LIMIT 10 OFFSET 1");
		oracleClient.query("SELECT * FROM PRODUCT P WHERE P.CATEGORY = 'E-BOOKS' OFFSET 1 FETCH NEXT 10 ROWS ONLY");

	}
}
