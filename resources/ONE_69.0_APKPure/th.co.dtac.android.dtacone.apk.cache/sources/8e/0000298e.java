package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ_\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)J \u0010-\u001a\u00020*2\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u00020%*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010=\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006?"}, m29142d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinatesCallback", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResultCallback", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/geometry/Offset;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "", "isStartHandle", "containerLayoutCoordinates", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "updateSelection-qCDeeow", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "updateSelection", "getSelectAllSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "selection", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "getLastVisibleOffset", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getSelectableId", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function0;", OperatorName.CURVE_TO, "d", "Landroidx/compose/ui/text/TextLayoutResult;", "_previousTextLayoutResult", "e", "I", "_previousLastVisibleOffset", "(Landroidx/compose/ui/text/TextLayoutResult;)I", "lastVisibleOffset", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegate implements Selectable {

    /* renamed from: a */
    public final long f14308a;

    /* renamed from: b */
    public final Function0 f14309b;

    /* renamed from: c */
    public final Function0 f14310c;

    /* renamed from: d */
    public TextLayoutResult f14311d;

    /* renamed from: e */
    public int f14312e;

    public MultiWidgetSelectionDelegate(long j, @NotNull Function0<? extends LayoutCoordinates> coordinatesCallback, @NotNull Function0<TextLayoutResult> layoutResultCallback) {
        Intrinsics.checkNotNullParameter(coordinatesCallback, "coordinatesCallback");
        Intrinsics.checkNotNullParameter(layoutResultCallback, "layoutResultCallback");
        this.f14308a = j;
        this.f14309b = coordinatesCallback;
        this.f14310c = layoutResultCallback;
        this.f14312e = -1;
    }

    /* renamed from: a */
    public final synchronized int m60955a(TextLayoutResult textLayoutResult) {
        int lineCount;
        try {
            if (this.f14311d != textLayoutResult) {
                if (textLayoutResult.getDidOverflowHeight() && !textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                    lineCount = AbstractC11695c.coerceAtMost(textLayoutResult.getLineForVerticalPosition(IntSize.m74001getHeightimpl(textLayoutResult.m73374getSizeYbymL2g())), textLayoutResult.getLineCount() - 1);
                    while (textLayoutResult.getLineTop(lineCount) >= IntSize.m74001getHeightimpl(textLayoutResult.m73374getSizeYbymL2g())) {
                        lineCount--;
                    }
                    this.f14312e = textLayoutResult.getLineEnd(lineCount, true);
                    this.f14311d = textLayoutResult;
                }
                lineCount = textLayoutResult.getLineCount() - 1;
                this.f14312e = textLayoutResult.getLineEnd(lineCount, true);
                this.f14311d = textLayoutResult;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f14312e;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    public Rect getBoundingBox(int i) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f14310c.invoke();
        if (textLayoutResult == null) {
            return Rect.Companion.getZero();
        }
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (length < 1) {
            return Rect.Companion.getZero();
        }
        return textLayoutResult.getBoundingBox(AbstractC11695c.coerceIn(i, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getHandlePosition-dBAh8RU  reason: not valid java name */
    public long mo70019getHandlePositiondBAh8RU(@NotNull Selection selection, boolean z) {
        Selection.AnchorInfo end;
        Intrinsics.checkNotNullParameter(selection, "selection");
        if ((z && selection.getStart().getSelectableId() != getSelectableId()) || (!z && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.Companion.m71702getZeroF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return Offset.Companion.m71702getZeroF1C5BW0();
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f14310c.invoke();
        if (textLayoutResult == null) {
            return Offset.Companion.m71702getZeroF1C5BW0();
        }
        if (z) {
            end = selection.getStart();
        } else {
            end = selection.getEnd();
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult, AbstractC11695c.coerceIn(end.getOffset(), 0, m60955a(textLayoutResult)), z, selection.getHandlesCrossed());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f14310c.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return m60955a(textLayoutResult);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @Nullable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f14309b.invoke();
        if (layoutCoordinates != null && layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        return null;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getRangeOfLineContaining--jx7JFs  reason: not valid java name */
    public long mo70020getRangeOfLineContainingjx7JFs(int i) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f14310c.invoke();
        if (textLayoutResult == null) {
            return TextRange.Companion.m73405getZerod9O1mEE();
        }
        int m60955a = m60955a(textLayoutResult);
        if (m60955a < 1) {
            return TextRange.Companion.m73405getZerod9O1mEE();
        }
        int lineForOffset = textLayoutResult.getLineForOffset(AbstractC11695c.coerceIn(i, 0, m60955a - 1));
        return TextRangeKt.TextRange(textLayoutResult.getLineStart(lineForOffset), textLayoutResult.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @Nullable
    public Selection getSelectAllSelection() {
        Selection m60954a;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f14310c.invoke();
        if (textLayoutResult != null) {
            m60954a = MultiWidgetSelectionDelegateKt.m60954a(TextRangeKt.TextRange(0, textLayoutResult.getLayoutInput().getText().length()), false, getSelectableId(), textLayoutResult);
            return m60954a;
        }
        return null;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.f14308a;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f14310c.invoke();
        if (textLayoutResult == null) {
            return new AnnotatedString("", null, null, 6, null);
        }
        return textLayoutResult.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    /* renamed from: updateSelection-qCDeeow  reason: not valid java name */
    public Pair<Selection, Boolean> mo70021updateSelectionqCDeeow(long j, long j2, @Nullable Offset offset, boolean z, @NotNull LayoutCoordinates containerLayoutCoordinates, @NotNull SelectionAdjustment adjustment, @Nullable Selection selection) {
        Offset offset2;
        Intrinsics.checkNotNullParameter(containerLayoutCoordinates, "containerLayoutCoordinates");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (selection != null && (getSelectableId() != selection.getStart().getSelectableId() || getSelectableId() != selection.getEnd().getSelectableId())) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
        }
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return new Pair<>(null, Boolean.FALSE);
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f14310c.invoke();
        if (textLayoutResult == null) {
            return new Pair<>(null, Boolean.FALSE);
        }
        long mo73001localPositionOfR5De75A = containerLayoutCoordinates.mo73001localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m71702getZeroF1C5BW0());
        long m71690minusMKHz9U = Offset.m71690minusMKHz9U(j, mo73001localPositionOfR5De75A);
        long m71690minusMKHz9U2 = Offset.m71690minusMKHz9U(j2, mo73001localPositionOfR5De75A);
        if (offset != null) {
            offset2 = Offset.m71675boximpl(Offset.m71690minusMKHz9U(offset.m71696unboximpl(), mo73001localPositionOfR5De75A));
        } else {
            offset2 = null;
        }
        return MultiWidgetSelectionDelegateKt.m70024getTextSelectionInfoyM0VcXU(textLayoutResult, m71690minusMKHz9U, m71690minusMKHz9U2, offset2, getSelectableId(), adjustment, selection, z);
    }
}