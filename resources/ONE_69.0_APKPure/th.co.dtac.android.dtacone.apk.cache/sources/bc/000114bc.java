package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivitySubOtherMenuBinding */
/* loaded from: classes7.dex */
public final class ActivitySubOtherMenuBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83687a;
    @NonNull
    public final RecyclerView subMenuList;
    @NonNull
    public final ZToolbarBinding toolbar;

    public ActivitySubOtherMenuBinding(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, ZToolbarBinding zToolbarBinding) {
        this.f83687a = coordinatorLayout;
        this.subMenuList = recyclerView;
        this.toolbar = zToolbarBinding;
    }

    @NonNull
    public static ActivitySubOtherMenuBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.subMenuList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbar))) != null) {
            return new ActivitySubOtherMenuBinding((CoordinatorLayout) view, recyclerView, ZToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySubOtherMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySubOtherMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_sub_other_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83687a;
    }
}