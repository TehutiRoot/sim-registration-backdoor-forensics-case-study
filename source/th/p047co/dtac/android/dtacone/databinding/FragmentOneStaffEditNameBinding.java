package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneStaffEditNameBinding */
/* loaded from: classes7.dex */
public final class FragmentOneStaffEditNameBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84122a;
    @NonNull
    public final OneFontTextView btnOk;
    @NonNull
    public final OneCustomClearableEditText edtName;
    @NonNull
    public final OneClearableEditText edtPhoneNumber;

    public FragmentOneStaffEditNameBinding(LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, OneCustomClearableEditText oneCustomClearableEditText, OneClearableEditText oneClearableEditText) {
        this.f84122a = linearLayoutCompat;
        this.btnOk = oneFontTextView;
        this.edtName = oneCustomClearableEditText;
        this.edtPhoneNumber = oneClearableEditText;
    }

    @NonNull
    public static FragmentOneStaffEditNameBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.edtName;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.edtPhoneNumber;
                OneClearableEditText oneClearableEditText = (OneClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneClearableEditText != null) {
                    return new FragmentOneStaffEditNameBinding((LinearLayoutCompat) view, oneFontTextView, oneCustomClearableEditText, oneClearableEditText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneStaffEditNameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneStaffEditNameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_staff_edit_name, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84122a;
    }
}
