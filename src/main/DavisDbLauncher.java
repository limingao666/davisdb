package query;

/**
 * The Program starts here. Launcher for DavisBase program
 */
public class DavisDbLauncher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter(";");

        DavisDbInitializer dbInit = new DavisDbInitializer();
        dbInit.initializeDatabase();

        promptOnScreen();





    }

    private static void promptOnScreen() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Welcome to DavisBase!!!!"); // Display the string.
        System.out.println("--------------------------------------------------------------------------------");
    }
}
