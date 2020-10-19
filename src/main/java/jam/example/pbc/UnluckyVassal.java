package jam.example.pbc;

import java.util.HashMap;
import java.util.List;

/**
 * Класс для обработки списка подчинённых
 *
 * @author JAM
 */
public class UnluckyVassal {
    private static final String KING="Король";
    private static final SortedServant sortedServant=new SortedServant();

    /**
     * Ключ-значение
     * человек - руководитель
     * Преобразую список людей в HashMap, для каждого человека указываю имя руководителя
     * По умолчанию у всех людей руководитель Король
     * Выполняю сортировку созданной HashMap по двум параметрам: parent, child
     * @param pollResults     *
     *
     */
    public HashMap<String, String> prepareDataForKing(List<String> pollResults) {
        String [] listServant;
        HashMap<String, String> hm = new HashMap<>();
        for (String str:pollResults) {
            listServant=(str.split(","));
            if (!hm.containsKey(listServant[0].trim()) ){
                if (listServant.length==1) {
                    hm.put(listServant[0].trim(),KING);
                }else{
                    hm.put(listServant[0].trim(),KING);
                }
            }
            //если у человека есть список chile, то обрабатываем каждое имя и добавляем к нему имя parent
            if (listServant.length>1) {
                for (int i = 1; i < listServant.length; i++) {
                    hm.put(listServant[i].trim(), listServant[0].trim());
                }
            }
        }
        return sortedServant.sortByValue(hm);
    }

}
