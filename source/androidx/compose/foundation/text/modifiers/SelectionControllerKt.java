package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerIconKt;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.text.TextLayoutResult;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u0010\u001a\u00020\b*\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, m28850d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "isInTouchMode", "Landroidx/compose/ui/Modifier;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/geometry/Offset;", "start", "end", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/text/TextLayoutResult;JJ)Z", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectionControllerKt {
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1, java.lang.Object] */
    /* renamed from: a */
    public static final Modifier m61032a(final SelectionRegistrar selectionRegistrar, final long j, final Function0 function0, final Function0 function02, boolean z) {
        if (z) {
            ?? r12 = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1

                /* renamed from: a */
                public long f14152a;

                /* renamed from: b */
                public long f14153b;

                {
                    Offset.Companion companion = Offset.Companion;
                    this.f14152a = companion.m71518getZeroF1C5BW0();
                    this.f14153b = companion.m71518getZeroF1C5BW0();
                }

                public final long getDragTotalDistance() {
                    return this.f14153b;
                }

                public final long getLastPosition() {
                    return this.f14152a;
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onCancel() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onDown-k-4lQ0M */
                public void mo69776onDownk4lQ0M(long j2) {
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onDrag-k-4lQ0M */
                public void mo69777onDragk4lQ0M(long j2) {
                    boolean m61031b;
                    LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                    if (layoutCoordinates != null) {
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        long j3 = j;
                        Function0 function03 = function02;
                        if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                            return;
                        }
                        long m71507plusMKHz9U = Offset.m71507plusMKHz9U(this.f14153b, j2);
                        this.f14153b = m71507plusMKHz9U;
                        long m71507plusMKHz9U2 = Offset.m71507plusMKHz9U(this.f14152a, m71507plusMKHz9U);
                        m61031b = SelectionControllerKt.m61031b((TextLayoutResult) function03.invoke(), this.f14152a, m71507plusMKHz9U2);
                        if (!m61031b && selectionRegistrar2.mo69883notifySelectionUpdate5iVPX68(layoutCoordinates, m71507plusMKHz9U2, this.f14152a, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                            this.f14152a = m71507plusMKHz9U2;
                            this.f14153b = Offset.Companion.m71518getZeroF1C5BW0();
                        }
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onStart-k-4lQ0M */
                public void mo69778onStartk4lQ0M(long j2) {
                    boolean m61031b;
                    LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                    if (layoutCoordinates != null) {
                        Function0 function03 = function02;
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        long j3 = j;
                        if (layoutCoordinates.isAttached()) {
                            m61031b = SelectionControllerKt.m61031b((TextLayoutResult) function03.invoke(), j2, j2);
                            if (m61031b) {
                                selectionRegistrar2.notifySelectionUpdateSelectAll(j3);
                            } else {
                                selectionRegistrar2.mo69884notifySelectionUpdateStartd4ec7I(layoutCoordinates, j2, SelectionAdjustment.Companion.getWord());
                            }
                            this.f14152a = j2;
                        } else {
                            return;
                        }
                    }
                    if (!SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                        return;
                    }
                    this.f14153b = Offset.Companion.m71518getZeroF1C5BW0();
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onStop() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onUp() {
                }

                public final void setDragTotalDistance(long j2) {
                    this.f14153b = j2;
                }

                public final void setLastPosition(long j2) {
                    this.f14152a = j2;
                }
            };
            return SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r12, new SelectionControllerKt$makeSelectionModifier$1(r12, null));
        }
        ?? r11 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1

            /* renamed from: a */
            public long f14158a = Offset.Companion.m71518getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.f14158a;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k  reason: not valid java name */
            public boolean mo69822onDrag3MmeM6k(long j2, @NotNull SelectionAdjustment adjustment) {
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                        return false;
                    }
                    if (selectionRegistrar2.mo69883notifySelectionUpdate5iVPX68(layoutCoordinates, j2, this.f14158a, false, adjustment)) {
                        this.f14158a = j2;
                        return true;
                    }
                    return true;
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M  reason: not valid java name */
            public boolean mo69823onExtendk4lQ0M(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo69883notifySelectionUpdate5iVPX68(layoutCoordinates, j2, this.f14158a, false, SelectionAdjustment.Companion.getNone())) {
                    this.f14158a = j2;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M  reason: not valid java name */
            public boolean mo69824onExtendDragk4lQ0M(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                        return false;
                    }
                    if (selectionRegistrar2.mo69883notifySelectionUpdate5iVPX68(layoutCoordinates, j2, this.f14158a, false, SelectionAdjustment.Companion.getNone())) {
                        this.f14158a = j2;
                        return true;
                    }
                    return true;
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k  reason: not valid java name */
            public boolean mo69825onStart3MmeM6k(long j2, @NotNull SelectionAdjustment adjustment) {
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo69884notifySelectionUpdateStartd4ec7I(layoutCoordinates, j2, adjustment);
                this.f14158a = j2;
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3);
            }

            public final void setLastPosition(long j2) {
                this.f14158a = j2;
            }
        };
        return PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r11, new SelectionControllerKt$makeSelectionModifier$2(r11, null)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }

    /* renamed from: b */
    public static final boolean m61031b(TextLayoutResult textLayoutResult, long j, long j2) {
        if (textLayoutResult == null) {
            return false;
        }
        int length = textLayoutResult.getLayoutInput().getText().getText().length();
        int m73189getOffsetForPositionk4lQ0M = textLayoutResult.m73189getOffsetForPositionk4lQ0M(j);
        int m73189getOffsetForPositionk4lQ0M2 = textLayoutResult.m73189getOffsetForPositionk4lQ0M(j2);
        int i = length - 1;
        if ((m73189getOffsetForPositionk4lQ0M < i || m73189getOffsetForPositionk4lQ0M2 < i) && (m73189getOffsetForPositionk4lQ0M >= 0 || m73189getOffsetForPositionk4lQ0M2 >= 0)) {
            return false;
        }
        return true;
    }
}
