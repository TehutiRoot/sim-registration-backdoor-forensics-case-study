package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.p003ui.unit.IntSize;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* renamed from: wR */
/* loaded from: classes.dex */
public final class C16978wR implements LazyListLayoutInfo {

    /* renamed from: c */
    public static final int f108428c = 0;

    /* renamed from: d */
    public static final int f108429d = 0;

    /* renamed from: e */
    public static final int f108430e = 0;

    /* renamed from: h */
    public static final boolean f108433h = false;

    /* renamed from: i */
    public static final int f108434i = 0;

    /* renamed from: j */
    public static final int f108435j = 0;

    /* renamed from: k */
    public static final int f108436k = 0;

    /* renamed from: a */
    public static final C16978wR f108426a = new C16978wR();

    /* renamed from: b */
    public static final List f108427b = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: f */
    public static final long f108431f = IntSize.Companion.m74007getZeroYbymL2g();

    /* renamed from: g */
    public static final Orientation f108432g = Orientation.Vertical;

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return f108435j;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return f108434i;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return f108436k;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public Orientation getOrientation() {
        return f108432g;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean getReverseLayout() {
        return f108433h;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return f108430e;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return f108429d;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo69784getViewportSizeYbymL2g() {
        return f108431f;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return f108428c;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public List getVisibleItemsInfo() {
        return f108427b;
    }
}