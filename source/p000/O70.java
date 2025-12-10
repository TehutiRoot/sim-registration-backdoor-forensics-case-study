package p000;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O70 */
/* loaded from: classes.dex */
public final class O70 implements InterfaceC12264m6 {

    /* renamed from: a */
    public final DecayAnimationSpec f4307a;

    public O70(DecayAnimationSpec decayAnimationSpec) {
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        this.f4307a = decayAnimationSpec;
    }

    @Override // p000.InterfaceC12264m6
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo1371a(ScrollScope scrollScope, Object obj, Object obj2, Function1 function1, Continuation continuation) {
        return m67112b(scrollScope, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), function1, continuation);
    }

    /* renamed from: b */
    public Object m67112b(ScrollScope scrollScope, float f, float f2, Function1 function1, Continuation continuation) {
        Object access$animateDecay = SnapFlingBehaviorKt.access$animateDecay(scrollScope, f, AnimationStateKt.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null), this.f4307a, function1, continuation);
        if (access$animateDecay == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return access$animateDecay;
        }
        return (C0781L4) access$animateDecay;
    }
}
