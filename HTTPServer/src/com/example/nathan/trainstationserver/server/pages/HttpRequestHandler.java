package com.example.nathan.trainstationserver.server.pages;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class HttpRequestHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange he) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(he.getResponseBody()));
		he.sendResponseHeaders(200, 0);
		String output = "<!DOCTYPE html><html><head><title>Fake HTML page</title></head><body><p>This is a web page</p><form method=\"GET\" action=\"/action\">"
				+ "<label for=\"name\">Name</label>"
				+ "<input type=\"text\" name=\"name\" id=\"name\">"
				+ "<label for=\"col\">Favourite Colour</label>"
				+ "<input type=\"submit\" value=\"button\">"
				+ "<input type=\"text\" name=\"colour\" id=\"col\"></form></body></html>";
		bw.write(output);
		bw.close();

	}

}
