package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZCheckboxPermissionBinding */
/* loaded from: classes7.dex */
public final class ZCheckboxPermissionBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCheckBox f84704a;

    public ZCheckboxPermissionBinding(DtacCheckBox dtacCheckBox) {
        this.f84704a = dtacCheckBox;
    }

    @NonNull
    public static ZCheckboxPermissionBinding bind(@NonNull View view) {
        if (view != null) {
            return new ZCheckboxPermissionBinding((DtacCheckBox) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ZCheckboxPermissionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZCheckboxPermissionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_checkbox_permission, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCheckBox getRoot() {
        return this.f84704a;
    }
}