package androidx.compose.foundation.pager;

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

@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b,\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010%R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u0010#\u001a\u0004\bE\u0010%R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u00107R \u0010L\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00060H8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010%R\u0014\u0010P\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010%R\u001d\u0010T\u001a\u00020Q8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, m28850d2 = {"Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "Landroidx/compose/foundation/pager/PageInfo;", "visiblePagesInfo", "", "pagesCount", "pageSize", "pageSpacing", "afterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "", "consumedScroll", "Landroidx/compose/foundation/pager/MeasuredPage;", "firstVisiblePage", "closestPageToSnapPosition", "firstVisiblePageOffset", "canScrollForward", "measureResult", "<init>", "(Ljava/util/List;IIIILandroidx/compose/foundation/gestures/Orientation;IIZFLandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/PageInfo;IZLandroidx/compose/ui/layout/MeasureResult;)V", "", "placeChildren", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getVisiblePagesInfo", "()Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getPagesCount", "()I", OperatorName.CURVE_TO, "getPageSize", "d", "getPageSpacing", "e", "getAfterContentPadding", OperatorName.FILL_NON_ZERO, "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", OperatorName.NON_STROKING_GRAY, "getViewportStartOffset", OperatorName.CLOSE_PATH, "getViewportEndOffset", "i", "Z", "getReverseLayout", "()Z", OperatorName.SET_LINE_JOINSTYLE, "F", "getConsumedScroll", "()F", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/foundation/pager/MeasuredPage;", "getFirstVisiblePage", "()Landroidx/compose/foundation/pager/MeasuredPage;", OperatorName.LINE_TO, "Landroidx/compose/foundation/pager/PageInfo;", "getClosestPageToSnapPosition", "()Landroidx/compose/foundation/pager/PageInfo;", OperatorName.MOVE_TO, "getFirstVisiblePageOffset", OperatorName.ENDPATH, "getCanScrollForward", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {

    /* renamed from: a */
    public final List f13857a;

    /* renamed from: b */
    public final int f13858b;

    /* renamed from: c */
    public final int f13859c;

    /* renamed from: d */
    public final int f13860d;

    /* renamed from: e */
    public final int f13861e;

    /* renamed from: f */
    public final Orientation f13862f;

    /* renamed from: g */
    public final int f13863g;

    /* renamed from: h */
    public final int f13864h;

    /* renamed from: i */
    public final boolean f13865i;

    /* renamed from: j */
    public final float f13866j;

    /* renamed from: k */
    public final MeasuredPage f13867k;

    /* renamed from: l */
    public final PageInfo f13868l;

    /* renamed from: m */
    public final int f13869m;

    /* renamed from: n */
    public final boolean f13870n;

    /* renamed from: o */
    public final /* synthetic */ MeasureResult f13871o;

    public PagerMeasureResult(@NotNull List<? extends PageInfo> visiblePagesInfo, int i, int i2, int i3, int i4, @NotNull Orientation orientation, int i5, int i6, boolean z, float f, @Nullable MeasuredPage measuredPage, @Nullable PageInfo pageInfo, int i7, boolean z2, @NotNull MeasureResult measureResult) {
        Intrinsics.checkNotNullParameter(visiblePagesInfo, "visiblePagesInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        this.f13857a = visiblePagesInfo;
        this.f13858b = i;
        this.f13859c = i2;
        this.f13860d = i3;
        this.f13861e = i4;
        this.f13862f = orientation;
        this.f13863g = i5;
        this.f13864h = i6;
        this.f13865i = z;
        this.f13866j = f;
        this.f13867k = measuredPage;
        this.f13868l = pageInfo;
        this.f13869m = i7;
        this.f13870n = z2;
        this.f13871o = measureResult;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.f13861e;
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    @NotNull
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.f13871o.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollForward() {
        return this.f13870n;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @Nullable
    public PageInfo getClosestPageToSnapPosition() {
        return this.f13868l;
    }

    public final float getConsumedScroll() {
        return this.f13866j;
    }

    @Nullable
    public final MeasuredPage getFirstVisiblePage() {
        return this.f13867k;
    }

    public final int getFirstVisiblePageOffset() {
        return this.f13869m;
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    public int getHeight() {
        return this.f13871o.getHeight();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.f13862f;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.f13859c;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.f13860d;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPagesCount() {
        return this.f13858b;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.f13865i;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.f13864h;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo69679getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.f13863g;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public List<PageInfo> getVisiblePagesInfo() {
        return this.f13857a;
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    public int getWidth() {
        return this.f13871o.getWidth();
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    public void placeChildren() {
        this.f13871o.placeChildren();
    }
}
