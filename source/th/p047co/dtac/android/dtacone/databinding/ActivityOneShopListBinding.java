package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneShopListBinding */
/* loaded from: classes7.dex */
public final class ActivityOneShopListBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83564a;
    @NonNull
    public final CoordinatorLayout container;
    @NonNull
    public final ConstraintLayout layoutToolbar;
    @NonNull
    public final OneTransparentToolbarBinding oneShopListToolbar;

    public ActivityOneShopListBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, ConstraintLayout constraintLayout, OneTransparentToolbarBinding oneTransparentToolbarBinding) {
        this.f83564a = coordinatorLayout;
        this.container = coordinatorLayout2;
        this.layoutToolbar = constraintLayout;
        this.oneShopListToolbar = oneTransparentToolbarBinding;
    }

    @NonNull
    public static ActivityOneShopListBinding bind(@NonNull View view) {
        View findChildViewById;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.layoutToolbar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.oneShopListToolbar))) != null) {
            return new ActivityOneShopListBinding(coordinatorLayout, coordinatorLayout, constraintLayout, OneTransparentToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneShopListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneShopListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_shop_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83564a;
    }
}
