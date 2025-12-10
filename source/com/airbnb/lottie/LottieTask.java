package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.utils.Logger;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes3.dex */
public class LottieTask<T> {
    public static Executor EXECUTOR = Executors.newCachedThreadPool();

    /* renamed from: a */
    public final Set f40998a;

    /* renamed from: b */
    public final Set f40999b;

    /* renamed from: c */
    public final Handler f41000c;

    /* renamed from: d */
    public volatile LottieResult f41001d;

    /* renamed from: com.airbnb.lottie.LottieTask$a */
    /* loaded from: classes3.dex */
    public class C5669a extends FutureTask {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5669a(Callable callable) {
            super(callable);
            LottieTask.this = r1;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (!isCancelled()) {
                try {
                    LottieTask.this.m50912g((LottieResult) get());
                } catch (InterruptedException | ExecutionException e) {
                    LottieTask.this.m50912g(new LottieResult(e));
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieTask(Callable<LottieResult<T>> callable) {
        this(callable, false);
    }

    /* renamed from: a */
    public static /* synthetic */ void m50918a(LottieTask lottieTask) {
        lottieTask.m50916c();
    }

    public synchronized LottieTask<T> addFailureListener(LottieListener<Throwable> lottieListener) {
        try {
            LottieResult lottieResult = this.f41001d;
            if (lottieResult != null && lottieResult.getException() != null) {
                lottieListener.onResult(lottieResult.getException());
            }
            this.f40999b.add(lottieListener);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized LottieTask<T> addListener(LottieListener<T> lottieListener) {
        try {
            LottieResult lottieResult = this.f41001d;
            if (lottieResult != null && lottieResult.getValue() != null) {
                lottieListener.onResult(lottieResult.getValue());
            }
            this.f40998a.add(lottieListener);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    /* renamed from: c */
    public final /* synthetic */ void m50916c() {
        LottieResult lottieResult = this.f41001d;
        if (lottieResult == null) {
            return;
        }
        if (lottieResult.getValue() != null) {
            m50913f(lottieResult.getValue());
        } else {
            m50915d(lottieResult.getException());
        }
    }

    /* renamed from: d */
    public final synchronized void m50915d(Throwable th2) {
        ArrayList<LottieListener> arrayList = new ArrayList(this.f40999b);
        if (arrayList.isEmpty()) {
            Logger.warning("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        for (LottieListener lottieListener : arrayList) {
            lottieListener.onResult(th2);
        }
    }

    /* renamed from: e */
    public final void m50914e() {
        this.f41000c.post(new Runnable() { // from class: sn0
            @Override // java.lang.Runnable
            public final void run() {
                LottieTask.m50918a(LottieTask.this);
            }
        });
    }

    /* renamed from: f */
    public final synchronized void m50913f(Object obj) {
        for (LottieListener lottieListener : new ArrayList(this.f40998a)) {
            lottieListener.onResult(obj);
        }
    }

    /* renamed from: g */
    public final void m50912g(LottieResult lottieResult) {
        if (this.f41001d == null) {
            this.f41001d = lottieResult;
            m50914e();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized LottieTask<T> removeFailureListener(LottieListener<Throwable> lottieListener) {
        this.f40999b.remove(lottieListener);
        return this;
    }

    public synchronized LottieTask<T> removeListener(LottieListener<T> lottieListener) {
        this.f40998a.remove(lottieListener);
        return this;
    }

    public LottieTask(Callable callable, boolean z) {
        this.f40998a = new LinkedHashSet(1);
        this.f40999b = new LinkedHashSet(1);
        this.f41000c = new Handler(Looper.getMainLooper());
        this.f41001d = null;
        if (z) {
            try {
                m50912g((LottieResult) callable.call());
                return;
            } catch (Throwable th2) {
                m50912g(new LottieResult(th2));
                return;
            }
        }
        EXECUTOR.execute(new C5669a(callable));
    }
}
