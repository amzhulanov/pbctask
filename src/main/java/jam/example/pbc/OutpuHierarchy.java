package jam.example.pbc;

import java.util.*;

/**
 * Метод для вывода списка подчинённых короля в иерархическом виде
 *
 * @author JAM
 */
public class OutpuHierarchy {

    private HashMap<String, String> list;

    public void outputHierarchy(HashMap<String, String> list) {
        this.list = list;
        ArrayList<String> mainNode = new ArrayList<>();
        mainNode.add("Король");
        recursiveHierarchy(mainNode, "  ");
    }

    /**
     * Рекурсивный метод для обработки всех уровней подчинения
     * @param listParent содержит список значений текущего уровня. Корневым элементом является Король
     * @param finalSpace вспомогательная переменная, содержит пробелы и с каждой рекурсией их кол-во увеличивается. Используется при визуализации, чтобы отделить уровень от предыдущего
     * @return если дочерний список не пуст, то метод вызывается ещё раз, а дочерний список передаётся в родительский. Иначе цикл завершается
     */
    private List<String> recursiveHierarchy(List<String> listParent, String finalSpace) {
        String finalSpace1 = finalSpace;
        listParent.forEach(c -> System.out.println(finalSpace1 + c));

        List<String> nextChild = new ArrayList<>();
        for (String item : listParent) {
                    list.entrySet()
                            .stream()
                            .filter(c->c.getValue().equals(item))
                            .forEach(c->nextChild.add(c.getKey()));
        }
        finalSpace = finalSpace + " ";
        Collections.sort(nextChild);
        if (!nextChild.isEmpty()) {
            return recursiveHierarchy(nextChild, finalSpace);
        } else return nextChild;
    }

}
