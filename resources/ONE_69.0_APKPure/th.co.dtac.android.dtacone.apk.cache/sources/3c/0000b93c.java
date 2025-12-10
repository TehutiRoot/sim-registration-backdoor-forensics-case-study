package com.jakewharton.rxbinding3.widget;

import android.widget.SeekBar;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, m29142d2 = {"Lcom/jakewharton/rxbinding3/widget/SeekBarProgressChangeEvent;", "Lcom/jakewharton/rxbinding3/widget/SeekBarChangeEvent;", "Landroid/widget/SeekBar;", Promotion.ACTION_VIEW, "", "progress", "", "fromUser", "<init>", "(Landroid/widget/SeekBar;IZ)V", "component1", "()Landroid/widget/SeekBar;", "component2", "()I", "component3", "()Z", "copy", "(Landroid/widget/SeekBar;IZ)Lcom/jakewharton/rxbinding3/widget/SeekBarProgressChangeEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/SeekBar;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getProgress", OperatorName.CURVE_TO, "Z", "getFromUser", "rxbinding_release"}, m29141k = 1, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class SeekBarProgressChangeEvent extends SeekBarChangeEvent {

    /* renamed from: a */
    public final SeekBar f58324a;

    /* renamed from: b */
    public final int f58325b;

    /* renamed from: c */
    public final boolean f58326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarProgressChangeEvent(@NotNull SeekBar view, int i, boolean z) {
        super(null);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58324a = view;
        this.f58325b = i;
        this.f58326c = z;
    }

    public static /* synthetic */ SeekBarProgressChangeEvent copy$default(SeekBarProgressChangeEvent seekBarProgressChangeEvent, SeekBar seekBar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            seekBar = seekBarProgressChangeEvent.getView();
        }
        if ((i2 & 2) != 0) {
            i = seekBarProgressChangeEvent.f58325b;
        }
        if ((i2 & 4) != 0) {
            z = seekBarProgressChangeEvent.f58326c;
        }
        return seekBarProgressChangeEvent.copy(seekBar, i, z);
    }

    @NotNull
    public final SeekBar component1() {
        return getView();
    }

    public final int component2() {
        return this.f58325b;
    }

    public final boolean component3() {
        return this.f58326c;
    }

    @NotNull
    public final SeekBarProgressChangeEvent copy(@NotNull SeekBar view, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return new SeekBarProgressChangeEvent(view, i, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof SeekBarProgressChangeEvent) {
                SeekBarProgressChangeEvent seekBarProgressChangeEvent = (SeekBarProgressChangeEvent) obj;
                return Intrinsics.areEqual(getView(), seekBarProgressChangeEvent.getView()) && this.f58325b == seekBarProgressChangeEvent.f58325b && this.f58326c == seekBarProgressChangeEvent.f58326c;
            }
            return false;
        }
        return true;
    }

    public final boolean getFromUser() {
        return this.f58326c;
    }

    public final int getProgress() {
        return this.f58325b;
    }

    @Override // com.jakewharton.rxbinding3.widget.SeekBarChangeEvent
    @NotNull
    public SeekBar getView() {
        return this.f58324a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        SeekBar view = getView();
        int hashCode = (((view != null ? view.hashCode() : 0) * 31) + this.f58325b) * 31;
        boolean z = this.f58326c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "SeekBarProgressChangeEvent(view=" + getView() + ", progress=" + this.f58325b + ", fromUser=" + this.f58326c + ")";
    }
}