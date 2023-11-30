package Week14LazyVsEager;

import java.util.function.Supplier;

public class LazyVsEager {

	public static void main(String[] args) {
		// Eager Evaluation
		System.out.println("Eager Evaluation:");
		int eagerResult = eagerEvaluation();
		System.out.println("Result: " + eagerResult);

		// Lazy Evaluation
		System.out.println("\nLazy Evaluation:");
		Supplier<Integer> lazySupplier = LazyVsEager::lazyEvaluation;
		System.out.println("Result: " + lazySupplier.get());
	}

	// Eager Evaluation
	public static int eagerEvaluation() {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int number : numbers) {
			sum += square(number);
		}

		return sum;
	}

	// Lazy Evaluation
	public static int lazyEvaluation() {
		int[] numbers = { 1, 2, 3, 4, 5 };

		// Use Supplier to delay the evaluation of square function
		Supplier<Integer> squareSupplier = () -> square(numbers[0]);
		Supplier<Integer> sumSupplier = () -> squareSupplier.get() + square(numbers[1]) + square(numbers[2])
				+ square(numbers[3]) + square(numbers[4]);

		return sumSupplier.get();
	}

	public static int square(int x) {
		System.out.println("Squaring: " + x);
		return x * x;
	}
}
