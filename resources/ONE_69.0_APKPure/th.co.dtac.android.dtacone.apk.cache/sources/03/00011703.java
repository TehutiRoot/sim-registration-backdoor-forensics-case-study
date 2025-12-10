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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrCommissionDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrCommissionDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84274a;
    @NonNull
    public final CardView alertInfo;
    @NonNull
    public final DtacFontTextView barCommissionDate;
    @NonNull
    public final ImageView barPaidStatus;
    @NonNull
    public final DtacFontTextView barWarnningMessage;
    @NonNull
    public final View bgWarnningMessage;
    @NonNull
    public final ConstraintLayout btnWithHoldingTaxPdf;
    @NonNull
    public final DtacFontTextView cashPaidTypeBankAccountNumber;
    @NonNull
    public final DtacFontTextView cashPaidTypeBankLabel;
    @NonNull
    public final DtacFontTextView cashPaidTypeBankName;
    @NonNull
    public final DtacFontTextView cashPaidTypeLabel;
    @NonNull
    public final DtacFontTextView commissionDate;
    @NonNull
    public final ConstraintLayout commissionHistoryHeader;
    @NonNull
    public final DtacFontTextView dtacFontTextView;
    @NonNull
    public final DtacFontTextView dtacFontTextView10;
    @NonNull
    public final DtacFontTextView dtacFontTextView11;
    @NonNull
    public final DtacFontTextView dtacOnlinePaidTypeLabel;
    @NonNull
    public final DtacFontTextView dtacOnlinePaidTypeValue;
    @NonNull
    public final ImageView imageView3;
    @NonNull
    public final ImageView ivDownload;
    @NonNull
    public final NestedScrollView mainScrollView;
    @NonNull
    public final Guideline minGuideline;
    @NonNull
    public final DtacFontTextView paidTypeLabel;
    @NonNull
    public final DtacFontTextView paidTypeValue;
    @NonNull
    public final ZCommProfileBoxBinding retailerProfileBox;
    @NonNull
    public final ZIncCommissionDetailBinding scDetail;
    @NonNull
    public final ConstraintLayout scHeader;
    @NonNull
    public final LinearLayout scrollContent;
    @NonNull
    public final ConstraintLayout svTotal;
    @NonNull
    public final DtacFontTextView toppicCommissionDateLabel;

    public FragmentRtrCommissionDetailBinding(NestedScrollView nestedScrollView, CardView cardView, DtacFontTextView dtacFontTextView, ImageView imageView, DtacFontTextView dtacFontTextView2, View view, ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12, ImageView imageView2, ImageView imageView3, NestedScrollView nestedScrollView2, Guideline guideline, DtacFontTextView dtacFontTextView13, DtacFontTextView dtacFontTextView14, ZCommProfileBoxBinding zCommProfileBoxBinding, ZIncCommissionDetailBinding zIncCommissionDetailBinding, ConstraintLayout constraintLayout3, LinearLayout linearLayout, ConstraintLayout constraintLayout4, DtacFontTextView dtacFontTextView15) {
        this.f84274a = nestedScrollView;
        this.alertInfo = cardView;
        this.barCommissionDate = dtacFontTextView;
        this.barPaidStatus = imageView;
        this.barWarnningMessage = dtacFontTextView2;
        this.bgWarnningMessage = view;
        this.btnWithHoldingTaxPdf = constraintLayout;
        this.cashPaidTypeBankAccountNumber = dtacFontTextView3;
        this.cashPaidTypeBankLabel = dtacFontTextView4;
        this.cashPaidTypeBankName = dtacFontTextView5;
        this.cashPaidTypeLabel = dtacFontTextView6;
        this.commissionDate = dtacFontTextView7;
        this.commissionHistoryHeader = constraintLayout2;
        this.dtacFontTextView = dtacFontTextView8;
        this.dtacFontTextView10 = dtacFontTextView9;
        this.dtacFontTextView11 = dtacFontTextView10;
        this.dtacOnlinePaidTypeLabel = dtacFontTextView11;
        this.dtacOnlinePaidTypeValue = dtacFontTextView12;
        this.imageView3 = imageView2;
        this.ivDownload = imageView3;
        this.mainScrollView = nestedScrollView2;
        this.minGuideline = guideline;
        this.paidTypeLabel = dtacFontTextView13;
        this.paidTypeValue = dtacFontTextView14;
        this.retailerProfileBox = zCommProfileBoxBinding;
        this.scDetail = zIncCommissionDetailBinding;
        this.scHeader = constraintLayout3;
        this.scrollContent = linearLayout;
        this.svTotal = constraintLayout4;
        this.toppicCommissionDateLabel = dtacFontTextView15;
    }

    @NonNull
    public static FragmentRtrCommissionDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.alertInfo;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.barCommissionDate;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.barPaidStatus;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.barWarnningMessage;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.bgWarnningMessage))) != null) {
                        i = R.id.btnWithHoldingTaxPdf;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.cashPaidTypeBankAccountNumber;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.cashPaidTypeBankLabel;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    i = R.id.cashPaidTypeBankName;
                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView5 != null) {
                                        i = R.id.cashPaidTypeLabel;
                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView6 != null) {
                                            i = R.id.commissionDate;
                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView7 != null) {
                                                i = R.id.commissionHistoryHeader;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.dtacFontTextView;
                                                    DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView8 != null) {
                                                        i = R.id.dtacFontTextView10;
                                                        DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView9 != null) {
                                                            i = R.id.dtacFontTextView11;
                                                            DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView10 != null) {
                                                                i = R.id.dtacOnlinePaidTypeLabel;
                                                                DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView11 != null) {
                                                                    i = R.id.dtacOnlinePaidTypeValue;
                                                                    DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView12 != null) {
                                                                        i = R.id.imageView3;
                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView2 != null) {
                                                                            i = R.id.ivDownload;
                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                            if (imageView3 != null) {
                                                                                NestedScrollView nestedScrollView = (NestedScrollView) view;
                                                                                i = R.id.minGuideline;
                                                                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                                                                if (guideline != null) {
                                                                                    i = R.id.paidTypeLabel;
                                                                                    DtacFontTextView dtacFontTextView13 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView13 != null) {
                                                                                        i = R.id.paidTypeValue;
                                                                                        DtacFontTextView dtacFontTextView14 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView14 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.retailer_profile_box))) != null) {
                                                                                            ZCommProfileBoxBinding bind = ZCommProfileBoxBinding.bind(findChildViewById2);
                                                                                            i = R.id.scDetail;
                                                                                            View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                                                                                            if (findChildViewById3 != null) {
                                                                                                ZIncCommissionDetailBinding bind2 = ZIncCommissionDetailBinding.bind(findChildViewById3);
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
                                                                                                            DtacFontTextView dtacFontTextView15 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (dtacFontTextView15 != null) {
                                                                                                                return new FragmentRtrCommissionDetailBinding(nestedScrollView, cardView, dtacFontTextView, imageView, dtacFontTextView2, findChildViewById, constraintLayout, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, constraintLayout2, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12, imageView2, imageView3, nestedScrollView, guideline, dtacFontTextView13, dtacFontTextView14, bind, bind2, constraintLayout3, linearLayout, constraintLayout4, dtacFontTextView15);
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
    public static FragmentRtrCommissionDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrCommissionDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_commission_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84274a;
    }
}