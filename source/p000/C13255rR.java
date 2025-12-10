package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.p003ui.unit.IntSize;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* renamed from: rR */
/* loaded from: classes.dex */
public final class C13255rR implements LazyGridLayoutInfo {

    /* renamed from: c */
    public static final int f77276c = 0;

    /* renamed from: d */
    public static final int f77277d = 0;

    /* renamed from: e */
    public static final int f77278e = 0;

    /* renamed from: h */
    public static final boolean f77281h = false;

    /* renamed from: i */
    public static final int f77282i = 0;

    /* renamed from: j */
    public static final int f77283j = 0;

    /* renamed from: k */
    public static final int f77284k = 0;

    /* renamed from: a */
    public static final C13255rR f77274a = new C13255rR();

    /* renamed from: b */
    public static final List f77275b = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: f */
    public static final long f77279f = IntSize.Companion.m73823getZeroYbymL2g();

    /* renamed from: g */
    public static final Orientation f77280g = Orientation.Vertical;

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getAfterContentPadding() {
        return f77283j;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getBeforeContentPadding() {
        return f77282i;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return f77284k;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public Orientation getOrientation() {
        return f77280g;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean getReverseLayout() {
        return f77281h;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return f77278e;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportEndOffset() {
        return f77277d;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo69626getViewportSizeYbymL2g() {
        return f77279f;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportStartOffset() {
        return f77276c;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public List getVisibleItemsInfo() {
        return f77275b;
    }
}
