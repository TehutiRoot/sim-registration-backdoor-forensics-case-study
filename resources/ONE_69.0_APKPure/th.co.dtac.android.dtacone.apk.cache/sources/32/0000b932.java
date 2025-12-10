package com.jakewharton.rxbinding3.widget;

import android.widget.CompoundButton;
import androidx.annotation.CheckResult;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"jC1"}, m29142d2 = {}, m29141k = 4, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RxCompoundButton {
    @CheckResult
    @NotNull
    public static final InitialValueObservable<Boolean> checkedChanges(@NotNull CompoundButton compoundButton) {
        return AbstractC20571jC1.m29608a(compoundButton);
    }
}