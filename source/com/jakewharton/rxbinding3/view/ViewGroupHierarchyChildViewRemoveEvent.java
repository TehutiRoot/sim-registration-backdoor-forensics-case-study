package com.jakewharton.rxbinding3.view;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, m28850d2 = {"Lcom/jakewharton/rxbinding3/view/ViewGroupHierarchyChildViewRemoveEvent;", "Lcom/jakewharton/rxbinding3/view/ViewGroupHierarchyChangeEvent;", "Landroid/view/ViewGroup;", Promotion.ACTION_VIEW, "Landroid/view/View;", "child", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "component1", "()Landroid/view/ViewGroup;", "component2", "()Landroid/view/View;", "copy", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/jakewharton/rxbinding3/view/ViewGroupHierarchyChildViewRemoveEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/ViewGroup;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/View;", "getChild", "rxbinding_release"}, m28849k = 1, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class ViewGroupHierarchyChildViewRemoveEvent extends ViewGroupHierarchyChangeEvent {

    /* renamed from: a */
    public final ViewGroup f58267a;

    /* renamed from: b */
    public final View f58268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupHierarchyChildViewRemoveEvent(@NotNull ViewGroup view, @NotNull View child) {
        super(null);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(child, "child");
        this.f58267a = view;
        this.f58268b = child;
    }

    public static /* synthetic */ ViewGroupHierarchyChildViewRemoveEvent copy$default(ViewGroupHierarchyChildViewRemoveEvent viewGroupHierarchyChildViewRemoveEvent, ViewGroup viewGroup, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            viewGroup = viewGroupHierarchyChildViewRemoveEvent.getView();
        }
        if ((i & 2) != 0) {
            view = viewGroupHierarchyChildViewRemoveEvent.getChild();
        }
        return viewGroupHierarchyChildViewRemoveEvent.copy(viewGroup, view);
    }

    @NotNull
    public final ViewGroup component1() {
        return getView();
    }

    @NotNull
    public final View component2() {
        return getChild();
    }

    @NotNull
    public final ViewGroupHierarchyChildViewRemoveEvent copy(@NotNull ViewGroup view, @NotNull View child) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(child, "child");
        return new ViewGroupHierarchyChildViewRemoveEvent(view, child);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof ViewGroupHierarchyChildViewRemoveEvent) {
                ViewGroupHierarchyChildViewRemoveEvent viewGroupHierarchyChildViewRemoveEvent = (ViewGroupHierarchyChildViewRemoveEvent) obj;
                return Intrinsics.areEqual(getView(), viewGroupHierarchyChildViewRemoveEvent.getView()) && Intrinsics.areEqual(getChild(), viewGroupHierarchyChildViewRemoveEvent.getChild());
            }
            return false;
        }
        return true;
    }

    @Override // com.jakewharton.rxbinding3.view.ViewGroupHierarchyChangeEvent
    @NotNull
    public View getChild() {
        return this.f58268b;
    }

    @Override // com.jakewharton.rxbinding3.view.ViewGroupHierarchyChangeEvent
    @NotNull
    public ViewGroup getView() {
        return this.f58267a;
    }

    public int hashCode() {
        ViewGroup view = getView();
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        View child = getChild();
        return hashCode + (child != null ? child.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ViewGroupHierarchyChildViewRemoveEvent(view=" + getView() + ", child=" + getChild() + ")";
    }
}
