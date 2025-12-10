package com.jakewharton.rxbinding3.widget;

import android.view.MenuItem;
import android.widget.Toolbar;
import androidx.annotation.CheckResult;
import androidx.annotation.RequiresApi;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"dD1", "eD1"}, m29142d2 = {}, m29141k = 4, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RxToolbar {
    @CheckResult
    @RequiresApi(21)
    @NotNull
    public static final Observable<MenuItem> itemClicks(@NotNull Toolbar toolbar) {
        return AbstractC19536dD1.m31909a(toolbar);
    }

    @CheckResult
    @RequiresApi(21)
    @NotNull
    public static final Observable<Unit> navigationClicks(@NotNull Toolbar toolbar) {
        return AbstractC19709eD1.m31733a(toolbar);
    }
}