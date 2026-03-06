public class Handler implements WasteHandler {
    private WasteHandler nextHandler;

    public Handler(){
        this.nextHandler = new HandlerComposting();
        WasteHandler w2 = new HandlerGeneralRecycling();
        WasteHandler w3 = new HandlerSpecialRecycling();
        WasteHandler w4 = new HandlerIncineration();
        WasteHandler w5 = new HandlerContainment();

        nextHandler.setNextHandler(w2);
        w2.setNextHandler(w3);
        w3.setNextHandler(w4);
        w4.setNextHandler(w5);
    }

    public void handleWaste(Waste waste) {
        if (nextHandler != null) {
            nextHandler.handleWaste(waste);
        } else {
            System.out.println("No handler available for this type of waste.");
        }
    }
    
    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
