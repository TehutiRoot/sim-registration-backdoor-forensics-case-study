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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.CustomerInfoStatusImageView;
import th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidValidationSpecialPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidValidationSpecialPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84050a;
    @NonNull
    public final ImageView chevronRight;
    @NonNull
    public final ConstraintLayout constraintLayout5;
    @NonNull
    public final CustomerInfoStatusImageView customerInfoStatusView;
    @NonNull
    public final Guideline guideTopContent;
    @NonNull
    public final CardView identityCard;
    @NonNull
    public final ImageView imageView27;
    @NonNull
    public final OneFontTextView label1;
    @NonNull
    public final OneFontTextView label2;
    @NonNull
    public final OneFontTextView label3;
    @NonNull
    public final OneFontTextView labelNotFound;
    @NonNull
    public final RecyclerView listMenu;
    @NonNull
    public final ConstraintLayout packageNotFound;
    @NonNull
    public final RecyclerView specialPackage;
    @NonNull
    public final CardView specialPackageCard;
    @NonNull
    public final TextViewTopLabelView textViewIdentityNumber;

    public FragmentOnePostpaidValidationSpecialPackageBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, CustomerInfoStatusImageView customerInfoStatusImageView, Guideline guideline, CardView cardView, ImageView imageView2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, RecyclerView recyclerView, ConstraintLayout constraintLayout3, RecyclerView recyclerView2, CardView cardView2, TextViewTopLabelView textViewTopLabelView) {
        this.f84050a = constraintLayout;
        this.chevronRight = imageView;
        this.constraintLayout5 = constraintLayout2;
        this.customerInfoStatusView = customerInfoStatusImageView;
        this.guideTopContent = guideline;
        this.identityCard = cardView;
        this.imageView27 = imageView2;
        this.label1 = oneFontTextView;
        this.label2 = oneFontTextView2;
        this.label3 = oneFontTextView3;
        this.labelNotFound = oneFontTextView4;
        this.listMenu = recyclerView;
        this.packageNotFound = constraintLayout3;
        this.specialPackage = recyclerView2;
        this.specialPackageCard = cardView2;
        this.textViewIdentityNumber = textViewTopLabelView;
    }

    @NonNull
    public static FragmentOnePostpaidValidationSpecialPackageBinding bind(@NonNull View view) {
        int i = R.id.chevronRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.constraintLayout5;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.customerInfoStatusView;
                CustomerInfoStatusImageView customerInfoStatusImageView = (CustomerInfoStatusImageView) ViewBindings.findChildViewById(view, i);
                if (customerInfoStatusImageView != null) {
                    i = R.id.guideTopContent;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = R.id.identityCard;
                        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                        if (cardView != null) {
                            i = R.id.imageView27;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.label1;
                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView != null) {
                                    i = R.id.label2;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        i = R.id.label3;
                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView3 != null) {
                                            i = R.id.labelNotFound;
                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView4 != null) {
                                                i = R.id.listMenu;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView != null) {
                                                    i = R.id.packageNotFound;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout2 != null) {
                                                        i = R.id.special_package;
                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                        if (recyclerView2 != null) {
                                                            i = R.id.specialPackageCard;
                                                            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                                                            if (cardView2 != null) {
                                                                i = R.id.textViewIdentityNumber;
                                                                TextViewTopLabelView textViewTopLabelView = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                if (textViewTopLabelView != null) {
                                                                    return new FragmentOnePostpaidValidationSpecialPackageBinding((ConstraintLayout) view, imageView, constraintLayout, customerInfoStatusImageView, guideline, cardView, imageView2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, recyclerView, constraintLayout2, recyclerView2, cardView2, textViewTopLabelView);
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
    public static FragmentOnePostpaidValidationSpecialPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidValidationSpecialPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_validation_special_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84050a;
    }
}
