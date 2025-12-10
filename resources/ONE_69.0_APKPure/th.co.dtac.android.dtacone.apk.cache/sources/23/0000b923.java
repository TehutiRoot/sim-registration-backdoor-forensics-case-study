package com.jakewharton.rxbinding3.view;

import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000e¨\u0006("}, m29142d2 = {"Lcom/jakewharton/rxbinding3/view/ViewScrollChangeEvent;", "", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "scrollX", "scrollY", "oldScrollX", "oldScrollY", "<init>", "(Landroid/view/View;IIII)V", "component1", "()Landroid/view/View;", "component2", "()I", "component3", "component4", "component5", "copy", "(Landroid/view/View;IIII)Lcom/jakewharton/rxbinding3/view/ViewScrollChangeEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getScrollX", OperatorName.CURVE_TO, "getScrollY", "d", "getOldScrollX", "e", "getOldScrollY", "rxbinding_release"}, m29141k = 1, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class ViewScrollChangeEvent {

    /* renamed from: a */
    public final View f58290a;

    /* renamed from: b */
    public final int f58291b;

    /* renamed from: c */
    public final int f58292c;

    /* renamed from: d */
    public final int f58293d;

    /* renamed from: e */
    public final int f58294e;

    public ViewScrollChangeEvent(@NotNull View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58290a = view;
        this.f58291b = i;
        this.f58292c = i2;
        this.f58293d = i3;
        this.f58294e = i4;
    }

    public static /* synthetic */ ViewScrollChangeEvent copy$default(ViewScrollChangeEvent viewScrollChangeEvent, View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            view = viewScrollChangeEvent.f58290a;
        }
        if ((i5 & 2) != 0) {
            i = viewScrollChangeEvent.f58291b;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = viewScrollChangeEvent.f58292c;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = viewScrollChangeEvent.f58293d;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = viewScrollChangeEvent.f58294e;
        }
        return viewScrollChangeEvent.copy(view, i6, i7, i8, i4);
    }

    @NotNull
    public final View component1() {
        return this.f58290a;
    }

    public final int component2() {
        return this.f58291b;
    }

    public final int component3() {
        return this.f58292c;
    }

    public final int component4() {
        return this.f58293d;
    }

    public final int component5() {
        return this.f58294e;
    }

    @NotNull
    public final ViewScrollChangeEvent copy(@NotNull View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return new ViewScrollChangeEvent(view, i, i2, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof ViewScrollChangeEvent) {
                ViewScrollChangeEvent viewScrollChangeEvent = (ViewScrollChangeEvent) obj;
                return Intrinsics.areEqual(this.f58290a, viewScrollChangeEvent.f58290a) && this.f58291b == viewScrollChangeEvent.f58291b && this.f58292c == viewScrollChangeEvent.f58292c && this.f58293d == viewScrollChangeEvent.f58293d && this.f58294e == viewScrollChangeEvent.f58294e;
            }
            return false;
        }
        return true;
    }

    public final int getOldScrollX() {
        return this.f58293d;
    }

    public final int getOldScrollY() {
        return this.f58294e;
    }

    public final int getScrollX() {
        return this.f58291b;
    }

    public final int getScrollY() {
        return this.f58292c;
    }

    @NotNull
    public final View getView() {
        return this.f58290a;
    }

    public int hashCode() {
        View view = this.f58290a;
        return ((((((((view != null ? view.hashCode() : 0) * 31) + this.f58291b) * 31) + this.f58292c) * 31) + this.f58293d) * 31) + this.f58294e;
    }

    @NotNull
    public String toString() {
        return "ViewScrollChangeEvent(view=" + this.f58290a + ", scrollX=" + this.f58291b + ", scrollY=" + this.f58292c + ", oldScrollX=" + this.f58293d + ", oldScrollY=" + this.f58294e + ")";
    }
}