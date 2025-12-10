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

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeVerfySimActivationBinding */
/* loaded from: classes7.dex */
public final class IncludeVerfySimActivationBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84299a;
    @NonNull
    public final DtacFontTextView tvCardNumberTitle;
    @NonNull
    public final DtacFontTextView tvCardNumberValue;
    @NonNull
    public final DtacFontTextView tvMobileNumberTitle;
    @NonNull
    public final DtacFontTextView tvMobileNumberValue;

    public IncludeVerfySimActivationBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84299a = linearLayout;
        this.tvCardNumberTitle = dtacFontTextView;
        this.tvCardNumberValue = dtacFontTextView2;
        this.tvMobileNumberTitle = dtacFontTextView3;
        this.tvMobileNumberValue = dtacFontTextView4;
    }

    @NonNull
    public static IncludeVerfySimActivationBinding bind(@NonNull View view) {
        int i = R.id.tvCardNumberTitle;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvCardNumberValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.tvMobileNumberTitle;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.tvMobileNumberValue;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        return new IncludeVerfySimActivationBinding((LinearLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeVerfySimActivationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeVerfySimActivationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_verfy_sim_activation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84299a;
    }
}
