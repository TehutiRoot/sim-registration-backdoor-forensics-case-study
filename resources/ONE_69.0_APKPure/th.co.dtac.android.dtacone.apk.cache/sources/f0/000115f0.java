package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneCampaignDetailRewardBinding */
/* loaded from: classes7.dex */
public final class FragmentOneCampaignDetailRewardBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83999a;
    @NonNull
    public final OneFontTextView btnRetryCampaignReward;
    @NonNull
    public final OneFontTextView btnSeeDetailCampaign;
    @NonNull
    public final ImageView ivCampaignProfitDetail;
    @NonNull
    public final LinearLayoutCompat layoutCampaignRewardError;
    @NonNull
    public final ConstraintLayout layoutDetailReturnProfit;
    @NonNull
    public final IncludeOneHeaderTrueCampaignDetailRewardBinding layoutHeader;
    @NonNull
    public final LinearLayoutCompat layoutProfitDetail;
    @NonNull
    public final LinearLayoutCompat layoutProfitMaxLimitReward;
    @NonNull
    public final LinearLayoutCompat layoutReward;
    @NonNull
    public final LinearLayoutCompat layoutSellValue;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final DtacRecyclerView rvProfitRoadMap;
    @NonNull
    public final OneFontTextView tvCalculateDate;
    @NonNull
    public final OneFontTextView tvCampaignProfitDetail;
    @NonNull
    public final OneFontTextView tvCampaignRewardError;
    @NonNull
    public final OneFontTextView tvColumnProfitAmount;
    @NonNull
    public final OneFontTextView tvColumnSimRegister;
    @NonNull
    public final OneFontTextView tvMaxLimitReward;
    @NonNull
    public final OneFontTextView tvMaxProfitTitle;
    @NonNull
    public final OneFontTextView tvMaxProfitValue;
    @NonNull
    public final OneFontTextView tvNextProfitTitle;
    @NonNull
    public final OneFontTextView tvNextProfitValue;
    @NonNull
    public final OneFontTextView tvProfitDescription;
    @NonNull
    public final OneFontTextView tvRewardAdditionalCollectTitle;
    @NonNull
    public final OneFontTextView tvRewardAdditionalCollectValue;
    @NonNull
    public final OneFontTextView tvSellProfitTitle;
    @NonNull
    public final OneFontTextView tvSellProfitValue;
    @NonNull
    public final OneFontTextView tvSellSimTitle;
    @NonNull
    public final OneFontTextView tvSellSimValue;
    @NonNull
    public final OneFontTextView tvTransTrofitTitle;

    public FragmentOneCampaignDetailRewardBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ImageView imageView, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout2, IncludeOneHeaderTrueCampaignDetailRewardBinding includeOneHeaderTrueCampaignDetailRewardBinding, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, LinearLayoutCompat linearLayoutCompat5, NestedScrollView nestedScrollView, DtacRecyclerView dtacRecyclerView, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14, OneFontTextView oneFontTextView15, OneFontTextView oneFontTextView16, OneFontTextView oneFontTextView17, OneFontTextView oneFontTextView18, OneFontTextView oneFontTextView19, OneFontTextView oneFontTextView20) {
        this.f83999a = constraintLayout;
        this.btnRetryCampaignReward = oneFontTextView;
        this.btnSeeDetailCampaign = oneFontTextView2;
        this.ivCampaignProfitDetail = imageView;
        this.layoutCampaignRewardError = linearLayoutCompat;
        this.layoutDetailReturnProfit = constraintLayout2;
        this.layoutHeader = includeOneHeaderTrueCampaignDetailRewardBinding;
        this.layoutProfitDetail = linearLayoutCompat2;
        this.layoutProfitMaxLimitReward = linearLayoutCompat3;
        this.layoutReward = linearLayoutCompat4;
        this.layoutSellValue = linearLayoutCompat5;
        this.nestedScrollView = nestedScrollView;
        this.rvProfitRoadMap = dtacRecyclerView;
        this.tvCalculateDate = oneFontTextView3;
        this.tvCampaignProfitDetail = oneFontTextView4;
        this.tvCampaignRewardError = oneFontTextView5;
        this.tvColumnProfitAmount = oneFontTextView6;
        this.tvColumnSimRegister = oneFontTextView7;
        this.tvMaxLimitReward = oneFontTextView8;
        this.tvMaxProfitTitle = oneFontTextView9;
        this.tvMaxProfitValue = oneFontTextView10;
        this.tvNextProfitTitle = oneFontTextView11;
        this.tvNextProfitValue = oneFontTextView12;
        this.tvProfitDescription = oneFontTextView13;
        this.tvRewardAdditionalCollectTitle = oneFontTextView14;
        this.tvRewardAdditionalCollectValue = oneFontTextView15;
        this.tvSellProfitTitle = oneFontTextView16;
        this.tvSellProfitValue = oneFontTextView17;
        this.tvSellSimTitle = oneFontTextView18;
        this.tvSellSimValue = oneFontTextView19;
        this.tvTransTrofitTitle = oneFontTextView20;
    }

    @NonNull
    public static FragmentOneCampaignDetailRewardBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnRetryCampaignReward;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.btnSeeDetailCampaign;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.ivCampaignProfitDetail;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.layoutCampaignRewardError;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = R.id.layoutDetailReturnProfit;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutHeader))) != null) {
                            IncludeOneHeaderTrueCampaignDetailRewardBinding bind = IncludeOneHeaderTrueCampaignDetailRewardBinding.bind(findChildViewById);
                            i = R.id.layoutProfitDetail;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = R.id.layoutProfitMaxLimitReward;
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat3 != null) {
                                    i = R.id.layoutReward;
                                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat4 != null) {
                                        i = R.id.layoutSellValue;
                                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat5 != null) {
                                            i = R.id.nestedScrollView;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView != null) {
                                                i = R.id.rvProfitRoadMap;
                                                DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (dtacRecyclerView != null) {
                                                    i = R.id.tvCalculateDate;
                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView3 != null) {
                                                        i = R.id.tvCampaignProfitDetail;
                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView4 != null) {
                                                            i = R.id.tvCampaignRewardError;
                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView5 != null) {
                                                                i = R.id.tvColumnProfitAmount;
                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView6 != null) {
                                                                    i = R.id.tvColumnSimRegister;
                                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView7 != null) {
                                                                        i = R.id.tvMaxLimitReward;
                                                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView8 != null) {
                                                                            i = R.id.tvMaxProfitTitle;
                                                                            OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView9 != null) {
                                                                                i = R.id.tvMaxProfitValue;
                                                                                OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView10 != null) {
                                                                                    i = R.id.tvNextProfitTitle;
                                                                                    OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView11 != null) {
                                                                                        i = R.id.tvNextProfitValue;
                                                                                        OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView12 != null) {
                                                                                            i = R.id.tvProfitDescription;
                                                                                            OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView13 != null) {
                                                                                                i = R.id.tvRewardAdditionalCollectTitle;
                                                                                                OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView14 != null) {
                                                                                                    i = R.id.tvRewardAdditionalCollectValue;
                                                                                                    OneFontTextView oneFontTextView15 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView15 != null) {
                                                                                                        i = R.id.tvSellProfitTitle;
                                                                                                        OneFontTextView oneFontTextView16 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView16 != null) {
                                                                                                            i = R.id.tvSellProfitValue;
                                                                                                            OneFontTextView oneFontTextView17 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneFontTextView17 != null) {
                                                                                                                i = R.id.tvSellSimTitle;
                                                                                                                OneFontTextView oneFontTextView18 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (oneFontTextView18 != null) {
                                                                                                                    i = R.id.tvSellSimValue;
                                                                                                                    OneFontTextView oneFontTextView19 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (oneFontTextView19 != null) {
                                                                                                                        i = R.id.tvTransTrofitTitle;
                                                                                                                        OneFontTextView oneFontTextView20 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (oneFontTextView20 != null) {
                                                                                                                            return new FragmentOneCampaignDetailRewardBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2, imageView, linearLayoutCompat, constraintLayout, bind, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, nestedScrollView, dtacRecyclerView, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, oneFontTextView13, oneFontTextView14, oneFontTextView15, oneFontTextView16, oneFontTextView17, oneFontTextView18, oneFontTextView19, oneFontTextView20);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneCampaignDetailRewardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneCampaignDetailRewardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_campaign_detail_reward, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83999a;
    }
}