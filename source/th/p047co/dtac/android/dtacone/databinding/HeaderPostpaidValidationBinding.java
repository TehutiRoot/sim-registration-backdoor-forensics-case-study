package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.HeaderPostpaidValidationBinding */
/* loaded from: classes7.dex */
public final class HeaderPostpaidValidationBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84232a;
    @NonNull
    public final Guideline guideHeaderBackground;

    public HeaderPostpaidValidationBinding(View view, Guideline guideline) {
        this.f84232a = view;
        this.guideHeaderBackground = guideline;
    }

    @NonNull
    public static HeaderPostpaidValidationBinding bind(@NonNull View view) {
        int i = R.id.guideHeaderBackground;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            return new HeaderPostpaidValidationBinding(view, guideline);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeaderPostpaidValidationBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.header_postpaid_validation, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84232a;
    }
}
