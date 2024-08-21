public class innerDemo {
    static class inner {
        class innermost {
            public static int x = 10;
        }
    }

    public static void main(String[] args) {
        inner obj1 = new inner();
        System.out.println(inner.innermost.x);
    }
}
