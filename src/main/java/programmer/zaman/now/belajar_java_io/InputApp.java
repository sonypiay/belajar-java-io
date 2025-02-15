package programmer.zaman.now.belajar_java_io;

import java.util.Scanner;

public class InputApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
