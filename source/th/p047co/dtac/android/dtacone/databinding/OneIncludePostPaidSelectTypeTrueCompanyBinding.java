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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludePostPaidSelectTypeTrueCompanyBinding */
/* loaded from: classes7.dex */
public final class OneIncludePostPaidSelectTypeTrueCompanyBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84478a;
    @NonNull
    public final OneFontButton normalRegistrationButton;
    @NonNull
    public final OneFontButton registrationWithCampaignButton;
    @NonNull
    public final OneFontButton withDeviceButton;
    @NonNull
    public final LinearLayout withDeviceLayout;

    public OneIncludePostPaidSelectTypeTrueCompanyBinding(LinearLayout linearLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontButton oneFontButton3, LinearLayout linearLayout2) {
        this.f84478a = linearLayout;
        this.normalRegistrationButton = oneFontButton;
        this.registrationWithCampaignButton = oneFontButton2;
        this.withDeviceButton = oneFontButton3;
        this.withDeviceLayout = linearLayout2;
    }

    @NonNull
    public static OneIncludePostPaidSelectTypeTrueCompanyBinding bind(@NonNull View view) {
        int i = R.id.normalRegistrationButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.registrationWithCampaignButton;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.withDeviceButton;
                OneFontButton oneFontButton3 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton3 != null) {
                    i = R.id.withDeviceLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        return new OneIncludePostPaidSelectTypeTrueCompanyBinding((LinearLayout) view, oneFontButton, oneFontButton2, oneFontButton3, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludePostPaidSelectTypeTrueCompanyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludePostPaidSelectTypeTrueCompanyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_post_paid_select_type_true_company, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84478a;
    }
}
