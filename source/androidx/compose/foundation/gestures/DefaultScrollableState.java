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
    public final Function1 f12952a;

    /* renamed from: b */
    public final ScrollScope f12953b;

    /* renamed from: c */
    public final MutatorMutex f12954c;

    /* renamed from: d */
    public final MutableState f12955d;

    public DefaultScrollableState(Function1 onDelta) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f12952a = onDelta;
        this.f12953b = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
            {
                DefaultScrollableState.this = this;
            }

            @Override // androidx.compose.foundation.gestures.ScrollScope
            public float scrollBy(float f) {
                if (Float.isNaN(f)) {
                    return 0.0f;
                }
                return ((Number) DefaultScrollableState.this.m61506d().invoke(Float.valueOf(f))).floatValue();
            }
        };
        this.f12954c = new MutatorMutex();
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f12955d = m31891g;
    }

    /* renamed from: d */
    public final Function1 m61506d() {
        return this.f12952a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return ((Number) this.f12952a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollBackward() {
        return JE1.m67774a(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollForward() {
        return JE1.m67773b(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return ((Boolean) this.f12955d.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new DefaultScrollableState$scroll$2(this, mutatePriority, function2, null), continuation);
        if (coroutineScope == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }
}
