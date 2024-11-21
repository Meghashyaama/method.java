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
        Method.send("Radhakrishna");
        Method.send(67868);
        Method.send("MeghashyaamA");
        Method.send(45642657);
    }

}
