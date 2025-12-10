package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ProfileInstallerInitializer implements Initializer<Result> {

    /* loaded from: classes2.dex */
    public static class Result {
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    /* loaded from: classes2.dex */
    public static class C4845a {
        /* renamed from: a */
        public static /* synthetic */ void m53676a(Runnable runnable, long j) {
            runnable.run();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m53674c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: tp1
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    ProfileInstallerInitializer.C4845a.m53676a(runnable, j);
                }
            });
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    /* loaded from: classes2.dex */
    public static class C4846b {
        @DoNotInline
        /* renamed from: a */
        public static Handler m53673a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m53685a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        profileInstallerInitializer.m53680f(context);
    }

    /* renamed from: b */
    public static /* synthetic */ void m53684b(Context context) {
        ProfileInstaller.writeProfile(context);
    }

    /* renamed from: c */
    public static /* synthetic */ void m53683c(Context context) {
        m53677i(context);
    }

    /* renamed from: i */
    public static void m53677i(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: sp1
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m53684b(context);
            }
        });
    }

    /* renamed from: d */
    public void m53682d(final Context context) {
        C4845a.m53674c(new Runnable() { // from class: qp1
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m53685a(ProfileInstallerInitializer.this, context);
            }
        });
    }

    @Override // androidx.startup.Initializer
    @NonNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* renamed from: e */
    public void m53680f(final Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C4846b.m53673a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: rp1
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m53683c(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    @Override // androidx.startup.Initializer
    @NonNull
    public Result create(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new Result();
        }
        m53682d(context.getApplicationContext());
        return new Result();
    }
}