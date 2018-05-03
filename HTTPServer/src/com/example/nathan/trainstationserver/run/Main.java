package com.example.nathan.trainstationserver.run;

import com.example.nathan.trainstationserver.server.HttpServerClass;

public class Main {

	static Runtime runtime;
	static int port = 8080;

	public static void main(String[] args) {
		runtime = java.lang.Runtime.getRuntime();
		startServer();
	}

	private static void startServer() {
		HttpServerClass srv = new HttpServerClass();
		boolean blResult = srv.open(port);

		if (blResult) {
			System.out.println("server started on " + port);
		} else {
			System.out.println("server start error");
		}
	}

}
