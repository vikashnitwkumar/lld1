package assiglld1.lld.Concurrency3;

import java.util.concurrent.Semaphore;

public class FooBar {
    private int n;
    Semaphore firstSemaphore;
    Semaphore secondSemaphore;

    public FooBar(int n) {
        this.n = n;
        firstSemaphore = new Semaphore(1);
        secondSemaphore = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.
            firstSemaphore.acquire();
            printFoo.run();
            secondSemaphore.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printBar.run() outputs "bar". Do not change or remove this line.
            firstSemaphore.acquire();
            printBar.run();
            secondSemaphore.release();
        }
    }
}
