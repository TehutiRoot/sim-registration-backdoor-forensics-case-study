package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.Threads;
import androidx.core.util.Preconditions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class Threads {
    /* renamed from: a */
    public static /* synthetic */ void m62794a(Runnable runnable, CountDownLatch countDownLatch) {
        m62792c(runnable, countDownLatch);
    }

    /* renamed from: b */
    public static Handler m62793b() {
        return new Handler(Looper.getMainLooper());
    }

    /* renamed from: c */
    public static /* synthetic */ void m62792c(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void checkBackgroundThread() {
        Preconditions.checkState(isBackgroundThread(), "In application's main thread");
    }

    public static void checkMainThread() {
        Preconditions.checkState(isMainThread(), "Not in application's main thread");
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static boolean isMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void runOnMain(@NonNull Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            Preconditions.checkState(m62793b().post(runnable), "Unable to post to main thread");
        }
    }

    public static void runOnMainSync(@NonNull final Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Preconditions.checkState(m62793b().post(new Runnable() { // from class: RT1
            @Override // java.lang.Runnable
            public final void run() {
                Threads.m62794a(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                return;
            }
            throw new IllegalStateException("Timeout to wait main thread execution");
        } catch (InterruptedException e) {
            throw new InterruptedRuntimeException(e);
        }
    }
}