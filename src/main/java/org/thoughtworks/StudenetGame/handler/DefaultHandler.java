package org.thoughtworks.StudenetGame.handler;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.thoughtworks.StudenetGame.number.GameNumber;

public class DefaultHandler implements IHandler {
	private final static IHandler defaultHandler = new DefaultHandler();

	private DefaultHandler() {

	}

	public static IHandler getDefaultHandlerInstance() {
		return defaultHandler;
	}

	@Override
	public boolean handle(String inputMsg) {
		if (StringUtils.isNotBlank(inputMsg)) {
			String[] arrs = inputMsg.split(",");
			if (arrs.length == 3) {
				String firstStr = arrs[0].trim();
				String secondStr = arrs[1].trim();
				String threeStr = arrs[2].trim();
				if (NumberUtils.isNumber(firstStr)
						&& NumberUtils.isNumber(secondStr)
						&& NumberUtils.isNumber(threeStr)) {
					Integer firstNumber = Integer.valueOf(firstStr);
					Integer secondNumber = Integer.valueOf(secondStr);
					Integer thirdNumber = Integer.valueOf(threeStr);
					if (firstNumber.equals(secondNumber)
							|| firstNumber.equals(thirdNumber)
							|| secondNumber.equals(thirdNumber)
							|| firstNumber >= 10 || secondNumber >= 10
							|| thirdNumber >= 10) {
						return false;
					}
					GameNumber.resetGameNumber();
					GameNumber.getAndSetFirstGameNumber(firstNumber);
					GameNumber.getAndSetSecondGameNumber(secondNumber);
					GameNumber.getAndSetThreeGameNumber(thirdNumber);
					return true;
				}
			}
		}
		return false;
	}
}
