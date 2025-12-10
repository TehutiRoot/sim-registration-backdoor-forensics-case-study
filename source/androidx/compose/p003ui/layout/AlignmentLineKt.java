package androidx.compose.p003ui.layout;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/ui/layout/AlignmentLine;", "", "position1", "position2", "merge", "(Landroidx/compose/ui/layout/AlignmentLine;II)I", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "getFirstBaseline", "()Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "FirstBaseline", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLastBaseline", "LastBaseline", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.AlignmentLineKt */
/* loaded from: classes2.dex */
public final class AlignmentLineKt {

    /* renamed from: a */
    public static final HorizontalAlignmentLine f30040a = new HorizontalAlignmentLine(AlignmentLineKt$FirstBaseline$1.INSTANCE);

    /* renamed from: b */
    public static final HorizontalAlignmentLine f30041b = new HorizontalAlignmentLine(AlignmentLineKt$LastBaseline$1.INSTANCE);

    @NotNull
    public static final HorizontalAlignmentLine getFirstBaseline() {
        return f30040a;
    }

    @NotNull
    public static final HorizontalAlignmentLine getLastBaseline() {
        return f30041b;
    }

    public static final int merge(@NotNull AlignmentLine alignmentLine, int i, int i2) {
        Intrinsics.checkNotNullParameter(alignmentLine, "<this>");
        return alignmentLine.getMerger$ui_release().invoke(Integer.valueOf(i), Integer.valueOf(i2)).intValue();
    }
}
