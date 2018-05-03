package com.example.nathan.trainstationserver.run;

import com.example.nathan.trainstationserver.server.Server;

public class Main {

	/**
	 * Set port to listen for server on:
	 */
	private static int port = 8080;
	private static Server srv;

	public static void main(String[] args) {
		startServer();
	}

	/**
	 * Attempts to start server
	 * prints a successful or unsuccessful attempt
	 */
	private static void startServer() {
		srv = new Server();
		boolean blResult = srv.open(port);
		if (blResult) {
			System.out.println("server started on " + port);
		} else {
			System.out.println("server start error");
		}
	}

}
