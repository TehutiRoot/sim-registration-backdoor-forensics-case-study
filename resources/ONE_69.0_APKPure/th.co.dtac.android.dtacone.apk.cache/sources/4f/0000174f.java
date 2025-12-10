package p000;

import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* renamed from: YR1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class YR1 {
    /* renamed from: a */
    public static void m65457a(TaskExecutor taskExecutor, Runnable runnable) {
        taskExecutor.getSerialTaskExecutor().execute(runnable);
    }

    /* renamed from: b */
    public static CoroutineDispatcher m65456b(TaskExecutor taskExecutor) {
        return ExecutorsKt.from(taskExecutor.getSerialTaskExecutor());
    }
}