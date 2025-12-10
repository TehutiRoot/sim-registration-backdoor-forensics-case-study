package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0006R+\u0010\f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u0015\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m29142d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;)V", FirebaseAnalytics.Param.INDEX, "scrollOffset", "requestPosition", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "(I)V", "getScrollOffset", "", OperatorName.CURVE_TO, "Z", "hadFirstNotEmptyLayout", "d", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "e", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n75#2:124\n108#2,2:125\n75#2:127\n108#2,2:128\n1#3:130\n*S KotlinDebug\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n*L\n34#1:124\n34#1:125,2\n36#1:127\n36#1:128,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListScrollPosition {

    /* renamed from: a */
    public final MutableIntState f13513a;

    /* renamed from: b */
    public final MutableIntState f13514b;

    /* renamed from: c */
    public boolean f13515c;

    /* renamed from: d */
    public Object f13516d;

    /* renamed from: e */
    public final LazyLayoutNearestRangeState f13517e;

    public LazyListScrollPosition() {
        this(0, 0, 3, null);
    }

    /* renamed from: a */
    public final void m61218a(int i) {
        this.f13514b.setIntValue(i);
    }

    /* renamed from: b */
    public final void m61217b(int i, int i2) {
        if (i >= 0.0f) {
            setIndex(i);
            this.f13517e.update(i);
            m61218a(i2);
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final int getIndex() {
        return this.f13513a.getIntValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.f13517e;
    }

    public final int getScrollOffset() {
        return this.f13514b.getIntValue();
    }

    public final void requestPosition(int i, int i2) {
        m61217b(i, i2);
        this.f13516d = null;
    }

    public final void setIndex(int i) {
        this.f13513a.setIntValue(i);
    }

    public final void updateFromMeasureResult(@NotNull LazyListMeasureResult measureResult) {
        Object obj;
        int i;
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        LazyListMeasuredItem firstVisibleItem = measureResult.getFirstVisibleItem();
        if (firstVisibleItem != null) {
            obj = firstVisibleItem.getKey();
        } else {
            obj = null;
        }
        this.f13516d = obj;
        if (this.f13515c || measureResult.getTotalItemsCount() > 0) {
            this.f13515c = true;
            int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
            if (firstVisibleItemScrollOffset >= 0.0f) {
                LazyListMeasuredItem firstVisibleItem2 = measureResult.getFirstVisibleItem();
                if (firstVisibleItem2 != null) {
                    i = firstVisibleItem2.getIndex();
                } else {
                    i = 0;
                }
                m61217b(i, firstVisibleItemScrollOffset);
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
    }

    @ExperimentalFoundationApi
    public final int updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyListItemProvider itemProvider, int i) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.f13516d, i);
        if (i != findIndexByKey) {
            setIndex(findIndexByKey);
            this.f13517e.update(i);
        }
        return findIndexByKey;
    }

    public LazyListScrollPosition(int i, int i2) {
        this.f13513a = SnapshotIntStateKt.mutableIntStateOf(i);
        this.f13514b = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.f13517e = new LazyLayoutNearestRangeState(i, 30, 100);
    }

    public /* synthetic */ LazyListScrollPosition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}