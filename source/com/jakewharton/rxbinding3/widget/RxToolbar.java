package com.jakewharton.rxbinding3.widget;

import android.view.MenuItem;
import android.widget.Toolbar;
import androidx.annotation.CheckResult;
import androidx.annotation.RequiresApi;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"gC1", "hC1"}, m28850d2 = {}, m28849k = 4, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RxToolbar {
    @CheckResult
    @RequiresApi(21)
    @NotNull
    public static final Observable<MenuItem> itemClicks(@NotNull Toolbar toolbar) {
        return AbstractC20000gC1.m31221a(toolbar);
    }

    @CheckResult
    @RequiresApi(21)
    @NotNull
    public static final Observable<Unit> navigationClicks(@NotNull Toolbar toolbar) {
        return AbstractC20172hC1.m30912a(toolbar);
    }
}
