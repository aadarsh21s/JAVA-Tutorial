import java.util.Arrays;
public class VariablesAndDataTypes {
    static void main() {
        String name = "Unik";
        int age = 23;
        String fm = name;                         //Now in fm unik is saved.
// Premitive Types
        byte age1 = 12;
        int phone = 1234567890;
        long phone1 = 12345678901L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = false;


//Non-Premetive Types
        String name1 = "Adarsh";
        System.out.println(name1.length());
    //Array
        int chems =88;
        int phy = 99;
        int math = 98;

        int[] marks = new int[3];
        marks[0] = chems;
        marks[1] = phy;
        marks[2] = math;

        System.out.println(marks[1]);
        System.out.println(marks.length);
        Arrays.sort(marks);
//        System.out.println(marks[0]);

// single dimension array
        int[] mark = {88,87,97,98,99};
//Double dimension array
        int[][] finakMarks = {{99,98,87,98,88}, {87,88,99,89,94}};
        System.out.println("Result="+finakMarks[1][0]);
        System.out.println("Result="+finakMarks[0][0]);

//Concatenate Strings
        String name2 = "Ads";
        String name3 = "Bds";
        String name4 = name2+name3;
        System.out.println(name4);
        String name5 = name2+ " and " +name3;
        System.out.println(name5);
        System.out.println(name5.charAt(2));
        System.out.println(name5.replace('A', 'B'));
        System.out.println(name4.substring(0, 5));

    }
}

/*
Types:
byte = 1 [-128 to 127]
short = 2
int = 4    1,2,3,4,5
long = 8
float = 4   3.14
double = 8
char = 2     a,b,c,d
boolean = 1     true/false
 */