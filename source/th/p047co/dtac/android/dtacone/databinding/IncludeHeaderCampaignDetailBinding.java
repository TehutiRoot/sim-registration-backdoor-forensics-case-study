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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeHeaderCampaignDetailBinding */
/* loaded from: classes7.dex */
public final class IncludeHeaderCampaignDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84236a;
    @NonNull
    public final View baselineViewForHeader;
    @NonNull
    public final DtacFontButton btnJoinCampaign;
    @NonNull
    public final ImageView ivCalendarCampaign;
    @NonNull
    public final ImageView ivCampaignBanner;
    @NonNull
    public final ImageView ivCampaignProfile;
    @NonNull
    public final ImageView ivCampaignTotalPoint;
    @NonNull
    public final ImageView ivCampaignTotalSim;
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
    public final RelativeLayout layoutCampaignTotalPoint;
    @NonNull
    public final RelativeLayout layoutCampaignTotalSim;
    @NonNull
    public final LinearLayout layoutHeaderDetail;
    @NonNull
    public final RelativeLayout layoutRootHeader;
    @NonNull
    public final DtacFontTextView tvCampaignAlreadyJoinTitle;
    @NonNull
    public final DtacFontTextView tvCampaignDetail;
    @NonNull
    public final DtacFontTextView tvCampaignJoinPeriodTitle;
    @NonNull
    public final DtacFontTextView tvCampaignName;
    @NonNull
    public final DtacFontTextView tvCampaignPeriodTitle;
    @NonNull
    public final DtacFontTextView tvCampaignPeriodValue;
    @NonNull
    public final DtacFontTextView tvCampaignTargetTitle;
    @NonNull
    public final DtacFontTextView tvCampaignTargetValue;
    @NonNull
    public final DtacFontTextView tvCampaignTotalPointTitle;
    @NonNull
    public final DtacFontTextView tvCampaignTotalPointValue;
    @NonNull
    public final DtacFontTextView tvCampaignTotalSimTitle;
    @NonNull
    public final DtacFontTextView tvCampaignTotalSimValue;

    public IncludeHeaderCampaignDetailBinding(RelativeLayout relativeLayout, View view, DtacFontButton dtacFontButton, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, RelativeLayout relativeLayout8, LinearLayout linearLayout, RelativeLayout relativeLayout9, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12) {
        this.f84236a = relativeLayout;
        this.baselineViewForHeader = view;
        this.btnJoinCampaign = dtacFontButton;
        this.ivCalendarCampaign = imageView;
        this.ivCampaignBanner = imageView2;
        this.ivCampaignProfile = imageView3;
        this.ivCampaignTotalPoint = imageView4;
        this.ivCampaignTotalSim = imageView5;
        this.ivTargetCampaign = imageView6;
        this.layoutCampaignAlreadyJoin = relativeLayout2;
        this.layoutCampaignHeader = relativeLayout3;
        this.layoutCampaignJoin = relativeLayout4;
        this.layoutCampaignPeriod = relativeLayout5;
        this.layoutCampaignTarget = relativeLayout6;
        this.layoutCampaignTotalPoint = relativeLayout7;
        this.layoutCampaignTotalSim = relativeLayout8;
        this.layoutHeaderDetail = linearLayout;
        this.layoutRootHeader = relativeLayout9;
        this.tvCampaignAlreadyJoinTitle = dtacFontTextView;
        this.tvCampaignDetail = dtacFontTextView2;
        this.tvCampaignJoinPeriodTitle = dtacFontTextView3;
        this.tvCampaignName = dtacFontTextView4;
        this.tvCampaignPeriodTitle = dtacFontTextView5;
        this.tvCampaignPeriodValue = dtacFontTextView6;
        this.tvCampaignTargetTitle = dtacFontTextView7;
        this.tvCampaignTargetValue = dtacFontTextView8;
        this.tvCampaignTotalPointTitle = dtacFontTextView9;
        this.tvCampaignTotalPointValue = dtacFontTextView10;
        this.tvCampaignTotalSimTitle = dtacFontTextView11;
        this.tvCampaignTotalSimValue = dtacFontTextView12;
    }

    @NonNull
    public static IncludeHeaderCampaignDetailBinding bind(@NonNull View view) {
        int i = R.id.baselineViewForHeader;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.btnJoinCampaign;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.ivCalendarCampaign;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ivCampaignBanner;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.ivCampaignProfile;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.ivCampaignTotalPoint;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView4 != null) {
                                i = R.id.ivCampaignTotalSim;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView5 != null) {
                                    i = R.id.ivTargetCampaign;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView6 != null) {
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
                                                            i = R.id.layoutCampaignTotalPoint;
                                                            RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                            if (relativeLayout6 != null) {
                                                                i = R.id.layoutCampaignTotalSim;
                                                                RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                if (relativeLayout7 != null) {
                                                                    i = R.id.layoutHeaderDetail;
                                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout != null) {
                                                                        RelativeLayout relativeLayout8 = (RelativeLayout) view;
                                                                        i = R.id.tvCampaignAlreadyJoinTitle;
                                                                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView != null) {
                                                                            i = R.id.tvCampaignDetail;
                                                                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView2 != null) {
                                                                                i = R.id.tvCampaignJoinPeriodTitle;
                                                                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacFontTextView3 != null) {
                                                                                    i = R.id.tvCampaignName;
                                                                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView4 != null) {
                                                                                        i = R.id.tvCampaignPeriodTitle;
                                                                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView5 != null) {
                                                                                            i = R.id.tvCampaignPeriodValue;
                                                                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (dtacFontTextView6 != null) {
                                                                                                i = R.id.tvCampaignTargetTitle;
                                                                                                DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (dtacFontTextView7 != null) {
                                                                                                    i = R.id.tvCampaignTargetValue;
                                                                                                    DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (dtacFontTextView8 != null) {
                                                                                                        i = R.id.tvCampaignTotalPointTitle;
                                                                                                        DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (dtacFontTextView9 != null) {
                                                                                                            i = R.id.tvCampaignTotalPointValue;
                                                                                                            DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (dtacFontTextView10 != null) {
                                                                                                                i = R.id.tvCampaignTotalSimTitle;
                                                                                                                DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (dtacFontTextView11 != null) {
                                                                                                                    i = R.id.tvCampaignTotalSimValue;
                                                                                                                    DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (dtacFontTextView12 != null) {
                                                                                                                        return new IncludeHeaderCampaignDetailBinding(relativeLayout8, findChildViewById, dtacFontButton, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, linearLayout, relativeLayout8, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12);
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
    public static IncludeHeaderCampaignDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeHeaderCampaignDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_header_campaign_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84236a;
    }
}
