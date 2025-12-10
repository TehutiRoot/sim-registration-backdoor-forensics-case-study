package p000;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.TransitionData;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: CT */
/* loaded from: classes.dex */
public final class C0181CT extends ExitTransition {

    /* renamed from: b */
    public final TransitionData f759b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181CT(TransitionData data) {
        super(null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.f759b = data;
    }

    @Override // androidx.compose.animation.ExitTransition
    public TransitionData getData$animation_release() {
        return this.f759b;
    }
}