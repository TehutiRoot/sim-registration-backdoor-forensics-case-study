package p000;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.Modifier;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x4 */
/* loaded from: classes.dex */
public final class C17020x4 implements AnimatedContentScope, AnimatedVisibilityScope {

    /* renamed from: a */
    public final /* synthetic */ AnimatedVisibilityScope f108217a;

    public C17020x4(AnimatedVisibilityScope animatedVisibilityScope) {
        Intrinsics.checkNotNullParameter(animatedVisibilityScope, "animatedVisibilityScope");
        this.f108217a = animatedVisibilityScope;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public Modifier animateEnterExit(Modifier modifier, EnterTransition enter, ExitTransition exit, String label) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(label, "label");
        return this.f108217a.animateEnterExit(modifier, enter, exit, label);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public Transition getTransition() {
        return this.f108217a.getTransition();
    }
}
