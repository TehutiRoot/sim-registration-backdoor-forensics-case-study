package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidMultiSimSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidMultiSimSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83960a;
    @NonNull
    public final LinearLayoutCompat btnFailGoHome;
    @NonNull
    public final LinearLayoutCompat btnGoHome;
    @NonNull
    public final LinearLayoutCompat btnPrintReceipt;
    @NonNull
    public final DtacFontTextView dtacFontTextView61;
    @NonNull
    public final DtacFontTextView dtacFontTextView63;
    @NonNull
    public final DtacFontTextView dtacFontTextView64;
    @NonNull
    public final ImageView ivSuccess;
    @NonNull
    public final DtacFontTextView label1;
    @NonNull
    public final LinearLayoutCompat layoutCountActivate;
    @NonNull
    public final CardView layoutCutSimStock;
    @NonNull
    public final LinearLayoutCompat layoutFailAll;
    @NonNull
    public final ConstraintLayout layoutFailed;
    @NonNull
    public final ConstraintLayout layoutOutStock;
    @NonNull
    public final LinearLayoutCompat layoutSubscriberAll;
    @NonNull
    public final LinearLayoutCompat layoutSubscriberFailAll;
    @NonNull
    public final ConstraintLayout layoutSuccess;
    @NonNull
    public final LinearLayoutCompat layoutSuccessMulti;
    @NonNull
    public final LinearLayout linearLayout11;
    @NonNull
    public final DtacFontTextView tvBtnFailGoHome;
    @NonNull
    public final DtacFontTextView tvBtnGoHome;
    @NonNull
    public final DtacFontTextView tvCheckSimStock;
    @NonNull
    public final DtacFontTextView tvCountActivateSuccess;
    @NonNull
    public final DtacFontTextView tvCountRegisterSuccess;
    @NonNull
    public final DtacFontTextView tvCutCount;
    @NonNull
    public final DtacFontTextView tvFailCutCount;
    @NonNull
    public final DtacFontTextView tvOutStockCount;

    public FragmentMrtrPrepaidMultiSimSuccessBinding(NestedScrollView nestedScrollView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, ImageView imageView, DtacFontTextView dtacFontTextView4, LinearLayoutCompat linearLayoutCompat4, CardView cardView, LinearLayoutCompat linearLayoutCompat5, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayoutCompat linearLayoutCompat6, LinearLayoutCompat linearLayoutCompat7, ConstraintLayout constraintLayout3, LinearLayoutCompat linearLayoutCompat8, LinearLayout linearLayout, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12) {
        this.f83960a = nestedScrollView;
        this.btnFailGoHome = linearLayoutCompat;
        this.btnGoHome = linearLayoutCompat2;
        this.btnPrintReceipt = linearLayoutCompat3;
        this.dtacFontTextView61 = dtacFontTextView;
        this.dtacFontTextView63 = dtacFontTextView2;
        this.dtacFontTextView64 = dtacFontTextView3;
        this.ivSuccess = imageView;
        this.label1 = dtacFontTextView4;
        this.layoutCountActivate = linearLayoutCompat4;
        this.layoutCutSimStock = cardView;
        this.layoutFailAll = linearLayoutCompat5;
        this.layoutFailed = constraintLayout;
        this.layoutOutStock = constraintLayout2;
        this.layoutSubscriberAll = linearLayoutCompat6;
        this.layoutSubscriberFailAll = linearLayoutCompat7;
        this.layoutSuccess = constraintLayout3;
        this.layoutSuccessMulti = linearLayoutCompat8;
        this.linearLayout11 = linearLayout;
        this.tvBtnFailGoHome = dtacFontTextView5;
        this.tvBtnGoHome = dtacFontTextView6;
        this.tvCheckSimStock = dtacFontTextView7;
        this.tvCountActivateSuccess = dtacFontTextView8;
        this.tvCountRegisterSuccess = dtacFontTextView9;
        this.tvCutCount = dtacFontTextView10;
        this.tvFailCutCount = dtacFontTextView11;
        this.tvOutStockCount = dtacFontTextView12;
    }

    @NonNull
    public static FragmentMrtrPrepaidMultiSimSuccessBinding bind(@NonNull View view) {
        int i = R.id.btnFailGoHome;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.btnGoHome;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = R.id.btnPrintReceipt;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat3 != null) {
                    i = R.id.dtacFontTextView61;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.dtacFontTextView63;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.dtacFontTextView64;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.ivSuccess;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = R.id.label1;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.layoutCountActivate;
                                        LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat4 != null) {
                                            i = R.id.layoutCutSimStock;
                                            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                            if (cardView != null) {
                                                i = R.id.layoutFailAll;
                                                LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                if (linearLayoutCompat5 != null) {
                                                    i = R.id.layoutFailed;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout != null) {
                                                        i = R.id.layoutOutStock;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout2 != null) {
                                                            i = R.id.layoutSubscriberAll;
                                                            LinearLayoutCompat linearLayoutCompat6 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayoutCompat6 != null) {
                                                                i = R.id.layoutSubscriberFailAll;
                                                                LinearLayoutCompat linearLayoutCompat7 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayoutCompat7 != null) {
                                                                    i = R.id.layoutSuccess;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout3 != null) {
                                                                        i = R.id.layoutSuccessMulti;
                                                                        LinearLayoutCompat linearLayoutCompat8 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayoutCompat8 != null) {
                                                                            i = R.id.linearLayout11;
                                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayout != null) {
                                                                                i = R.id.tvBtnFailGoHome;
                                                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacFontTextView5 != null) {
                                                                                    i = R.id.tvBtnGoHome;
                                                                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView6 != null) {
                                                                                        i = R.id.tvCheckSimStock;
                                                                                        DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView7 != null) {
                                                                                            i = R.id.tvCountActivateSuccess;
                                                                                            DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (dtacFontTextView8 != null) {
                                                                                                i = R.id.tvCountRegisterSuccess;
                                                                                                DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (dtacFontTextView9 != null) {
                                                                                                    i = R.id.tvCutCount;
                                                                                                    DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (dtacFontTextView10 != null) {
                                                                                                        i = R.id.tvFailCutCount;
                                                                                                        DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (dtacFontTextView11 != null) {
                                                                                                            i = R.id.tvOutStockCount;
                                                                                                            DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (dtacFontTextView12 != null) {
                                                                                                                return new FragmentMrtrPrepaidMultiSimSuccessBinding((NestedScrollView) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, imageView, dtacFontTextView4, linearLayoutCompat4, cardView, linearLayoutCompat5, constraintLayout, constraintLayout2, linearLayoutCompat6, linearLayoutCompat7, constraintLayout3, linearLayoutCompat8, linearLayout, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12);
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
    public static FragmentMrtrPrepaidMultiSimSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidMultiSimSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_multi_sim_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83960a;
    }
}