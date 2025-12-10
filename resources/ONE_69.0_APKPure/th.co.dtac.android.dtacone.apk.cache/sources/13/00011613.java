package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84034a;
    @NonNull
    public final OneFontButton btnChangesim;
    @NonNull
    public final OneFontButton btnGoHome;
    @NonNull
    public final OneFontTextView btnPrint;
    @NonNull
    public final LinearLayoutCompat btnPrintContract;
    @NonNull
    public final OneFontTextView btnPrintContract1;
    @NonNull
    public final LinearLayoutCompat btnPrintReceipt;
    @NonNull
    public final ImageView imageIconSuccess;
    @NonNull
    public final OneFontTextView tvHeader;
    @NonNull
    public final OneFontTextView tvNextStepMessage;
    @NonNull
    public final OneFontTextView tvPhoneNumber;

    public FragmentOneDeviceSaleSuccessBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontTextView oneFontTextView, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView2, LinearLayoutCompat linearLayoutCompat2, ImageView imageView, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f84034a = constraintLayout;
        this.btnChangesim = oneFontButton;
        this.btnGoHome = oneFontButton2;
        this.btnPrint = oneFontTextView;
        this.btnPrintContract = linearLayoutCompat;
        this.btnPrintContract1 = oneFontTextView2;
        this.btnPrintReceipt = linearLayoutCompat2;
        this.imageIconSuccess = imageView;
        this.tvHeader = oneFontTextView3;
        this.tvNextStepMessage = oneFontTextView4;
        this.tvPhoneNumber = oneFontTextView5;
    }

    @NonNull
    public static FragmentOneDeviceSaleSuccessBinding bind(@NonNull View view) {
        int i = R.id.btn_changesim;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btn_go_home;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.btn_print;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.btnPrintContract;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = R.id.btn_print_contract;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.btnPrintReceipt;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = R.id.imageIconSuccess;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = R.id.tvHeader;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        i = R.id.tvNextStepMessage;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            i = R.id.tvPhoneNumber;
                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView5 != null) {
                                                return new FragmentOneDeviceSaleSuccessBinding((ConstraintLayout) view, oneFontButton, oneFontButton2, oneFontTextView, linearLayoutCompat, oneFontTextView2, linearLayoutCompat2, imageView, oneFontTextView3, oneFontTextView4, oneFontTextView5);
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
    public static FragmentOneDeviceSaleSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84034a;
    }
}