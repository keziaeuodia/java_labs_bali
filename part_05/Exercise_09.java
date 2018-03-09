package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class VarArgs{
    static String varDemo(String...var){
        StringBuilder sb = new StringBuilder();

        for(String val : var){
            sb.append(val + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(varDemo("It's", "another", "day"));
        System.out.println(varDemo("in", "paradise"));
        System.out.println(varDemo("I'm", "lovin'", "it"));

    }
}


