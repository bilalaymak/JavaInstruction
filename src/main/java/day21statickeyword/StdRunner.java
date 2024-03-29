package day21statickeyword;

import java.util.List;

public class StdRunner {
    public static void main(String[] args) {


        //stdName static oldugundan ona ulasmak icin ona ulasmak icin object olusturmadim
        //sadece class ismini kullanmak yeterlidir
        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz

        Student std1 = new Student();
        System.out.println(std1.age);

        String initials = Student.getInitials("Tom Cruise");//TC

        int vowels = std1.countVowels("Sefa Eyer");
        System.out.println(vowels);//4

        //static olanlari object ile cagirmak tavsiye edilmez
        String s = std1.getInitials("Ali Can");
        System.out.println(s);//AC

        //list olusturmada yeni bir yol
        List<String> names = List.of("Ali","Veli","Can","Kemal");
        System.out.println(names);//[Ali, Veli, Can, Kemal]

    }
}
