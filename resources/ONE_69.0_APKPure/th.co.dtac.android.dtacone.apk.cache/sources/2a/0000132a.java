package p000;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: U70 */
/* loaded from: classes.dex */
public final class U70 implements InterfaceC12249m6 {

    /* renamed from: a */
    public final DecayAnimationSpec f6545a;

    public U70(DecayAnimationSpec decayAnimationSpec) {
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        this.f6545a = decayAnimationSpec;
    }

    @Override // p000.InterfaceC12249m6
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo72a(ScrollScope scrollScope, Object obj, Object obj2, Function1 function1, Continuation continuation) {
        return m66230b(scrollScope, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), function1, continuation);
    }

    /* renamed from: b */
    public Object m66230b(ScrollScope scrollScope, float f, float f2, Function1 function1, Continuation continuation) {
        Object m61395a;
        m61395a = SnapFlingBehaviorKt.m61395a(scrollScope, f, AnimationStateKt.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null), this.f6545a, function1, continuation);
        if (m61395a == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return m61395a;
        }
        return (C0774L4) m61395a;
    }
}