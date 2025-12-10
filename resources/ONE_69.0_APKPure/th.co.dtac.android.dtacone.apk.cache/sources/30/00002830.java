package androidx.compose.foundation.pager;

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

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0006R+\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R+\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u0011\u0010\u0016R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m29142d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "", "initialPage", "initialScrollOffset", "<init>", "(II)V", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", FirebaseAnalytics.Param.INDEX, "scrollOffset", "requestPosition", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableIntState;", "getFirstVisiblePage", "()I", "setFirstVisiblePage", "(I)V", "firstVisiblePage", "getCurrentPage", "setCurrentPage", "currentPage", OperatorName.CURVE_TO, "getScrollOffset", "", "d", "Z", "hadFirstNotEmptyLayout", "e", "Ljava/lang/Object;", "lastKnownFirstPageKey", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n75#2:111\n108#2,2:112\n75#2:114\n108#2,2:115\n75#2:117\n108#2,2:118\n1#3:120\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n34#1:111\n34#1:112,2\n35#1:114\n35#1:115,2\n37#1:117\n37#1:118,2\n*E\n"})
/* loaded from: classes.dex */
public final class PagerScrollPosition {

    /* renamed from: a */
    public final MutableIntState f13960a;

    /* renamed from: b */
    public final MutableIntState f13961b;

    /* renamed from: c */
    public final MutableIntState f13962c;

    /* renamed from: d */
    public boolean f13963d;

    /* renamed from: e */
    public Object f13964e;

    /* renamed from: f */
    public final LazyLayoutNearestRangeState f13965f;

    public PagerScrollPosition() {
        this(0, 0, 3, null);
    }

    /* renamed from: a */
    public final void m61065a(int i) {
        this.f13962c.setIntValue(i);
    }

    /* renamed from: b */
    public final void m61064b(int i, int i2) {
        if (i >= 0.0f) {
            setFirstVisiblePage(i);
            this.f13965f.update(i);
            m61065a(i2);
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final int getCurrentPage() {
        return this.f13961b.getIntValue();
    }

    public final int getFirstVisiblePage() {
        return this.f13960a.getIntValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.f13965f;
    }

    public final int getScrollOffset() {
        return this.f13962c.getIntValue();
    }

    public final void requestPosition(int i, int i2) {
        m61064b(i, i2);
        this.f13964e = null;
    }

    public final void setCurrentPage(int i) {
        this.f13961b.setIntValue(i);
    }

    public final void setFirstVisiblePage(int i) {
        this.f13960a.setIntValue(i);
    }

    public final void updateFromMeasureResult(@NotNull PagerMeasureResult measureResult) {
        Object obj;
        int i;
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        MeasuredPage firstVisiblePage = measureResult.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            obj = firstVisiblePage.getKey();
        } else {
            obj = null;
        }
        this.f13964e = obj;
        if (this.f13963d || measureResult.getPagesCount() > 0) {
            this.f13963d = true;
            int firstVisiblePageOffset = measureResult.getFirstVisiblePageOffset();
            if (firstVisiblePageOffset >= 0.0f) {
                MeasuredPage firstVisiblePage2 = measureResult.getFirstVisiblePage();
                if (firstVisiblePage2 != null) {
                    i = firstVisiblePage2.getIndex();
                } else {
                    i = 0;
                }
                m61064b(i, firstVisiblePageOffset);
                PageInfo closestPageToSnapPosition = measureResult.getClosestPageToSnapPosition();
                if (closestPageToSnapPosition != null) {
                    setCurrentPage(closestPageToSnapPosition.getIndex());
                    return;
                }
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisiblePageOffset + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
    }

    public PagerScrollPosition(int i, int i2) {
        this.f13960a = SnapshotIntStateKt.mutableIntStateOf(i);
        this.f13961b = SnapshotIntStateKt.mutableIntStateOf(i);
        this.f13962c = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.f13965f = new LazyLayoutNearestRangeState(i, 30, 100);
    }

    public /* synthetic */ PagerScrollPosition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}