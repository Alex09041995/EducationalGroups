public class Controller1 {
    @SuppressWarnings("unused")
    private StreamService streamService; /** данный конструктор класса "Controller1" получает экземпляр сервиса "StreamService" и сохраняет его в приватном поле "streamService" */
    public Controller1(StreamService streamService) {
        this.streamService = streamService;
    }
} 
