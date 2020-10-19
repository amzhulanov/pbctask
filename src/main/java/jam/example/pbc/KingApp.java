package jam.example.pbc;

import java.util.*;

/**
 * Задание: Помогите слуге правильно составить иерархию и подготовить отчет для короля
 *В pollResults входные данные
 * @author JAM
 */
public class KingApp {

    private static final List<String> pollResults = Arrays.asList(
            "служанка Аня",
            "управляющий Семен Семеныч, крестьянин Федя, доярка Нюра",
            "дворянин Кузькин, управляющий Семен Семеныч, жена Кузькина, экономка Лидия Федоровна",
            "экономка Лидия Федоровна, дворник Гена, служанка Аня",
            "доярка Нюра",
            "кот Василий, человеческая особь Катя",
            "дворник Гена, посыльный Тошка",
            "киллер Гена",
            "зажиточный холоп, крестьянка Таня",
            "секретарь короля, зажиточный холоп, шпион Т",
            "шпион Т, кучер Д",
            "посыльный Тошка, кот Василий",
            "аристократ Клаус",
            "просветленный Антон"
    );

    public static void main(String... args) {
        UnluckyVassal unluckyVassal = new UnluckyVassal();
        HashMap<String, String> hm=unluckyVassal.prepareDataForKing(pollResults);

        System.out.println("Отсортированный hm");
        hm.forEach((key, value) -> System.out.println(value + " -> " + key));

        System.out.println("Вывод иерархического списка");
        OutpuHierarchy outpuHierarchy=new OutpuHierarchy();
        outpuHierarchy.outputHierarchy(hm);
    }

}
