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
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPostpaidOtherCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPostpaidOtherCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83834a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final DtacCheckBox checkBoxOtherCardNotifyExpired;
    @NonNull
    public final DtacClearableEditText edtOtherCard;

    public FragmentEsimPostpaidOtherCardFormBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacCheckBox dtacCheckBox, DtacClearableEditText dtacClearableEditText) {
        this.f83834a = nestedScrollView;
        this.btnNext = dtacFontButton;
        this.checkBoxOtherCardNotifyExpired = dtacCheckBox;
        this.edtOtherCard = dtacClearableEditText;
    }

    @NonNull
    public static FragmentEsimPostpaidOtherCardFormBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.checkBoxOtherCardNotifyExpired;
            DtacCheckBox dtacCheckBox = (DtacCheckBox) ViewBindings.findChildViewById(view, i);
            if (dtacCheckBox != null) {
                i = R.id.edtOtherCard;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    return new FragmentEsimPostpaidOtherCardFormBinding((NestedScrollView) view, dtacFontButton, dtacCheckBox, dtacClearableEditText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEsimPostpaidOtherCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPostpaidOtherCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_postpaid_other_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83834a;
    }
}