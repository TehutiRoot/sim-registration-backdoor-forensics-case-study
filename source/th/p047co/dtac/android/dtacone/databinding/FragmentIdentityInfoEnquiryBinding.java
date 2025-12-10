package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.CustomerInfoStatusView;
import th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentIdentityInfoEnquiryBinding */
/* loaded from: classes7.dex */
public final class FragmentIdentityInfoEnquiryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83755a;
    @NonNull
    public final ImageView chevronRight;
    @NonNull
    public final CustomerInfoStatusView customerInfoStatusView;
    @NonNull
    public final CardView identityCard;
    @NonNull
    public final View line1;
    @NonNull
    public final View shimmer1;
    @NonNull
    public final ShimmerFrameLayout shimmerCard;
    @NonNull
    public final TextViewTopLabelView textViewIdentityNumber;
    @NonNull
    public final TextViewTopLabelView textViewName;

    public FragmentIdentityInfoEnquiryBinding(ConstraintLayout constraintLayout, ImageView imageView, CustomerInfoStatusView customerInfoStatusView, CardView cardView, View view, View view2, ShimmerFrameLayout shimmerFrameLayout, TextViewTopLabelView textViewTopLabelView, TextViewTopLabelView textViewTopLabelView2) {
        this.f83755a = constraintLayout;
        this.chevronRight = imageView;
        this.customerInfoStatusView = customerInfoStatusView;
        this.identityCard = cardView;
        this.line1 = view;
        this.shimmer1 = view2;
        this.shimmerCard = shimmerFrameLayout;
        this.textViewIdentityNumber = textViewTopLabelView;
        this.textViewName = textViewTopLabelView2;
    }

    @NonNull
    public static FragmentIdentityInfoEnquiryBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.chevronRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.customerInfoStatusView;
            CustomerInfoStatusView customerInfoStatusView = (CustomerInfoStatusView) ViewBindings.findChildViewById(view, i);
            if (customerInfoStatusView != null) {
                i = R.id.identityCard;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.shimmer1))) != null) {
                    i = R.id.shimmer_card;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                    if (shimmerFrameLayout != null) {
                        i = R.id.textViewIdentityNumber;
                        TextViewTopLabelView textViewTopLabelView = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                        if (textViewTopLabelView != null) {
                            i = R.id.textViewName;
                            TextViewTopLabelView textViewTopLabelView2 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                            if (textViewTopLabelView2 != null) {
                                return new FragmentIdentityInfoEnquiryBinding((ConstraintLayout) view, imageView, customerInfoStatusView, cardView, findChildViewById, findChildViewById2, shimmerFrameLayout, textViewTopLabelView, textViewTopLabelView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentIdentityInfoEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentIdentityInfoEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_identity_info_enquiry, viewGroup, false);
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
