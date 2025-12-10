package com.jakewharton.rxbinding3.widget;

import android.widget.RatingBar;
import androidx.annotation.CheckResult;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"OB1", "PB1"}, m28850d2 = {}, m28849k = 4, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RxRatingBar {
    @CheckResult
    @NotNull
    public static final InitialValueObservable<RatingBarChangeEvent> ratingChangeEvents(@NotNull RatingBar ratingBar) {
        return OB1.m67108a(ratingBar);
    }

    @CheckResult
    @NotNull
    public static final InitialValueObservable<Float> ratingChanges(@NotNull RatingBar ratingBar) {
        return PB1.m66901a(ratingBar);
    }
}
