class ejercicio11 {
    public static void main(String[] args) {

        System.out.println("Forma 1: ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nForma 2: ");

        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n\nForma 3: ");

        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 100);
    }
}
