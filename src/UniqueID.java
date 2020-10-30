public class UniqueID {
    private static int id = 1003;

    public static int nextID(){
        return id++;
    }
}