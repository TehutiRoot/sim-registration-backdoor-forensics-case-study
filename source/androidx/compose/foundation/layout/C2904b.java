package androidx.compose.foundation.layout;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.layout.b */
/* loaded from: classes.dex */
public final class C2904b implements WindowInsets {

    /* renamed from: a */
    public final WindowInsets f13345a;

    /* renamed from: b */
    public final int f13346b;

    public /* synthetic */ C2904b(WindowInsets windowInsets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2904b)) {
            return false;
        }
        C2904b c2904b = (C2904b) obj;
        if (Intrinsics.areEqual(this.f13345a, c2904b.f13345a) && WindowInsetsSides.m69578equalsimpl0(this.f13346b, c2904b.f13346b)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (WindowInsetsSides.m69579hasAnybkgdKaI$foundation_layout_release(this.f13346b, WindowInsetsSides.Companion.m69588getBottomJoeWqyM())) {
            return this.f13345a.getBottom(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        int m69585getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m69585getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m69584getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            m69585getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m69585getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m69579hasAnybkgdKaI$foundation_layout_release(this.f13346b, m69585getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.f13345a.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        int m69587getAllowRightInRtlJoeWqyM$foundation_layout_release;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m69587getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m69586getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            m69587getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m69587getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m69579hasAnybkgdKaI$foundation_layout_release(this.f13346b, m69587getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.f13345a.getRight(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (WindowInsetsSides.m69579hasAnybkgdKaI$foundation_layout_release(this.f13346b, WindowInsetsSides.Companion.m69594getTopJoeWqyM())) {
            return this.f13345a.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.f13345a.hashCode() * 31) + WindowInsetsSides.m69580hashCodeimpl(this.f13346b);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f13345a + " only " + ((Object) WindowInsetsSides.m69582toStringimpl(this.f13346b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C2904b(WindowInsets insets, int i) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f13345a = insets;
        this.f13346b = i;
    }
}
