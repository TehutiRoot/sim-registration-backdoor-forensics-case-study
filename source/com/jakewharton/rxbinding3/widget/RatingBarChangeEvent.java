package com.jakewharton.rxbinding3.widget;

import android.widget.RatingBar;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000f¨\u0006$"}, m28850d2 = {"Lcom/jakewharton/rxbinding3/widget/RatingBarChangeEvent;", "", "Landroid/widget/RatingBar;", Promotion.ACTION_VIEW, "", "rating", "", "fromUser", "<init>", "(Landroid/widget/RatingBar;FZ)V", "component1", "()Landroid/widget/RatingBar;", "component2", "()F", "component3", "()Z", "copy", "(Landroid/widget/RatingBar;FZ)Lcom/jakewharton/rxbinding3/widget/RatingBarChangeEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RatingBar;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getRating", OperatorName.CURVE_TO, "Z", "getFromUser", "rxbinding_release"}, m28849k = 1, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RatingBarChangeEvent {

    /* renamed from: a */
    public final RatingBar f58306a;

    /* renamed from: b */
    public final float f58307b;

    /* renamed from: c */
    public final boolean f58308c;

    public RatingBarChangeEvent(@NotNull RatingBar view, float f, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58306a = view;
        this.f58307b = f;
        this.f58308c = z;
    }

    public static /* synthetic */ RatingBarChangeEvent copy$default(RatingBarChangeEvent ratingBarChangeEvent, RatingBar ratingBar, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ratingBar = ratingBarChangeEvent.f58306a;
        }
        if ((i & 2) != 0) {
            f = ratingBarChangeEvent.f58307b;
        }
        if ((i & 4) != 0) {
            z = ratingBarChangeEvent.f58308c;
        }
        return ratingBarChangeEvent.copy(ratingBar, f, z);
    }

    @NotNull
    public final RatingBar component1() {
        return this.f58306a;
    }

    public final float component2() {
        return this.f58307b;
    }

    public final boolean component3() {
        return this.f58308c;
    }

    @NotNull
    public final RatingBarChangeEvent copy(@NotNull RatingBar view, float f, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return new RatingBarChangeEvent(view, f, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof RatingBarChangeEvent) {
                RatingBarChangeEvent ratingBarChangeEvent = (RatingBarChangeEvent) obj;
                return Intrinsics.areEqual(this.f58306a, ratingBarChangeEvent.f58306a) && Float.compare(this.f58307b, ratingBarChangeEvent.f58307b) == 0 && this.f58308c == ratingBarChangeEvent.f58308c;
            }
            return false;
        }
        return true;
    }

    public final boolean getFromUser() {
        return this.f58308c;
    }

    public final float getRating() {
        return this.f58307b;
    }

    @NotNull
    public final RatingBar getView() {
        return this.f58306a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        RatingBar ratingBar = this.f58306a;
        int hashCode = (((ratingBar != null ? ratingBar.hashCode() : 0) * 31) + Float.floatToIntBits(this.f58307b)) * 31;
        boolean z = this.f58308c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "RatingBarChangeEvent(view=" + this.f58306a + ", rating=" + this.f58307b + ", fromUser=" + this.f58308c + ")";
    }
}
