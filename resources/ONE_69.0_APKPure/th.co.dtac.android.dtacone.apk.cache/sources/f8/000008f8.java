package p000;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.TransitionData;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: JS */
/* loaded from: classes.dex */
public final class C0660JS extends EnterTransition {

    /* renamed from: b */
    public final TransitionData f3014b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0660JS(TransitionData data) {
        super(null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.f3014b = data;
    }

    @Override // androidx.compose.animation.EnterTransition
    public TransitionData getData$animation_release() {
        return this.f3014b;
    }
}