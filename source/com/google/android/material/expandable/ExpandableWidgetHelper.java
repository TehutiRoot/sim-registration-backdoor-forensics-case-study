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
    public final View f49902a;

    /* renamed from: b */
    public boolean f49903b = false;

    /* renamed from: c */
    public int f49904c = 0;

    public ExpandableWidgetHelper(ExpandableWidget expandableWidget) {
        this.f49902a = (View) expandableWidget;
    }

    /* renamed from: a */
    public final void m44796a() {
        ViewParent parent = this.f49902a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f49902a);
        }
    }

    @IdRes
    public int getExpandedComponentIdHint() {
        return this.f49904c;
    }

    public boolean isExpanded() {
        return this.f49903b;
    }

    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        this.f49903b = bundle.getBoolean("expanded", false);
        this.f49904c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f49903b) {
            m44796a();
        }
    }

    @NonNull
    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f49903b);
        bundle.putInt("expandedComponentIdHint", this.f49904c);
        return bundle;
    }

    public boolean setExpanded(boolean z) {
        if (this.f49903b != z) {
            this.f49903b = z;
            m44796a();
            return true;
        }
        return false;
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.f49904c = i;
    }
}
