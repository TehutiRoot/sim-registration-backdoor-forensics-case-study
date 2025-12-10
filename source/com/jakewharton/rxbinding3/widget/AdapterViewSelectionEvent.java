package com.jakewharton.rxbinding3.widget;

import android.widget.AdapterView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28852bv = {1, 0, 3}, m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m28850d2 = {"Lcom/jakewharton/rxbinding3/widget/AdapterViewSelectionEvent;", "", "()V", Promotion.ACTION_VIEW, "Landroid/widget/AdapterView;", "getView", "()Landroid/widget/AdapterView;", "Lcom/jakewharton/rxbinding3/widget/AdapterViewItemSelectionEvent;", "Lcom/jakewharton/rxbinding3/widget/AdapterViewNothingSelectionEvent;", "rxbinding_release"}, m28849k = 1, m28848mv = {1, 1, 15})
/* loaded from: classes5.dex */
public abstract class AdapterViewSelectionEvent {
    public AdapterViewSelectionEvent() {
    }

    @NotNull
    public abstract AdapterView<?> getView();

    public /* synthetic */ AdapterViewSelectionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
