package p000;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.TransitionData;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: FS */
/* loaded from: classes.dex */
public final class C0388FS extends EnterTransition {

    /* renamed from: b */
    public final TransitionData f1616b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0388FS(TransitionData data) {
        super(null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.f1616b = data;
    }

    @Override // androidx.compose.animation.EnterTransition
    public TransitionData getData$animation_release() {
        return this.f1616b;
    }
}
