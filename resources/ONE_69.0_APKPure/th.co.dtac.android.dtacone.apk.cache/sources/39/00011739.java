package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentWithDeviceCampaignDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentWithDeviceCampaignDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84328a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final DtacFontTextView dtacFontTextView4;
    @NonNull
    public final FrameLayout frameLayout;
    @NonNull
    public final FrameLayout framePrice;
    @NonNull
    public final FrameLayout frameSum;
    @NonNull
    public final ImageView imageView13;
    @NonNull
    public final View line1;
    @NonNull
    public final View line2;
    @NonNull
    public final DtacFontTextView title1;
    @NonNull
    public final DtacFontTextView tvAmount;
    @NonNull
    public final DtacFontTextView tvAmountValue;
    @NonNull
    public final DtacFontTextView tvDeviceType;
    @NonNull
    public final DtacFontTextView tvDiscount;
    @NonNull
    public final DtacFontTextView tvDiscountValue;
    @NonNull
    public final DtacFontTextView tvSummary;
    @NonNull
    public final DtacFontTextView tvSummaryValue;
    @NonNull
    public final DtacFontTextView tvTitle;
    @NonNull
    public final DtacFontTextView tvTitleValue;

    public FragmentWithDeviceCampaignDetailBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ImageView imageView, View view, View view2, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11) {
        this.f84328a = linearLayout;
        this.btnConfirm = dtacFontButton;
        this.dtacFontTextView4 = dtacFontTextView;
        this.frameLayout = frameLayout;
        this.framePrice = frameLayout2;
        this.frameSum = frameLayout3;
        this.imageView13 = imageView;
        this.line1 = view;
        this.line2 = view2;
        this.title1 = dtacFontTextView2;
        this.tvAmount = dtacFontTextView3;
        this.tvAmountValue = dtacFontTextView4;
        this.tvDeviceType = dtacFontTextView5;
        this.tvDiscount = dtacFontTextView6;
        this.tvDiscountValue = dtacFontTextView7;
        this.tvSummary = dtacFontTextView8;
        this.tvSummaryValue = dtacFontTextView9;
        this.tvTitle = dtacFontTextView10;
        this.tvTitleValue = dtacFontTextView11;
    }

    @NonNull
    public static FragmentWithDeviceCampaignDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btn_confirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.dtacFontTextView4;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.frameLayout;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.frame_price;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        i = R.id.frame_sum;
                        FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout3 != null) {
                            i = R.id.imageView13;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.line2))) != null) {
                                i = R.id.title1;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tv_amount;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        i = R.id.tv_amountValue;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            i = R.id.tv_deviceType;
                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView5 != null) {
                                                i = R.id.tv_discount;
                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView6 != null) {
                                                    i = R.id.tv_discountValue;
                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView7 != null) {
                                                        i = R.id.tv_summary;
                                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView8 != null) {
                                                            i = R.id.tv_summary_value;
                                                            DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView9 != null) {
                                                                i = R.id.tv_title;
                                                                DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView10 != null) {
                                                                    i = R.id.tv_titleValue;
                                                                    DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView11 != null) {
                                                                        return new FragmentWithDeviceCampaignDetailBinding((LinearLayout) view, dtacFontButton, dtacFontTextView, frameLayout, frameLayout2, frameLayout3, imageView, findChildViewById, findChildViewById2, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11);
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
    public static FragmentWithDeviceCampaignDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWithDeviceCampaignDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_with_device_campaign_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84328a;
    }
}