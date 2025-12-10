package p000;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.foundation.pager.PagerIntervalContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ah1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17283Ah1 extends LazyLayoutIntervalContent {

    /* renamed from: a */
    public final Function4 f169a;

    /* renamed from: b */
    public final Function1 f170b;

    /* renamed from: c */
    public final int f171c;

    /* renamed from: d */
    public final IntervalList f172d;

    public C17283Ah1(Function4 pageContent, Function1 function1, int i) {
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        this.f169a = pageContent;
        this.f170b = function1;
        this.f171c = i;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.addInterval(i, new PagerIntervalContent(function1, pageContent));
        this.f172d = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList getIntervals() {
        return this.f172d;
    }
}
