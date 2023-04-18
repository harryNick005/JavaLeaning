package InterviewPractice;

public class calculation_practice {
    public static int calculation(int numerator , int denominator) {

        int count=0;
        while(numerator>=0){
             if(numerator-denominator>=0){
                 count+=1;

             }
            numerator=numerator-denominator;
        }
        return count;
    }
//    public static void calculation(float numerator,float denominator) {
//
//        int count=0; int reminder=0;
//
//        while(numerator>=denominator){
//             if(numerator-denominator>=0){
//                 count+=1;
//                 numerator=numerator-denominator;
//                 if(numerator<denominator){
//                  reminder=(int)numerator;
//                 }
//
//             }
//
//        }
//        System.out.println("The result is: "+count+"......."+reminder);
//    }
    public static void calculation(float numerator,float denominator) {

        int count=0; int reminder=0;

       do {
           if(numerator-denominator>=0){
               count+=1;
               numerator=numerator-denominator;
               if(numerator-denominator<denominator){
                   reminder=(int)numerator;
               }
           }

           }while (numerator>=denominator);


        System.out.println("The result is: "+count+"......."+reminder);
    }

    public static void main(String[] args) {
        calculation(10.0f,3.0f);
        System.out.println(10/3);
    }
}
