public class StringBuff {
    public static void main (String [] args ){
        StringBuffer sb1 = new StringBuffer(); // empty buffer
        StringBuffer sb2 = new StringBuffer("Hello"); // initiated 
        StringBuffer sb3 = new StringBuffer(50);

        System.out.println("sb1 capacity : " + sb1.capacity());
        System.out.println("sb2 content : " + sb2);
        System.out.println("sb3 capacity : " + sb3.capacity());
