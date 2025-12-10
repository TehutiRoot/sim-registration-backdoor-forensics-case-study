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
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSalePaymentHeaderBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSalePaymentHeaderBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83790a;
    @NonNull
    public final DtacFontTextView balanceAmountLabel;
    @NonNull
    public final DtacFontTextView balanceAmountValue;
    @NonNull
    public final DtacFontTextView discountAmountValue;
    @NonNull
    public final DtacFontTextView discountLabel;
    @NonNull
    public final DtacFontTextView paymentAmountLabel;
    @NonNull
    public final DtacFontTextView paymentAmountValue;
    @NonNull
    public final DtacFontTextView totalAmountLabel;
    @NonNull
    public final DtacFontTextView totalAmountValue;
    @NonNull

    /* renamed from: v1 */
    public final ImageView f83791v1;
    @NonNull

    /* renamed from: v2 */
    public final ImageView f83792v2;
    @NonNull

    /* renamed from: v3 */
    public final ImageView f83793v3;

    public FragmentDeviceSalePaymentHeaderBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.f83790a = constraintLayout;
        this.balanceAmountLabel = dtacFontTextView;
        this.balanceAmountValue = dtacFontTextView2;
        this.discountAmountValue = dtacFontTextView3;
        this.discountLabel = dtacFontTextView4;
        this.paymentAmountLabel = dtacFontTextView5;
        this.paymentAmountValue = dtacFontTextView6;
        this.totalAmountLabel = dtacFontTextView7;
        this.totalAmountValue = dtacFontTextView8;
        this.f83791v1 = imageView;
        this.f83792v2 = imageView2;
        this.f83793v3 = imageView3;
    }

    @NonNull
    public static FragmentDeviceSalePaymentHeaderBinding bind(@NonNull View view) {
        int i = R.id.balanceAmountLabel;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.balanceAmountValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.discountAmountValue;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.discountLabel;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        i = R.id.paymentAmountLabel;
                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView5 != null) {
                            i = R.id.paymentAmountValue;
                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView6 != null) {
                                i = R.id.totalAmountLabel;
                                DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView7 != null) {
                                    i = R.id.totalAmountValue;
                                    DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView8 != null) {
                                        i = R.id.v1;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = R.id.v2;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null) {
                                                i = R.id.v3;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView3 != null) {
                                                    return new FragmentDeviceSalePaymentHeaderBinding((ConstraintLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, imageView, imageView2, imageView3);
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
    public static FragmentDeviceSalePaymentHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSalePaymentHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_payment_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83790a;
    }
}