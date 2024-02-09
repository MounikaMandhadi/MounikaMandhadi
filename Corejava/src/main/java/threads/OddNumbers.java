package threads;

public class OddNumbers implements Runnable {

        private int max;

        public OddNumbers(int max) {
            this.max = max;
        }

        @Override
        public void run() {
            for (int i = 1; i <= max; i += 2) {
                System.out.println(i);
            }
        }
    }


