package _COROUTINE;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m28850d2 = {"L_COROUTINE/ArtificialStackFrames;", "", "()V", "coroutineBoundary", "Ljava/lang/StackTraceElement;", "coroutineCreation", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class ArtificialStackFrames {
    @NotNull
    public final StackTraceElement coroutineBoundary() {
        StackTraceElement m65130a;
        m65130a = CoroutineDebuggingKt.m65130a(new Exception(), AbstractC18948a72.class.getSimpleName());
        return m65130a;
    }

    @NotNull
    public final StackTraceElement coroutineCreation() {
        StackTraceElement m65130a;
        m65130a = CoroutineDebuggingKt.m65130a(new Exception(), AbstractC19126b72.class.getSimpleName());
        return m65130a;
    }
}
