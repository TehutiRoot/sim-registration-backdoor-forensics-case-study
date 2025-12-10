package com.jakewharton.rxbinding2.widget;

import android.widget.RatingBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes5.dex */
public abstract class RatingBarChangeEvent {
    @NonNull
    @CheckResult
    public static RatingBarChangeEvent create(@NonNull RatingBar ratingBar, float f, boolean z) {
        return new C1139Q8(ratingBar, f, z);
    }

    public abstract boolean fromUser();

    public abstract float rating();

    @NonNull
    public abstract RatingBar view();
}