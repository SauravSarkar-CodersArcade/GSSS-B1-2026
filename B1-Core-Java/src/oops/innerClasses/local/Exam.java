package oops.innerClasses.local;
public class Exam {
    void evaluate(int marks){
        class GradeCalculator{
            String calculate(){
                if(marks >= 75) return "Distinction";
                else if (marks >= 60) return "First Class";
                else return "Pass";
            }
        }
        GradeCalculator gc = new GradeCalculator();
        System.out.println(gc.calculate());
    }
    void displayExamDate(){
        System.out.println("The exam date is 5th of May.");
    }
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.evaluate(80);
        exam.evaluate(50);
        exam.displayExamDate();
    }
}
/*
⭐ The Grade Logic is scoped to the "evaluate" method only
⭐ It avoids polluting the class with helper methods
⭐ Helps in designing the codebase in a cleaner way
 */
