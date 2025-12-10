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

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneHeaderCampaignDetailBinding */
/* loaded from: classes7.dex */
public final class IncludeOneHeaderCampaignDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84261a;
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
    public final ImageView ivTargetCampaign;
    @NonNull
    public final RelativeLayout layoutCampaignAlreadyJoin;
    @NonNull
    public final RelativeLayout layoutCampaignHeader;
    @NonNull
    public final RelativeLayout layoutCampaignJoin;
    @NonNull
    public final RelativeLayout layoutCampaignPeriod;
    @NonNull
    public final RelativeLayout layoutCampaignTarget;
    @NonNull
    public final LinearLayout layoutHeaderDetail;
    @NonNull
    public final RelativeLayout layoutRootHeader;
    @NonNull
    public final OneFontTextView tvCampaignAlreadyJoinTitle;
    @NonNull
    public final OneFontTextView tvCampaignDetail;
    @NonNull
    public final OneFontTextView tvCampaignJoinPeriodTitle;
    @NonNull
    public final OneFontTextView tvCampaignName;
    @NonNull
    public final OneFontTextView tvCampaignPeriodTitle;
    @NonNull
    public final OneFontTextView tvCampaignPeriodValue;
    @NonNull
    public final OneFontTextView tvCampaignTargetTitle;
    @NonNull
    public final OneFontTextView tvCampaignTargetValue;

    public IncludeOneHeaderCampaignDetailBinding(RelativeLayout relativeLayout, View view, OneFontButton oneFontButton, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, LinearLayout linearLayout, RelativeLayout relativeLayout7, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8) {
        this.f84261a = relativeLayout;
        this.baselineViewForHeader = view;
        this.btnJoinCampaign = oneFontButton;
        this.ivCalendarCampaign = imageView;
        this.ivCampaignBanner = imageView2;
        this.ivCampaignProfile = imageView3;
        this.ivTargetCampaign = imageView4;
        this.layoutCampaignAlreadyJoin = relativeLayout2;
        this.layoutCampaignHeader = relativeLayout3;
        this.layoutCampaignJoin = relativeLayout4;
        this.layoutCampaignPeriod = relativeLayout5;
        this.layoutCampaignTarget = relativeLayout6;
        this.layoutHeaderDetail = linearLayout;
        this.layoutRootHeader = relativeLayout7;
        this.tvCampaignAlreadyJoinTitle = oneFontTextView;
        this.tvCampaignDetail = oneFontTextView2;
        this.tvCampaignJoinPeriodTitle = oneFontTextView3;
        this.tvCampaignName = oneFontTextView4;
        this.tvCampaignPeriodTitle = oneFontTextView5;
        this.tvCampaignPeriodValue = oneFontTextView6;
        this.tvCampaignTargetTitle = oneFontTextView7;
        this.tvCampaignTargetValue = oneFontTextView8;
    }

    @NonNull
    public static IncludeOneHeaderCampaignDetailBinding bind(@NonNull View view) {
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
                            i = R.id.ivTargetCampaign;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView4 != null) {
                                i = R.id.layoutCampaignAlreadyJoin;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout != null) {
                                    i = R.id.layoutCampaignHeader;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout2 != null) {
                                        i = R.id.layoutCampaignJoin;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout3 != null) {
                                            i = R.id.layoutCampaignPeriod;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout4 != null) {
                                                i = R.id.layoutCampaignTarget;
                                                RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout5 != null) {
                                                    i = R.id.layoutHeaderDetail;
                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout != null) {
                                                        RelativeLayout relativeLayout6 = (RelativeLayout) view;
                                                        i = R.id.tvCampaignAlreadyJoinTitle;
                                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView != null) {
                                                            i = R.id.tvCampaignDetail;
                                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView2 != null) {
                                                                i = R.id.tvCampaignJoinPeriodTitle;
                                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView3 != null) {
                                                                    i = R.id.tvCampaignName;
                                                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView4 != null) {
                                                                        i = R.id.tvCampaignPeriodTitle;
                                                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView5 != null) {
                                                                            i = R.id.tvCampaignPeriodValue;
                                                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView6 != null) {
                                                                                i = R.id.tvCampaignTargetTitle;
                                                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView7 != null) {
                                                                                    i = R.id.tvCampaignTargetValue;
                                                                                    OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView8 != null) {
                                                                                        return new IncludeOneHeaderCampaignDetailBinding(relativeLayout6, findChildViewById, oneFontButton, imageView, imageView2, imageView3, imageView4, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, linearLayout, relativeLayout6, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8);
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
    public static IncludeOneHeaderCampaignDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneHeaderCampaignDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_header_campaign_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84261a;
    }
}
