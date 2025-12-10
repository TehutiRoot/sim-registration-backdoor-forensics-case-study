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

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013¨\u0006*"}, m28850d2 = {"Lcom/jakewharton/rxbinding3/widget/AdapterViewItemLongClickEvent;", "", "Landroid/widget/AdapterView;", Promotion.ACTION_VIEW, "Landroid/view/View;", "clickedView", "", "position", "", "id", "<init>", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "component1", "()Landroid/widget/AdapterView;", "component2", "()Landroid/view/View;", "component3", "()I", "component4", "()J", "copy", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)Lcom/jakewharton/rxbinding3/widget/AdapterViewItemLongClickEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/AdapterView;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/View;", "getClickedView", OperatorName.CURVE_TO, "I", "getPosition", "d", OperatorName.SET_LINE_CAPSTYLE, "getId", "rxbinding_release"}, m28849k = 1, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class AdapterViewItemLongClickEvent {

    /* renamed from: a */
    public final AdapterView f58297a;

    /* renamed from: b */
    public final View f58298b;

    /* renamed from: c */
    public final int f58299c;

    /* renamed from: d */
    public final long f58300d;

    public AdapterViewItemLongClickEvent(@NotNull AdapterView<?> view, @Nullable View view2, int i, long j) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58297a = view;
        this.f58298b = view2;
        this.f58299c = i;
        this.f58300d = j;
    }

    public static /* synthetic */ AdapterViewItemLongClickEvent copy$default(AdapterViewItemLongClickEvent adapterViewItemLongClickEvent, AdapterView adapterView, View view, int i, long j, int i2, Object obj) {
        AdapterView adapterView2 = adapterView;
        if ((i2 & 1) != 0) {
            adapterView2 = adapterViewItemLongClickEvent.f58297a;
        }
        if ((i2 & 2) != 0) {
            view = adapterViewItemLongClickEvent.f58298b;
        }
        View view2 = view;
        if ((i2 & 4) != 0) {
            i = adapterViewItemLongClickEvent.f58299c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = adapterViewItemLongClickEvent.f58300d;
        }
        return adapterViewItemLongClickEvent.copy(adapterView2, view2, i3, j);
    }

    @NotNull
    public final AdapterView<?> component1() {
        return this.f58297a;
    }

    @Nullable
    public final View component2() {
        return this.f58298b;
    }

    public final int component3() {
        return this.f58299c;
    }

    public final long component4() {
        return this.f58300d;
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
                return Intrinsics.areEqual(this.f58297a, adapterViewItemLongClickEvent.f58297a) && Intrinsics.areEqual(this.f58298b, adapterViewItemLongClickEvent.f58298b) && this.f58299c == adapterViewItemLongClickEvent.f58299c && this.f58300d == adapterViewItemLongClickEvent.f58300d;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final View getClickedView() {
        return this.f58298b;
    }

    public final long getId() {
        return this.f58300d;
    }

    public final int getPosition() {
        return this.f58299c;
    }

    @NotNull
    public final AdapterView<?> getView() {
        return this.f58297a;
    }

    public int hashCode() {
        AdapterView adapterView = this.f58297a;
        int hashCode = (adapterView != null ? adapterView.hashCode() : 0) * 31;
        View view = this.f58298b;
        int hashCode2 = view != null ? view.hashCode() : 0;
        long j = this.f58300d;
        return ((((hashCode + hashCode2) * 31) + this.f58299c) * 31) + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        return "AdapterViewItemLongClickEvent(view=" + this.f58297a + ", clickedView=" + this.f58298b + ", position=" + this.f58299c + ", id=" + this.f58300d + ")";
    }
}
