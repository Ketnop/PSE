class CalcuatorUnit {

	static Integer getSum(Integer a, Integer b) {

		if (checkMinMax(a) && checkMinMax(b)) {
			Integer c = a + b;
			if (checkMinMax(c)) {
				return c;
			}
		}
	}

	static Integer getPro(Integer a, Integer b) {
		if (checkMinMax(a) && checkMinMax(b)) {
			Integer c = a * b;
			if (checkMinMax(c)) {
				return c;
			}
		}
	}

	static Integer getDiv(Integer a, Integer b) {

		if (checkMinMax(a) && checkMinMax(b)) {
			Integer c = a / b;
			if (checkMinMax(c)) {
				return c;
			}
		}
	}

	static Integer getArea(Integer a, Integer b) {
		return getPro(a, b);
	}

	static boolean checkMinMax(Integer x) {
		if (((x >= Integer.MAX_VALUE) || (x <= Integer.MIN_VALUE))) {
			return false;
			throw new IllegalArgumentException("Integer over max value or under min value ");
		} else {
			return true;
		}

	}
}
