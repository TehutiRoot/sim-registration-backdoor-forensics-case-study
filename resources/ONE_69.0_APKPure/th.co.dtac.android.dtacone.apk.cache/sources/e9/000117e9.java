package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemStaffDetailPermissionBinding */
/* loaded from: classes7.dex */
public final class ItemStaffDetailPermissionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84504a;
    @NonNull
    public final AppCompatImageView ivIconPermission;

    public ItemStaffDetailPermissionBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView) {
        this.f84504a = constraintLayout;
        this.ivIconPermission = appCompatImageView;
    }

    @NonNull
    public static ItemStaffDetailPermissionBinding bind(@NonNull View view) {
        int i = R.id.ivIconPermission;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            return new ItemStaffDetailPermissionBinding((ConstraintLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemStaffDetailPermissionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemStaffDetailPermissionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_staff_detail_permission, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84504a;
    }
}