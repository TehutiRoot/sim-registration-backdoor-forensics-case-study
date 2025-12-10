package com.jakewharton.rxbinding3.widget;

import android.widget.SeekBar;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lcom/jakewharton/rxbinding3/widget/SeekBarStartChangeEvent;", "Lcom/jakewharton/rxbinding3/widget/SeekBarChangeEvent;", "Landroid/widget/SeekBar;", Promotion.ACTION_VIEW, "<init>", "(Landroid/widget/SeekBar;)V", "component1", "()Landroid/widget/SeekBar;", "copy", "(Landroid/widget/SeekBar;)Lcom/jakewharton/rxbinding3/widget/SeekBarStartChangeEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/SeekBar;", "getView", "rxbinding_release"}, m29141k = 1, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class SeekBarStartChangeEvent extends SeekBarChangeEvent {

    /* renamed from: a */
    public final SeekBar f58327a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarStartChangeEvent(@NotNull SeekBar view) {
        super(null);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58327a = view;
    }

    public static /* synthetic */ SeekBarStartChangeEvent copy$default(SeekBarStartChangeEvent seekBarStartChangeEvent, SeekBar seekBar, int i, Object obj) {
        if ((i & 1) != 0) {
            seekBar = seekBarStartChangeEvent.getView();
        }
        return seekBarStartChangeEvent.copy(seekBar);
    }

    @NotNull
    public final SeekBar component1() {
        return getView();
    }

    @NotNull
    public final SeekBarStartChangeEvent copy(@NotNull SeekBar view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return new SeekBarStartChangeEvent(view);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof SeekBarStartChangeEvent) && Intrinsics.areEqual(getView(), ((SeekBarStartChangeEvent) obj).getView());
        }
        return true;
    }

    @Override // com.jakewharton.rxbinding3.widget.SeekBarChangeEvent
    @NotNull
    public SeekBar getView() {
        return this.f58327a;
    }

    public int hashCode() {
        SeekBar view = getView();
        if (view != null) {
            return view.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "SeekBarStartChangeEvent(view=" + getView() + ")";
    }
}