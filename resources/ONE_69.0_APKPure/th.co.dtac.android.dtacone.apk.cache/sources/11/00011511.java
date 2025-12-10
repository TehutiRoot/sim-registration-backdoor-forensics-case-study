package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangeSimIdFormBinding */
/* loaded from: classes7.dex */
public final class FragmentChangeSimIdFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83772a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final DtacCheckBox checkBoxNotifyIdCardExpired;
    @NonNull
    public final DtacClearableEditText edtIdCard;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding switchModeToSmartCard;

    public FragmentChangeSimIdFormBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacCheckBox dtacCheckBox, DtacClearableEditText dtacClearableEditText, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding) {
        this.f83772a = constraintLayout;
        this.btnNext = dtacFontButton;
        this.checkBoxNotifyIdCardExpired = dtacCheckBox;
        this.edtIdCard = dtacClearableEditText;
        this.switchModeToSmartCard = zIncludeSwitchModeCameraBinding;
    }

    @NonNull
    public static FragmentChangeSimIdFormBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.checkBoxNotifyIdCardExpired;
            DtacCheckBox dtacCheckBox = (DtacCheckBox) ViewBindings.findChildViewById(view, i);
            if (dtacCheckBox != null) {
                i = R.id.edtIdCard;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.switchModeToSmartCard))) != null) {
                    return new FragmentChangeSimIdFormBinding((ConstraintLayout) view, dtacFontButton, dtacCheckBox, dtacClearableEditText, ZIncludeSwitchModeCameraBinding.bind(findChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChangeSimIdFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangeSimIdFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_sim_id_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83772a;
    }
}