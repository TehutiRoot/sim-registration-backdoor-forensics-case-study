package androidx.compose.foundation.layout;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.layout.b */
/* loaded from: classes.dex */
public final class C2886b implements WindowInsets {

    /* renamed from: a */
    public final WindowInsets f13433a;

    /* renamed from: b */
    public final int f13434b;

    public /* synthetic */ C2886b(WindowInsets windowInsets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2886b)) {
            return false;
        }
        C2886b c2886b = (C2886b) obj;
        if (Intrinsics.areEqual(this.f13433a, c2886b.f13433a) && WindowInsetsSides.m69762equalsimpl0(this.f13434b, c2886b.f13434b)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (WindowInsetsSides.m69763hasAnybkgdKaI$foundation_layout_release(this.f13434b, WindowInsetsSides.Companion.m69772getBottomJoeWqyM())) {
            return this.f13433a.getBottom(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        int m69769getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m69769getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m69768getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            m69769getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m69769getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m69763hasAnybkgdKaI$foundation_layout_release(this.f13434b, m69769getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.f13433a.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        int m69771getAllowRightInRtlJoeWqyM$foundation_layout_release;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m69771getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m69770getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            m69771getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m69771getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m69763hasAnybkgdKaI$foundation_layout_release(this.f13434b, m69771getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.f13433a.getRight(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (WindowInsetsSides.m69763hasAnybkgdKaI$foundation_layout_release(this.f13434b, WindowInsetsSides.Companion.m69778getTopJoeWqyM())) {
            return this.f13433a.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.f13433a.hashCode() * 31) + WindowInsetsSides.m69764hashCodeimpl(this.f13434b);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f13433a + " only " + ((Object) WindowInsetsSides.m69766toStringimpl(this.f13434b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C2886b(WindowInsets insets, int i) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f13433a = insets;
        this.f13434b = i;
    }
}