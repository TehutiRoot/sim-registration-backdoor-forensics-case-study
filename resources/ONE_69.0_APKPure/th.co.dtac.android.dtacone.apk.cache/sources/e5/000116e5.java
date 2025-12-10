package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.PhoneStatusView;
import th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPostSubscriberInfoEnquiryBinding */
/* loaded from: classes7.dex */
public final class FragmentPostSubscriberInfoEnquiryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84244a;
    @NonNull
    public final ImageView arrowSuspend;
    @NonNull
    public final TextViewTopLabelView dummyText;
    @NonNull
    public final TextViewTopLabelView dummyText1;
    @NonNull
    public final ImageView iconsnextlight;
    @NonNull
    public final ImageView imageViewFaceRegStatus;
    @NonNull
    public final ImageView imageViewMemberType;
    @NonNull
    public final LinearLayout layoutBalanceSOS;
    @NonNull
    public final LinearLayout layoutBilling;
    @NonNull
    public final LinearLayout layoutShimmerBilling;
    @NonNull
    public final LinearLayout layoutShimmerDeviceContract;
    @NonNull
    public final LinearLayout layoutStartEndPackage;
    @NonNull
    public final ConstraintLayout layoutStatusSuspend;
    @NonNull
    public final LinearLayout packageSummary;
    @NonNull
    public final PhoneStatusView phoneStatusView;
    @NonNull
    public final ShimmerFrameLayout shimmerBalance;
    @NonNull
    public final ShimmerFrameLayout shimmerBillingOutstanding;
    @NonNull
    public final ShimmerFrameLayout shimmerDeviceContract;
    @NonNull
    public final ShimmerFrameLayout shimmerFaceRecogStatus;
    @NonNull
    public final ShimmerFrameLayout shimmerSegment;
    @NonNull
    public final ShimmerFrameLayout shimmerStatusSuspend;
    @NonNull
    public final TextViewTopLabelView textViewAOU;
    @NonNull
    public final TextViewTopLabelView textViewBillingAmount;
    @NonNull
    public final TextViewTopLabelView textViewBillingDueDate;
    @NonNull
    public final TextViewTopLabelView textViewCurrentPackage;
    @NonNull
    public final TextViewTopLabelView textViewEndPackage;
    @NonNull
    public final TextViewTopLabelView textViewStartDate;
    @NonNull
    public final TextViewTopLabelView textViewStartPackage;
    @NonNull
    public final TextViewTopLabelView textViewStatus;
    @NonNull
    public final TextViewTopLabelView textViewSubscriberNumber;
    @NonNull
    public final DtacFontTextView textViewSuspendNums;

    public FragmentPostSubscriberInfoEnquiryBinding(ConstraintLayout constraintLayout, ImageView imageView, TextViewTopLabelView textViewTopLabelView, TextViewTopLabelView textViewTopLabelView2, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ConstraintLayout constraintLayout2, LinearLayout linearLayout6, PhoneStatusView phoneStatusView, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, ShimmerFrameLayout shimmerFrameLayout3, ShimmerFrameLayout shimmerFrameLayout4, ShimmerFrameLayout shimmerFrameLayout5, ShimmerFrameLayout shimmerFrameLayout6, TextViewTopLabelView textViewTopLabelView3, TextViewTopLabelView textViewTopLabelView4, TextViewTopLabelView textViewTopLabelView5, TextViewTopLabelView textViewTopLabelView6, TextViewTopLabelView textViewTopLabelView7, TextViewTopLabelView textViewTopLabelView8, TextViewTopLabelView textViewTopLabelView9, TextViewTopLabelView textViewTopLabelView10, TextViewTopLabelView textViewTopLabelView11, DtacFontTextView dtacFontTextView) {
        this.f84244a = constraintLayout;
        this.arrowSuspend = imageView;
        this.dummyText = textViewTopLabelView;
        this.dummyText1 = textViewTopLabelView2;
        this.iconsnextlight = imageView2;
        this.imageViewFaceRegStatus = imageView3;
        this.imageViewMemberType = imageView4;
        this.layoutBalanceSOS = linearLayout;
        this.layoutBilling = linearLayout2;
        this.layoutShimmerBilling = linearLayout3;
        this.layoutShimmerDeviceContract = linearLayout4;
        this.layoutStartEndPackage = linearLayout5;
        this.layoutStatusSuspend = constraintLayout2;
        this.packageSummary = linearLayout6;
        this.phoneStatusView = phoneStatusView;
        this.shimmerBalance = shimmerFrameLayout;
        this.shimmerBillingOutstanding = shimmerFrameLayout2;
        this.shimmerDeviceContract = shimmerFrameLayout3;
        this.shimmerFaceRecogStatus = shimmerFrameLayout4;
        this.shimmerSegment = shimmerFrameLayout5;
        this.shimmerStatusSuspend = shimmerFrameLayout6;
        this.textViewAOU = textViewTopLabelView3;
        this.textViewBillingAmount = textViewTopLabelView4;
        this.textViewBillingDueDate = textViewTopLabelView5;
        this.textViewCurrentPackage = textViewTopLabelView6;
        this.textViewEndPackage = textViewTopLabelView7;
        this.textViewStartDate = textViewTopLabelView8;
        this.textViewStartPackage = textViewTopLabelView9;
        this.textViewStatus = textViewTopLabelView10;
        this.textViewSubscriberNumber = textViewTopLabelView11;
        this.textViewSuspendNums = dtacFontTextView;
    }

    @NonNull
    public static FragmentPostSubscriberInfoEnquiryBinding bind(@NonNull View view) {
        int i = R.id.arrowSuspend;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.dummyText;
            TextViewTopLabelView textViewTopLabelView = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
            if (textViewTopLabelView != null) {
                i = R.id.dummyText1;
                TextViewTopLabelView textViewTopLabelView2 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                if (textViewTopLabelView2 != null) {
                    i = R.id.iconsnextlight;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.imageViewFaceRegStatus;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.imageViewMemberType;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView4 != null) {
                                i = R.id.layoutBalanceSOS;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.layoutBilling;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = R.id.layoutShimmerBilling;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout3 != null) {
                                            i = R.id.layoutShimmerDeviceContract;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout4 != null) {
                                                i = R.id.layoutStartEndPackage;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout5 != null) {
                                                    i = R.id.layoutStatusSuspend;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout != null) {
                                                        i = R.id.packageSummary;
                                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout6 != null) {
                                                            i = R.id.phoneStatusView;
                                                            PhoneStatusView phoneStatusView = (PhoneStatusView) ViewBindings.findChildViewById(view, i);
                                                            if (phoneStatusView != null) {
                                                                i = R.id.shimmerBalance;
                                                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                if (shimmerFrameLayout != null) {
                                                                    i = R.id.shimmerBillingOutstanding;
                                                                    ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (shimmerFrameLayout2 != null) {
                                                                        i = R.id.shimmerDeviceContract;
                                                                        ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (shimmerFrameLayout3 != null) {
                                                                            i = R.id.shimmerFaceRecogStatus;
                                                                            ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (shimmerFrameLayout4 != null) {
                                                                                i = R.id.shimmerSegment;
                                                                                ShimmerFrameLayout shimmerFrameLayout5 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (shimmerFrameLayout5 != null) {
                                                                                    i = R.id.shimmerStatusSuspend;
                                                                                    ShimmerFrameLayout shimmerFrameLayout6 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (shimmerFrameLayout6 != null) {
                                                                                        i = R.id.textViewAOU;
                                                                                        TextViewTopLabelView textViewTopLabelView3 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textViewTopLabelView3 != null) {
                                                                                            i = R.id.textViewBillingAmount;
                                                                                            TextViewTopLabelView textViewTopLabelView4 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textViewTopLabelView4 != null) {
                                                                                                i = R.id.textViewBillingDueDate;
                                                                                                TextViewTopLabelView textViewTopLabelView5 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textViewTopLabelView5 != null) {
                                                                                                    i = R.id.textViewCurrentPackage;
                                                                                                    TextViewTopLabelView textViewTopLabelView6 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textViewTopLabelView6 != null) {
                                                                                                        i = R.id.textViewEndPackage;
                                                                                                        TextViewTopLabelView textViewTopLabelView7 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textViewTopLabelView7 != null) {
                                                                                                            i = R.id.textViewStartDate;
                                                                                                            TextViewTopLabelView textViewTopLabelView8 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textViewTopLabelView8 != null) {
                                                                                                                i = R.id.textViewStartPackage;
                                                                                                                TextViewTopLabelView textViewTopLabelView9 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textViewTopLabelView9 != null) {
                                                                                                                    i = R.id.textViewStatus;
                                                                                                                    TextViewTopLabelView textViewTopLabelView10 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (textViewTopLabelView10 != null) {
                                                                                                                        i = R.id.textViewSubscriberNumber;
                                                                                                                        TextViewTopLabelView textViewTopLabelView11 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (textViewTopLabelView11 != null) {
                                                                                                                            i = R.id.textViewSuspendNums;
                                                                                                                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (dtacFontTextView != null) {
                                                                                                                                return new FragmentPostSubscriberInfoEnquiryBinding((ConstraintLayout) view, imageView, textViewTopLabelView, textViewTopLabelView2, imageView2, imageView3, imageView4, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, constraintLayout, linearLayout6, phoneStatusView, shimmerFrameLayout, shimmerFrameLayout2, shimmerFrameLayout3, shimmerFrameLayout4, shimmerFrameLayout5, shimmerFrameLayout6, textViewTopLabelView3, textViewTopLabelView4, textViewTopLabelView5, textViewTopLabelView6, textViewTopLabelView7, textViewTopLabelView8, textViewTopLabelView9, textViewTopLabelView10, textViewTopLabelView11, dtacFontTextView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPostSubscriberInfoEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPostSubscriberInfoEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_post_subscriber_info_enquiry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84244a;
    }
}