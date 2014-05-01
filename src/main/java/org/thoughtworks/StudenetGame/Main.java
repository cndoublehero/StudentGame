package org.thoughtworks.StudenetGame;

import java.util.Scanner;

import org.apache.commons.lang.StringUtils;
import org.thoughtworks.StudenetGame.handler.DefaultHandler;
import org.thoughtworks.StudenetGame.handler.IHandler;
import org.thoughtworks.StudenetGame.role.RoleCollections;
import org.thoughtworks.StudenetGame.util.Utils;

public class Main {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		try {
			while (inputScanner.hasNext()) {
				process(inputScanner.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			inputScanner.close();
		}
	}

	private static void process(String nextLine) {
		if (StringUtils.isNotBlank(nextLine)) {
			IHandler defaultHandler = DefaultHandler
					.getDefaultHandlerInstance();
			if (defaultHandler.handle(nextLine)) {
				for (int i = 1; i <= 100; ++i) {
					Utils.info(RoleCollections.apply(i));
				}
			}
		}

	}
}
