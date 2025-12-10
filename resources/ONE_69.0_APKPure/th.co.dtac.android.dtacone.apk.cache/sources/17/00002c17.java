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
    public final Function1 f14677a;

    /* renamed from: b */
    public final MutableState f14678b;

    /* renamed from: c */
    public final DragScope f14679c;

    /* renamed from: d */
    public final MutatorMutex f14680d;

    public SliderDraggableState(Function1 onDelta) {
        MutableState m65148g;
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f14677a = onDelta;
        m65148g = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
        this.f14678b = m65148g;
        this.f14679c = new DragScope() { // from class: androidx.compose.material.SliderDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f) {
                SliderDraggableState.this.m60782d().invoke(Float.valueOf(f));
            }
        };
        this.f14680d = new MutatorMutex();
    }

    /* renamed from: d */
    public final Function1 m60782d() {
        return this.f14677a;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        this.f14677a.invoke(Float.valueOf(f));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new SliderDraggableState$drag$2(this, mutatePriority, function2, null), continuation);
        if (coroutineScope == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public final boolean m60781e() {
        return ((Boolean) this.f14678b.getValue()).booleanValue();
    }

    /* renamed from: f */
    public final void m60780f(boolean z) {
        this.f14678b.setValue(Boolean.valueOf(z));
    }
}