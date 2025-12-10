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
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidReregistTabBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidReregistTabBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83970a;
    @NonNull
    public final DtacClearableEditText edtName;
    @NonNull
    public final DtacClearableEditText edtPersonId;
    @NonNull
    public final DtacClearableEditText edtSureName;
    @NonNull
    public final DtacFontTextView tvFormHelper;

    public FragmentMrtrPrepaidReregistTabBinding(LinearLayout linearLayout, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacClearableEditText dtacClearableEditText3, DtacFontTextView dtacFontTextView) {
        this.f83970a = linearLayout;
        this.edtName = dtacClearableEditText;
        this.edtPersonId = dtacClearableEditText2;
        this.edtSureName = dtacClearableEditText3;
        this.tvFormHelper = dtacFontTextView;
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistTabBinding bind(@NonNull View view) {
        int i = R.id.edtName;
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
                        return new FragmentMrtrPrepaidReregistTabBinding((LinearLayout) view, dtacClearableEditText, dtacClearableEditText2, dtacClearableEditText3, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistTabBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_reregist_tab, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83970a;
    }
}