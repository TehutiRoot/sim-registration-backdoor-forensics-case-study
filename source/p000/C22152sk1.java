package p000;

import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.window.PopupPositionProvider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22152sk1 implements PopupPositionProvider {

    /* renamed from: a */
    public final int f79874a;

    public C22152sk1(int i) {
        this.f79874a = i;
    }

    @Override // androidx.compose.p003ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo69834calculatePositionllwVHH4(IntRect anchorBounds, long j, LayoutDirection layoutDirection, long j2) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int left = anchorBounds.getLeft() + ((anchorBounds.getWidth() - IntSize.m73818getWidthimpl(j2)) / 2);
        int top = (anchorBounds.getTop() - IntSize.m73817getHeightimpl(j2)) - this.f79874a;
        if (top < 0) {
            top = this.f79874a + anchorBounds.getBottom();
        }
        return IntOffsetKt.IntOffset(left, top);
    }
}
