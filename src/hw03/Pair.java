package hw03;

public class Pair<T, G> {

	private T valOne;
	private G valTwo;

	public Pair(T valOne, G valTwo) {
		this.valOne = valOne;
		this.valTwo = valTwo;
	}

	public T getFirst() {
		return valOne;
	}

	public G getSecond() {
		return valTwo;
	}

	public void setFirst(T valOne) {
		this.valOne = valOne;
	}

	public void setSecond(G valTwo) {
		this.valTwo = valTwo;
	}

	public static void main(String[] args) {
		Pair<Integer, Integer> intPair = new Pair<>(1, 2);
		Pair<Double, String> mixPair = new Pair<>(10.434343, "random");
		Pair<Pair<Integer, Integer>, Pair<Double, String>> pairPair = new Pair<>(intPair, mixPair);
	}
}
