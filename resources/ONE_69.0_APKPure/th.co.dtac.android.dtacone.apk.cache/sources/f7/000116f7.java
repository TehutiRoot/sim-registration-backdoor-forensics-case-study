package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRectifyStvConfirmBinding */
/* loaded from: classes7.dex */
public final class FragmentRectifyStvConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84262a;
    @NonNull
    public final LinearLayout confirmDetailsAmount;
    @NonNull
    public final RelativeLayout confirmDetailsDescription;
    @NonNull
    public final ImageView ivRectifyType;
    @NonNull
    public final DtacFontTextView messageInfomation;
    @NonNull
    public final DtacClearableEditText rectifyEdtConfirmPin;
    @NonNull
    public final LinearLayout rectifyLlvConfirmSubscriberNumber;
    @NonNull
    public final LinearLayout rectifyTypeBox;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    public final DtacFontTextView tvRectifyAmount;
    @NonNull
    public final DtacFontTextView tvRectifyDescription;
    @NonNull
    public final DtacFontTextView tvRectifyPhoneNumber;
    @NonNull
    public final DtacFontTextView tvRectifyType;
    @NonNull
    public final DtacFontTextView tvSimR;

    public FragmentRectifyStvConfirmBinding(NestedScrollView nestedScrollView, LinearLayout linearLayout, RelativeLayout relativeLayout, ImageView imageView, DtacFontTextView dtacFontTextView, DtacClearableEditText dtacClearableEditText, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f84262a = nestedScrollView;
        this.confirmDetailsAmount = linearLayout;
        this.confirmDetailsDescription = relativeLayout;
        this.ivRectifyType = imageView;
        this.messageInfomation = dtacFontTextView;
        this.rectifyEdtConfirmPin = dtacClearableEditText;
        this.rectifyLlvConfirmSubscriberNumber = linearLayout2;
        this.rectifyTypeBox = linearLayout3;
        this.rootLayout = relativeLayout2;
        this.tvRectifyAmount = dtacFontTextView2;
        this.tvRectifyDescription = dtacFontTextView3;
        this.tvRectifyPhoneNumber = dtacFontTextView4;
        this.tvRectifyType = dtacFontTextView5;
        this.tvSimR = dtacFontTextView6;
    }

    @NonNull
    public static FragmentRectifyStvConfirmBinding bind(@NonNull View view) {
        int i = R.id.confirm_details_amount;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.confirm_details_description;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.ivRectifyType;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.message_infomation;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.rectify_edt_confirm_pin;
                        DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText != null) {
                            i = R.id.rectify_llv_confirm_subscriber_number;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = R.id.rectifyTypeBox;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout3 != null) {
                                    i = R.id.rootLayout;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout2 != null) {
                                        i = R.id.tvRectifyAmount;
                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView2 != null) {
                                            i = R.id.tvRectifyDescription;
                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView3 != null) {
                                                i = R.id.tvRectifyPhoneNumber;
                                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView4 != null) {
                                                    i = R.id.tvRectifyType;
                                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView5 != null) {
                                                        i = R.id.tvSimR;
                                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView6 != null) {
                                                            return new FragmentRectifyStvConfirmBinding((NestedScrollView) view, linearLayout, relativeLayout, imageView, dtacFontTextView, dtacClearableEditText, linearLayout2, linearLayout3, relativeLayout2, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
    public static FragmentRectifyStvConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRectifyStvConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rectify_stv_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84262a;
    }
}