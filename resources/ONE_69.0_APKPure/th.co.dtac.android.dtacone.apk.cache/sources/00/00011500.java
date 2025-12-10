package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.CustomerInfoStatusView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.TextViewTopLabelView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentByidIdentityInfoEnquiryBinding */
/* loaded from: classes7.dex */
public final class FragmentByidIdentityInfoEnquiryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83755a;
    @NonNull
    public final ImageView chevronRight;
    @NonNull
    public final CustomerInfoStatusView customerInfoStatusView;
    @NonNull
    public final DtacCardView identityCard;
    @NonNull
    public final View shimmer1;
    @NonNull
    public final ShimmerFrameLayout shimmerCard;
    @NonNull
    public final TextViewTopLabelView textViewIdentityNumber;
    @NonNull
    public final TextViewTopLabelView textViewName;

    public FragmentByidIdentityInfoEnquiryBinding(ConstraintLayout constraintLayout, ImageView imageView, CustomerInfoStatusView customerInfoStatusView, DtacCardView dtacCardView, View view, ShimmerFrameLayout shimmerFrameLayout, TextViewTopLabelView textViewTopLabelView, TextViewTopLabelView textViewTopLabelView2) {
        this.f83755a = constraintLayout;
        this.chevronRight = imageView;
        this.customerInfoStatusView = customerInfoStatusView;
        this.identityCard = dtacCardView;
        this.shimmer1 = view;
        this.shimmerCard = shimmerFrameLayout;
        this.textViewIdentityNumber = textViewTopLabelView;
        this.textViewName = textViewTopLabelView2;
    }

    @NonNull
    public static FragmentByidIdentityInfoEnquiryBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.chevronRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.customerInfoStatusView;
            CustomerInfoStatusView customerInfoStatusView = (CustomerInfoStatusView) ViewBindings.findChildViewById(view, i);
            if (customerInfoStatusView != null) {
                i = R.id.identityCard;
                DtacCardView dtacCardView = (DtacCardView) ViewBindings.findChildViewById(view, i);
                if (dtacCardView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.shimmer1))) != null) {
                    i = R.id.shimmer_card;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                    if (shimmerFrameLayout != null) {
                        i = R.id.textViewIdentityNumber;
                        TextViewTopLabelView textViewTopLabelView = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                        if (textViewTopLabelView != null) {
                            i = R.id.textViewName;
                            TextViewTopLabelView textViewTopLabelView2 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                            if (textViewTopLabelView2 != null) {
                                return new FragmentByidIdentityInfoEnquiryBinding((ConstraintLayout) view, imageView, customerInfoStatusView, dtacCardView, findChildViewById, shimmerFrameLayout, textViewTopLabelView, textViewTopLabelView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentByidIdentityInfoEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentByidIdentityInfoEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_byid_identity_info_enquiry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83755a;
    }
}