package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentWithdeviceConfirmBinding */
/* loaded from: classes7.dex */
public final class FragmentWithdeviceConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final ScrollView f84228a;
    @NonNull
    public final DtacFontButton btnConfirmWithDevice;
    @NonNull
    public final FrameLayout frameSign;
    @NonNull
    public final ImageView imgvSign;
    @NonNull
    public final DtacFontTextView signDesc;
    @NonNull
    public final DtacFontTextView signTitle;
    @NonNull
    public final DtacFontTextView tvAdvancePaymentValue;
    @NonNull
    public final DtacFontTextView tvConditionDetail;
    @NonNull
    public final DtacFontTextView tvDeviceName;
    @NonNull
    public final DtacFontTextView tvDisCountDevice;
    @NonNull
    public final DtacFontTextView tvExtraAdvanceAmount;
    @NonNull
    public final DtacFontTextView tvImeiNumber;
    @NonNull
    public final DtacFontTextView tvPackageName;
    @NonNull
    public final DtacFontTextView tvPackagePeriod;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvSignatureTextHelper;
    @NonNull
    public final DtacFontTextView tvTotalPayment;
    @NonNull
    public final LinearLayout vgConditionBox;
    @NonNull
    public final View vwDividerTotalPayment;
    @NonNull
    public final FrameLayout vwExtraAdvancePayment;
    @NonNull
    public final FrameLayout vwTotalPayment;

    public FragmentWithdeviceConfirmBinding(ScrollView scrollView, DtacFontButton dtacFontButton, FrameLayout frameLayout, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12, DtacFontTextView dtacFontTextView13, LinearLayout linearLayout, View view, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.f84228a = scrollView;
        this.btnConfirmWithDevice = dtacFontButton;
        this.frameSign = frameLayout;
        this.imgvSign = imageView;
        this.signDesc = dtacFontTextView;
        this.signTitle = dtacFontTextView2;
        this.tvAdvancePaymentValue = dtacFontTextView3;
        this.tvConditionDetail = dtacFontTextView4;
        this.tvDeviceName = dtacFontTextView5;
        this.tvDisCountDevice = dtacFontTextView6;
        this.tvExtraAdvanceAmount = dtacFontTextView7;
        this.tvImeiNumber = dtacFontTextView8;
        this.tvPackageName = dtacFontTextView9;
        this.tvPackagePeriod = dtacFontTextView10;
        this.tvPhoneNumber = dtacFontTextView11;
        this.tvSignatureTextHelper = dtacFontTextView12;
        this.tvTotalPayment = dtacFontTextView13;
        this.vgConditionBox = linearLayout;
        this.vwDividerTotalPayment = view;
        this.vwExtraAdvancePayment = frameLayout2;
        this.vwTotalPayment = frameLayout3;
    }

    @NonNull
    public static FragmentWithdeviceConfirmBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btn_confirm_with_device;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.frame_sign;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.imgv_sign;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.signDesc;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.signTitle;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.tvAdvancePaymentValue;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.tvConditionDetail;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    i = R.id.tvDeviceName;
                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView5 != null) {
                                        i = R.id.tvDisCountDevice;
                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView6 != null) {
                                            i = R.id.tvExtraAdvanceAmount;
                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView7 != null) {
                                                i = R.id.tvImeiNumber;
                                                DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView8 != null) {
                                                    i = R.id.tvPackageName;
                                                    DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView9 != null) {
                                                        i = R.id.tvPackagePeriod;
                                                        DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView10 != null) {
                                                            i = R.id.tvPhoneNumber;
                                                            DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView11 != null) {
                                                                i = R.id.tvSignatureTextHelper;
                                                                DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView12 != null) {
                                                                    i = R.id.tvTotalPayment;
                                                                    DtacFontTextView dtacFontTextView13 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView13 != null) {
                                                                        i = R.id.vgConditionBox;
                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vwDividerTotalPayment))) != null) {
                                                                            i = R.id.vwExtraAdvancePayment;
                                                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (frameLayout2 != null) {
                                                                                i = R.id.vwTotalPayment;
                                                                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (frameLayout3 != null) {
                                                                                    return new FragmentWithdeviceConfirmBinding((ScrollView) view, dtacFontButton, frameLayout, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12, dtacFontTextView13, linearLayout, findChildViewById, frameLayout2, frameLayout3);
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
    public static FragmentWithdeviceConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWithdeviceConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_withdevice_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.f84228a;
    }
}
