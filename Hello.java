public class Hello {
    public static void world(String input) {
        if (input.startsWith("System.out.print(\"") && input.endsWith("\")")){
            // con for Content
            String con = input.substring(18, input.length()-2 );
            System.out.print(con);
        }else {
            System.out.println("Error or Invalid input Format");
        }
    }
    public static void main(String[] args) {
//        Hello.world
        Hello.world("System.out.print(\"Hello, that's me!\")");
    }
}
