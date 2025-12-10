package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public final class DefaultDraggableState implements DraggableState {

    /* renamed from: a */
    public final Function1 f12945a;

    /* renamed from: b */
    public final DragScope f12946b;

    /* renamed from: c */
    public final MutatorMutex f12947c;

    public DefaultDraggableState(Function1 onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f12945a = onDelta;
        this.f12946b = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
            {
                DefaultDraggableState.this = this;
            }

            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f) {
                DefaultDraggableState.this.m61510c().invoke(Float.valueOf(f));
            }
        };
        this.f12947c = new MutatorMutex();
    }

    /* renamed from: c */
    public final Function1 m61510c() {
        return this.f12945a;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        this.f12945a.invoke(Float.valueOf(f));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new DefaultDraggableState$drag$2(this, mutatePriority, function2, null), continuation);
        if (coroutineScope == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }
}
