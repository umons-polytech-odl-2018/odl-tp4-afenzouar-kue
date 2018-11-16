package exercise1;

class MyException extends RuntimeException {

	public MyException(){

	}

	@Override
	public String getMessage() {
		return "valeur entrée est égale à 42";
	}
}
