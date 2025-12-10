package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneCampaignRewardProgressBinding */
/* loaded from: classes7.dex */
public final class ItemOneCampaignRewardProgressBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84455a;
    @NonNull
    public final ImageView ivDotCenter;
    @NonNull
    public final ImageView ivLineBottom;
    @NonNull
    public final ImageView ivLineTop;
    @NonNull
    public final ConstraintLayout layoutImageRoadmap;
    @NonNull
    public final ConstraintLayout tvCampaignRewardData;
    @NonNull
    public final OneFontTextView tvCampaignRewardDataLeft;
    @NonNull
    public final OneFontTextView tvCampaignRewardDataRight;
    @NonNull
    public final View vSeparateLine;

    public ItemOneCampaignRewardProgressBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, View view) {
        this.f84455a = constraintLayout;
        this.ivDotCenter = imageView;
        this.ivLineBottom = imageView2;
        this.ivLineTop = imageView3;
        this.layoutImageRoadmap = constraintLayout2;
        this.tvCampaignRewardData = constraintLayout3;
        this.tvCampaignRewardDataLeft = oneFontTextView;
        this.tvCampaignRewardDataRight = oneFontTextView2;
        this.vSeparateLine = view;
    }

    @NonNull
    public static ItemOneCampaignRewardProgressBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivDotCenter;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivLineBottom;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.ivLineTop;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.layoutImageRoadmap;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.tvCampaignRewardData;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            i = R.id.tvCampaignRewardDataLeft;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.tvCampaignRewardDataRight;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLine))) != null) {
                                    return new ItemOneCampaignRewardProgressBinding((ConstraintLayout) view, imageView, imageView2, imageView3, constraintLayout, constraintLayout2, oneFontTextView, oneFontTextView2, findChildViewById);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneCampaignRewardProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneCampaignRewardProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_campaign_reward_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84455a;
    }
}