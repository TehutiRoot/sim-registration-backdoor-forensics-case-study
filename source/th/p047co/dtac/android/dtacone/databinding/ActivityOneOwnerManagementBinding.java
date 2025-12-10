package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneOwnerManagementBinding */
/* loaded from: classes7.dex */
public final class ActivityOneOwnerManagementBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83549a;
    @NonNull
    public final FrameLayout oneOwnerManagementContainer;
    @NonNull
    public final OneToolbarBinding oneOwnerManagementToolbar;

    public ActivityOneOwnerManagementBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, OneToolbarBinding oneToolbarBinding) {
        this.f83549a = constraintLayout;
        this.oneOwnerManagementContainer = frameLayout;
        this.oneOwnerManagementToolbar = oneToolbarBinding;
    }

    @NonNull
    public static ActivityOneOwnerManagementBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.oneOwnerManagementContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.oneOwnerManagementToolbar))) != null) {
            return new ActivityOneOwnerManagementBinding((ConstraintLayout) view, frameLayout, OneToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneOwnerManagementBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneOwnerManagementBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_owner_management, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83549a;
    }
}
