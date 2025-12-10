package androidx.camera.core.impl.utils.executor;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.executor.AudioExecutor;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AudioExecutor implements Executor {

    /* renamed from: b */
    public static volatile Executor f11317b;

    /* renamed from: a */
    public final ExecutorService f11318a = Executors.newFixedThreadPool(2, new ThreadFactoryC2541a());

    /* renamed from: androidx.camera.core.impl.utils.executor.AudioExecutor$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC2541a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f11319a = new AtomicInteger(0);

        public ThreadFactoryC2541a() {
        }

        /* renamed from: b */
        public static /* synthetic */ void m62841b(Runnable runnable) {
            Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: m7
                @Override // java.lang.Runnable
                public final void run() {
                    AudioExecutor.ThreadFactoryC2541a.m62841b(runnable);
                }
            });
            thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.f11319a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: a */
    public static Executor m62843a() {
        if (f11317b != null) {
            return f11317b;
        }
        synchronized (AudioExecutor.class) {
            try {
                if (f11317b == null) {
                    f11317b = new AudioExecutor();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11317b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f11318a.execute(runnable);
    }
}
