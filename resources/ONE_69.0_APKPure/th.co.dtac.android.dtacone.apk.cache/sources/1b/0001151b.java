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
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentCustomerEnquiry700mhzBinding */
/* loaded from: classes7.dex */
public final class FragmentCustomerEnquiry700mhzBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83782a;
    @NonNull
    public final ImageView chevronRight;
    @NonNull
    public final CardView cvAnnounceView;
    @NonNull
    public final ImageView ivAnnounceView;
    @NonNull
    public final CardView mhzCard;
    @NonNull
    public final ConstraintLayout mhzCardContent;
    @NonNull
    public final ConstraintLayout root;
    @NonNull
    public final DtacFontTextView textViewHeaderTopic;
    @NonNull
    public final DtacFontTextView textViewSegmentMessage;

    public FragmentCustomerEnquiry700mhzBinding(ConstraintLayout constraintLayout, ImageView imageView, CardView cardView, ImageView imageView2, CardView cardView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83782a = constraintLayout;
        this.chevronRight = imageView;
        this.cvAnnounceView = cardView;
        this.ivAnnounceView = imageView2;
        this.mhzCard = cardView2;
        this.mhzCardContent = constraintLayout2;
        this.root = constraintLayout3;
        this.textViewHeaderTopic = dtacFontTextView;
        this.textViewSegmentMessage = dtacFontTextView2;
    }

    @NonNull
    public static FragmentCustomerEnquiry700mhzBinding bind(@NonNull View view) {
        int i = R.id.chevronRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.cvAnnounceView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.ivAnnounceView;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.mhzCard;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView2 != null) {
                        i = R.id.mhzCardContent;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                            i = R.id.textViewHeaderTopic;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.textViewSegmentMessage;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    return new FragmentCustomerEnquiry700mhzBinding(constraintLayout2, imageView, cardView, imageView2, cardView2, constraintLayout, constraintLayout2, dtacFontTextView, dtacFontTextView2);
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
    public static FragmentCustomerEnquiry700mhzBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCustomerEnquiry700mhzBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_customer_enquiry_700mhz, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83782a;
    }
}