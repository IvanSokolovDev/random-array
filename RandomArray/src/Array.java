import java.util.Arrays;

public class Array {
	public static final int COUNT = 10;
	public static double[] array = new double[COUNT];

	public static void main(String[] args) {
		fillArray();
		System.out.println("Массив случайных чисел");
		Arrays.stream(array).forEach(System.out::println);
		System.out.println("Максимум " + max());
		System.out.println("Минимум " + min());
		System.out.println("Среднее значение " + mean());
	}

	public static void fillArray() {
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random();
		}
	}

	public static double max() {
		return Arrays.stream(array).max().getAsDouble();
	}

	public static double min() {
		return Arrays.stream(array).min().getAsDouble();
	}

	public static double mean() {
		return Arrays.stream(array).sum() / COUNT;
	}
}
