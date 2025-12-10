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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneVerifyCampaignDefaultBinding */
/* loaded from: classes7.dex */
public final class ItemOneVerifyCampaignDefaultBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84484a;
    @NonNull
    public final OneTextInputLayoutText defaultTextInputLayout;

    public ItemOneVerifyCampaignDefaultBinding(FrameLayout frameLayout, OneTextInputLayoutText oneTextInputLayoutText) {
        this.f84484a = frameLayout;
        this.defaultTextInputLayout = oneTextInputLayoutText;
    }

    @NonNull
    public static ItemOneVerifyCampaignDefaultBinding bind(@NonNull View view) {
        int i = R.id.defaultTextInputLayout;
        OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
        if (oneTextInputLayoutText != null) {
            return new ItemOneVerifyCampaignDefaultBinding((FrameLayout) view, oneTextInputLayoutText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneVerifyCampaignDefaultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneVerifyCampaignDefaultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_verify_campaign_default, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84484a;
    }
}