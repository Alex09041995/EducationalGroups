import java.util.Iterator;
import java.util.List;


public class Flow<EducationalGroup> implements Iterable<EducationalGroup> { /** Объявляем класс "Flow" с параметром типа "EducationalGroup", и реализуем интерфейс "Iterable", чтобы можно было перебирать с помощью какого-либо цикла */

    private String name; /** определяем строку "Name" приватным полем */
    @SuppressWarnings("unused")
    private List<EducationalGroup> EducatinalGroups; /** определяем "EducatinalGroups" также приватным полем */
    private Iterable<EducationalGroup> groups; /** назначаем поле "groups" также приватным и итерируемым */

    public Flow(String name, List<EducationalGroup> Groups) { /** конструктор "Flow" принимает два параметра: строку "name" и список объектов "EducationalGroup" */ 
        this.name = name; /** конструктор инициализирует приватное поле "name" значением параметра "name" */
        this.EducatinalGroups = Groups; /** и инициализирует приватное поле "EducatinalGroups" значением параметра "Groups" */
    }
    public String getName() { /** метод "getName" возвращает значение приватного поля "name", чтобы получать название потока */
        return name;
    }
    public List<EducationalGroup> getGroups(List<EducationalGroup> groups) { /** метод "getGroups" принимает параметр: "groups" как список объектов "EducationalGroup" */
        return groups; /** затем возвращает список "groups" без изменений */
    }
    @Override
    public Iterator<EducationalGroup> iterator() { /** метод "iterator" возвращает итератор по элементам коллекции "groups", которая является списком "EducationalGroup" */
        return groups.iterator(); /** и возвращает данный - итератор по объектам типа "EducationalGroup" */
    }
   
}












