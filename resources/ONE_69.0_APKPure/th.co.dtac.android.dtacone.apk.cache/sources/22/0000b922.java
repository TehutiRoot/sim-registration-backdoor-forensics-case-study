package com.jakewharton.rxbinding3.view;

import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012Jj\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u0012R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u0012¨\u00068"}, m29142d2 = {"Lcom/jakewharton/rxbinding3/view/ViewLayoutChangeEvent;", "", "Landroid/view/View;", Promotion.ACTION_VIEW, "", OneNadOutboundSearchFragment.POSITION_LEFT, "top", OneNadOutboundSearchFragment.POSITION_RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "<init>", "(Landroid/view/View;IIIIIIII)V", "component1", "()Landroid/view/View;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Landroid/view/View;IIIIIIII)Lcom/jakewharton/rxbinding3/view/ViewLayoutChangeEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getLeft", OperatorName.CURVE_TO, "getTop", "d", "getRight", "e", "getBottom", OperatorName.FILL_NON_ZERO, "getOldLeft", OperatorName.NON_STROKING_GRAY, "getOldTop", OperatorName.CLOSE_PATH, "getOldRight", "i", "getOldBottom", "rxbinding_release"}, m29141k = 1, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class ViewLayoutChangeEvent {

    /* renamed from: a */
    public final View f58281a;

    /* renamed from: b */
    public final int f58282b;

    /* renamed from: c */
    public final int f58283c;

    /* renamed from: d */
    public final int f58284d;

    /* renamed from: e */
    public final int f58285e;

    /* renamed from: f */
    public final int f58286f;

    /* renamed from: g */
    public final int f58287g;

    /* renamed from: h */
    public final int f58288h;

    /* renamed from: i */
    public final int f58289i;

    public ViewLayoutChangeEvent(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58281a = view;
        this.f58282b = i;
        this.f58283c = i2;
        this.f58284d = i3;
        this.f58285e = i4;
        this.f58286f = i5;
        this.f58287g = i6;
        this.f58288h = i7;
        this.f58289i = i8;
    }

    @NotNull
    public final View component1() {
        return this.f58281a;
    }

    public final int component2() {
        return this.f58282b;
    }

    public final int component3() {
        return this.f58283c;
    }

    public final int component4() {
        return this.f58284d;
    }

    public final int component5() {
        return this.f58285e;
    }

    public final int component6() {
        return this.f58286f;
    }

    public final int component7() {
        return this.f58287g;
    }

    public final int component8() {
        return this.f58288h;
    }

    public final int component9() {
        return this.f58289i;
    }

    @NotNull
    public final ViewLayoutChangeEvent copy(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return new ViewLayoutChangeEvent(view, i, i2, i3, i4, i5, i6, i7, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof ViewLayoutChangeEvent) {
                ViewLayoutChangeEvent viewLayoutChangeEvent = (ViewLayoutChangeEvent) obj;
                return Intrinsics.areEqual(this.f58281a, viewLayoutChangeEvent.f58281a) && this.f58282b == viewLayoutChangeEvent.f58282b && this.f58283c == viewLayoutChangeEvent.f58283c && this.f58284d == viewLayoutChangeEvent.f58284d && this.f58285e == viewLayoutChangeEvent.f58285e && this.f58286f == viewLayoutChangeEvent.f58286f && this.f58287g == viewLayoutChangeEvent.f58287g && this.f58288h == viewLayoutChangeEvent.f58288h && this.f58289i == viewLayoutChangeEvent.f58289i;
            }
            return false;
        }
        return true;
    }

    public final int getBottom() {
        return this.f58285e;
    }

    public final int getLeft() {
        return this.f58282b;
    }

    public final int getOldBottom() {
        return this.f58289i;
    }

    public final int getOldLeft() {
        return this.f58286f;
    }

    public final int getOldRight() {
        return this.f58288h;
    }

    public final int getOldTop() {
        return this.f58287g;
    }

    public final int getRight() {
        return this.f58284d;
    }

    public final int getTop() {
        return this.f58283c;
    }

    @NotNull
    public final View getView() {
        return this.f58281a;
    }

    public int hashCode() {
        View view = this.f58281a;
        return ((((((((((((((((view != null ? view.hashCode() : 0) * 31) + this.f58282b) * 31) + this.f58283c) * 31) + this.f58284d) * 31) + this.f58285e) * 31) + this.f58286f) * 31) + this.f58287g) * 31) + this.f58288h) * 31) + this.f58289i;
    }

    @NotNull
    public String toString() {
        return "ViewLayoutChangeEvent(view=" + this.f58281a + ", left=" + this.f58282b + ", top=" + this.f58283c + ", right=" + this.f58284d + ", bottom=" + this.f58285e + ", oldLeft=" + this.f58286f + ", oldTop=" + this.f58287g + ", oldRight=" + this.f58288h + ", oldBottom=" + this.f58289i + ")";
    }
}