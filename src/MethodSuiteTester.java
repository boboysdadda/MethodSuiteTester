
/**
 * Project:     MethodSuiteTester
 * FileName:    ${FILE_NAME}
 * Author:      james
 * Date:        3/31/2016
 * Description:
 */
class MethodSuiteTester {
    public static void main(String[] args) {

        //Test Variables
        double[] numbers = {2.5,3.4,5.1};
        int[] ints = {1,2,3,4,5,6,7,8,9,10};

        //Test Arguments
        System.out.println("Expect: 6. Got: " + MethodSuite.max(5,6));
        System.out.println("Expect: 6. Got: " + MethodSuite.max(6,5));
        System.out.println("Expect 11.0. Got: " + MethodSuite.total(numbers));
        System.out.println("Expect 10. Got: " + MethodSuite.max(ints));
        System.out.println("Expect 3.6. Got: " + MethodSuite.average(numbers));
    }
}
