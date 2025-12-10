package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneHeaderDeviceSaleBinding */
/* loaded from: classes7.dex */
public final class OneHeaderDeviceSaleBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84564a;
    @NonNull
    public final Guideline guideHeaderBackground;

    public OneHeaderDeviceSaleBinding(View view, Guideline guideline) {
        this.f84564a = view;
        this.guideHeaderBackground = guideline;
    }

    @NonNull
    public static OneHeaderDeviceSaleBinding bind(@NonNull View view) {
        int i = R.id.guideHeaderBackground;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            return new OneHeaderDeviceSaleBinding(view, guideline);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneHeaderDeviceSaleBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.one_header_device_sale, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84564a;
    }
}