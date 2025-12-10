package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentConfirmEpinBinding */
/* loaded from: classes7.dex */
public final class FragmentConfirmEpinBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacSwipeRefresh f83680a;
    @NonNull
    public final ZBalanceBoxBinding balanceBox;
    @NonNull
    public final LinearLayout confirmDetails;
    @NonNull
    public final LinearLayout confirmSubscriberNumber;
    @NonNull
    public final DtacClearableEditText edtPin;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;
    @NonNull
    public final DtacFontTextView tvConfirmEpinAmount;
    @NonNull
    public final DtacFontTextView tvConfirmInformationTitle;
    @NonNull
    public final DtacFontTextView tvEpinConfirmSubscriberNumber;

    public FragmentConfirmEpinBinding(DtacSwipeRefresh dtacSwipeRefresh, ZBalanceBoxBinding zBalanceBoxBinding, LinearLayout linearLayout, LinearLayout linearLayout2, DtacClearableEditText dtacClearableEditText, LinearLayout linearLayout3, DtacSwipeRefresh dtacSwipeRefresh2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83680a = dtacSwipeRefresh;
        this.balanceBox = zBalanceBoxBinding;
        this.confirmDetails = linearLayout;
        this.confirmSubscriberNumber = linearLayout2;
        this.edtPin = dtacClearableEditText;
        this.rootLayout = linearLayout3;
        this.swipeRefresh = dtacSwipeRefresh2;
        this.tvConfirmEpinAmount = dtacFontTextView;
        this.tvConfirmInformationTitle = dtacFontTextView2;
        this.tvEpinConfirmSubscriberNumber = dtacFontTextView3;
    }

    @NonNull
    public static FragmentConfirmEpinBinding bind(@NonNull View view) {
        int i = R.id.balance_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZBalanceBoxBinding bind = ZBalanceBoxBinding.bind(findChildViewById);
            i = R.id.confirm_details;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.confirm_subscriber_number;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.edtPin;
                    DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText != null) {
                        i = R.id.rootLayout;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout3 != null) {
                            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) view;
                            i = R.id.tv_confirm_epin_amount;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tv_confirm_information_title;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tv_epin_confirm_subscriber_number;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        return new FragmentConfirmEpinBinding(dtacSwipeRefresh, bind, linearLayout, linearLayout2, dtacClearableEditText, linearLayout3, dtacSwipeRefresh, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static FragmentConfirmEpinBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentConfirmEpinBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_confirm_epin, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacSwipeRefresh getRoot() {
        return this.f83680a;
    }
}
