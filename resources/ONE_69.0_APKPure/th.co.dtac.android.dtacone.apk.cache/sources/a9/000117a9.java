package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemMyCampaignDetailPointHistoryBinding */
/* loaded from: classes7.dex */
public final class ItemMyCampaignDetailPointHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84440a;
    @NonNull
    public final RoundedImageView ivGetReward;
    @NonNull
    public final ImageView ivHistoryIcon;
    @NonNull
    public final RelativeLayout layoutDescription;
    @NonNull
    public final RelativeLayout layoutGetReward;
    @NonNull
    public final RelativeLayout layoutHistory;
    @NonNull
    public final RelativeLayout layoutReward;
    @NonNull
    public final RecyclerView recyclerItemDescription;
    @NonNull
    public final RecyclerView recyclerReward;
    @NonNull
    public final DtacFontTextView tvHistoryDate;
    @NonNull
    public final DtacFontTextView tvHistoryPoint;
    @NonNull
    public final DtacFontTextView tvHistoryPointUnit;
    @NonNull
    public final DtacFontTextView tvHistoryTitle;
    @NonNull
    public final DtacFontTextView tvHistoryTitleCenter;

    public ItemMyCampaignDetailPointHistoryBinding(LinearLayout linearLayout, RoundedImageView roundedImageView, ImageView imageView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RecyclerView recyclerView, RecyclerView recyclerView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f84440a = linearLayout;
        this.ivGetReward = roundedImageView;
        this.ivHistoryIcon = imageView;
        this.layoutDescription = relativeLayout;
        this.layoutGetReward = relativeLayout2;
        this.layoutHistory = relativeLayout3;
        this.layoutReward = relativeLayout4;
        this.recyclerItemDescription = recyclerView;
        this.recyclerReward = recyclerView2;
        this.tvHistoryDate = dtacFontTextView;
        this.tvHistoryPoint = dtacFontTextView2;
        this.tvHistoryPointUnit = dtacFontTextView3;
        this.tvHistoryTitle = dtacFontTextView4;
        this.tvHistoryTitleCenter = dtacFontTextView5;
    }

    @NonNull
    public static ItemMyCampaignDetailPointHistoryBinding bind(@NonNull View view) {
        int i = R.id.ivGetReward;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
        if (roundedImageView != null) {
            i = R.id.ivHistoryIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.layoutDescription;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.layoutGetReward;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null) {
                        i = R.id.layoutHistory;
                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout3 != null) {
                            i = R.id.layoutReward;
                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout4 != null) {
                                i = R.id.recyclerItemDescription;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = R.id.recyclerReward;
                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView2 != null) {
                                        i = R.id.tvHistoryDate;
                                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView != null) {
                                            i = R.id.tvHistoryPoint;
                                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView2 != null) {
                                                i = R.id.tvHistoryPointUnit;
                                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView3 != null) {
                                                    i = R.id.tvHistoryTitle;
                                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView4 != null) {
                                                        i = R.id.tvHistoryTitleCenter;
                                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView5 != null) {
                                                            return new ItemMyCampaignDetailPointHistoryBinding((LinearLayout) view, roundedImageView, imageView, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, recyclerView, recyclerView2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
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
    public static ItemMyCampaignDetailPointHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMyCampaignDetailPointHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_my_campaign_detail_point_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84440a;
    }
}