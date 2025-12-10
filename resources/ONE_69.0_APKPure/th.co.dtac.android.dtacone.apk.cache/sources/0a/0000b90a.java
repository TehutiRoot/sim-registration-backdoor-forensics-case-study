package com.jakewharton.rxbinding2.widget;

import android.widget.SeekBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes5.dex */
public abstract class SeekBarProgressChangeEvent extends SeekBarChangeEvent {
    @NonNull
    @CheckResult
    public static SeekBarProgressChangeEvent create(@NonNull SeekBar seekBar, int i, boolean z) {
        return new C1647X8(seekBar, i, z);
    }

    public abstract boolean fromUser();

    public abstract int progress();
}