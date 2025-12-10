package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneVerifyCampaignMsisdnBinding */
/* loaded from: classes7.dex */
public final class ItemOneVerifyCampaignMsisdnBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84485a;
    @NonNull
    public final OneTextInputLayoutPhone phoneTextInputLayout;

    public ItemOneVerifyCampaignMsisdnBinding(FrameLayout frameLayout, OneTextInputLayoutPhone oneTextInputLayoutPhone) {
        this.f84485a = frameLayout;
        this.phoneTextInputLayout = oneTextInputLayoutPhone;
    }

    @NonNull
    public static ItemOneVerifyCampaignMsisdnBinding bind(@NonNull View view) {
        int i = R.id.phoneTextInputLayout;
        OneTextInputLayoutPhone oneTextInputLayoutPhone = (OneTextInputLayoutPhone) ViewBindings.findChildViewById(view, i);
        if (oneTextInputLayoutPhone != null) {
            return new ItemOneVerifyCampaignMsisdnBinding((FrameLayout) view, oneTextInputLayoutPhone);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneVerifyCampaignMsisdnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneVerifyCampaignMsisdnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_verify_campaign_msisdn, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84485a;
    }
}