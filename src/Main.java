import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    //Tip Güvenli ArrayList örneği. Yani ArrayList tipini önceden belirliyor ve içine belirlenen tipte veri ekliyoruz.

        ArrayList<String> city = new ArrayList<String>();
        city.add("İstanbul");
        city.add("Safranbolu");
        city.add("Bartın");
        city.add("Aydın");
        city.add("Ankara");

        for(String item:city){
            System.out.println(item);
        }
        System.out.println("----------");
        //ArrayList sıralanıyor.
        Collections.sort(city);

        for(String item:city){
            System.out.println(item);
        }
    }
}