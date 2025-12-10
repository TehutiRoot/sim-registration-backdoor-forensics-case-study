package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.HeaderDeviceSaleBinding */
/* loaded from: classes7.dex */
public final class HeaderDeviceSaleBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84229a;
    @NonNull
    public final Guideline guideHeaderBackground;

    public HeaderDeviceSaleBinding(View view, Guideline guideline) {
        this.f84229a = view;
        this.guideHeaderBackground = guideline;
    }

    @NonNull
    public static HeaderDeviceSaleBinding bind(@NonNull View view) {
        int i = R.id.guideHeaderBackground;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            return new HeaderDeviceSaleBinding(view, guideline);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeaderDeviceSaleBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.header_device_sale, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84229a;
    }
}
