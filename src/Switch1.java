public class Switch1{

    void test(int x, int y){

/*
 * 
 * You only ned to care about the code between 
 * these two comment blocks!
 * 
 */
        switch (x % 3) {
            case y:
                System.out.println("A");
            break;
            case 0:
                if(x > 3){
                    System.out.println("B");
                } else {
                    System.out.println("C");
                }
            break;
            case 1:
                if(x == 3){
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            break;
            case 2:
                if (x == y) {
                    System.out.println("F");
                }
                System.out.println("G");
            break;
            default:
                System.out.println("H");
            break;
        }

 /*
 * 
 * You only ned to care about the code between 
 * these two comment blocks!
 * 
 */

    }

}