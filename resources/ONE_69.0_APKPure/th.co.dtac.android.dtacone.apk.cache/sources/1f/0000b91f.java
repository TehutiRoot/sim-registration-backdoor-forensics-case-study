package com.jakewharton.rxbinding3.view;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m29144bv = {1, 0, 3}, m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m29142d2 = {"Lcom/jakewharton/rxbinding3/view/ViewGroupHierarchyChangeEvent;", "", "()V", "child", "Landroid/view/View;", "getChild", "()Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/view/ViewGroup;", "getView", "()Landroid/view/ViewGroup;", "Lcom/jakewharton/rxbinding3/view/ViewGroupHierarchyChildViewAddEvent;", "Lcom/jakewharton/rxbinding3/view/ViewGroupHierarchyChildViewRemoveEvent;", "rxbinding_release"}, m29141k = 1, m29140mv = {1, 1, 15})
/* loaded from: classes5.dex */
public abstract class ViewGroupHierarchyChangeEvent {
    public ViewGroupHierarchyChangeEvent() {
    }

    @NotNull
    public abstract View getChild();

    @NotNull
    public abstract ViewGroup getView();

    public /* synthetic */ ViewGroupHierarchyChangeEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}