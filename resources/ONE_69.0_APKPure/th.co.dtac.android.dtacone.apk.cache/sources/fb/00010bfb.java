package p046rx.internal.util;

import java.util.concurrent.CountDownLatch;
import p046rx.Subscription;

/* renamed from: rx.internal.util.BlockingUtils */
/* loaded from: classes7.dex */
public final class BlockingUtils {
    public static void awaitForComplete(CountDownLatch countDownLatch, Subscription subscription) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            subscription.unsubscribe();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
        }
    }
}