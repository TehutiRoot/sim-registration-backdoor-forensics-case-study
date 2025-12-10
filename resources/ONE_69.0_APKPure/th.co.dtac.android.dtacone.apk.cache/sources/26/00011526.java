package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSaleSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSaleSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83796a;
    @NonNull
    public final DtacFontButton btnChangesim;
    @NonNull
    public final DtacFontButton btnGoHome;
    @NonNull
    public final DtacFontButton btnPrintContract;
    @NonNull
    public final DtacFontButton btnPrintReceipt;
    @NonNull
    public final DtacFontTextView dtacFontTextView20;
    @NonNull
    public final DtacFontTextView dtacFontTextView5;
    @NonNull
    public final DtacFontTextView dtacFontTextView6;
    @NonNull
    public final ImageView imageView14;
    @NonNull
    public final DtacFontTextView textView3;

    public FragmentDeviceSaleSuccessBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontButton dtacFontButton3, DtacFontButton dtacFontButton4, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, ImageView imageView, DtacFontTextView dtacFontTextView4) {
        this.f83796a = nestedScrollView;
        this.btnChangesim = dtacFontButton;
        this.btnGoHome = dtacFontButton2;
        this.btnPrintContract = dtacFontButton3;
        this.btnPrintReceipt = dtacFontButton4;
        this.dtacFontTextView20 = dtacFontTextView;
        this.dtacFontTextView5 = dtacFontTextView2;
        this.dtacFontTextView6 = dtacFontTextView3;
        this.imageView14 = imageView;
        this.textView3 = dtacFontTextView4;
    }

    @NonNull
    public static FragmentDeviceSaleSuccessBinding bind(@NonNull View view) {
        int i = R.id.btn_changesim;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btn_go_home;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.btn_print_contract;
                DtacFontButton dtacFontButton3 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton3 != null) {
                    i = R.id.btn_print_receipt;
                    DtacFontButton dtacFontButton4 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                    if (dtacFontButton4 != null) {
                        i = R.id.dtacFontTextView20;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.dtacFontTextView5;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.dtacFontTextView6;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.imageView14;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = R.id.textView3;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            return new FragmentDeviceSaleSuccessBinding((NestedScrollView) view, dtacFontButton, dtacFontButton2, dtacFontButton3, dtacFontButton4, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, imageView, dtacFontTextView4);
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
    public static FragmentDeviceSaleSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSaleSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83796a;
    }
}