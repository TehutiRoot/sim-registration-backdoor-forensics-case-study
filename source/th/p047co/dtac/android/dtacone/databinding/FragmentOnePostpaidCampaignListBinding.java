package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidCampaignListBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidCampaignListBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84015a;

    public FragmentOnePostpaidCampaignListBinding(FrameLayout frameLayout) {
        this.f84015a = frameLayout;
    }

    @NonNull
    public static FragmentOnePostpaidCampaignListBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOnePostpaidCampaignListBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOnePostpaidCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_campaign_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84015a;
    }
}
