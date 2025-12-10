package androidx.compose.foundation.lazy.grid;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, m29142d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "", "", "sizes", "positions", "<init>", "([I[I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "[I", "getSizes", "()[I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPositions", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyGridSlots {

    /* renamed from: a */
    public final int[] f13644a;

    /* renamed from: b */
    public final int[] f13645b;

    public LazyGridSlots(@NotNull int[] sizes, @NotNull int[] positions) {
        Intrinsics.checkNotNullParameter(sizes, "sizes");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.f13644a = sizes;
        this.f13645b = positions;
    }

    @NotNull
    public final int[] getPositions() {
        return this.f13645b;
    }

    @NotNull
    public final int[] getSizes() {
        return this.f13644a;
    }
}