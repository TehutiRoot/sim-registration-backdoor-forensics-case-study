package com.jakewharton.rxbinding3.widget;

import android.view.MenuItem;
import android.widget.PopupMenu;
import androidx.annotation.CheckResult;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"HC1", "IC1"}, m29142d2 = {}, m29141k = 4, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RxPopupMenu {
    @CheckResult
    @NotNull
    public static final Observable<Unit> dismisses(@NotNull PopupMenu popupMenu) {
        return HC1.m68159a(popupMenu);
    }

    @CheckResult
    @NotNull
    public static final Observable<MenuItem> itemClicks(@NotNull PopupMenu popupMenu) {
        return IC1.m68053a(popupMenu);
    }
}