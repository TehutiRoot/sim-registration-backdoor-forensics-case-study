package com.jakewharton.rxbinding3.widget;

import android.widget.AbsListView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000e¨\u0006("}, m29142d2 = {"Lcom/jakewharton/rxbinding3/widget/AbsListViewScrollEvent;", "", "Landroid/widget/AbsListView;", Promotion.ACTION_VIEW, "", "scrollState", "firstVisibleItem", "visibleItemCount", "totalItemCount", "<init>", "(Landroid/widget/AbsListView;IIII)V", "component1", "()Landroid/widget/AbsListView;", "component2", "()I", "component3", "component4", "component5", "copy", "(Landroid/widget/AbsListView;IIII)Lcom/jakewharton/rxbinding3/widget/AbsListViewScrollEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/AbsListView;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getScrollState", OperatorName.CURVE_TO, "getFirstVisibleItem", "d", "getVisibleItemCount", "e", "getTotalItemCount", "rxbinding_release"}, m29141k = 1, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class AbsListViewScrollEvent {

    /* renamed from: a */
    public final AbsListView f58295a;

    /* renamed from: b */
    public final int f58296b;

    /* renamed from: c */
    public final int f58297c;

    /* renamed from: d */
    public final int f58298d;

    /* renamed from: e */
    public final int f58299e;

    public AbsListViewScrollEvent(@NotNull AbsListView view, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58295a = view;
        this.f58296b = i;
        this.f58297c = i2;
        this.f58298d = i3;
        this.f58299e = i4;
    }

    public static /* synthetic */ AbsListViewScrollEvent copy$default(AbsListViewScrollEvent absListViewScrollEvent, AbsListView absListView, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            absListView = absListViewScrollEvent.f58295a;
        }
        if ((i5 & 2) != 0) {
            i = absListViewScrollEvent.f58296b;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = absListViewScrollEvent.f58297c;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = absListViewScrollEvent.f58298d;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = absListViewScrollEvent.f58299e;
        }
        return absListViewScrollEvent.copy(absListView, i6, i7, i8, i4);
    }

    @NotNull
    public final AbsListView component1() {
        return this.f58295a;
    }

    public final int component2() {
        return this.f58296b;
    }

    public final int component3() {
        return this.f58297c;
    }

    public final int component4() {
        return this.f58298d;
    }

    public final int component5() {
        return this.f58299e;
    }

    @NotNull
    public final AbsListViewScrollEvent copy(@NotNull AbsListView view, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return new AbsListViewScrollEvent(view, i, i2, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof AbsListViewScrollEvent) {
                AbsListViewScrollEvent absListViewScrollEvent = (AbsListViewScrollEvent) obj;
                return Intrinsics.areEqual(this.f58295a, absListViewScrollEvent.f58295a) && this.f58296b == absListViewScrollEvent.f58296b && this.f58297c == absListViewScrollEvent.f58297c && this.f58298d == absListViewScrollEvent.f58298d && this.f58299e == absListViewScrollEvent.f58299e;
            }
            return false;
        }
        return true;
    }

    public final int getFirstVisibleItem() {
        return this.f58297c;
    }

    public final int getScrollState() {
        return this.f58296b;
    }

    public final int getTotalItemCount() {
        return this.f58299e;
    }

    @NotNull
    public final AbsListView getView() {
        return this.f58295a;
    }

    public final int getVisibleItemCount() {
        return this.f58298d;
    }

    public int hashCode() {
        AbsListView absListView = this.f58295a;
        return ((((((((absListView != null ? absListView.hashCode() : 0) * 31) + this.f58296b) * 31) + this.f58297c) * 31) + this.f58298d) * 31) + this.f58299e;
    }

    @NotNull
    public String toString() {
        return "AbsListViewScrollEvent(view=" + this.f58295a + ", scrollState=" + this.f58296b + ", firstVisibleItem=" + this.f58297c + ", visibleItemCount=" + this.f58298d + ", totalItemCount=" + this.f58299e + ")";
    }
}