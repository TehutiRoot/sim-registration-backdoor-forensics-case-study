package p000;

import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* renamed from: bR1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC19180bR1 {
    /* renamed from: a */
    public static void m52011a(TaskExecutor taskExecutor, Runnable runnable) {
        taskExecutor.getSerialTaskExecutor().execute(runnable);
    }

    /* renamed from: b */
    public static CoroutineDispatcher m52010b(TaskExecutor taskExecutor) {
        return ExecutorsKt.from(taskExecutor.getSerialTaskExecutor());
    }
}
