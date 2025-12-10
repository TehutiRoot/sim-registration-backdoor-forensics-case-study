package androidx.compose.material3;

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

/* loaded from: classes2.dex */
public final class SliderDraggableState implements DraggableState {

    /* renamed from: a */
    public final Function1 f26159a;

    /* renamed from: b */
    public final MutableState f26160b;

    /* renamed from: c */
    public final DragScope f26161c;

    /* renamed from: d */
    public final MutatorMutex f26162d;

    public SliderDraggableState(Function1 onDelta) {
        MutableState m65148g;
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f26159a = onDelta;
        m65148g = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
        this.f26160b = m65148g;
        this.f26161c = new DragScope() { // from class: androidx.compose.material3.SliderDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f) {
                SliderDraggableState.this.m60512d().invoke(Float.valueOf(f));
            }
        };
        this.f26162d = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m60510f(boolean z) {
        this.f26160b.setValue(Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final Function1 m60512d() {
        return this.f26159a;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        this.f26159a.invoke(Float.valueOf(f));
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
    public final boolean m60511e() {
        return ((Boolean) this.f26160b.getValue()).booleanValue();
    }
}