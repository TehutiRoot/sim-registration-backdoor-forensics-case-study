package p000;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E4 */
/* loaded from: classes2.dex */
public final class C0291E4 implements PaddingValues {

    /* renamed from: a */
    public final State f1244a;

    /* renamed from: b */
    public final State f1245b;

    public C0291E4(State animationProgress, State topPadding) {
        Intrinsics.checkNotNullParameter(animationProgress, "animationProgress");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        this.f1244a = animationProgress;
        this.f1245b = topPadding;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM  reason: not valid java name */
    public float mo69342calculateBottomPaddingD9Ej5fM() {
        return C3623Dp.m73842constructorimpl(SearchBarKt.getSearchBarVerticalPadding() * ((Number) this.f1244a.getValue()).floatValue());
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM  reason: not valid java name */
    public float mo69343calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return C3623Dp.m73842constructorimpl(0);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM  reason: not valid java name */
    public float mo69344calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return C3623Dp.m73842constructorimpl(0);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM  reason: not valid java name */
    public float mo69345calculateTopPaddingD9Ej5fM() {
        return C3623Dp.m73842constructorimpl(((C3623Dp) this.f1245b.getValue()).m73856unboximpl() * ((Number) this.f1244a.getValue()).floatValue());
    }
}