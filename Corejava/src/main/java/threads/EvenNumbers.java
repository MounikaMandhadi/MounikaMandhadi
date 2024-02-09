package threads;

public class EvenNumbers implements Runnable  {
    // EvenNumberPrinter.java

        private int max;

        public EvenNumbers(int max) {
            this.max = max;
        }

        @Override
        public void run() {
            for (int i = 2; i <= max; i += 2) {
                System.out.println(i);
            }
        }
    }


