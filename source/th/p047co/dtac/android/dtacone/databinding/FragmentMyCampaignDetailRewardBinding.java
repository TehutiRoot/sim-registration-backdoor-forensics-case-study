package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMyCampaignDetailRewardBinding */
/* loaded from: classes7.dex */
public final class FragmentMyCampaignDetailRewardBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83879a;
    @NonNull
    public final RelativeLayout btnAllReward;
    @NonNull
    public final RoundedImageView ivCurrentReward;
    @NonNull
    public final ImageView ivEmptyReward;
    @NonNull
    public final RoundedImageView ivNextReward;
    @NonNull
    public final RelativeLayout layoutCurrentReward;
    @NonNull
    public final LinearLayout layoutCurrentRewardTitle;
    @NonNull
    public final RelativeLayout layoutEmptyReward;
    @NonNull
    public final RelativeLayout layoutNextReward;
    @NonNull
    public final LinearLayout layoutNextRewardTitle;
    @NonNull
    public final RecyclerView recyclerCurrentReward;
    @NonNull
    public final RecyclerView recyclerNextReward;
    @NonNull
    public final DtacFontTextView tvCurrentRewardTitle;
    @NonNull
    public final DtacFontTextView tvEmptyCurrentReward;
    @NonNull
    public final DtacFontTextView tvNextRewardTitle;

    public FragmentMyCampaignDetailRewardBinding(NestedScrollView nestedScrollView, RelativeLayout relativeLayout, RoundedImageView roundedImageView, ImageView imageView, RoundedImageView roundedImageView2, RelativeLayout relativeLayout2, LinearLayout linearLayout, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, LinearLayout linearLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83879a = nestedScrollView;
        this.btnAllReward = relativeLayout;
        this.ivCurrentReward = roundedImageView;
        this.ivEmptyReward = imageView;
        this.ivNextReward = roundedImageView2;
        this.layoutCurrentReward = relativeLayout2;
        this.layoutCurrentRewardTitle = linearLayout;
        this.layoutEmptyReward = relativeLayout3;
        this.layoutNextReward = relativeLayout4;
        this.layoutNextRewardTitle = linearLayout2;
        this.recyclerCurrentReward = recyclerView;
        this.recyclerNextReward = recyclerView2;
        this.tvCurrentRewardTitle = dtacFontTextView;
        this.tvEmptyCurrentReward = dtacFontTextView2;
        this.tvNextRewardTitle = dtacFontTextView3;
    }

    @NonNull
    public static FragmentMyCampaignDetailRewardBinding bind(@NonNull View view) {
        int i = R.id.btnAllReward;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.ivCurrentReward;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
            if (roundedImageView != null) {
                i = R.id.ivEmptyReward;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ivNextReward;
                    RoundedImageView roundedImageView2 = (RoundedImageView) ViewBindings.findChildViewById(view, i);
                    if (roundedImageView2 != null) {
                        i = R.id.layoutCurrentReward;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.layoutCurrentRewardTitle;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.layoutEmptyReward;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout3 != null) {
                                    i = R.id.layoutNextReward;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout4 != null) {
                                        i = R.id.layoutNextRewardTitle;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout2 != null) {
                                            i = R.id.recyclerCurrentReward;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView != null) {
                                                i = R.id.recyclerNextReward;
                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView2 != null) {
                                                    i = R.id.tvCurrentRewardTitle;
                                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView != null) {
                                                        i = R.id.tvEmptyCurrentReward;
                                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView2 != null) {
                                                            i = R.id.tvNextRewardTitle;
                                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView3 != null) {
                                                                return new FragmentMyCampaignDetailRewardBinding((NestedScrollView) view, relativeLayout, roundedImageView, imageView, roundedImageView2, relativeLayout2, linearLayout, relativeLayout3, relativeLayout4, linearLayout2, recyclerView, recyclerView2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static FragmentMyCampaignDetailRewardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMyCampaignDetailRewardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_campaign_detail_reward, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83879a;
    }
}
