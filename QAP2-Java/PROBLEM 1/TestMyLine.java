public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println(line1); // MyLine[begin=(0,0),end=(3,4)]
        System.out.println("Length: " + line1.getLength()); // 5.0
    }
}
