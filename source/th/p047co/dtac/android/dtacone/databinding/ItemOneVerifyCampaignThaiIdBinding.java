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
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneVerifyCampaignThaiIdBinding */
/* loaded from: classes7.dex */
public final class ItemOneVerifyCampaignThaiIdBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84379a;
    @NonNull
    public final OneTextLayoutView tvIdCard;

    public ItemOneVerifyCampaignThaiIdBinding(FrameLayout frameLayout, OneTextLayoutView oneTextLayoutView) {
        this.f84379a = frameLayout;
        this.tvIdCard = oneTextLayoutView;
    }

    @NonNull
    public static ItemOneVerifyCampaignThaiIdBinding bind(@NonNull View view) {
        int i = R.id.tvIdCard;
        OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
        if (oneTextLayoutView != null) {
            return new ItemOneVerifyCampaignThaiIdBinding((FrameLayout) view, oneTextLayoutView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneVerifyCampaignThaiIdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneVerifyCampaignThaiIdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_verify_campaign_thai_id, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84379a;
    }
}
