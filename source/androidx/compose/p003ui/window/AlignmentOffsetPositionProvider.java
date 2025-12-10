package androidx.compose.p003ui.window;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m28850d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/unit/IntOffset;", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getOffset-nOcc-ac", "()J", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,102:1\n86#2:103\n86#2:104\n79#2:105\n86#2:106\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n84#1:103\n87#1:104\n90#1:105\n97#1:106\n*E\n"})
/* renamed from: androidx.compose.ui.window.AlignmentOffsetPositionProvider */
/* loaded from: classes2.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {

    /* renamed from: a */
    public final Alignment f31813a;

    /* renamed from: b */
    public final long f31814b;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j);
    }

    @Override // androidx.compose.p003ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo69834calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long j, @NotNull LayoutDirection layoutDirection, long j2) {
        int i;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long IntOffset = IntOffsetKt.IntOffset(0, 0);
        Alignment alignment = this.f31813a;
        IntSize.Companion companion = IntSize.Companion;
        long mo71407alignKFBX0sM = alignment.mo71407alignKFBX0sM(companion.m73823getZeroYbymL2g(), IntSizeKt.IntSize(anchorBounds.getWidth(), anchorBounds.getHeight()), layoutDirection);
        long mo71407alignKFBX0sM2 = this.f31813a.mo71407alignKFBX0sM(companion.m73823getZeroYbymL2g(), IntSizeKt.IntSize(IntSize.m73818getWidthimpl(j2), IntSize.m73817getHeightimpl(j2)), layoutDirection);
        long IntOffset2 = IntOffsetKt.IntOffset(anchorBounds.getLeft(), anchorBounds.getTop());
        long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset) + IntOffset.m73776getXimpl(IntOffset2), IntOffset.m73777getYimpl(IntOffset) + IntOffset.m73777getYimpl(IntOffset2));
        long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset3) + IntOffset.m73776getXimpl(mo71407alignKFBX0sM), IntOffset.m73777getYimpl(IntOffset3) + IntOffset.m73777getYimpl(mo71407alignKFBX0sM));
        long IntOffset5 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(mo71407alignKFBX0sM2), IntOffset.m73777getYimpl(mo71407alignKFBX0sM2));
        long IntOffset6 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset4) - IntOffset.m73776getXimpl(IntOffset5), IntOffset.m73777getYimpl(IntOffset4) - IntOffset.m73777getYimpl(IntOffset5));
        int m73776getXimpl = IntOffset.m73776getXimpl(this.f31814b);
        if (layoutDirection == LayoutDirection.Ltr) {
            i = 1;
        } else {
            i = -1;
        }
        long IntOffset7 = IntOffsetKt.IntOffset(m73776getXimpl * i, IntOffset.m73777getYimpl(this.f31814b));
        return IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset6) + IntOffset.m73776getXimpl(IntOffset7), IntOffset.m73777getYimpl(IntOffset6) + IntOffset.m73777getYimpl(IntOffset7));
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.f31813a;
    }

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    public final long m73895getOffsetnOccac() {
        return this.f31814b;
    }

    public AlignmentOffsetPositionProvider(Alignment alignment, long j) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f31813a = alignment;
        this.f31814b = j;
    }
}
