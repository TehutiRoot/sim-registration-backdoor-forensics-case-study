package com.jakewharton.rxbinding3.widget;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013¨\u0006*"}, m29142d2 = {"Lcom/jakewharton/rxbinding3/widget/AdapterViewItemLongClickEvent;", "", "Landroid/widget/AdapterView;", Promotion.ACTION_VIEW, "Landroid/view/View;", "clickedView", "", "position", "", "id", "<init>", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "component1", "()Landroid/widget/AdapterView;", "component2", "()Landroid/view/View;", "component3", "()I", "component4", "()J", "copy", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)Lcom/jakewharton/rxbinding3/widget/AdapterViewItemLongClickEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/AdapterView;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/View;", "getClickedView", OperatorName.CURVE_TO, "I", "getPosition", "d", OperatorName.SET_LINE_CAPSTYLE, "getId", "rxbinding_release"}, m29141k = 1, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class AdapterViewItemLongClickEvent {

    /* renamed from: a */
    public final AdapterView f58309a;

    /* renamed from: b */
    public final View f58310b;

    /* renamed from: c */
    public final int f58311c;

    /* renamed from: d */
    public final long f58312d;

    public AdapterViewItemLongClickEvent(@NotNull AdapterView<?> view, @Nullable View view2, int i, long j) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58309a = view;
        this.f58310b = view2;
        this.f58311c = i;
        this.f58312d = j;
    }

    public static /* synthetic */ AdapterViewItemLongClickEvent copy$default(AdapterViewItemLongClickEvent adapterViewItemLongClickEvent, AdapterView adapterView, View view, int i, long j, int i2, Object obj) {
        AdapterView adapterView2 = adapterView;
        if ((i2 & 1) != 0) {
            adapterView2 = adapterViewItemLongClickEvent.f58309a;
        }
        if ((i2 & 2) != 0) {
            view = adapterViewItemLongClickEvent.f58310b;
        }
        View view2 = view;
        if ((i2 & 4) != 0) {
            i = adapterViewItemLongClickEvent.f58311c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = adapterViewItemLongClickEvent.f58312d;
        }
        return adapterViewItemLongClickEvent.copy(adapterView2, view2, i3, j);
    }

    @NotNull
    public final AdapterView<?> component1() {
        return this.f58309a;
    }

    @Nullable
    public final View component2() {
        return this.f58310b;
    }

    public final int component3() {
        return this.f58311c;
    }

    public final long component4() {
        return this.f58312d;
    }

    @NotNull
    public final AdapterViewItemLongClickEvent copy(@NotNull AdapterView<?> view, @Nullable View view2, int i, long j) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return new AdapterViewItemLongClickEvent(view, view2, i, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof AdapterViewItemLongClickEvent) {
                AdapterViewItemLongClickEvent adapterViewItemLongClickEvent = (AdapterViewItemLongClickEvent) obj;
                return Intrinsics.areEqual(this.f58309a, adapterViewItemLongClickEvent.f58309a) && Intrinsics.areEqual(this.f58310b, adapterViewItemLongClickEvent.f58310b) && this.f58311c == adapterViewItemLongClickEvent.f58311c && this.f58312d == adapterViewItemLongClickEvent.f58312d;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final View getClickedView() {
        return this.f58310b;
    }

    public final long getId() {
        return this.f58312d;
    }

    public final int getPosition() {
        return this.f58311c;
    }

    @NotNull
    public final AdapterView<?> getView() {
        return this.f58309a;
    }

    public int hashCode() {
        AdapterView adapterView = this.f58309a;
        int hashCode = (adapterView != null ? adapterView.hashCode() : 0) * 31;
        View view = this.f58310b;
        int hashCode2 = view != null ? view.hashCode() : 0;
        long j = this.f58312d;
        return ((((hashCode + hashCode2) * 31) + this.f58311c) * 31) + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        return "AdapterViewItemLongClickEvent(view=" + this.f58309a + ", clickedView=" + this.f58310b + ", position=" + this.f58311c + ", id=" + this.f58312d + ")";
    }
}