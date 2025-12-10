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

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOnePostpaidCampaignBinding */
/* loaded from: classes7.dex */
public final class IncludeOnePostpaidCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84382a;
    @NonNull
    public final OneFontButton btnRetry;
    @NonNull
    public final LinearLayoutCompat buttonEditCampaign;
    @NonNull
    public final LinearLayoutCompat buttonEditProposition;
    @NonNull
    public final OneFontTextView campaignLabel;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final ConstraintLayout constraintLayout10;
    @NonNull
    public final OneCustomClearableEditText edtSearch;
    @NonNull
    public final ImageView ivGift;
    @NonNull
    public final ConstraintLayout layoutCampaign;
    @NonNull
    public final LinearLayoutCompat layoutContact;
    @NonNull
    public final ConstraintLayout layoutProposition;
    @NonNull
    public final LinearLayoutCompat layoutRetry;
    @NonNull
    public final LinearLayoutCompat line;
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
    public final View spaceBottom;
    @NonNull
    public final View spaceTop;
    @NonNull
    public final OneFontTextView tvCampaignName;
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

    public IncludeOnePostpaidCampaignBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, OneFontTextView oneFontTextView, CardView cardView, ConstraintLayout constraintLayout2, OneCustomClearableEditText oneCustomClearableEditText, ImageView imageView, ConstraintLayout constraintLayout3, LinearLayoutCompat linearLayoutCompat3, ConstraintLayout constraintLayout4, LinearLayoutCompat linearLayoutCompat4, LinearLayoutCompat linearLayoutCompat5, RecyclerView recyclerView, RecyclerView recyclerView2, OneFontTextView oneFontTextView2, ConstraintLayout constraintLayout5, CardView cardView2, View view, View view2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9) {
        this.f84382a = constraintLayout;
        this.btnRetry = oneFontButton;
        this.buttonEditCampaign = linearLayoutCompat;
        this.buttonEditProposition = linearLayoutCompat2;
        this.campaignLabel = oneFontTextView;
        this.cardView = cardView;
        this.constraintLayout10 = constraintLayout2;
        this.edtSearch = oneCustomClearableEditText;
        this.ivGift = imageView;
        this.layoutCampaign = constraintLayout3;
        this.layoutContact = linearLayoutCompat3;
        this.layoutProposition = constraintLayout4;
        this.layoutRetry = linearLayoutCompat4;
        this.line = linearLayoutCompat5;
        this.listView = recyclerView;
        this.listViewPackage = recyclerView2;
        this.propositionLabel = oneFontTextView2;
        this.root = constraintLayout5;
        this.sectionSelected = cardView2;
        this.spaceBottom = view;
        this.spaceTop = view2;
        this.tvCampaignName = oneFontTextView3;
        this.tvOpenMarket = oneFontTextView4;
        this.tvPropositionName = oneFontTextView5;
        this.tvRetryMessage = oneFontTextView6;
        this.tvTitle = oneFontTextView7;
        this.tvTrueDevice = oneFontTextView8;
        this.tvWarningMessage = oneFontTextView9;
    }

    @NonNull
    public static IncludeOnePostpaidCampaignBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btnRetry;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.buttonEditCampaign;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.buttonEditProposition;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    i = R.id.campaignLabel;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
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
                                        i = R.id.layoutCampaign;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = R.id.layoutContact;
                                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat3 != null) {
                                                i = R.id.layoutProposition;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout3 != null) {
                                                    i = R.id.layoutRetry;
                                                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayoutCompat4 != null) {
                                                        i = R.id.line;
                                                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayoutCompat5 != null) {
                                                            i = R.id.listView;
                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                            if (recyclerView != null) {
                                                                i = R.id.listViewPackage;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                if (recyclerView2 != null) {
                                                                    i = R.id.propositionLabel;
                                                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView2 != null) {
                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) view;
                                                                        i = R.id.sectionSelected;
                                                                        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                        if (cardView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.spaceBottom))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.spaceTop))) != null) {
                                                                            i = R.id.tvCampaignName;
                                                                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView3 != null) {
                                                                                i = R.id.tvOpenMarket;
                                                                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView4 != null) {
                                                                                    i = R.id.tvPropositionName;
                                                                                    OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView5 != null) {
                                                                                        i = R.id.tvRetryMessage;
                                                                                        OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView6 != null) {
                                                                                            i = R.id.tvTitle;
                                                                                            OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView7 != null) {
                                                                                                i = R.id.tvTrueDevice;
                                                                                                OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView8 != null) {
                                                                                                    i = R.id.tvWarningMessage;
                                                                                                    OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView9 != null) {
                                                                                                        return new IncludeOnePostpaidCampaignBinding(constraintLayout4, oneFontButton, linearLayoutCompat, linearLayoutCompat2, oneFontTextView, cardView, constraintLayout, oneCustomClearableEditText, imageView, constraintLayout2, linearLayoutCompat3, constraintLayout3, linearLayoutCompat4, linearLayoutCompat5, recyclerView, recyclerView2, oneFontTextView2, constraintLayout4, cardView2, findChildViewById, findChildViewById2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9);
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
    public static IncludeOnePostpaidCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOnePostpaidCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_postpaid_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84382a;
    }
}