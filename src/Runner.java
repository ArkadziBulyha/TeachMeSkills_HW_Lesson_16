import java.util.Map;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите путь к файлам: ");
        String pathDir = sc.next();

        System.out.println("Укажите кол-во документов для обработки: ");
        int num = sc.nextInt();

        Parser pars = new Parser();
        Map<String, Document> mapDoc;

        mapDoc = pars.parseDoc(pathDir, num);

        if (mapDoc != null) {
            System.out.println(mapDoc);
        }
    }
}
