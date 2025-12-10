package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrOneCommissionDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrOneCommissionDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84276a;
    @NonNull
    public final CardView alertInfo;
    @NonNull
    public final OneFontTextView barCommissionDate;
    @NonNull
    public final ImageView barPaidStatus;
    @NonNull
    public final OneFontTextView barWarnningMessage;
    @NonNull
    public final View bgWarnningMessage;
    @NonNull
    public final ConstraintLayout btnWithHoldingTaxPdf;
    @NonNull
    public final OneFontTextView cashPaidTypeBankAccountNumber;
    @NonNull
    public final OneFontTextView cashPaidTypeBankName;
    @NonNull
    public final OneFontTextView cashPaidTypeLabel;
    @NonNull
    public final OneFontTextView commissionDate;
    @NonNull
    public final ConstraintLayout commissionHistoryHeader;
    @NonNull
    public final OneFontTextView dtacFontTextView;
    @NonNull
    public final OneFontTextView dtacFontTextView10;
    @NonNull
    public final OneFontTextView dtacFontTextView11;
    @NonNull
    public final OneFontTextView dtacOnlinePaidTypeLabel;
    @NonNull
    public final OneFontTextView dtacOnlinePaidTypeValue;
    @NonNull
    public final ImageView imageView3;
    @NonNull
    public final NestedScrollView mainScrollView;
    @NonNull
    public final Guideline minGuideline;
    @NonNull
    public final OneFontTextView paddSpaceView;
    @NonNull
    public final OneFontTextView paidTypeLabel;
    @NonNull
    public final OneFontTextView paidTypeValue;
    @NonNull
    public final OneCommProfileBoxBinding retailerProfileBox;
    @NonNull
    public final OneIncludeCommissionDetailBinding scDetail;
    @NonNull
    public final ConstraintLayout scHeader;
    @NonNull
    public final LinearLayout scrollContent;
    @NonNull
    public final ConstraintLayout svTotal;
    @NonNull
    public final OneFontTextView toppicCommissionDateLabel;

    public FragmentRtrOneCommissionDetailBinding(NestedScrollView nestedScrollView, CardView cardView, OneFontTextView oneFontTextView, ImageView imageView, OneFontTextView oneFontTextView2, View view, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, ImageView imageView2, NestedScrollView nestedScrollView2, Guideline guideline, OneFontTextView oneFontTextView12, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14, OneCommProfileBoxBinding oneCommProfileBoxBinding, OneIncludeCommissionDetailBinding oneIncludeCommissionDetailBinding, ConstraintLayout constraintLayout3, LinearLayout linearLayout, ConstraintLayout constraintLayout4, OneFontTextView oneFontTextView15) {
        this.f84276a = nestedScrollView;
        this.alertInfo = cardView;
        this.barCommissionDate = oneFontTextView;
        this.barPaidStatus = imageView;
        this.barWarnningMessage = oneFontTextView2;
        this.bgWarnningMessage = view;
        this.btnWithHoldingTaxPdf = constraintLayout;
        this.cashPaidTypeBankAccountNumber = oneFontTextView3;
        this.cashPaidTypeBankName = oneFontTextView4;
        this.cashPaidTypeLabel = oneFontTextView5;
        this.commissionDate = oneFontTextView6;
        this.commissionHistoryHeader = constraintLayout2;
        this.dtacFontTextView = oneFontTextView7;
        this.dtacFontTextView10 = oneFontTextView8;
        this.dtacFontTextView11 = oneFontTextView9;
        this.dtacOnlinePaidTypeLabel = oneFontTextView10;
        this.dtacOnlinePaidTypeValue = oneFontTextView11;
        this.imageView3 = imageView2;
        this.mainScrollView = nestedScrollView2;
        this.minGuideline = guideline;
        this.paddSpaceView = oneFontTextView12;
        this.paidTypeLabel = oneFontTextView13;
        this.paidTypeValue = oneFontTextView14;
        this.retailerProfileBox = oneCommProfileBoxBinding;
        this.scDetail = oneIncludeCommissionDetailBinding;
        this.scHeader = constraintLayout3;
        this.scrollContent = linearLayout;
        this.svTotal = constraintLayout4;
        this.toppicCommissionDateLabel = oneFontTextView15;
    }

    @NonNull
    public static FragmentRtrOneCommissionDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.alertInfo;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.barCommissionDate;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.barPaidStatus;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.barWarnningMessage;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.bgWarnningMessage))) != null) {
                        i = R.id.btnWithHoldingTaxPdf;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.cashPaidTypeBankAccountNumber;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                i = R.id.cashPaidTypeBankName;
                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView4 != null) {
                                    i = R.id.cashPaidTypeLabel;
                                    OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView5 != null) {
                                        i = R.id.commissionDate;
                                        OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView6 != null) {
                                            i = R.id.commissionHistoryHeader;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout2 != null) {
                                                i = R.id.dtacFontTextView;
                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView7 != null) {
                                                    i = R.id.dtacFontTextView10;
                                                    OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView8 != null) {
                                                        i = R.id.dtacFontTextView11;
                                                        OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView9 != null) {
                                                            i = R.id.dtacOnlinePaidTypeLabel;
                                                            OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView10 != null) {
                                                                i = R.id.dtacOnlinePaidTypeValue;
                                                                OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView11 != null) {
                                                                    i = R.id.imageView3;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                    if (imageView2 != null) {
                                                                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                                                                        i = R.id.minGuideline;
                                                                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                                                        if (guideline != null) {
                                                                            i = R.id.paddSpaceView;
                                                                            OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView12 != null) {
                                                                                i = R.id.paidTypeLabel;
                                                                                OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView13 != null) {
                                                                                    i = R.id.paidTypeValue;
                                                                                    OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView14 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.retailer_profile_box))) != null) {
                                                                                        OneCommProfileBoxBinding bind = OneCommProfileBoxBinding.bind(findChildViewById2);
                                                                                        i = R.id.scDetail;
                                                                                        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                                                                                        if (findChildViewById3 != null) {
                                                                                            OneIncludeCommissionDetailBinding bind2 = OneIncludeCommissionDetailBinding.bind(findChildViewById3);
                                                                                            i = R.id.scHeader;
                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (constraintLayout3 != null) {
                                                                                                i = R.id.scrollContent;
                                                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (linearLayout != null) {
                                                                                                    i = R.id.svTotal;
                                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                    if (constraintLayout4 != null) {
                                                                                                        i = R.id.toppicCommissionDateLabel;
                                                                                                        OneFontTextView oneFontTextView15 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView15 != null) {
                                                                                                            return new FragmentRtrOneCommissionDetailBinding(nestedScrollView, cardView, oneFontTextView, imageView, oneFontTextView2, findChildViewById, constraintLayout, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, constraintLayout2, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, imageView2, nestedScrollView, guideline, oneFontTextView12, oneFontTextView13, oneFontTextView14, bind, bind2, constraintLayout3, linearLayout, constraintLayout4, oneFontTextView15);
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
    public static FragmentRtrOneCommissionDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrOneCommissionDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_one_commission_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84276a;
    }
}