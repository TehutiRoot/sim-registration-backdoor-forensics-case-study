package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__BuildersKt {
    /* renamed from: a */
    public static final Flow m27073a(Iterable iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    /* renamed from: b */
    public static final Flow m27072b(Iterator it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    /* renamed from: c */
    public static final Flow m27071c(final Function0 function0) {
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation<? super Unit> continuation) {
                Object emit = flowCollector.emit(Function0.this.invoke(), continuation);
                if (emit == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                    return emit;
                }
                return Unit.INSTANCE;
            }
        };
    }

    /* renamed from: d */
    public static final Flow m27070d(Function1 function1) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(function1);
    }

    /* renamed from: e */
    public static final Flow m27069e(IntRange intRange) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(intRange);
    }

    /* renamed from: f */
    public static final Flow m27068f(LongRange longRange) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(longRange);
    }

    /* renamed from: g */
    public static final Flow m27067g(Sequence sequence) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(sequence);
    }

    /* renamed from: h */
    public static final Flow m27066h(int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    /* renamed from: i */
    public static final Flow m27065i(long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    /* renamed from: j */
    public static final Flow m27064j(Object[] objArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(objArr);
    }

    /* renamed from: k */
    public static final Flow m27063k(Function2 function2) {
        return new CallbackFlowBuilder(function2, null, 0, null, 14, null);
    }

    /* renamed from: l */
    public static final Flow m27062l(Function2 function2) {
        return new C1410To(function2, null, 0, null, 14, null);
    }

    /* renamed from: m */
    public static final Flow m27061m() {
        return C13182qR.f76972a;
    }

    /* renamed from: n */
    public static final Flow m27060n(Function2 function2) {
        return new C20175hD1(function2);
    }

    /* renamed from: o */
    public static final Flow m27059o(final Object obj) {
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation<? super Unit> continuation) {
                Object emit = flowCollector.emit(obj, continuation);
                if (emit == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                    return emit;
                }
                return Unit.INSTANCE;
            }
        };
    }

    /* renamed from: p */
    public static final Flow m27058p(Object... objArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(objArr);
    }
}
