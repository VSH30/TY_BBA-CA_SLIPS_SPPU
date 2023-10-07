import java.io.File;

public class S5B {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java FileCleanup <file1> <file2> ...");
            return;
        }

        for (String fileName : args) {
            File file = new File(fileName);

            if (file.exists()) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    if (file.delete()) {
                        System.out.println("Deleted: " + fileName);
                    } else {
                        System.out.println("Failed to delete: " + fileName);
                    }
                }
            } else {
                System.out.println("File not found: " + fileName);
            }
        }

        // Display the name, location, and size of the remaining files
        System.out.println("\nRemaining Files:");
        for (String fileName : args) {
            File file = new File(fileName);

            if (file.exists() && file.isFile() && !file.getName().endsWith(".txt")) {
                System.out.println("Name: " + file.getName());
                System.out.println("Location: " + file.getParent());
                System.out.println("Size: " + file.length() + " bytes\n");
            }
        }
    }
}