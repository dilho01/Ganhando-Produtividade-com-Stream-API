import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ComsumerExampla {


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 4, 5, 6);

        Consumer<Integer> imprimirNumero = numero -> {
            if (numero % 2 == 0){
                System.out.print(numero + " ");
            }
        };

        numeros.stream().forEach(n ->{
                if (n % 2 == 0)   {
                    System.out.println(n);
                }

            }
        );
    }
}
