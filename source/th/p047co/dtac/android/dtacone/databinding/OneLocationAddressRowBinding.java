package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneLocationAddressRowBinding */
/* loaded from: classes7.dex */
public final class OneLocationAddressRowBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84493a;
    @NonNull
    public final OneFontTextView zTvLocationAddres;

    public OneLocationAddressRowBinding(LinearLayout linearLayout, OneFontTextView oneFontTextView) {
        this.f84493a = linearLayout;
        this.zTvLocationAddres = oneFontTextView;
    }

    @NonNull
    public static OneLocationAddressRowBinding bind(@NonNull View view) {
        int i = R.id.z_tv_location_addres;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new OneLocationAddressRowBinding((LinearLayout) view, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneLocationAddressRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneLocationAddressRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_location_address_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84493a;
    }
}
