package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidReregistInputDocumentBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidReregistInputDocumentBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83966a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final DtacClearableEditText edtName;
    @NonNull
    public final DtacClearableEditText edtPersonId;
    @NonNull
    public final DtacClearableEditText edtSureName;
    @NonNull
    public final DtacFontTextView tvFormHelper;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvPhoneNumberRegister;

    public FragmentMrtrPrepaidReregistInputDocumentBinding(FrameLayout frameLayout, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacClearableEditText dtacClearableEditText3, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83966a = frameLayout;
        this.btnOk = dtacFontButton;
        this.edtName = dtacClearableEditText;
        this.edtPersonId = dtacClearableEditText2;
        this.edtSureName = dtacClearableEditText3;
        this.tvFormHelper = dtacFontTextView;
        this.tvPhoneNumber = dtacFontTextView2;
        this.tvPhoneNumberRegister = dtacFontTextView3;
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistInputDocumentBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.edtName;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.edtPersonId;
                DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText2 != null) {
                    i = R.id.edtSureName;
                    DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText3 != null) {
                        i = R.id.tvFormHelper;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.tvPhoneNumber;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tvPhoneNumberRegister;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    return new FragmentMrtrPrepaidReregistInputDocumentBinding((FrameLayout) view, dtacFontButton, dtacClearableEditText, dtacClearableEditText2, dtacClearableEditText3, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static FragmentMrtrPrepaidReregistInputDocumentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistInputDocumentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_reregist_input_document, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83966a;
    }
}