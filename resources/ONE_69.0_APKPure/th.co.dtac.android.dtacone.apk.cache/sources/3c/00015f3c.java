package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.p003ui.unit.IntSize;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* renamed from: vR */
/* loaded from: classes.dex */
public final class C16908vR implements LazyGridLayoutInfo {

    /* renamed from: c */
    public static final int f108101c = 0;

    /* renamed from: d */
    public static final int f108102d = 0;

    /* renamed from: e */
    public static final int f108103e = 0;

    /* renamed from: h */
    public static final boolean f108106h = false;

    /* renamed from: i */
    public static final int f108107i = 0;

    /* renamed from: j */
    public static final int f108108j = 0;

    /* renamed from: k */
    public static final int f108109k = 0;

    /* renamed from: a */
    public static final C16908vR f108099a = new C16908vR();

    /* renamed from: b */
    public static final List f108100b = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: f */
    public static final long f108104f = IntSize.Companion.m74007getZeroYbymL2g();

    /* renamed from: g */
    public static final Orientation f108105g = Orientation.Vertical;

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getAfterContentPadding() {
        return f108108j;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getBeforeContentPadding() {
        return f108107i;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return f108109k;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public Orientation getOrientation() {
        return f108105g;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean getReverseLayout() {
        return f108106h;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return f108103e;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportEndOffset() {
        return f108102d;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo69810getViewportSizeYbymL2g() {
        return f108104f;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportStartOffset() {
        return f108101c;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public List getVisibleItemsInfo() {
        return f108100b;
    }
}