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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityRegisterBinding */
/* loaded from: classes7.dex */
public final class ActivityRegisterBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83577a;
    @NonNull
    public final FrameLayout content;
    @NonNull
    public final ZIncludeContactDtacBinding fragmentDtac;
    @NonNull
    public final ZToolbarBinding incToolBar;

    public ActivityRegisterBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, ZIncludeContactDtacBinding zIncludeContactDtacBinding, ZToolbarBinding zToolbarBinding) {
        this.f83577a = coordinatorLayout;
        this.content = frameLayout;
        this.fragmentDtac = zIncludeContactDtacBinding;
        this.incToolBar = zToolbarBinding;
    }

    @NonNull
    public static ActivityRegisterBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.content;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.fragment_dtac))) != null) {
            ZIncludeContactDtacBinding bind = ZIncludeContactDtacBinding.bind(findChildViewById);
            int i2 = R.id.incToolBar;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById2 != null) {
                return new ActivityRegisterBinding((CoordinatorLayout) view, frameLayout, bind, ZToolbarBinding.bind(findChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_register, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83577a;
    }
}
