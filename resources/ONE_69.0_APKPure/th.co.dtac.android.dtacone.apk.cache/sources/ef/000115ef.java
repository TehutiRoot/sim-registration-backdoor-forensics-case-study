package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneCampaignDetailRegisterBinding */
/* loaded from: classes7.dex */
public final class FragmentOneCampaignDetailRegisterBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83998a;
    @NonNull
    public final ConstraintLayout layoutDescription;
    @NonNull
    public final LinearLayout layoutDescriptionHeader;
    @NonNull
    public final IncludeOneHeaderTrueCampaignDetailBinding layoutHeader;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final OneFontTextView tvDescriptionValue;

    public FragmentOneCampaignDetailRegisterBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, IncludeOneHeaderTrueCampaignDetailBinding includeOneHeaderTrueCampaignDetailBinding, NestedScrollView nestedScrollView, OneFontTextView oneFontTextView) {
        this.f83998a = constraintLayout;
        this.layoutDescription = constraintLayout2;
        this.layoutDescriptionHeader = linearLayout;
        this.layoutHeader = includeOneHeaderTrueCampaignDetailBinding;
        this.nestedScrollView = nestedScrollView;
        this.tvDescriptionValue = oneFontTextView;
    }

    @NonNull
    public static FragmentOneCampaignDetailRegisterBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.layoutDescription;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.layoutDescriptionHeader;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutHeader))) != null) {
                IncludeOneHeaderTrueCampaignDetailBinding bind = IncludeOneHeaderTrueCampaignDetailBinding.bind(findChildViewById);
                i = R.id.nestedScrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null) {
                    i = R.id.tvDescriptionValue;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new FragmentOneCampaignDetailRegisterBinding((ConstraintLayout) view, constraintLayout, linearLayout, bind, nestedScrollView, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneCampaignDetailRegisterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneCampaignDetailRegisterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_campaign_detail_register, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83998a;
    }
}