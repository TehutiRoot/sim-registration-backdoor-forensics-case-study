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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZLocationAddressRowBinding */
/* loaded from: classes7.dex */
public final class ZLocationAddressRowBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84770a;
    @NonNull
    public final DtacFontTextView zTvLocationAddres;

    public ZLocationAddressRowBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView) {
        this.f84770a = linearLayout;
        this.zTvLocationAddres = dtacFontTextView;
    }

    @NonNull
    public static ZLocationAddressRowBinding bind(@NonNull View view) {
        int i = R.id.z_tv_location_addres;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ZLocationAddressRowBinding((LinearLayout) view, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZLocationAddressRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZLocationAddressRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_location_address_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84770a;
    }
}