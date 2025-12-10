package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.HeaderOneDeviceSaleBinding */
/* loaded from: classes7.dex */
public final class HeaderOneDeviceSaleBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84230a;
    @NonNull
    public final Guideline guideHeaderBackground;
    @NonNull
    public final Guideline guideVertical;

    public HeaderOneDeviceSaleBinding(View view, Guideline guideline, Guideline guideline2) {
        this.f84230a = view;
        this.guideHeaderBackground = guideline;
        this.guideVertical = guideline2;
    }

    @NonNull
    public static HeaderOneDeviceSaleBinding bind(@NonNull View view) {
        int i = R.id.guideHeaderBackground;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = R.id.guideVertical;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline2 != null) {
                return new HeaderOneDeviceSaleBinding(view, guideline, guideline2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeaderOneDeviceSaleBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.header_one_device_sale, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84230a;
    }
}
