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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidRegisSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidRegisSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83839a;
    @NonNull
    public final DtacFontButton btnChangesim;
    @NonNull
    public final DtacFontButton btnGoHome;
    @NonNull
    public final DtacFontTextView btnPrint;
    @NonNull
    public final LinearLayoutCompat btnPrintReceipt;
    @NonNull
    public final ImageView imageIconSuccess;
    @NonNull
    public final DtacFontTextView tvHeader;
    @NonNull
    public final DtacFontTextView tvMessageSimStock;
    @NonNull
    public final DtacFontTextView tvNextStepMessage;
    @NonNull
    public final DtacFontTextView tvSubMessage;

    public FragmentMrtrPostpaidRegisSuccessBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView, LinearLayoutCompat linearLayoutCompat, ImageView imageView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f83839a = constraintLayout;
        this.btnChangesim = dtacFontButton;
        this.btnGoHome = dtacFontButton2;
        this.btnPrint = dtacFontTextView;
        this.btnPrintReceipt = linearLayoutCompat;
        this.imageIconSuccess = imageView;
        this.tvHeader = dtacFontTextView2;
        this.tvMessageSimStock = dtacFontTextView3;
        this.tvNextStepMessage = dtacFontTextView4;
        this.tvSubMessage = dtacFontTextView5;
    }

    @NonNull
    public static FragmentMrtrPostpaidRegisSuccessBinding bind(@NonNull View view) {
        int i = R.id.btn_changesim;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btn_go_home;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.btn_print;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.btnPrintReceipt;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = R.id.imageIconSuccess;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.tvHeader;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tvMessageSimStock;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.tvNextStepMessage;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.tvSubMessage;
                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView5 != null) {
                                            return new FragmentMrtrPostpaidRegisSuccessBinding((ConstraintLayout) view, dtacFontButton, dtacFontButton2, dtacFontTextView, linearLayoutCompat, imageView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
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
    public static FragmentMrtrPostpaidRegisSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidRegisSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_regis_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83839a;
    }
}
