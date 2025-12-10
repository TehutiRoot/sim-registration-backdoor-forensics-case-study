package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p003ui.unit.IntSize;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\"\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\u000fR\u001a\u0010%\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000fR\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, m29142d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/EmptyLazyStaggeredGridLayoutInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "<init>", "()V", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "visibleItemsInfo", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getTotalItemsCount", "()I", "totalItemsCount", "Landroidx/compose/ui/unit/IntSize;", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getViewportSize-YbymL2g", "()J", "viewportSize", "d", "getViewportStartOffset", "viewportStartOffset", "e", "getViewportEndOffset", "viewportEndOffset", OperatorName.FILL_NON_ZERO, "getBeforeContentPadding", "beforeContentPadding", OperatorName.NON_STROKING_GRAY, "getAfterContentPadding", "afterContentPadding", OperatorName.CLOSE_PATH, "getMainAxisItemSpacing", "mainAxisItemSpacing", "Landroidx/compose/foundation/gestures/Orientation;", "i", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EmptyLazyStaggeredGridLayoutInfo implements LazyStaggeredGridLayoutInfo {

    /* renamed from: b */
    public static final int f13778b = 0;

    /* renamed from: d */
    public static final int f13780d = 0;

    /* renamed from: e */
    public static final int f13781e = 0;

    /* renamed from: f */
    public static final int f13782f = 0;

    /* renamed from: g */
    public static final int f13783g = 0;

    /* renamed from: h */
    public static final int f13784h = 0;
    @NotNull
    public static final EmptyLazyStaggeredGridLayoutInfo INSTANCE = new EmptyLazyStaggeredGridLayoutInfo();

    /* renamed from: a */
    public static final List f13777a = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: c */
    public static final long f13779c = IntSize.Companion.m74007getZeroYbymL2g();

    /* renamed from: i */
    public static final Orientation f13785i = Orientation.Vertical;

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return f13783g;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return f13782f;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return f13784h;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return f13785i;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return f13778b;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return f13781e;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
    public long mo69829getViewportSizeYbymL2g() {
        return f13779c;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return f13780d;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public List<LazyStaggeredGridItemInfo> getVisibleItemsInfo() {
        return f13777a;
    }
}