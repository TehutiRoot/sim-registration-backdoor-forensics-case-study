package com.jakewharton.rxbinding3.widget;

import android.widget.RadioGroup;
import androidx.annotation.CheckResult;
import com.jakewharton.rxbinding3.InitialValueObservable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"JC1", "KC1"}, m29142d2 = {}, m29141k = 4, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RxRadioGroup {
    @CheckResult
    @NotNull
    public static final Consumer<? super Integer> checked(@NotNull RadioGroup radioGroup) {
        return KC1.m67737a(radioGroup);
    }

    @CheckResult
    @NotNull
    public static final InitialValueObservable<Integer> checkedChanges(@NotNull RadioGroup radioGroup) {
        return JC1.m67916a(radioGroup);
    }
}