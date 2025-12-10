package com.jakewharton.rxbinding2.view;

import android.view.MenuItem;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes5.dex */
public abstract class MenuItemActionViewExpandEvent extends MenuItemActionViewEvent {
    @NonNull
    @CheckResult
    public static MenuItemActionViewExpandEvent create(@NonNull MenuItem menuItem) {
        return new C0363F8(menuItem);
    }
}