package androidx.compose.foundation.text.selection;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyKey;
import androidx.compose.p003ui.unit.C3641Dp;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u001d\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001d\u0010\r\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/ui/geometry/Offset;", "position", "getAdjustedCoordinates-k-4lQ0M", "(J)J", "getAdjustedCoordinates", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getHandleWidth", "()F", "HandleWidth", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getHandleHeight", "HandleHeight", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", OperatorName.CURVE_TO, "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getSelectionHandleInfoKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "SelectionHandleInfoKey", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,70:1\n154#2:71\n154#2:72\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n27#1:71\n28#1:72\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionHandlesKt {

    /* renamed from: a */
    public static final float f14240a;

    /* renamed from: b */
    public static final float f14241b;

    /* renamed from: c */
    public static final SemanticsPropertyKey f14242c = new SemanticsPropertyKey("SelectionHandleInfo", null, 2, null);

    static {
        float f = 25;
        f14240a = C3641Dp.m73658constructorimpl(f);
        f14241b = C3641Dp.m73658constructorimpl(f);
    }

    /* renamed from: getAdjustedCoordinates-k-4lQ0M  reason: not valid java name */
    public static final long m69851getAdjustedCoordinatesk4lQ0M(long j) {
        return OffsetKt.Offset(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j) - 1.0f);
    }

    public static final float getHandleHeight() {
        return f14241b;
    }

    public static final float getHandleWidth() {
        return f14240a;
    }

    @NotNull
    public static final SemanticsPropertyKey<SelectionHandleInfo> getSelectionHandleInfoKey() {
        return f14242c;
    }
}
