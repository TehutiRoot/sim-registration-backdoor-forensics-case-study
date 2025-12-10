package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CameraXExecutors {
    @NonNull
    public static Executor audioExecutor() {
        return AudioExecutor.m62843a();
    }

    @NonNull
    public static Executor directExecutor() {
        return ExecutorC1377TI.m66216a();
    }

    @NonNull
    public static Executor highPriorityExecutor() {
        return N70.m67242a();
    }

    @NonNull
    public static Executor ioExecutor() {
        return ExecutorC21967rg0.m23296a();
    }

    public static boolean isSequentialExecutor(@NonNull Executor executor) {
        return executor instanceof SequentialExecutor;
    }

    @NonNull
    public static ScheduledExecutorService mainThreadExecutor() {
        return AbstractC17491Dn0.m68589a();
    }

    @NonNull
    public static ScheduledExecutorService myLooperExecutor() {
        return ScheduledExecutorServiceC22048s70.m22709c();
    }

    @NonNull
    public static ScheduledExecutorService newHandlerExecutor(@NonNull Handler handler) {
        return new ScheduledExecutorServiceC22048s70(handler);
    }

    @NonNull
    public static Executor newSequentialExecutor(@NonNull Executor executor) {
        return new SequentialExecutor(executor);
    }
}
