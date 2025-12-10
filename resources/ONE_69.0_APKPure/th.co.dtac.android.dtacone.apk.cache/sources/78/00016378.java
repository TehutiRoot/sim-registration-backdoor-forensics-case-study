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

/* renamed from: zn0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23436zn0 implements InterfaceC12249m6 {

    /* renamed from: a */
    public final AnimationSpec f109486a;

    /* renamed from: b */
    public final SnapLayoutInfoProvider f109487b;

    /* renamed from: c */
    public final Density f109488c;

    public C23436zn0(AnimationSpec lowVelocityAnimationSpec, SnapLayoutInfoProvider layoutInfoProvider, Density density) {
        Intrinsics.checkNotNullParameter(lowVelocityAnimationSpec, "lowVelocityAnimationSpec");
        Intrinsics.checkNotNullParameter(layoutInfoProvider, "layoutInfoProvider");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f109486a = lowVelocityAnimationSpec;
        this.f109487b = layoutInfoProvider;
        this.f109488c = density;
    }

    @Override // p000.InterfaceC12249m6
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo72a(ScrollScope scrollScope, Object obj, Object obj2, Function1 function1, Continuation continuation) {
        return m71b(scrollScope, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), function1, continuation);
    }

    /* renamed from: b */
    public Object m71b(ScrollScope scrollScope, float f, float f2, Function1 function1, Continuation continuation) {
        Object m61393c;
        m61393c = SnapFlingBehaviorKt.m61393c(scrollScope, (Math.abs(f) + this.f109487b.calculateSnapStepSize(this.f109488c)) * Math.signum(f2), f, AnimationStateKt.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null), this.f109486a, function1, continuation);
        if (m61393c == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return m61393c;
        }
        return (C0774L4) m61393c;
    }
}