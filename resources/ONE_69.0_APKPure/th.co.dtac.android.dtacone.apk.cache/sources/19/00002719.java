package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u001d\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0006R+\u0010\f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0015\u0010\u0019R+\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m29142d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;)V", FirebaseAnalytics.Param.INDEX, "scrollOffset", "requestPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I", OperatorName.CURVE_TO, "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "(I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getScrollOffset", "", "Z", "hadFirstNotEmptyLayout", "d", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "e", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n75#2:125\n108#2,2:126\n75#2:128\n108#2,2:129\n1#3:131\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n*L\n35#1:125\n35#1:126,2\n38#1:128\n38#1:129,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridScrollPosition {

    /* renamed from: a */
    public final MutableIntState f13639a;

    /* renamed from: b */
    public final MutableIntState f13640b;

    /* renamed from: c */
    public boolean f13641c;

    /* renamed from: d */
    public Object f13642d;

    /* renamed from: e */
    public final LazyLayoutNearestRangeState f13643e;

    public LazyGridScrollPosition() {
        this(0, 0, 3, null);
    }

    /* renamed from: a */
    public final void m61184a(int i) {
        this.f13639a.setIntValue(i);
    }

    /* renamed from: b */
    public final void m61183b(int i) {
        this.f13640b.setIntValue(i);
    }

    /* renamed from: c */
    public final void m61182c(int i, int i2) {
        if (i >= 0.0f) {
            m61184a(i);
            this.f13643e.update(i);
            m61183b(i2);
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final int getIndex() {
        return this.f13639a.getIntValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.f13643e;
    }

    public final int getScrollOffset() {
        return this.f13640b.getIntValue();
    }

    public final void requestPosition(int i, int i2) {
        m61182c(i, i2);
        this.f13642d = null;
    }

    public final void updateFromMeasureResult(@NotNull LazyGridMeasureResult measureResult) {
        Object obj;
        int i;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem[] items2;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        LazyGridMeasuredLine firstVisibleLine = measureResult.getFirstVisibleLine();
        if (firstVisibleLine != null && (items2 = firstVisibleLine.getItems()) != null && (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(items2)) != null) {
            obj = lazyGridMeasuredItem2.getKey();
        } else {
            obj = null;
        }
        this.f13642d = obj;
        if (this.f13641c || measureResult.getTotalItemsCount() > 0) {
            this.f13641c = true;
            int firstVisibleLineScrollOffset = measureResult.getFirstVisibleLineScrollOffset();
            if (firstVisibleLineScrollOffset >= 0.0f) {
                LazyGridMeasuredLine firstVisibleLine2 = measureResult.getFirstVisibleLine();
                if (firstVisibleLine2 != null && (items = firstVisibleLine2.getItems()) != null && (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(items)) != null) {
                    i = lazyGridMeasuredItem.getIndex();
                } else {
                    i = 0;
                }
                m61182c(i, firstVisibleLineScrollOffset);
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleLineScrollOffset + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyGridItemProvider itemProvider, int i) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.f13642d, i);
        if (i != findIndexByKey) {
            m61184a(findIndexByKey);
            this.f13643e.update(i);
        }
        return findIndexByKey;
    }

    public LazyGridScrollPosition(int i, int i2) {
        this.f13639a = SnapshotIntStateKt.mutableIntStateOf(i);
        this.f13640b = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.f13643e = new LazyLayoutNearestRangeState(i, 90, 200);
    }

    public /* synthetic */ LazyGridScrollPosition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}