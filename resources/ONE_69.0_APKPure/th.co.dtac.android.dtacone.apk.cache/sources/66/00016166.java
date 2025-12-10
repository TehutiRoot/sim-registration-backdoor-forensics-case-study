package p000;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.foundation.pager.PagerIntervalContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23076xi1 extends LazyLayoutIntervalContent {

    /* renamed from: a */
    public final Function4 f108821a;

    /* renamed from: b */
    public final Function1 f108822b;

    /* renamed from: c */
    public final int f108823c;

    /* renamed from: d */
    public final IntervalList f108824d;

    public C23076xi1(Function4 pageContent, Function1 function1, int i) {
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        this.f108821a = pageContent;
        this.f108822b = function1;
        this.f108823c = i;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.addInterval(i, new PagerIntervalContent(function1, pageContent));
        this.f108824d = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList getIntervals() {
        return this.f108824d;
    }
}