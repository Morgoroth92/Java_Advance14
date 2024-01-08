import java.util.*;

public class Main {
    public static void main(String[] args) {


        Map<String, String> hashMap1 = new LinkedHashMap<>();

        hashMap1.put("b", "2");
        hashMap1.put("a", "1");
        hashMap1.put("c", "3");
        hashMap1.put("d", "4");
        hashMap1.put("f", "6");
        hashMap1.put("e", "5");

        System.out.println("HashMap1 prima dell'ordinamento: " + hashMap1);

        List<String> chiaviOrdinate = new ArrayList<>(hashMap1.keySet());
        Collections.sort(chiaviOrdinate);

        Map<String, String> mappaOrdinata = new LinkedHashMap<>();
        for (String chiave : chiaviOrdinate) {
            mappaOrdinata.put(chiave, hashMap1.get(chiave));
        }

        System.out.println("LinkedHashMap1 dopo l'ordinamento: " + mappaOrdinata);
    }
}