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
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneChangeOwnerFormTabBinding */
/* loaded from: classes7.dex */
public final class FragmentOneChangeOwnerFormTabBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84003a;
    @NonNull
    public final OneCustomClearableEditText edtName;
    @NonNull
    public final OneCustomClearableEditText edtPersonId;
    @NonNull
    public final OneCustomClearableEditText edtSureName;

    public FragmentOneChangeOwnerFormTabBinding(LinearLayoutCompat linearLayoutCompat, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3) {
        this.f84003a = linearLayoutCompat;
        this.edtName = oneCustomClearableEditText;
        this.edtPersonId = oneCustomClearableEditText2;
        this.edtSureName = oneCustomClearableEditText3;
    }

    @NonNull
    public static FragmentOneChangeOwnerFormTabBinding bind(@NonNull View view) {
        int i = R.id.edtName;
        OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
        if (oneCustomClearableEditText != null) {
            i = R.id.edtPersonId;
            OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText2 != null) {
                i = R.id.edtSureName;
                OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText3 != null) {
                    return new FragmentOneChangeOwnerFormTabBinding((LinearLayoutCompat) view, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneChangeOwnerFormTabBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneChangeOwnerFormTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_change_owner_form_tab, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84003a;
    }
}