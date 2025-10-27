public class test {

    public void testNestedLoops() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }

    public void testWhileInFor() {
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 10) {
                System.out.println(i + ", " + j);
                j++;
            }
        }
    }

    public void testTripleNestedLoops() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(i + ", " + j + ", " + k);
                }
            }
        }
    }

    public void testSequentialLoops() {
        for (int i = 0; i < 10; i++) {
            System.out.println("First: " + i);
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Second: " + j);
        }
    }

    public void testLoopInBlock() {
        for (int i = 0; i < 10; i++) {
            {
                for (int j = 0; j < 10; j++) {
                    System.out.println(i + ", " + j);
                }
            }
        }
    }

    public void testMethodCallInLoop() {
        for (int i = 0; i < 10; i++) {
            helperMethod(i);
        }
    }

    private void helperMethod(int x) {
        System.out.println(x);
    }
}