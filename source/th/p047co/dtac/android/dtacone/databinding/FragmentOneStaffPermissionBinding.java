package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneStaffPermissionBinding */
/* loaded from: classes7.dex */
public final class FragmentOneStaffPermissionBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84124a;
    @NonNull
    public final DtacRecyclerView rvPermission;
    @NonNull
    public final OneFontTextView tvStaffName;

    public FragmentOneStaffPermissionBinding(NestedScrollView nestedScrollView, DtacRecyclerView dtacRecyclerView, OneFontTextView oneFontTextView) {
        this.f84124a = nestedScrollView;
        this.rvPermission = dtacRecyclerView;
        this.tvStaffName = oneFontTextView;
    }

    @NonNull
    public static FragmentOneStaffPermissionBinding bind(@NonNull View view) {
        int i = R.id.rvPermission;
        DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
        if (dtacRecyclerView != null) {
            i = R.id.tvStaffName;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                return new FragmentOneStaffPermissionBinding((NestedScrollView) view, dtacRecyclerView, oneFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneStaffPermissionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneStaffPermissionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_staff_permission, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84124a;
    }
}
