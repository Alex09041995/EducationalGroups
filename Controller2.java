import java.util.List;

public class Controller2 { /** данный класс определяет "Controller2", который также зависит от сервиса "streamService" */
    private StreamService streamService;
    public List<Flow> sortFlow(List<Flow> Flows) { /** метод "sortFlow" класса "Controller2" принимает список объектов "Flow"  */
        return streamService.sortFlow(Flows); /** и возвращает отсортированный список этих объектов */
    } 
}
