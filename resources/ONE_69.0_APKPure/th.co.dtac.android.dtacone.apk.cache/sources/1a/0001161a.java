package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleTrueSelectCampaignBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleTrueSelectCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84041a;
    @NonNull
    public final ImageView deviceSaleDeviceTypeImageView;
    @NonNull
    public final RecyclerView listViewPackage;
    @NonNull
    public final CardView oneDeviceSaleSelectCampaignCardView;
    @NonNull
    public final ConstraintLayout oneDeviceSaleSelectCampaignDeviceTypeLayout;
    @NonNull
    public final OneCustomClearableEditText oneDeviceSaleSelectCampaignEditText;
    @NonNull
    public final FrameLayout oneDeviceSaleSelectCampaignFrameLayout;
    @NonNull
    public final ImageView oneDeviceSaleSelectCampaignGiftImageView;
    @NonNull
    public final ConstraintLayout oneDeviceSaleSelectCampaignHeaderLayout;
    @NonNull
    public final OneFontTextView oneDeviceSaleSelectCampaignHeaderTextView;
    @NonNull
    public final ConstraintLayout oneDeviceSaleSelectCampaignMainLayout;
    @NonNull
    public final RecyclerView oneDeviceSaleSelectCampaignRecyclerView;
    @NonNull
    public final OneFontButton oneDeviceSaleSelectCampaignRetryButton;
    @NonNull
    public final LinearLayoutCompat oneDeviceSaleSelectCampaignRetryLayout;
    @NonNull
    public final OneFontTextView oneDeviceSaleSelectCampaignRetryMessageTextView;
    @NonNull
    public final OneFontTextView oneDeviceSaleSelectCampaignWarningMessageTextView;

    public FragmentOneDeviceSaleTrueSelectCampaignBinding(ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, CardView cardView, ConstraintLayout constraintLayout2, OneCustomClearableEditText oneCustomClearableEditText, FrameLayout frameLayout, ImageView imageView2, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout4, RecyclerView recyclerView2, OneFontButton oneFontButton, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84041a = constraintLayout;
        this.deviceSaleDeviceTypeImageView = imageView;
        this.listViewPackage = recyclerView;
        this.oneDeviceSaleSelectCampaignCardView = cardView;
        this.oneDeviceSaleSelectCampaignDeviceTypeLayout = constraintLayout2;
        this.oneDeviceSaleSelectCampaignEditText = oneCustomClearableEditText;
        this.oneDeviceSaleSelectCampaignFrameLayout = frameLayout;
        this.oneDeviceSaleSelectCampaignGiftImageView = imageView2;
        this.oneDeviceSaleSelectCampaignHeaderLayout = constraintLayout3;
        this.oneDeviceSaleSelectCampaignHeaderTextView = oneFontTextView;
        this.oneDeviceSaleSelectCampaignMainLayout = constraintLayout4;
        this.oneDeviceSaleSelectCampaignRecyclerView = recyclerView2;
        this.oneDeviceSaleSelectCampaignRetryButton = oneFontButton;
        this.oneDeviceSaleSelectCampaignRetryLayout = linearLayoutCompat;
        this.oneDeviceSaleSelectCampaignRetryMessageTextView = oneFontTextView2;
        this.oneDeviceSaleSelectCampaignWarningMessageTextView = oneFontTextView3;
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueSelectCampaignBinding bind(@NonNull View view) {
        int i = R.id.deviceSaleDeviceTypeImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.listViewPackage;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.oneDeviceSaleSelectCampaignCardView;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.oneDeviceSaleSelectCampaignDeviceTypeLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.oneDeviceSaleSelectCampaignEditText;
                        OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (oneCustomClearableEditText != null) {
                            i = R.id.oneDeviceSaleSelectCampaignFrameLayout;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = R.id.oneDeviceSaleSelectCampaignGiftImageView;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.oneDeviceSaleSelectCampaignHeaderLayout;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = R.id.oneDeviceSaleSelectCampaignHeaderTextView;
                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView != null) {
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                            i = R.id.oneDeviceSaleSelectCampaignRecyclerView;
                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView2 != null) {
                                                i = R.id.oneDeviceSaleSelectCampaignRetryButton;
                                                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                                if (oneFontButton != null) {
                                                    i = R.id.oneDeviceSaleSelectCampaignRetryLayout;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayoutCompat != null) {
                                                        i = R.id.oneDeviceSaleSelectCampaignRetryMessageTextView;
                                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView2 != null) {
                                                            i = R.id.oneDeviceSaleSelectCampaignWarningMessageTextView;
                                                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView3 != null) {
                                                                return new FragmentOneDeviceSaleTrueSelectCampaignBinding(constraintLayout3, imageView, recyclerView, cardView, constraintLayout, oneCustomClearableEditText, frameLayout, imageView2, constraintLayout2, oneFontTextView, constraintLayout3, recyclerView2, oneFontButton, linearLayoutCompat, oneFontTextView2, oneFontTextView3);
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
    public static FragmentOneDeviceSaleTrueSelectCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueSelectCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_true_select_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84041a;
    }
}