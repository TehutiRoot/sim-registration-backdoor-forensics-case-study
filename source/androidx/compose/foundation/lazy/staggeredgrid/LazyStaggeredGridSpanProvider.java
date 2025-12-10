package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "intervals", "<init>", "(Landroidx/compose/foundation/lazy/layout/IntervalList;)V", "", "itemIndex", "", "isFullSpan", "(I)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyStaggeredGridSpanProvider {

    /* renamed from: a */
    public final IntervalList f13790a;

    public LazyStaggeredGridSpanProvider(@NotNull IntervalList<LazyStaggeredGridInterval> intervals) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        this.f13790a = intervals;
    }

    @NotNull
    public final IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.f13790a;
    }

    public final boolean isFullSpan(int i) {
        if (i < 0 || i >= this.f13790a.getSize()) {
            return false;
        }
        IntervalList.Interval interval = this.f13790a.get(i);
        Function1<Integer, StaggeredGridItemSpan> span = ((LazyStaggeredGridInterval) interval.getValue()).getSpan();
        int startIndex = i - interval.getStartIndex();
        if (span == null || span.invoke(Integer.valueOf(startIndex)) != StaggeredGridItemSpan.Companion.getFullLine()) {
            return false;
        }
        return true;
    }
}
