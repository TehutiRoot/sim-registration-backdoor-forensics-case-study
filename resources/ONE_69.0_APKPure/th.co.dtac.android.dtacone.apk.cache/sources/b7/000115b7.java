package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.CustomerInfoStatusImageView;
import th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidValidationIdCardInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidValidationIdCardInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83942a;
    @NonNull
    public final ImageView chevronRight;
    @NonNull
    public final CustomerInfoStatusImageView customerInfoStatusView;
    @NonNull
    public final Guideline guideTopContent;
    @NonNull
    public final CardView identityCard;
    @NonNull
    public final ImageView imageView28;
    @NonNull
    public final ImageView imageView29;
    @NonNull
    public final ImageView imageView30;
    @NonNull
    public final DtacFontTextView label1;
    @NonNull
    public final DtacFontTextView label2;
    @NonNull
    public final DtacFontTextView label3;
    @NonNull
    public final ConstraintLayout layout1ID1Device;
    @NonNull
    public final ConstraintLayout layout3level;
    @NonNull
    public final ConstraintLayout layoutStatus;
    @NonNull
    public final View line1;
    @NonNull
    public final View line2;
    @NonNull
    public final View line3;
    @NonNull
    public final TextViewTopLabelView textViewIdentityNumber;
    @NonNull
    public final DtacFontTextView tv3Level;
    @NonNull
    public final DtacFontTextView tvStatus;

    public FragmentMrtrPostpaidValidationIdCardInfoBinding(ConstraintLayout constraintLayout, ImageView imageView, CustomerInfoStatusImageView customerInfoStatusImageView, Guideline guideline, CardView cardView, ImageView imageView2, ImageView imageView3, ImageView imageView4, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, View view, View view2, View view3, TextViewTopLabelView textViewTopLabelView, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f83942a = constraintLayout;
        this.chevronRight = imageView;
        this.customerInfoStatusView = customerInfoStatusImageView;
        this.guideTopContent = guideline;
        this.identityCard = cardView;
        this.imageView28 = imageView2;
        this.imageView29 = imageView3;
        this.imageView30 = imageView4;
        this.label1 = dtacFontTextView;
        this.label2 = dtacFontTextView2;
        this.label3 = dtacFontTextView3;
        this.layout1ID1Device = constraintLayout2;
        this.layout3level = constraintLayout3;
        this.layoutStatus = constraintLayout4;
        this.line1 = view;
        this.line2 = view2;
        this.line3 = view3;
        this.textViewIdentityNumber = textViewTopLabelView;
        this.tv3Level = dtacFontTextView4;
        this.tvStatus = dtacFontTextView5;
    }

    @NonNull
    public static FragmentMrtrPostpaidValidationIdCardInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i = R.id.chevronRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.customerInfoStatusView;
            CustomerInfoStatusImageView customerInfoStatusImageView = (CustomerInfoStatusImageView) ViewBindings.findChildViewById(view, i);
            if (customerInfoStatusImageView != null) {
                i = R.id.guideTopContent;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = R.id.identityCard;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.imageView28;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.imageView29;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.imageView30;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    i = R.id.label1;
                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView != null) {
                                        i = R.id.label2;
                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView2 != null) {
                                            i = R.id.label3;
                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView3 != null) {
                                                i = R.id.layout1ID1Device;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    i = R.id.layout3level;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout2 != null) {
                                                        i = R.id.layoutStatus;
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.line2))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.line3))) != null) {
                                                            i = R.id.textViewIdentityNumber;
                                                            TextViewTopLabelView textViewTopLabelView = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                            if (textViewTopLabelView != null) {
                                                                i = R.id.tv3Level;
                                                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView4 != null) {
                                                                    i = R.id.tvStatus;
                                                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView5 != null) {
                                                                        return new FragmentMrtrPostpaidValidationIdCardInfoBinding((ConstraintLayout) view, imageView, customerInfoStatusImageView, guideline, cardView, imageView2, imageView3, imageView4, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, constraintLayout, constraintLayout2, constraintLayout3, findChildViewById, findChildViewById2, findChildViewById3, textViewTopLabelView, dtacFontTextView4, dtacFontTextView5);
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
    public static FragmentMrtrPostpaidValidationIdCardInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidValidationIdCardInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_validation_id_card_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83942a;
    }
}