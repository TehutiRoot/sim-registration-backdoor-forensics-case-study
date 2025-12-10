package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.p003ui.unit.IntSize;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* renamed from: sR */
/* loaded from: classes.dex */
public final class C13923sR implements LazyListLayoutInfo {

    /* renamed from: c */
    public static final int f79779c = 0;

    /* renamed from: d */
    public static final int f79780d = 0;

    /* renamed from: e */
    public static final int f79781e = 0;

    /* renamed from: h */
    public static final boolean f79784h = false;

    /* renamed from: i */
    public static final int f79785i = 0;

    /* renamed from: j */
    public static final int f79786j = 0;

    /* renamed from: k */
    public static final int f79787k = 0;

    /* renamed from: a */
    public static final C13923sR f79777a = new C13923sR();

    /* renamed from: b */
    public static final List f79778b = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: f */
    public static final long f79782f = IntSize.Companion.m73823getZeroYbymL2g();

    /* renamed from: g */
    public static final Orientation f79783g = Orientation.Vertical;

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return f79786j;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return f79785i;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return f79787k;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public Orientation getOrientation() {
        return f79783g;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean getReverseLayout() {
        return f79784h;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return f79781e;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return f79780d;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo69600getViewportSizeYbymL2g() {
        return f79782f;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return f79779c;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public List getVisibleItemsInfo() {
        return f79778b;
    }
}
