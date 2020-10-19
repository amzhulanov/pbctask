package jam.example.pbc;

import java.util.*;

/**
 * Класс для сортировки hashmap по значениям
 *
 * @author JAM
 */
public class SortedServant {
    private List<Map.Entry<String, String>> list;


    /**
     * Метод для сортировки hashmap по значениям
     *
     * @param hm HashMap содержащий не отсортированные значения
     * @return HashMap содержащий отсортированные значения по ключу Руководитель/Имя человека
     */
    public HashMap<String, String> sortByValue(HashMap<String, String> hm) {

        list = new LinkedList<>(hm.entrySet());

        list.sort((str1, str2) -> {
            int result = (str1.getValue().compareTo(str2.getValue()));
            if (result != 0) {
                return result;
            } else {
                return str1.getKey().compareTo(str2.getKey());
            }
        });

        HashMap<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> aa : list) {
            result.put(aa.getKey(), aa.getValue());
        }

        return result;
    }

}
