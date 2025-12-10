package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneOtherShopListBinding */
/* loaded from: classes7.dex */
public final class ActivityOneOtherShopListBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83548a;
    @NonNull
    public final CoordinatorLayout container;
    @NonNull
    public final ConstraintLayout layoutToolbar;
    @NonNull
    public final FrameLayout oneShopListContainer;
    @NonNull
    public final OneTransparentToolbarBinding oneShopListToolbar;

    public ActivityOneOtherShopListBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, ConstraintLayout constraintLayout, FrameLayout frameLayout, OneTransparentToolbarBinding oneTransparentToolbarBinding) {
        this.f83548a = coordinatorLayout;
        this.container = coordinatorLayout2;
        this.layoutToolbar = constraintLayout;
        this.oneShopListContainer = frameLayout;
        this.oneShopListToolbar = oneTransparentToolbarBinding;
    }

    @NonNull
    public static ActivityOneOtherShopListBinding bind(@NonNull View view) {
        View findChildViewById;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.layoutToolbar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.oneShopListContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.oneShopListToolbar))) != null) {
                return new ActivityOneOtherShopListBinding(coordinatorLayout, coordinatorLayout, constraintLayout, frameLayout, OneTransparentToolbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneOtherShopListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneOtherShopListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_other_shop_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83548a;
    }
}
