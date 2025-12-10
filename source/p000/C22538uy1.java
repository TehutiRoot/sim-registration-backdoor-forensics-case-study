package p000;

import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.window.PopupPositionProvider;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: uy1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22538uy1 implements PopupPositionProvider {

    /* renamed from: a */
    public final int f107537a;

    public C22538uy1(int i) {
        this.f107537a = i;
    }

    @Override // androidx.compose.p003ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo69834calculatePositionllwVHH4(IntRect anchorBounds, long j, LayoutDirection layoutDirection, long j2) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int right = anchorBounds.getRight();
        if (IntSize.m73818getWidthimpl(j2) + right > IntSize.m73818getWidthimpl(j) && (right = anchorBounds.getLeft() - IntSize.m73818getWidthimpl(j2)) < 0) {
            right = anchorBounds.getLeft() + ((anchorBounds.getWidth() - IntSize.m73818getWidthimpl(j2)) / 2);
        }
        int top = (anchorBounds.getTop() - IntSize.m73817getHeightimpl(j2)) - this.f107537a;
        if (top < 0) {
            top = this.f107537a + anchorBounds.getBottom();
        }
        return IntOffsetKt.IntOffset(right, top);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C22538uy1) && this.f107537a == ((C22538uy1) obj).f107537a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f107537a;
    }

    public String toString() {
        return "RichTooltipPositionProvider(tooltipAnchorPadding=" + this.f107537a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
