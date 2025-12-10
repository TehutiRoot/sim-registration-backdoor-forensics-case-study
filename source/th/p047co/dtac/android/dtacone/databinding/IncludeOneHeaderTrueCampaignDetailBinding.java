package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneHeaderTrueCampaignDetailBinding */
/* loaded from: classes7.dex */
public final class IncludeOneHeaderTrueCampaignDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84262a;
    @NonNull
    public final View baselineViewForHeader;
    @NonNull
    public final OneFontButton btnJoinCampaign;
    @NonNull
    public final ImageView ivCalendarCampaign;
    @NonNull
    public final ImageView ivCampaignBanner;
    @NonNull
    public final ImageView ivCampaignProfile;
    @NonNull
    public final RelativeLayout layoutCampaignHeader;
    @NonNull
    public final RelativeLayout layoutCampaignJoin;
    @NonNull
    public final RelativeLayout layoutCampaignPeriod;
    @NonNull
    public final LinearLayout layoutHeaderDetail;
    @NonNull
    public final RelativeLayout layoutRootHeader;
    @NonNull
    public final OneFontTextView tvCampaignJoinPeriodTitle;
    @NonNull
    public final OneFontTextView tvCampaignName;
    @NonNull
    public final OneFontTextView tvCampaignPeriodTitle;
    @NonNull
    public final OneFontTextView tvCampaignPeriodValue;

    public IncludeOneHeaderTrueCampaignDetailBinding(RelativeLayout relativeLayout, View view, OneFontButton oneFontButton, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, LinearLayout linearLayout, RelativeLayout relativeLayout5, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84262a = relativeLayout;
        this.baselineViewForHeader = view;
        this.btnJoinCampaign = oneFontButton;
        this.ivCalendarCampaign = imageView;
        this.ivCampaignBanner = imageView2;
        this.ivCampaignProfile = imageView3;
        this.layoutCampaignHeader = relativeLayout2;
        this.layoutCampaignJoin = relativeLayout3;
        this.layoutCampaignPeriod = relativeLayout4;
        this.layoutHeaderDetail = linearLayout;
        this.layoutRootHeader = relativeLayout5;
        this.tvCampaignJoinPeriodTitle = oneFontTextView;
        this.tvCampaignName = oneFontTextView2;
        this.tvCampaignPeriodTitle = oneFontTextView3;
        this.tvCampaignPeriodValue = oneFontTextView4;
    }

    @NonNull
    public static IncludeOneHeaderTrueCampaignDetailBinding bind(@NonNull View view) {
        int i = R.id.baselineViewForHeader;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.btnJoinCampaign;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.ivCalendarCampaign;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ivCampaignBanner;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.ivCampaignProfile;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.layoutCampaignHeader;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout != null) {
                                i = R.id.layoutCampaignJoin;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout2 != null) {
                                    i = R.id.layoutCampaignPeriod;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout3 != null) {
                                        i = R.id.layoutHeaderDetail;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            RelativeLayout relativeLayout4 = (RelativeLayout) view;
                                            i = R.id.tvCampaignJoinPeriodTitle;
                                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView != null) {
                                                i = R.id.tvCampaignName;
                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView2 != null) {
                                                    i = R.id.tvCampaignPeriodTitle;
                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView3 != null) {
                                                        i = R.id.tvCampaignPeriodValue;
                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView4 != null) {
                                                            return new IncludeOneHeaderTrueCampaignDetailBinding(relativeLayout4, findChildViewById, oneFontButton, imageView, imageView2, imageView3, relativeLayout, relativeLayout2, relativeLayout3, linearLayout, relativeLayout4, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static IncludeOneHeaderTrueCampaignDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneHeaderTrueCampaignDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_header_true_campaign_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84262a;
    }
}
