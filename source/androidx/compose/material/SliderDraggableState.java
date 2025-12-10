package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public final class SliderDraggableState implements DraggableState {

    /* renamed from: a */
    public final Function1 f14589a;

    /* renamed from: b */
    public final MutableState f14590b;

    /* renamed from: c */
    public final DragScope f14591c;

    /* renamed from: d */
    public final MutatorMutex f14592d;

    public SliderDraggableState(Function1 onDelta) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f14589a = onDelta;
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f14590b = m31891g;
        this.f14591c = new DragScope() { // from class: androidx.compose.material.SliderDraggableState$dragScope$1
            {
                SliderDraggableState.this = this;
            }

            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f) {
                SliderDraggableState.this.m60832d().invoke(Float.valueOf(f));
            }
        };
        this.f14592d = new MutatorMutex();
    }

    /* renamed from: d */
    public final Function1 m60832d() {
        return this.f14589a;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        this.f14589a.invoke(Float.valueOf(f));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new SliderDraggableState$drag$2(this, mutatePriority, function2, null), continuation);
        if (coroutineScope == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public final boolean m60831e() {
        return ((Boolean) this.f14590b.getValue()).booleanValue();
    }

    /* renamed from: f */
    public final void m60830f(boolean z) {
        this.f14590b.setValue(Boolean.valueOf(z));
    }
}
