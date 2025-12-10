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
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneVerifyCampaignApproveCodeBinding */
/* loaded from: classes7.dex */
public final class ItemOneVerifyCampaignApproveCodeBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84373a;
    @NonNull
    public final OneTextInputLayoutText approveCodeTextInputLayout;

    public ItemOneVerifyCampaignApproveCodeBinding(FrameLayout frameLayout, OneTextInputLayoutText oneTextInputLayoutText) {
        this.f84373a = frameLayout;
        this.approveCodeTextInputLayout = oneTextInputLayoutText;
    }

    @NonNull
    public static ItemOneVerifyCampaignApproveCodeBinding bind(@NonNull View view) {
        int i = R.id.approveCodeTextInputLayout;
        OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
        if (oneTextInputLayoutText != null) {
            return new ItemOneVerifyCampaignApproveCodeBinding((FrameLayout) view, oneTextInputLayoutText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneVerifyCampaignApproveCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneVerifyCampaignApproveCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_verify_campaign_approve_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84373a;
    }
}
