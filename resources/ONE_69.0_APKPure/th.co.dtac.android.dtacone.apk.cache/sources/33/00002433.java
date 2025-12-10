package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public final class DefaultScrollableState implements ScrollableState {

    /* renamed from: a */
    public final Function1 f13040a;

    /* renamed from: b */
    public final ScrollScope f13041b;

    /* renamed from: c */
    public final MutatorMutex f13042c;

    /* renamed from: d */
    public final MutableState f13043d;

    public DefaultScrollableState(Function1 onDelta) {
        MutableState m65148g;
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f13040a = onDelta;
        this.f13041b = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
            @Override // androidx.compose.foundation.gestures.ScrollScope
            public float scrollBy(float f) {
                if (Float.isNaN(f)) {
                    return 0.0f;
                }
                return ((Number) DefaultScrollableState.this.m61456d().invoke(Float.valueOf(f))).floatValue();
            }
        };
        this.f13042c = new MutatorMutex();
        m65148g = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
        this.f13043d = m65148g;
    }

    /* renamed from: d */
    public final Function1 m61456d() {
        return this.f13040a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return ((Number) this.f13040a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollBackward() {
        return GF1.m68304a(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollForward() {
        return GF1.m68303b(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return ((Boolean) this.f13043d.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new DefaultScrollableState$scroll$2(this, mutatePriority, function2, null), continuation);
        if (coroutineScope == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }
}