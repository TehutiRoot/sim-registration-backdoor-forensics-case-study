package androidx.core.p005os;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.os.ExecutorCompat */
/* loaded from: classes2.dex */
public final class ExecutorCompat {

    /* renamed from: androidx.core.os.ExecutorCompat$a */
    /* loaded from: classes2.dex */
    public static class ExecutorC4038a implements Executor {

        /* renamed from: a */
        public final Handler f33948a;

        public ExecutorC4038a(Handler handler) {
            this.f33948a = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f33948a.post((Runnable) Preconditions.checkNotNull(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f33948a + " is shutting down");
        }
    }

    @NonNull
    public static Executor create(@NonNull Handler handler) {
        return new ExecutorC4038a(handler);
    }
}
