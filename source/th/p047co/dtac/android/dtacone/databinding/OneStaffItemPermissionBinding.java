package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneStaffItemPermissionBinding */
/* loaded from: classes7.dex */
public final class OneStaffItemPermissionBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84529a;
    @NonNull
    public final AppCompatImageView ivIconPermission;
    @NonNull
    public final SwitchCompat switchPermission;
    @NonNull
    public final OneFontTextView tvPermissionName;

    public OneStaffItemPermissionBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, SwitchCompat switchCompat, OneFontTextView oneFontTextView) {
        this.f84529a = linearLayoutCompat;
        this.ivIconPermission = appCompatImageView;
        this.switchPermission = switchCompat;
        this.tvPermissionName = oneFontTextView;
    }

    @NonNull
    public static OneStaffItemPermissionBinding bind(@NonNull View view) {
        int i = R.id.ivIconPermission;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.switchPermission;
            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
            if (switchCompat != null) {
                i = R.id.tvPermissionName;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new OneStaffItemPermissionBinding((LinearLayoutCompat) view, appCompatImageView, switchCompat, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneStaffItemPermissionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneStaffItemPermissionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_staff_item_permission, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84529a;
    }
}
