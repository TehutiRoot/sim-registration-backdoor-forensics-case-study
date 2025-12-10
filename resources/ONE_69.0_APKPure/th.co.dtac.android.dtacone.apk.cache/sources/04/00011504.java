package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentCampaignDetailImageBinding */
/* loaded from: classes7.dex */
public final class FragmentCampaignDetailImageBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83759a;
    @NonNull
    public final ImageView ivCampaignDetail;
    @NonNull
    public final ProgressBar progressBar;

    public FragmentCampaignDetailImageBinding(RelativeLayout relativeLayout, ImageView imageView, ProgressBar progressBar) {
        this.f83759a = relativeLayout;
        this.ivCampaignDetail = imageView;
        this.progressBar = progressBar;
    }

    @NonNull
    public static FragmentCampaignDetailImageBinding bind(@NonNull View view) {
        int i = R.id.ivCampaignDetail;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                return new FragmentCampaignDetailImageBinding((RelativeLayout) view, imageView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCampaignDetailImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCampaignDetailImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_campaign_detail_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83759a;
    }
}