import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> { /** данный класс "StreamComparator" - реализует интерфейс "Comparator<Flow>", и используется для сравнения объектов "Flow" и определения порядка их сортировки */

    @Override
    
    public int compare(Flow flow1, Flow flow2) { /** данный метод переопределяет метод "compare" интерфейса "Comparator" и используется для сравнения двух объектов "Flow": flow1, flow2 */
        int quantityGroups1 = flow1.getGroups(null).size(); /** возвращает отрицательное число, если количество групп в "flow1" меньше, чем в "flow2" */
        int quantityGroups2 = flow2.getGroups(null).size(); /** возвращает положительное число, если количество групп в "flow1" больше, чем в "flow2", и возвращает ноль, если количество групп в "flow1" равно количеству групп в "flow2" */
        return Integer.compare(quantityGroups1, quantityGroups2);
    }
}












