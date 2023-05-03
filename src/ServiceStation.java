public class ServiceStation {
    public void check(Service service){
        service.updateTyre();
        service.checkEngine();
        service.checkTrailer();
    }
}
