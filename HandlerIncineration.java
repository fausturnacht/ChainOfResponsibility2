public class HandlerIncineration implements WasteHandler{
    private WasteHandler nextHandler;
    
    @Override
    public void handleWaste(Waste waste) {
        if(waste.getType().equalsIgnoreCase("Biohazardous")){
            System.out.println("Biohazardous waste assigned to incineration.");
        }
        else if (nextHandler != null) {
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