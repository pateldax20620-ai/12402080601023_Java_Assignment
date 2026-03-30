public class Program3 {

    public static void main(String[] args) {

        // Wrapper Class Example
        int num = 10;

        // Converting primitive to wrapper object (Autoboxing)
        Integer obj = Integer.valueOf(num);

        // Converting wrapper object to primitive (Unboxing)
        int value = obj.intValue();

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object: " + obj);
        System.out.println("Unboxed value: " + value);

        // String Example
        String str = "Hello";
        str = str + " World"; // creates new object

        System.out.println("String Result: " + str);

        // StringBuffer Example
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // modifies same object

        System.out.println("StringBuffer Result: " + sb);
    }
}