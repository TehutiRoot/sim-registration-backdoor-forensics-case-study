package androidx.compose.foundation.lazy.staggeredgrid;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, m29142d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "", "", "positions", "sizes", "<init>", "([I[I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "[I", "getPositions", "()[I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSizes", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyStaggeredGridSlots {

    /* renamed from: a */
    public final int[] f13876a;

    /* renamed from: b */
    public final int[] f13877b;

    public LazyStaggeredGridSlots(@NotNull int[] positions, @NotNull int[] sizes) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(sizes, "sizes");
        this.f13876a = positions;
        this.f13877b = sizes;
    }

    @NotNull
    public final int[] getPositions() {
        return this.f13876a;
    }

    @NotNull
    public final int[] getSizes() {
        return this.f13877b;
    }
}