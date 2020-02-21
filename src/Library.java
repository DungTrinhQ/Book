import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        int amountProgrammingBook, amountFictionBook;
        Scanner input = new Scanner(System.in);
        ArrayList<ProgrammingBook> arrProgrammingBook = new ArrayList<>();
        ArrayList<FictionBook> arrFictionBook = new ArrayList<>();

        System.out.println("Nhập số Programming book: ");
        amountProgrammingBook = input.nextInt();
        System.out.println("Nhập số FictionBook");
        amountFictionBook = input.nextInt();

        System.out.println("Nhập thông tin Programming Book:");
        for (int i = 0; i < amountProgrammingBook; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            ProgrammingBook programmingBook = new ProgrammingBook();
            programmingBook.addBook();
            arrProgrammingBook.add(programmingBook);
        }

        System.out.println("Nhập thông tin Fiction Book:");
        for (int i = 0; i < amountFictionBook; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            FictionBook fictionBook = new FictionBook();
            fictionBook.addBook();
            arrFictionBook.add(fictionBook);
        }

        System.out.println("Tổng tiền Programming book");
        int moneyProgrammingBook = 0;
        for (int i = 0; i < arrProgrammingBook.size(); i++) {
            moneyProgrammingBook += arrProgrammingBook.get(i).getPrice();
        }
        System.out.println(moneyProgrammingBook);


        System.out.println("Tổng tiền Programming book");
        int moneyFictionBook = 0;
        for (int i = 0; i < arrFictionBook.size(); i++) {
            moneyFictionBook += arrFictionBook.get(i).getPrice();
        }
        System.out.println(moneyFictionBook);


        int total = moneyProgrammingBook + moneyFictionBook;
        System.out.println("Tổng tiền: " + total);

        int count = 0;
        for (int i = 0; i < 1; i++){
            if(arrProgrammingBook.get(i).getLanguage().equals("Java")){
                count++;
            }
        }
        System.out.println("Số Programming book ngôn ngữ Java là: " +count);

    }
}
