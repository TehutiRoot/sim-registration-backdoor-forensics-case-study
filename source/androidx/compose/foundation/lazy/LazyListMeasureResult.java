package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.unit.IntSizeKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b&\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bw\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#R\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010#R\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0015\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010!\u001a\u0004\b=\u0010#R\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010!\u001a\u0004\b?\u0010#R \u0010D\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00050@8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010#R\u0014\u0010H\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010#R\u001d\u0010L\u001a\u00020I8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010#\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, m28850d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V", "", "placeChildren", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getFirstVisibleItem", "()Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getFirstVisibleItemScrollOffset", "()I", OperatorName.CURVE_TO, "Z", "getCanScrollForward", "()Z", "d", "F", "getConsumedScroll", "()F", "e", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", OperatorName.FILL_NON_ZERO, "getViewportStartOffset", OperatorName.NON_STROKING_GRAY, "getViewportEndOffset", OperatorName.CLOSE_PATH, "getTotalItemsCount", "i", "getReverseLayout", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", OperatorName.NON_STROKING_CMYK, "getAfterContentPadding", OperatorName.LINE_TO, "getMainAxisItemSpacing", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {

    /* renamed from: a */
    public final LazyListMeasuredItem f13388a;

    /* renamed from: b */
    public final int f13389b;

    /* renamed from: c */
    public final boolean f13390c;

    /* renamed from: d */
    public final float f13391d;

    /* renamed from: e */
    public final List f13392e;

    /* renamed from: f */
    public final int f13393f;

    /* renamed from: g */
    public final int f13394g;

    /* renamed from: h */
    public final int f13395h;

    /* renamed from: i */
    public final boolean f13396i;

    /* renamed from: j */
    public final Orientation f13397j;

    /* renamed from: k */
    public final int f13398k;

    /* renamed from: l */
    public final int f13399l;

    /* renamed from: m */
    public final /* synthetic */ MeasureResult f13400m;

    public LazyListMeasureResult(@Nullable LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, @NotNull MeasureResult measureResult, @NotNull List<? extends LazyListItemInfo> visibleItemsInfo, int i2, int i3, int i4, boolean z2, @NotNull Orientation orientation, int i5, int i6) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(visibleItemsInfo, "visibleItemsInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f13388a = lazyListMeasuredItem;
        this.f13389b = i;
        this.f13390c = z;
        this.f13391d = f;
        this.f13392e = visibleItemsInfo;
        this.f13393f = i2;
        this.f13394g = i3;
        this.f13395h = i4;
        this.f13396i = z2;
        this.f13397j = orientation;
        this.f13398k = i5;
        this.f13399l = i6;
        this.f13400m = measureResult;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return this.f13398k;
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    @NotNull
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.f13400m.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollForward() {
        return this.f13390c;
    }

    public final float getConsumedScroll() {
        return this.f13391d;
    }

    @Nullable
    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.f13388a;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.f13389b;
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    public int getHeight() {
        return this.f13400m.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.f13399l;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.f13397j;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean getReverseLayout() {
        return this.f13396i;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return this.f13395h;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return this.f13394g;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo69600getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return this.f13393f;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @NotNull
    public List<LazyListItemInfo> getVisibleItemsInfo() {
        return this.f13392e;
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    public int getWidth() {
        return this.f13400m.getWidth();
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    public void placeChildren() {
        this.f13400m.placeChildren();
    }
}
