package p000;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.p003ui.unit.Density;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tn0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22332tn0 implements InterfaceC12264m6 {

    /* renamed from: a */
    public final AnimationSpec f107205a;

    /* renamed from: b */
    public final SnapLayoutInfoProvider f107206b;

    /* renamed from: c */
    public final Density f107207c;

    public C22332tn0(AnimationSpec lowVelocityAnimationSpec, SnapLayoutInfoProvider layoutInfoProvider, Density density) {
        Intrinsics.checkNotNullParameter(lowVelocityAnimationSpec, "lowVelocityAnimationSpec");
        Intrinsics.checkNotNullParameter(layoutInfoProvider, "layoutInfoProvider");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f107205a = lowVelocityAnimationSpec;
        this.f107206b = layoutInfoProvider;
        this.f107207c = density;
    }

    @Override // p000.InterfaceC12264m6
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo1371a(ScrollScope scrollScope, Object obj, Object obj2, Function1 function1, Continuation continuation) {
        return m1370b(scrollScope, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), function1, continuation);
    }

    /* renamed from: b */
    public Object m1370b(ScrollScope scrollScope, float f, float f2, Function1 function1, Continuation continuation) {
        Object access$animateSnap = SnapFlingBehaviorKt.access$animateSnap(scrollScope, (Math.abs(f) + this.f107206b.calculateSnapStepSize(this.f107207c)) * Math.signum(f2), f, AnimationStateKt.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null), this.f107205a, function1, continuation);
        if (access$animateSnap == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return access$animateSnap;
        }
        return (C0781L4) access$animateSnap;
    }
}
