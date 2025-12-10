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
    public final Function1 f13033a;

    /* renamed from: b */
    public final DragScope f13034b;

    /* renamed from: c */
    public final MutatorMutex f13035c;

    public DefaultDraggableState(Function1 onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f13033a = onDelta;
        this.f13034b = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f) {
                DefaultDraggableState.this.m61460c().invoke(Float.valueOf(f));
            }
        };
        this.f13035c = new MutatorMutex();
    }

    /* renamed from: c */
    public final Function1 m61460c() {
        return this.f13033a;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        this.f13033a.invoke(Float.valueOf(f));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new DefaultDraggableState$drag$2(this, mutatePriority, function2, null), continuation);
        if (coroutineScope == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }
}