package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {

    /* renamed from: F */
    public int f50429F;

    /* renamed from: G */
    public final FrameLayout.LayoutParams f50430G;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.f50429F = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f50430G = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new C19023aH0(context);
    }

    @InterfaceC2037Px
    public int getItemMinimumHeight() {
        return this.f50429F;
    }

    public int getMenuGravity() {
        return this.f50430G.gravity;
    }

    /* renamed from: k */
    public boolean m44450k() {
        if ((this.f50430G.gravity & 112) == 48) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final int m44449l(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.f50429F;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    /* renamed from: m */
    public final int m44448m(View view, int i, int i2) {
        if (view.getVisibility() != 8) {
            view.measure(i, i2);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: n */
    public final int m44447n(int i, int i2, int i3, View view) {
        int makeMeasureSpec;
        if (view == null) {
            makeMeasureSpec = m44449l(i, i2, i3);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != view) {
                i4 += m44448m(childAt, i, makeMeasureSpec);
            }
        }
        return i4;
    }

    /* renamed from: o */
    public final int m44446o(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i4 = m44448m(childAt, i, m44449l(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + m44447n(i, i2, i3, childAt);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int m44447n;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().getVisibleItems().size();
        if (size2 > 1 && isShifting(getLabelVisibilityMode(), size2)) {
            m44447n = m44446o(i, size, size2);
        } else {
            m44447n = m44447n(i, size, size2, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(m44447n, i2, 0));
    }

    public void setItemMinimumHeight(@InterfaceC2037Px int i) {
        if (this.f50429F != i) {
            this.f50429F = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.f50430G;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }
}