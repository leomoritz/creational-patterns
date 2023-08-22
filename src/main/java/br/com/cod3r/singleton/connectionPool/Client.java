package br.com.cod3r.singleton.connectionPool;

import br.com.cod3r.singleton.connectionPool.conn.Connection;
import br.com.cod3r.singleton.connectionPool.conn.ConnectionPool;

public class Client {
	public static void doQuery1() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A1");
		//pool.leaveConnection(conn); //Libera a conexão novamente no Pool de conexões.
	}
	
	public static void doQuery2() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A2");
		//pool.leaveConnection(conn); //Libera a conexão novamente no Pool de conexões.
	}

	public static void doQuery3() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A3");
		//pool.leaveConnection(conn); //Libera a conexão novamente no Pool de conexões.
	}

	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		/**
		 * Ao chamar o método abaixo, deverá apresentar a mensagem No Connections available,
		 * pois com o singleton garantimos que será chamada a mesma instância várias vezes
		 * onde o limite de conexões foi definida com valor 2. Sem o singleton, seriam
		 * instâncias diferentes e para cada uma teria um limite de 2. Com o singleton,
		 * a próxima solicitação precisa aguardar o encerramento de uma das conexões
		 * ocupadas: doQuery1() e doQuery2().
		 */
		doQuery3();
	}
}
