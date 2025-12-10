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
    public final Function3 f12957a;

    /* renamed from: b */
    public final TransformScope f12958b;

    /* renamed from: c */
    public final MutatorMutex f12959c;

    /* renamed from: d */
    public final MutableState f12960d;

    public DefaultTransformableState(Function3 onTransformation) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(onTransformation, "onTransformation");
        this.f12957a = onTransformation;
        this.f12958b = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
            @Override // androidx.compose.foundation.gestures.TransformScope
            /* renamed from: transformBy-d-4ec7I  reason: not valid java name */
            public void mo69384transformByd4ec7I(float f, long j, float f2) {
                DefaultTransformableState.this.m61502d().invoke(Float.valueOf(f), Offset.m71491boximpl(j), Float.valueOf(f2));
            }
        };
        this.f12959c = new MutatorMutex();
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f12960d = m31891g;
    }

    /* renamed from: d */
    public final Function3 m61502d() {
        return this.f12957a;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return ((Boolean) this.f12960d.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new DefaultTransformableState$transform$2(this, mutatePriority, function2, null), continuation);
        if (coroutineScope == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }
}
