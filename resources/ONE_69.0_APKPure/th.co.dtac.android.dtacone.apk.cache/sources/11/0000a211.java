package com.google.android.material.expandable;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
public final class ExpandableWidgetHelper {

    /* renamed from: a */
    public final View f49914a;

    /* renamed from: b */
    public boolean f49915b = false;

    /* renamed from: c */
    public int f49916c = 0;

    public ExpandableWidgetHelper(ExpandableWidget expandableWidget) {
        this.f49914a = (View) expandableWidget;
    }

    /* renamed from: a */
    public final void m44772a() {
        ViewParent parent = this.f49914a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f49914a);
        }
    }

    @IdRes
    public int getExpandedComponentIdHint() {
        return this.f49916c;
    }

    public boolean isExpanded() {
        return this.f49915b;
    }

    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        this.f49915b = bundle.getBoolean("expanded", false);
        this.f49916c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f49915b) {
            m44772a();
        }
    }

    @NonNull
    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f49915b);
        bundle.putInt("expandedComponentIdHint", this.f49916c);
        return bundle;
    }

    public boolean setExpanded(boolean z) {
        if (this.f49915b != z) {
            this.f49915b = z;
            m44772a();
            return true;
        }
        return false;
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.f49916c = i;
    }
}