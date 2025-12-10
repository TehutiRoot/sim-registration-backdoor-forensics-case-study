package p000;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.TransitionData;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yT */
/* loaded from: classes.dex */
public final class C17128yT extends ExitTransition {

    /* renamed from: b */
    public final TransitionData f108761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17128yT(TransitionData data) {
        super(null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.f108761b = data;
    }

    @Override // androidx.compose.animation.ExitTransition
    public TransitionData getData$animation_release() {
        return this.f108761b;
    }
}
