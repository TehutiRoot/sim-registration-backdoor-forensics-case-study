package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public final class DefaultTransformableState implements TransformableState {

    /* renamed from: a */
    public final Function3 f13045a;

    /* renamed from: b */
    public final TransformScope f13046b;

    /* renamed from: c */
    public final MutatorMutex f13047c;

    /* renamed from: d */
    public final MutableState f13048d;

    public DefaultTransformableState(Function3 onTransformation) {
        MutableState m65148g;
        Intrinsics.checkNotNullParameter(onTransformation, "onTransformation");
        this.f13045a = onTransformation;
        this.f13046b = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
            @Override // androidx.compose.foundation.gestures.TransformScope
            /* renamed from: transformBy-d-4ec7I  reason: not valid java name */
            public void mo69568transformByd4ec7I(float f, long j, float f2) {
                DefaultTransformableState.this.m61452d().invoke(Float.valueOf(f), Offset.m71675boximpl(j), Float.valueOf(f2));
            }
        };
        this.f13047c = new MutatorMutex();
        m65148g = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
        this.f13048d = m65148g;
    }

    /* renamed from: d */
    public final Function3 m61452d() {
        return this.f13045a;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return ((Boolean) this.f13048d.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new DefaultTransformableState$transform$2(this, mutatePriority, function2, null), continuation);
        if (coroutineScope == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }
}