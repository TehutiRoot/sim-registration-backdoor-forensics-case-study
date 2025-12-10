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
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneVerifyCampaignMsisdnSelectBinding */
/* loaded from: classes7.dex */
public final class ItemOneVerifyCampaignMsisdnSelectBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84377a;
    @NonNull
    public final OneTextLayoutView tvPhoneNumber;

    public ItemOneVerifyCampaignMsisdnSelectBinding(ConstraintLayout constraintLayout, OneTextLayoutView oneTextLayoutView) {
        this.f84377a = constraintLayout;
        this.tvPhoneNumber = oneTextLayoutView;
    }

    @NonNull
    public static ItemOneVerifyCampaignMsisdnSelectBinding bind(@NonNull View view) {
        int i = R.id.tvPhoneNumber;
        OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
        if (oneTextLayoutView != null) {
            return new ItemOneVerifyCampaignMsisdnSelectBinding((ConstraintLayout) view, oneTextLayoutView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneVerifyCampaignMsisdnSelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneVerifyCampaignMsisdnSelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_verify_campaign_msisdn_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84377a;
    }
}
