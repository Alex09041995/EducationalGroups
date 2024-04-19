import java.util.List;

public class StreamService {

    @SuppressWarnings("rawtypes") /** данная функция подавляет определенные типы предупреждений во время компиляции. Она используется для подавления предупреждений о необработанных типах */

    public List<Flow> sortFlow(List<Flow> Flow) { /** метод сортирует список объектов "Flow" */
        Flow.sort(new StreamComparator());  /** с помощью компаратора "StreamComparator" */
        return Flow; /** и возвращает отсортированный список "Flow" */
    }
}



