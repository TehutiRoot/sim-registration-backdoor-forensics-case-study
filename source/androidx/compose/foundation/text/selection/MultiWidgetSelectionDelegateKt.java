package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.unit.IntSize;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ak\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, m28850d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Offset;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "", "selectableId", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "", "isStartHandle", "Lkotlin/Pair;", "getTextSelectionInfo-yM0VcXU", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/geometry/Offset;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;Z)Lkotlin/Pair;", "getTextSelectionInfo", "Landroidx/compose/ui/geometry/Rect;", "bounds", "position", "", "getOffsetForPosition-0AR0LA0", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;J)I", "getOffsetForPosition", "Landroidx/compose/ui/text/TextRange;", "newSelectionRange", "handlesCrossed", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JZJLandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/Selection;", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* renamed from: a */
    public static final Selection m61004a(long j, boolean z, long j2, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(TextRange.m73216getStartimpl(j)), TextRange.m73216getStartimpl(j), j2), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(TextRange.m73211getEndimpl(j) - 1, 0)), TextRange.m73211getEndimpl(j), j2), z);
    }

    /* renamed from: access$getAssembledSelectionInfo-vJH6DeI */
    public static final /* synthetic */ Selection m69838access$getAssembledSelectionInfovJH6DeI(long j, boolean z, long j2, TextLayoutResult textLayoutResult) {
        return m61004a(j, z, j2, textLayoutResult);
    }

    /* renamed from: getOffsetForPosition-0AR0LA0 */
    public static final int m69839getOffsetForPosition0AR0LA0(@NotNull TextLayoutResult textLayoutResult, @NotNull Rect bounds, long j) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (bounds.m71528containsk4lQ0M(j)) {
            return AbstractC11719c.coerceIn(textLayoutResult.m73189getOffsetForPositionk4lQ0M(j), 0, length);
        }
        if (SelectionMode.Vertical.mo69881compare3MmeM6k$foundation_release(j, bounds) < 0) {
            return 0;
        }
        return length;
    }

    @NotNull
    /* renamed from: getTextSelectionInfo-yM0VcXU */
    public static final Pair<Selection, Boolean> m69840getTextSelectionInfoyM0VcXU(@NotNull TextLayoutResult textLayoutResult, long j, long j2, @Nullable Offset offset, long j3, @NotNull SelectionAdjustment adjustment, @Nullable Selection selection, boolean z) {
        int i;
        TextRange textRange;
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m73818getWidthimpl(textLayoutResult.m73190getSizeYbymL2g()), IntSize.m73817getHeightimpl(textLayoutResult.m73190getSizeYbymL2g()));
        if (!SelectionMode.Vertical.m69882isSelected2x9bVx0$foundation_release(rect, j, j2)) {
            return new Pair<>(null, Boolean.FALSE);
        }
        int m69839getOffsetForPosition0AR0LA0 = m69839getOffsetForPosition0AR0LA0(textLayoutResult, rect, j);
        int m69839getOffsetForPosition0AR0LA02 = m69839getOffsetForPosition0AR0LA0(textLayoutResult, rect, j2);
        if (offset != null) {
            i = m69839getOffsetForPosition0AR0LA0(textLayoutResult, rect, offset.m71512unboximpl());
        } else {
            i = -1;
        }
        long TextRange = TextRangeKt.TextRange(m69839getOffsetForPosition0AR0LA0, m69839getOffsetForPosition0AR0LA02);
        if (selection != null) {
            textRange = TextRange.m73204boximpl(selection.m69842toTextRanged9O1mEE());
        } else {
            textRange = null;
        }
        long mo69843adjustZXO7KMw = adjustment.mo69843adjustZXO7KMw(textLayoutResult, TextRange, i, z, textRange);
        Selection m61004a = m61004a(mo69843adjustZXO7KMw, TextRange.m73215getReversedimpl(mo69843adjustZXO7KMw), j3, textLayoutResult);
        boolean z2 = true;
        boolean z3 = !Intrinsics.areEqual(m61004a, selection);
        if (!z ? m69839getOffsetForPosition0AR0LA02 == i : m69839getOffsetForPosition0AR0LA0 == i) {
            if (!z3) {
                z2 = false;
            }
        }
        return new Pair<>(m61004a, Boolean.valueOf(z2));
    }

    /* renamed from: getTextSelectionInfo-yM0VcXU$default */
    public static /* synthetic */ Pair m69841getTextSelectionInfoyM0VcXU$default(TextLayoutResult textLayoutResult, long j, long j2, Offset offset, long j3, SelectionAdjustment selectionAdjustment, Selection selection, boolean z, int i, Object obj) {
        Selection selection2;
        boolean z2;
        if ((i & 64) != 0) {
            selection2 = null;
        } else {
            selection2 = selection;
        }
        if ((i & 128) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        return m69840getTextSelectionInfoyM0VcXU(textLayoutResult, j, j2, offset, j3, selectionAdjustment, selection2, z2);
    }
}
