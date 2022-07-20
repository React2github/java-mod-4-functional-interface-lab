public class Main {
    public static void main(String[] args) {
        ConcatStringFunction func = (str) -> String.join( "",str).toUpperCase();
        String res = func.apply("banana", "grape", "Smoothie");
        System.out.println(res); // BANANAGRAPESMOOTHIE

				String res2 = func.apply("apple","orange", "pineapple", "Smoothie");
				System.out.println(res2); // APPLEORANGEPINEAPPLESMOOTHIE
    }
}

@FunctionalInterface
interface ConcatStringFunction {
    String apply(String... aStrings);
};
