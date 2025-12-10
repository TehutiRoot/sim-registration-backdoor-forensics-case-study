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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityHomeBinding */
/* loaded from: classes7.dex */
public final class ActivityHomeBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83614a;
    @NonNull
    public final FrameLayout bgMenuMain;
    @NonNull
    public final CoordinatorLayout contentService;
    @NonNull
    public final ZBottomBarBinding incBottomBar;
    @NonNull
    public final ZToolbarBinding incToolBar;
    @NonNull
    public final CoordinatorLayout serviceContainer;

    public ActivityHomeBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, CoordinatorLayout coordinatorLayout2, ZBottomBarBinding zBottomBarBinding, ZToolbarBinding zToolbarBinding, CoordinatorLayout coordinatorLayout3) {
        this.f83614a = coordinatorLayout;
        this.bgMenuMain = frameLayout;
        this.contentService = coordinatorLayout2;
        this.incBottomBar = zBottomBarBinding;
        this.incToolBar = zToolbarBinding;
        this.serviceContainer = coordinatorLayout3;
    }

    @NonNull
    public static ActivityHomeBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.bgMenuMain;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.contentService;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
            if (coordinatorLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incBottomBar))) != null) {
                ZBottomBarBinding bind = ZBottomBarBinding.bind(findChildViewById);
                i = R.id.incToolBar;
                View findChildViewById2 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById2 != null) {
                    CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) view;
                    return new ActivityHomeBinding(coordinatorLayout2, frameLayout, coordinatorLayout, bind, ZToolbarBinding.bind(findChildViewById2), coordinatorLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83614a;
    }
}