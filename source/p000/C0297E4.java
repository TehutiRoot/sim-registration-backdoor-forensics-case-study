package p000;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E4 */
/* loaded from: classes2.dex */
public final class C0297E4 implements PaddingValues {

    /* renamed from: a */
    public final State f1202a;

    /* renamed from: b */
    public final State f1203b;

    public C0297E4(State animationProgress, State topPadding) {
        Intrinsics.checkNotNullParameter(animationProgress, "animationProgress");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        this.f1202a = animationProgress;
        this.f1203b = topPadding;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM  reason: not valid java name */
    public float mo69156calculateBottomPaddingD9Ej5fM() {
        return C3641Dp.m73658constructorimpl(SearchBarKt.getSearchBarVerticalPadding() * ((Number) this.f1202a.getValue()).floatValue());
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM  reason: not valid java name */
    public float mo69157calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return C3641Dp.m73658constructorimpl(0);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM  reason: not valid java name */
    public float mo69158calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return C3641Dp.m73658constructorimpl(0);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM  reason: not valid java name */
    public float mo69159calculateTopPaddingD9Ej5fM() {
        return C3641Dp.m73658constructorimpl(((C3641Dp) this.f1203b.getValue()).m73672unboximpl() * ((Number) this.f1202a.getValue()).floatValue());
    }
}
