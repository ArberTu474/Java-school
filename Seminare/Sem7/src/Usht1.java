// Ndërtoni një program që vendos në array list 10 numra të rastësishëm nga 1 deri tek 10. Për të
// gjeneruar këtë, ju duhet të mbushni një tabelë me numra nga 1 deri në 10 duke pasur parasysh që
// dy vlera në tabelë nuk duhet të jenë të njëjta. Ky veprim do të bëhet derisa të gjenerohen numra
// random dhe të gjenerohet një vlerë që nuk ndodhet në tabelë. Por kjo gjë nuk është efiçiente. Për
// të realizuar kë program mund të ndiqni këtë algoritëm:
// Krijoni një tabelë të dytë më vlera nga 1 deri tek 10.
// Zgjidhni një element në mënyrë random nga tabela e dytë.
// Hiqeni elementin dhe vendoseni në tabelën me elementë të rastësishëm.

import java.util.ArrayList;
import java.util.Random;

public class Usht1 {
    public static void main(String[] args) throws Exception {
        final int ARRAY_SIZE = 10;

        ArrayList<Integer> random_numbers = new ArrayList<Integer>();
        ArrayList<Integer> ordered_numbers = new ArrayList<Integer>();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            ordered_numbers.add(i + 1);
        }

        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            int random_index = random.nextInt(ordered_numbers.size());
            int temp = ordered_numbers.get(random_index);
            ordered_numbers.remove(random_index);
            random_numbers.add(temp);
        }

        for (int num : random_numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
