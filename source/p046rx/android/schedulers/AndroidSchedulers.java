package p046rx.android.schedulers;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Scheduler;
import p046rx.android.plugins.RxAndroidPlugins;
import p046rx.annotations.Experimental;

/* renamed from: rx.android.schedulers.AndroidSchedulers */
/* loaded from: classes5.dex */
public final class AndroidSchedulers {

    /* renamed from: b */
    public static final AtomicReference f77704b = new AtomicReference();

    /* renamed from: a */
    public final Scheduler f77705a;

    public AndroidSchedulers() {
        Scheduler mainThreadScheduler = RxAndroidPlugins.getInstance().getSchedulersHook().getMainThreadScheduler();
        if (mainThreadScheduler != null) {
            this.f77705a = mainThreadScheduler;
        } else {
            this.f77705a = new C18065Mm0(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static AndroidSchedulers m23169a() {
        AtomicReference atomicReference;
        AndroidSchedulers androidSchedulers;
        do {
            atomicReference = f77704b;
            AndroidSchedulers androidSchedulers2 = (AndroidSchedulers) atomicReference.get();
            if (androidSchedulers2 != null) {
                return androidSchedulers2;
            }
            androidSchedulers = new AndroidSchedulers();
        } while (!AbstractC17300An1.m69050a(atomicReference, null, androidSchedulers));
        return androidSchedulers;
    }

    public static Scheduler from(Looper looper) {
        if (looper != null) {
            return new C18065Mm0(looper);
        }
        throw new NullPointerException("looper == null");
    }

    public static Scheduler mainThread() {
        return m23169a().f77705a;
    }

    @Experimental
    public static void reset() {
        f77704b.set(null);
    }
}
