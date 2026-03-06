public class HandlerComposting implements WasteHandler {
    private WasteHandler nextHandler;
    
    @Override
    public void handleWaste(Waste waste) {
        if (waste.getType().equalsIgnoreCase("Organic")){
            System.out.println("Organic waste has been composted.");
        } else if (nextHandler != null){
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
