package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneMnpCampaignBinding */
/* loaded from: classes7.dex */
public final class IncludeOneMnpCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84273a;
    @NonNull
    public final OneFontButton btnRetry;
    @NonNull
    public final LinearLayoutCompat buttonEditProposition;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final ConstraintLayout constraintLayout10;
    @NonNull
    public final OneCustomClearableEditText edtSearch;
    @NonNull
    public final ImageView ivGift;
    @NonNull
    public final LinearLayoutCompat layoutContact;
    @NonNull
    public final ConstraintLayout layoutProposition;
    @NonNull
    public final LinearLayoutCompat layoutRetry;
    @NonNull
    public final RecyclerView listView;
    @NonNull
    public final RecyclerView listViewPackage;
    @NonNull
    public final OneFontTextView propositionLabel;
    @NonNull
    public final ConstraintLayout root;
    @NonNull
    public final CardView sectionSelected;
    @NonNull
    public final OneFontTextView tvOpenMarket;
    @NonNull
    public final OneFontTextView tvPropositionName;
    @NonNull
    public final OneFontTextView tvRetryMessage;
    @NonNull
    public final OneFontTextView tvTitle;
    @NonNull
    public final OneFontTextView tvTrueDevice;
    @NonNull
    public final OneFontTextView tvWarningMessage;

    public IncludeOneMnpCampaignBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, LinearLayoutCompat linearLayoutCompat, CardView cardView, ConstraintLayout constraintLayout2, OneCustomClearableEditText oneCustomClearableEditText, ImageView imageView, LinearLayoutCompat linearLayoutCompat2, ConstraintLayout constraintLayout3, LinearLayoutCompat linearLayoutCompat3, RecyclerView recyclerView, RecyclerView recyclerView2, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout4, CardView cardView2, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7) {
        this.f84273a = constraintLayout;
        this.btnRetry = oneFontButton;
        this.buttonEditProposition = linearLayoutCompat;
        this.cardView = cardView;
        this.constraintLayout10 = constraintLayout2;
        this.edtSearch = oneCustomClearableEditText;
        this.ivGift = imageView;
        this.layoutContact = linearLayoutCompat2;
        this.layoutProposition = constraintLayout3;
        this.layoutRetry = linearLayoutCompat3;
        this.listView = recyclerView;
        this.listViewPackage = recyclerView2;
        this.propositionLabel = oneFontTextView;
        this.root = constraintLayout4;
        this.sectionSelected = cardView2;
        this.tvOpenMarket = oneFontTextView2;
        this.tvPropositionName = oneFontTextView3;
        this.tvRetryMessage = oneFontTextView4;
        this.tvTitle = oneFontTextView5;
        this.tvTrueDevice = oneFontTextView6;
        this.tvWarningMessage = oneFontTextView7;
    }

    @NonNull
    public static IncludeOneMnpCampaignBinding bind(@NonNull View view) {
        int i = R.id.btnRetry;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.buttonEditProposition;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.cardView;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.constraintLayout10;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.edtSearch;
                        OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (oneCustomClearableEditText != null) {
                            i = R.id.ivGift;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.layoutContact;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = R.id.layoutProposition;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = R.id.layoutRetry;
                                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat3 != null) {
                                            i = R.id.listView;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView != null) {
                                                i = R.id.listViewPackage;
                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView2 != null) {
                                                    i = R.id.propositionLabel;
                                                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView != null) {
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                                        i = R.id.sectionSelected;
                                                        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                                                        if (cardView2 != null) {
                                                            i = R.id.tvOpenMarket;
                                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView2 != null) {
                                                                i = R.id.tvPropositionName;
                                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView3 != null) {
                                                                    i = R.id.tvRetryMessage;
                                                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView4 != null) {
                                                                        i = R.id.tvTitle;
                                                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView5 != null) {
                                                                            i = R.id.tvTrueDevice;
                                                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView6 != null) {
                                                                                i = R.id.tvWarningMessage;
                                                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView7 != null) {
                                                                                    return new IncludeOneMnpCampaignBinding(constraintLayout3, oneFontButton, linearLayoutCompat, cardView, constraintLayout, oneCustomClearableEditText, imageView, linearLayoutCompat2, constraintLayout2, linearLayoutCompat3, recyclerView, recyclerView2, oneFontTextView, constraintLayout3, cardView2, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7);
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
    public static IncludeOneMnpCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneMnpCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_mnp_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84273a;
    }
}
