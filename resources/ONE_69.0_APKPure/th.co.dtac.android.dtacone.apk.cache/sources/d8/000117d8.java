package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditTextInputLayoutPhone;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneVerifyCampaignMsisdnTrueBinding */
/* loaded from: classes7.dex */
public final class ItemOneVerifyCampaignMsisdnTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84487a;
    @NonNull
    public final OneEditTextInputLayoutPhone inputLayoutPhone;

    public ItemOneVerifyCampaignMsisdnTrueBinding(ConstraintLayout constraintLayout, OneEditTextInputLayoutPhone oneEditTextInputLayoutPhone) {
        this.f84487a = constraintLayout;
        this.inputLayoutPhone = oneEditTextInputLayoutPhone;
    }

    @NonNull
    public static ItemOneVerifyCampaignMsisdnTrueBinding bind(@NonNull View view) {
        int i = R.id.inputLayoutPhone;
        OneEditTextInputLayoutPhone oneEditTextInputLayoutPhone = (OneEditTextInputLayoutPhone) ViewBindings.findChildViewById(view, i);
        if (oneEditTextInputLayoutPhone != null) {
            return new ItemOneVerifyCampaignMsisdnTrueBinding((ConstraintLayout) view, oneEditTextInputLayoutPhone);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneVerifyCampaignMsisdnTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneVerifyCampaignMsisdnTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_verify_campaign_msisdn_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84487a;
    }
}