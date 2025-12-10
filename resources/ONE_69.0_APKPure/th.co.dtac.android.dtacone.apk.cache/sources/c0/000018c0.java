package _COROUTINE;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m29142d2 = {"L_COROUTINE/ArtificialStackFrames;", "", "()V", "coroutineBoundary", "Ljava/lang/StackTraceElement;", "coroutineCreation", "kotlinx-coroutines-core"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ArtificialStackFrames {
    @NotNull
    public final StackTraceElement coroutineBoundary() {
        StackTraceElement m65191a;
        m65191a = CoroutineDebuggingKt.m65191a(new Exception(), X72.class.getSimpleName());
        return m65191a;
    }

    @NotNull
    public final StackTraceElement coroutineCreation() {
        StackTraceElement m65191a;
        m65191a = CoroutineDebuggingKt.m65191a(new Exception(), Y72.class.getSimpleName());
        return m65191a;
    }
}