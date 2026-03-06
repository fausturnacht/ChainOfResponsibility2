public class WasteManagement {
    public static void main(String[] args) {
        Handler handler = new Handler();

        Waste waste1 = new Waste("Organic");
        handler.handleWaste(waste1);

        Waste waste2 = new Waste("Inorganic");
        handler.handleWaste(waste2);

        Waste waste3 = new Waste("BioHazardous");
        handler.handleWaste(waste3);

        Waste waste4 = new Waste("E-Waste");
        handler.handleWaste(waste4);

        Waste waste5 = new Waste("Radioactive");
        handler.handleWaste(waste5);
    }
}