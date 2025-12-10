package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityBuyDol3DsBinding */
/* loaded from: classes7.dex */
public final class ActivityBuyDol3DsBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83499a;
    @NonNull
    public final FrameLayout buyDol3DsContainer;

    public ActivityBuyDol3DsBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout) {
        this.f83499a = coordinatorLayout;
        this.buyDol3DsContainer = frameLayout;
    }

    @NonNull
    public static ActivityBuyDol3DsBinding bind(@NonNull View view) {
        int i = R.id.buyDol3DsContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ActivityBuyDol3DsBinding((CoordinatorLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBuyDol3DsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBuyDol3DsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_buy_dol3_ds, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83499a;
    }
}
