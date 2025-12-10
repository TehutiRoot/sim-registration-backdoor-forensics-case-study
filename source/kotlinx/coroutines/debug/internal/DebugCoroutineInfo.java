package kotlinx.coroutines.debug.internal;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010*\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010-\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188G¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u001d¨\u00060"}, m28850d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "source", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCreationStackBottom", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "creationStackBottom", "", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getSequenceNumber", "()J", "sequenceNumber", "", "Ljava/lang/StackTraceElement;", "d", "Ljava/util/List;", "getCreationStackTrace", "()Ljava/util/List;", "creationStackTrace", "", "e", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ljava/lang/Thread;", OperatorName.FILL_NON_ZERO, "Ljava/lang/Thread;", "getLastObservedThread", "()Ljava/lang/Thread;", "lastObservedThread", OperatorName.NON_STROKING_GRAY, "getLastObservedFrame", "lastObservedFrame", OperatorName.CLOSE_PATH, "lastObservedStackTrace", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@PublishedApi
/* loaded from: classes6.dex */
public final class DebugCoroutineInfo {

    /* renamed from: a */
    public final CoroutineContext f70728a;

    /* renamed from: b */
    public final CoroutineStackFrame f70729b;

    /* renamed from: c */
    public final long f70730c;

    /* renamed from: d */
    public final List f70731d;

    /* renamed from: e */
    public final String f70732e;

    /* renamed from: f */
    public final Thread f70733f;

    /* renamed from: g */
    public final CoroutineStackFrame f70734g;

    /* renamed from: h */
    public final List f70735h;

    public DebugCoroutineInfo(@NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl, @NotNull CoroutineContext coroutineContext) {
        this.f70728a = coroutineContext;
        this.f70729b = debugCoroutineInfoImpl.getCreationStackBottom();
        this.f70730c = debugCoroutineInfoImpl.sequenceNumber;
        this.f70731d = debugCoroutineInfoImpl.getCreationStackTrace();
        this.f70732e = debugCoroutineInfoImpl.getState();
        this.f70733f = debugCoroutineInfoImpl.lastObservedThread;
        this.f70734g = debugCoroutineInfoImpl.getLastObservedFrame$kotlinx_coroutines_core();
        this.f70735h = debugCoroutineInfoImpl.lastObservedStackTrace();
    }

    @NotNull
    public final CoroutineContext getContext() {
        return this.f70728a;
    }

    @Nullable
    public final CoroutineStackFrame getCreationStackBottom() {
        return this.f70729b;
    }

    @NotNull
    public final List<StackTraceElement> getCreationStackTrace() {
        return this.f70731d;
    }

    @Nullable
    public final CoroutineStackFrame getLastObservedFrame() {
        return this.f70734g;
    }

    @Nullable
    public final Thread getLastObservedThread() {
        return this.f70733f;
    }

    public final long getSequenceNumber() {
        return this.f70730c;
    }

    @NotNull
    public final String getState() {
        return this.f70732e;
    }

    @JvmName(name = "lastObservedStackTrace")
    @NotNull
    public final List<StackTraceElement> lastObservedStackTrace() {
        return this.f70735h;
    }
}
