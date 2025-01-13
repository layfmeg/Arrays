public class Square {
    public static void main(String[] args) {
        int size = 10; // Размер квадрата

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print('*');
            }
            System.out.println(); // Переход на новую строку после каждой строки квадрата
        }
    }
}
