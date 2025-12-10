package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/foundation/layout/FlowResult;", "", "", "mainAxisTotalSize", "crossAxisTotalSize", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", FirebaseAnalytics.Param.ITEMS, "<init>", "(IILandroidx/compose/runtime/collection/MutableVector;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getMainAxisTotalSize", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCrossAxisTotalSize", OperatorName.CURVE_TO, "Landroidx/compose/runtime/collection/MutableVector;", "getItems", "()Landroidx/compose/runtime/collection/MutableVector;", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FlowResult {

    /* renamed from: a */
    public final int f13152a;

    /* renamed from: b */
    public final int f13153b;

    /* renamed from: c */
    public final MutableVector f13154c;

    public FlowResult(int i, int i2, @NotNull MutableVector<RowColumnMeasureHelperResult> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f13152a = i;
        this.f13153b = i2;
        this.f13154c = items;
    }

    public final int getCrossAxisTotalSize() {
        return this.f13153b;
    }

    @NotNull
    public final MutableVector<RowColumnMeasureHelperResult> getItems() {
        return this.f13154c;
    }

    public final int getMainAxisTotalSize() {
        return this.f13152a;
    }
}
