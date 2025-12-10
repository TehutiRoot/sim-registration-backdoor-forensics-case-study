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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.TextViewTopLabelView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPreSubscriberInfoEnquiryBinding */
/* loaded from: classes7.dex */
public final class FragmentPreSubscriberInfoEnquiryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84148a;
    @NonNull
    public final DtacFontTextView arrowSuspend;
    @NonNull
    public final TextViewTopLabelView dummyText;
    @NonNull
    public final ImageView iconsnextlight;
    @NonNull
    public final ImageView imageViewFaceRegStatus;
    @NonNull
    public final ImageView imageViewMemberType;
    @NonNull
    public final LinearLayout layoutBalanceSOS;
    @NonNull
    public final LinearLayout layoutCeDate;
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
    public final ShimmerFrameLayout shimmerCeDate;
    @NonNull
    public final ShimmerFrameLayout shimmerFaceRecogStatus;
    @NonNull
    public final ShimmerFrameLayout shimmerSegment;
    @NonNull
    public final ShimmerFrameLayout shimmerStatusSuspend;
    @NonNull
    public final TextViewTopLabelView textViewAOU;
    @NonNull
    public final TextViewTopLabelView textViewBalance;
    @NonNull
    public final TextViewTopLabelView textViewCeDate;
    @NonNull
    public final TextViewTopLabelView textViewCurrentPackage;
    @NonNull
    public final TextViewTopLabelView textViewEndPackage;
    @NonNull
    public final TextViewTopLabelView textViewSOS;
    @NonNull
    public final TextViewTopLabelView textViewStartDate;
    @NonNull
    public final TextViewTopLabelView textViewStartPackage;
    @NonNull
    public final th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView textViewSubscriberNumber;
    @NonNull
    public final DtacFontTextView textViewSuspendNums;

    public FragmentPreSubscriberInfoEnquiryBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, TextViewTopLabelView textViewTopLabelView, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ConstraintLayout constraintLayout2, LinearLayout linearLayout4, PhoneStatusView phoneStatusView, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, ShimmerFrameLayout shimmerFrameLayout3, ShimmerFrameLayout shimmerFrameLayout4, ShimmerFrameLayout shimmerFrameLayout5, TextViewTopLabelView textViewTopLabelView2, TextViewTopLabelView textViewTopLabelView3, TextViewTopLabelView textViewTopLabelView4, TextViewTopLabelView textViewTopLabelView5, TextViewTopLabelView textViewTopLabelView6, TextViewTopLabelView textViewTopLabelView7, TextViewTopLabelView textViewTopLabelView8, TextViewTopLabelView textViewTopLabelView9, th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView textViewTopLabelView10, DtacFontTextView dtacFontTextView2) {
        this.f84148a = constraintLayout;
        this.arrowSuspend = dtacFontTextView;
        this.dummyText = textViewTopLabelView;
        this.iconsnextlight = imageView;
        this.imageViewFaceRegStatus = imageView2;
        this.imageViewMemberType = imageView3;
        this.layoutBalanceSOS = linearLayout;
        this.layoutCeDate = linearLayout2;
        this.layoutStartEndPackage = linearLayout3;
        this.layoutStatusSuspend = constraintLayout2;
        this.packageSummary = linearLayout4;
        this.phoneStatusView = phoneStatusView;
        this.shimmerBalance = shimmerFrameLayout;
        this.shimmerCeDate = shimmerFrameLayout2;
        this.shimmerFaceRecogStatus = shimmerFrameLayout3;
        this.shimmerSegment = shimmerFrameLayout4;
        this.shimmerStatusSuspend = shimmerFrameLayout5;
        this.textViewAOU = textViewTopLabelView2;
        this.textViewBalance = textViewTopLabelView3;
        this.textViewCeDate = textViewTopLabelView4;
        this.textViewCurrentPackage = textViewTopLabelView5;
        this.textViewEndPackage = textViewTopLabelView6;
        this.textViewSOS = textViewTopLabelView7;
        this.textViewStartDate = textViewTopLabelView8;
        this.textViewStartPackage = textViewTopLabelView9;
        this.textViewSubscriberNumber = textViewTopLabelView10;
        this.textViewSuspendNums = dtacFontTextView2;
    }

    @NonNull
    public static FragmentPreSubscriberInfoEnquiryBinding bind(@NonNull View view) {
        int i = R.id.arrowSuspend;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.dummyText;
            TextViewTopLabelView textViewTopLabelView = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
            if (textViewTopLabelView != null) {
                i = R.id.iconsnextlight;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.imageViewFaceRegStatus;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.imageViewMemberType;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.layoutBalanceSOS;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.layoutCeDate;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = R.id.layoutStartEndPackage;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = R.id.layoutStatusSuspend;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = R.id.packageSummary;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout4 != null) {
                                                i = R.id.phoneStatusView;
                                                PhoneStatusView phoneStatusView = (PhoneStatusView) ViewBindings.findChildViewById(view, i);
                                                if (phoneStatusView != null) {
                                                    i = R.id.shimmerBalance;
                                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (shimmerFrameLayout != null) {
                                                        i = R.id.shimmerCeDate;
                                                        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                        if (shimmerFrameLayout2 != null) {
                                                            i = R.id.shimmerFaceRecogStatus;
                                                            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                            if (shimmerFrameLayout3 != null) {
                                                                i = R.id.shimmerSegment;
                                                                ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                if (shimmerFrameLayout4 != null) {
                                                                    i = R.id.shimmerStatusSuspend;
                                                                    ShimmerFrameLayout shimmerFrameLayout5 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (shimmerFrameLayout5 != null) {
                                                                        i = R.id.textViewAOU;
                                                                        TextViewTopLabelView textViewTopLabelView2 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                        if (textViewTopLabelView2 != null) {
                                                                            i = R.id.textViewBalance;
                                                                            TextViewTopLabelView textViewTopLabelView3 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                            if (textViewTopLabelView3 != null) {
                                                                                i = R.id.textViewCeDate;
                                                                                TextViewTopLabelView textViewTopLabelView4 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                if (textViewTopLabelView4 != null) {
                                                                                    i = R.id.textViewCurrentPackage;
                                                                                    TextViewTopLabelView textViewTopLabelView5 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textViewTopLabelView5 != null) {
                                                                                        i = R.id.textViewEndPackage;
                                                                                        TextViewTopLabelView textViewTopLabelView6 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textViewTopLabelView6 != null) {
                                                                                            i = R.id.textViewSOS;
                                                                                            TextViewTopLabelView textViewTopLabelView7 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textViewTopLabelView7 != null) {
                                                                                                i = R.id.textViewStartDate;
                                                                                                TextViewTopLabelView textViewTopLabelView8 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textViewTopLabelView8 != null) {
                                                                                                    i = R.id.textViewStartPackage;
                                                                                                    TextViewTopLabelView textViewTopLabelView9 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textViewTopLabelView9 != null) {
                                                                                                        i = R.id.textViewSubscriberNumber;
                                                                                                        th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView textViewTopLabelView10 = (th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textViewTopLabelView10 != null) {
                                                                                                            i = R.id.textViewSuspendNums;
                                                                                                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (dtacFontTextView2 != null) {
                                                                                                                return new FragmentPreSubscriberInfoEnquiryBinding((ConstraintLayout) view, dtacFontTextView, textViewTopLabelView, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, constraintLayout, linearLayout4, phoneStatusView, shimmerFrameLayout, shimmerFrameLayout2, shimmerFrameLayout3, shimmerFrameLayout4, shimmerFrameLayout5, textViewTopLabelView2, textViewTopLabelView3, textViewTopLabelView4, textViewTopLabelView5, textViewTopLabelView6, textViewTopLabelView7, textViewTopLabelView8, textViewTopLabelView9, textViewTopLabelView10, dtacFontTextView2);
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
    public static FragmentPreSubscriberInfoEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPreSubscriberInfoEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_pre_subscriber_info_enquiry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84148a;
    }
}
