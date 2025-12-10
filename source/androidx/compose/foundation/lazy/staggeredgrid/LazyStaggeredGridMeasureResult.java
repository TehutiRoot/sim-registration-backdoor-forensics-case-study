package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.MeasureResult;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0088\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b\f\u0010/R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R#\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u001a\u0010\u0015\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bB\u00106R\u001a\u0010\u0016\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u00106R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u00106R\u001a\u0010\u0018\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\bH\u00106R\u001a\u0010N\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR \u0010S\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\r0O8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u00106R\u0014\u0010W\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u00106\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "firstVisibleItemIndices", "firstVisibleItemScrollOffsets", "", "consumedScroll", "measureResult", "", "canScrollForward", "canScrollBackward", "isVertical", "", "totalItemsCount", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "visibleItemsInfo", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "viewportStartOffset", "viewportEndOffset", "beforeContentPadding", "afterContentPadding", "mainAxisItemSpacing", "<init>", "([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "placeChildren", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "[I", "getFirstVisibleItemIndices", "()[I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFirstVisibleItemScrollOffsets", OperatorName.CURVE_TO, "F", "getConsumedScroll", "()F", "d", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "e", "Z", "getCanScrollForward", "()Z", OperatorName.FILL_NON_ZERO, "getCanScrollBackward", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "I", "getTotalItemsCount", "()I", "i", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", OperatorName.SET_LINE_JOINSTYLE, OperatorName.SET_LINE_CAPSTYLE, "getViewportSize-YbymL2g", "()J", OperatorName.NON_STROKING_CMYK, "getViewportStartOffset", OperatorName.LINE_TO, "getViewportEndOffset", OperatorName.MOVE_TO, "getBeforeContentPadding", OperatorName.ENDPATH, "getAfterContentPadding", "o", "getMainAxisItemSpacing", "Landroidx/compose/foundation/gestures/Orientation;", "p", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {

    /* renamed from: a */
    public final int[] f13747a;

    /* renamed from: b */
    public final int[] f13748b;

    /* renamed from: c */
    public final float f13749c;

    /* renamed from: d */
    public final MeasureResult f13750d;

    /* renamed from: e */
    public final boolean f13751e;

    /* renamed from: f */
    public final boolean f13752f;

    /* renamed from: g */
    public final boolean f13753g;

    /* renamed from: h */
    public final int f13754h;

    /* renamed from: i */
    public final List f13755i;

    /* renamed from: j */
    public final long f13756j;

    /* renamed from: k */
    public final int f13757k;

    /* renamed from: l */
    public final int f13758l;

    /* renamed from: m */
    public final int f13759m;

    /* renamed from: n */
    public final int f13760n;

    /* renamed from: o */
    public final int f13761o;

    /* renamed from: p */
    public final Orientation f13762p;

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f, MeasureResult measureResult, boolean z, boolean z2, boolean z3, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2, f, measureResult, z, z2, z3, i, list, j, i2, i3, i4, i5, i6);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return this.f13760n;
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    @NotNull
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.f13750d.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return this.f13759m;
    }

    public final boolean getCanScrollBackward() {
        return this.f13752f;
    }

    public final boolean getCanScrollForward() {
        return this.f13751e;
    }

    public final float getConsumedScroll() {
        return this.f13749c;
    }

    @NotNull
    public final int[] getFirstVisibleItemIndices() {
        return this.f13747a;
    }

    @NotNull
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.f13748b;
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    public int getHeight() {
        return this.f13750d.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.f13761o;
    }

    @NotNull
    public final MeasureResult getMeasureResult() {
        return this.f13750d;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.f13762p;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return this.f13754h;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return this.f13758l;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo69645getViewportSizeYbymL2g() {
        return this.f13756j;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return this.f13757k;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public List<LazyStaggeredGridItemInfo> getVisibleItemsInfo() {
        return this.f13755i;
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    public int getWidth() {
        return this.f13750d.getWidth();
    }

    public final boolean isVertical() {
        return this.f13753g;
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    public void placeChildren() {
        this.f13750d.placeChildren();
    }

    public LazyStaggeredGridMeasureResult(int[] firstVisibleItemIndices, int[] firstVisibleItemScrollOffsets, float f, MeasureResult measureResult, boolean z, boolean z2, boolean z3, int i, List visibleItemsInfo, long j, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(firstVisibleItemIndices, "firstVisibleItemIndices");
        Intrinsics.checkNotNullParameter(firstVisibleItemScrollOffsets, "firstVisibleItemScrollOffsets");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(visibleItemsInfo, "visibleItemsInfo");
        this.f13747a = firstVisibleItemIndices;
        this.f13748b = firstVisibleItemScrollOffsets;
        this.f13749c = f;
        this.f13750d = measureResult;
        this.f13751e = z;
        this.f13752f = z2;
        this.f13753g = z3;
        this.f13754h = i;
        this.f13755i = visibleItemsInfo;
        this.f13756j = j;
        this.f13757k = i2;
        this.f13758l = i3;
        this.f13759m = i4;
        this.f13760n = i5;
        this.f13761o = i6;
        this.f13762p = z3 ? Orientation.Vertical : Orientation.Horizontal;
    }
}
