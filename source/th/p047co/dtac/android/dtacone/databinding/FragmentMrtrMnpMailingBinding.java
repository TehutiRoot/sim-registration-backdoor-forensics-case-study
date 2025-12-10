package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpMailingBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpMailingBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83790a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final DtacEditText edtBirthDay;
    @NonNull
    public final DtacClearableEditText edtIdCard;
    @NonNull
    public final DtacClearableEditText edtName;
    @NonNull
    public final DtacClearableEditText edtSureName;
    @NonNull
    public final IncludeEInvoiceBinding incEInvoice;
    @NonNull
    public final ZIncludeMrtrMailingAddressV3Binding incMailingAddress;
    @NonNull
    public final ToggleButton languageSelect;
    @NonNull
    public final LinearLayoutCompat layoutMailingAddress;
    @NonNull
    public final NestedScrollView scrollView;
    @NonNull
    public final ToggleButton tbGender;
    @NonNull
    public final DtacFontTextView tvGenderTitle;
    @NonNull
    public final DtacFontTextView tvMailingTitle;
    @NonNull
    public final DtacFontTextView tvMsisdn;
    @NonNull
    public final DtacFontTextView tvProfileTitle;
    @NonNull
    public final DtacFontTextView tvTitle;

    public FragmentMrtrMnpMailingBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacEditText dtacEditText, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacClearableEditText dtacClearableEditText3, IncludeEInvoiceBinding includeEInvoiceBinding, ZIncludeMrtrMailingAddressV3Binding zIncludeMrtrMailingAddressV3Binding, ToggleButton toggleButton, LinearLayoutCompat linearLayoutCompat, NestedScrollView nestedScrollView2, ToggleButton toggleButton2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f83790a = nestedScrollView;
        this.btnConfirm = dtacFontButton;
        this.edtBirthDay = dtacEditText;
        this.edtIdCard = dtacClearableEditText;
        this.edtName = dtacClearableEditText2;
        this.edtSureName = dtacClearableEditText3;
        this.incEInvoice = includeEInvoiceBinding;
        this.incMailingAddress = zIncludeMrtrMailingAddressV3Binding;
        this.languageSelect = toggleButton;
        this.layoutMailingAddress = linearLayoutCompat;
        this.scrollView = nestedScrollView2;
        this.tbGender = toggleButton2;
        this.tvGenderTitle = dtacFontTextView;
        this.tvMailingTitle = dtacFontTextView2;
        this.tvMsisdn = dtacFontTextView3;
        this.tvProfileTitle = dtacFontTextView4;
        this.tvTitle = dtacFontTextView5;
    }

    @NonNull
    public static FragmentMrtrMnpMailingBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.edtBirthDay;
            DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
            if (dtacEditText != null) {
                i = R.id.edtIdCard;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    i = R.id.edtName;
                    DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText2 != null) {
                        i = R.id.edtSureName;
                        DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incEInvoice))) != null) {
                            IncludeEInvoiceBinding bind = IncludeEInvoiceBinding.bind(findChildViewById);
                            i = R.id.incMailingAddress;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, i);
                            if (findChildViewById2 != null) {
                                ZIncludeMrtrMailingAddressV3Binding bind2 = ZIncludeMrtrMailingAddressV3Binding.bind(findChildViewById2);
                                i = R.id.languageSelect;
                                ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(view, i);
                                if (toggleButton != null) {
                                    i = R.id.layoutMailingAddress;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat != null) {
                                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                                        i = R.id.tbGender;
                                        ToggleButton toggleButton2 = (ToggleButton) ViewBindings.findChildViewById(view, i);
                                        if (toggleButton2 != null) {
                                            i = R.id.tvGenderTitle;
                                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView != null) {
                                                i = R.id.tv_mailing_title;
                                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView2 != null) {
                                                    i = R.id.tvMsisdn;
                                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView3 != null) {
                                                        i = R.id.tvProfileTitle;
                                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView4 != null) {
                                                            i = R.id.tvTitle;
                                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView5 != null) {
                                                                return new FragmentMrtrMnpMailingBinding(nestedScrollView, dtacFontButton, dtacEditText, dtacClearableEditText, dtacClearableEditText2, dtacClearableEditText3, bind, bind2, toggleButton, linearLayoutCompat, nestedScrollView, toggleButton2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
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
    public static FragmentMrtrMnpMailingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpMailingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_mailing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83790a;
    }
}
