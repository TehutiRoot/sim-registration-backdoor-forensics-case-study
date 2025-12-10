package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacIdCardEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPre2postIdCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPre2postIdCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83851a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final DtacCheckBox checkBoxNotifyIdCardExpired;
    @NonNull
    public final DtacIdCardEditText edtIdCard;

    public FragmentMrtrPre2postIdCardFormBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacCheckBox dtacCheckBox, DtacIdCardEditText dtacIdCardEditText) {
        this.f83851a = nestedScrollView;
        this.btnNext = dtacFontButton;
        this.checkBoxNotifyIdCardExpired = dtacCheckBox;
        this.edtIdCard = dtacIdCardEditText;
    }

    @NonNull
    public static FragmentMrtrPre2postIdCardFormBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.checkBoxNotifyIdCardExpired;
            DtacCheckBox dtacCheckBox = (DtacCheckBox) ViewBindings.findChildViewById(view, i);
            if (dtacCheckBox != null) {
                i = R.id.edtIdCard;
                DtacIdCardEditText dtacIdCardEditText = (DtacIdCardEditText) ViewBindings.findChildViewById(view, i);
                if (dtacIdCardEditText != null) {
                    return new FragmentMrtrPre2postIdCardFormBinding((NestedScrollView) view, dtacFontButton, dtacCheckBox, dtacIdCardEditText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPre2postIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPre2postIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_pre2post_id_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83851a;
    }
}
