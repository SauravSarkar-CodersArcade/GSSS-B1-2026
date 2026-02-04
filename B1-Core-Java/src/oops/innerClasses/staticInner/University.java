package oops.innerClasses.staticInner;
public class University {
    static class AdmissionRules {
        static boolean isEligible(int marks){
            return marks >= 60;
        }
    }
    public static void main(String[] args) {
        boolean result1 = University.AdmissionRules.isEligible(35);
        System.out.println(result1);
        boolean result2 = University.AdmissionRules.isEligible(72);
        System.out.println(result2);
    }
}
/*
Points to remember:
⭐ No University object needed
⭐ Logical grouping of data -> improves readability
⭐ Similar to utility-helper classes
 */
