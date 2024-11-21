class Method
{
    public static void send(String name){
    System.out.println("name");
    }
    public static void send(int no){
        System.out.println(no);

    }
}
class Mainclass
{
    public static void main(String[] args) {
        Method.send("raaga");
        Method.send(67868);
    }

}