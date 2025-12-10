package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class AndroidSchedulers {

    /* renamed from: a */
    public static final Scheduler f63813a = RxAndroidPlugins.initMainThreadScheduler(new CallableC10746a());

    /* renamed from: io.reactivex.android.schedulers.AndroidSchedulers$a */
    /* loaded from: classes5.dex */
    public static class CallableC10746a implements Callable {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Scheduler call() {
            return C10747b.f63814a;
        }
    }

    /* renamed from: io.reactivex.android.schedulers.AndroidSchedulers$b */
    /* loaded from: classes5.dex */
    public static final class C10747b {

        /* renamed from: a */
        public static final Scheduler f63814a = new C22220t70(new Handler(Looper.getMainLooper()), false);
    }

    public static Scheduler from(Looper looper) {
        return from(looper, false);
    }

    public static Scheduler mainThread() {
        return RxAndroidPlugins.onMainThreadScheduler(f63813a);
    }

    @SuppressLint({"NewApi"})
    public static Scheduler from(Looper looper, boolean z) {
        if (looper != null) {
            int i = Build.VERSION.SDK_INT;
            if (z && i < 22) {
                Message obtain = Message.obtain();
                try {
                    obtain.setAsynchronous(true);
                } catch (NoSuchMethodError unused) {
                    z = false;
                }
                obtain.recycle();
            }
            return new C22220t70(new Handler(looper), z);
        }
        throw new NullPointerException("looper == null");
    }
}
