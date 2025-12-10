package com.jakewharton.rxbinding2.widget;

import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes5.dex */
public abstract class AdapterViewItemClickEvent {
    @NonNull
    @CheckResult
    public static AdapterViewItemClickEvent create(@NonNull AdapterView<?> adapterView, @NonNull View view, int i, long j) {
        return new C10051d8(adapterView, view, i, j);
    }

    @NonNull
    public abstract View clickedView();

    /* renamed from: id */
    public abstract long mo31919id();

    public abstract int position();

    @NonNull
    public abstract AdapterView<?> view();
}
