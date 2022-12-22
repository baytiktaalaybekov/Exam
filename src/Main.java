import java.util.*;

public class Main {
    public static void main(String[] args) {
//        7 Student деген класс ачыныз полелерин толтурунуз.
//        Полелери аты, жашы,жынысы,акчасы,фамилиясы.
//* 1 - аты А менен башталган студенттерди чыгарыныз.
//                * 2 - жашы 15тен чон жана  акчасы 2000 ден чон балдарды чыгарыныз.
//* 3 - эн коп акчасы бар студентти чыгарыныз.
//                * 4 - эн акчасы коп кызды чыгарыныз.
//* 5 - баардык студенттердин атын эле консолго чыгарынз.
//                * 6 - бардык студеттердин акчасына 1000 сомдон кошуп чыгарыныз.
//                * 7 - биринчи турган студентти чыгарыныз.
//                * 8 - канча студент бар экен чыгарыныз.
//* 9 - балдарды жана кыздарды группага салгыла.


        ServiceImpl service = new ServiceImpl();
        List<Student> list = new ArrayList<>();
        list.add(new Student("Baytik", 20, Gender.MALE, 200, "Taalaybekova"));
        list.add(new Student("Symik", 22, Gender.MALE, 20, "Jumabekov"));
        list.add(new Student("Bayish", 21, Gender.MALE, 2030, "Orozozaliev"));
        list.add(new Student("Aigerim", 13, Gender.FEMALE, 207, "Bekenova"));


        service.createDB(list);
        service.filterA();
        service.filterAge();
        service.filterPrice();
        service.filterPriceGirl();
        service.filterName();
        service.filterPriceName();
        service.filterNameA();
        System.out.println(service.filterL());
        System.out.println(service.filterGroup());

        
//        while (true) {
//            System.out.println("""
//                    ----------Choice----------
//                    1 -> Create DB
//                    2 -> Filter
//                    3 -> Filter
//                    4 -> Filter
//                    """);
//            int choice = new Scanner(System.in).nextInt();
//            switch (choice) {
//                case 1 -> service.createDB(list);
//                case 2 -> service.filterA();
//                case 3 -> service.filterAge();
//                case 4 -> service.filterPrice();
//                case 5 -> service.filterPriceGirl();
//                case 6 -> service.filterName();
//                case 7 -> service.filterPriceName();
//                case 8 -> service.filterNameA();
//                case 9 -> System.out.println(service.filterL());
//                case 10 -> System.out.println(service.filterGroup());
//            }

        }
    }

