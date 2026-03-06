public interface WasteHandler {
    void handleWaste(Waste waste);
    void setNextHandler(WasteHandler nextHandler);
}