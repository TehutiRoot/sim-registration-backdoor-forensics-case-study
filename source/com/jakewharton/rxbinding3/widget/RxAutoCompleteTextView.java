package com.jakewharton.rxbinding3.widget;

import android.widget.AutoCompleteTextView;
import androidx.annotation.CheckResult;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"MA1"}, m28850d2 = {}, m28849k = 4, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RxAutoCompleteTextView {
    @CheckResult
    @NotNull
    public static final Observable<AdapterViewItemClickEvent> itemClickEvents(@NotNull AutoCompleteTextView autoCompleteTextView) {
        return MA1.m67422a(autoCompleteTextView);
    }
}
