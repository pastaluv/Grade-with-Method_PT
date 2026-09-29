import java.util.Scanner;
public class Main {
    static String LRN = "";
    static String gradeLevel = "";
    static String firstName = "";
    static String middleName = "";
    static String lastName = "";
    static String section = "";
    static String track = "";
    static String age = "";
    static String gender = "";

    public static void main(String[]arg){
        Scanner scanner = new Scanner (System.in);
        String remarks ="";
        inputGrades(scanner);

        System.out.println("Enter the following term 1 grade;");
        System.out.print("Gen. Science: ");
        double genSci  = scanner.nextDouble();
        System.out.print("Gen. Math: ");
        double genMath  = scanner.nextDouble();
        System.out.print("Effective Communication: ");
        double effCom  = scanner.nextDouble();
        System.out.print("Mabisang Kommunikasyon: ");
        double mabKom  = scanner.nextDouble();
        System.out.print("Life and Career Skills: ");
        double LCS  = scanner.nextDouble();
        System.out.print("PKLP: ");
        double PKLP  = scanner.nextDouble();
        System.out.print("Computer Program: ");
        double comProg  = scanner.nextDouble();
        System.out.println("Gen.Tiburcio De Leon National High School");
        System.out.println("Corner Mercado St., Gen. T. De Leon, Valenzuela City");
        System.out.println("==========================================================");
        System.out.println("                                                            ");
        System.out.println("            SENIOR HIGH SCHOOL REPORT CARD");
        System.out.println("                                                             ");
        System.out.println("==========================================================");
        System.out.println("                                                             ");
        System.out.printf("%-25s %-10s%n", "LRN   :" + LRN,"Grade Level:" + gradeLevel);
        System.out.printf("%-25s %-10s%n", "Name   :" + firstName + middleName + lastName," Section:" + section);
        System.out.printf("%-25s %-10s %10s%n", "Track   :" + track,"Age:" + age,"Gender;" + gender);
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-30s %-10s%n", "SUBJECT","GRADE");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                                                             ");
        System.out.printf("%-30s %.2f%n", "General Mathematics", genMath);
        System.out.printf("%-30s %.2f%n", "General Science", genSci);
        System.out.printf("%-30s %.2f%n", "Effective Communication", effCom);
        System.out.printf("%-30s %.2f%n", "Mabisang kommunikasyon", mabKom);
        System.out.printf("%-30s %.2f%n", "Life and Career Skills", LCS);
        System.out.printf("%-30s %.2f%n", "PKLP", PKLP);
        System.out.printf("%-30s %.2f%n", "Computer Programming", comProg);
        System.out.println("-----------------------------------------------------------------------");
        double averageGrade = (genMath + genSci + effCom + mabKom + LCS + PKLP + comProg) / 7;
        if (averageGrade >= 75){
            remarks = "Passed";}
        else
        {
            remarks = "Failed";}
        System.out.printf("%-30s %.2f%n", "Average Grade", averageGrade);
        System.out.printf("%-30s %s%n", "Remarks", remarks);

        System.out.println("==========================================================");
    }

   public static void inputGrades(Scanner scanner){
       System.out.print("Enter LRN: ");
       String LRN = scanner.nextLine();
       System.out.print("Enter Last Name: ");
       String lastName = scanner.nextLine();
       System.out.print("Enter First Name: ");
       String firstName = scanner.nextLine();
       System.out.print("Enter Middle Name: ");
       String middleName = scanner.nextLine();
       System.out.print("Enter Track: ");
       String track = scanner.nextLine();
       System.out.print("Enter Grade Level: ");
       String gradeLevel = scanner.nextLine();
       System.out.print("Enter Section: ");
       String section = scanner.nextLine();
       System.out.print("Enter Age: ");
       String age = scanner.nextLine();
       System.out.print("Enter Gender: ");
       String gender = scanner.nextLine();
   }
}