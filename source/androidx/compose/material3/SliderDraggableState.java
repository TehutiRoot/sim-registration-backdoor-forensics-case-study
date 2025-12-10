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
    public final Function1 f26071a;

    /* renamed from: b */
    public final MutableState f26072b;

    /* renamed from: c */
    public final DragScope f26073c;

    /* renamed from: d */
    public final MutatorMutex f26074d;

    public SliderDraggableState(Function1 onDelta) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f26071a = onDelta;
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f26072b = m31891g;
        this.f26073c = new DragScope() { // from class: androidx.compose.material3.SliderDraggableState$dragScope$1
            {
                SliderDraggableState.this = this;
            }

            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f) {
                SliderDraggableState.this.m60562d().invoke(Float.valueOf(f));
            }
        };
        this.f26074d = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m60560f(boolean z) {
        this.f26072b.setValue(Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final Function1 m60562d() {
        return this.f26071a;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        this.f26071a.invoke(Float.valueOf(f));
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
    public final boolean m60561e() {
        return ((Boolean) this.f26072b.getValue()).booleanValue();
    }
}
