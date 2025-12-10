package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.material.tabs.a */
/* loaded from: classes4.dex */
public class C7109a {
    /* renamed from: a */
    public static RectF m43874a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.isTabIndicatorFullWidth() && (view instanceof TabLayout.TabView)) {
            return m43873b((TabLayout.TabView) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: b */
    public static RectF m43873b(TabLayout.TabView tabView, int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int dpToPx = (int) ViewUtils.dpToPx(tabView.getContext(), i);
        if (contentWidth < dpToPx) {
            contentWidth = dpToPx;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    /* renamed from: c */
    public void m43872c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF m43874a = m43874a(tabLayout, view);
        drawable.setBounds((int) m43874a.left, drawable.getBounds().top, (int) m43874a.right, drawable.getBounds().bottom);
    }

    /* renamed from: d */
    public void mo31544d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF m43874a = m43874a(tabLayout, view);
        RectF m43874a2 = m43874a(tabLayout, view2);
        drawable.setBounds(AnimationUtils.lerp((int) m43874a.left, (int) m43874a2.left, f), drawable.getBounds().top, AnimationUtils.lerp((int) m43874a.right, (int) m43874a2.right, f), drawable.getBounds().bottom);
    }
}
