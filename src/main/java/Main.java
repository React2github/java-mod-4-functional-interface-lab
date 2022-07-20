public class Main {
    public static void main(String[] args) {
        ConcatStringFunction func = (str1,str2, str3) -> String.join( "",str1, str2, str3).toUpperCase();
        String res = func.apply("banana", "grape", "Smoothie");
        System.out.println(res); // BANANAGRAPESMOOTHIE

				String res2 = func.apply("apple","orange", "pineapple");
				System.out.println(res2); // APPLEORANGEPINEAPPLESMOOTHIE
    }
}

@FunctionalInterface
interface ConcatStringFunction {
    String apply(String str1, String str2, String str3);
};
