package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrChangeSimIdFormBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrChangeSimIdFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83769a;
    @NonNull
    public final DtacFontTextView btnNext;
    @NonNull
    public final DtacCheckBox checkBoxNotifyIdCardExpired;
    @NonNull
    public final DtacClearableEditText edtIdCard;
    @NonNull
    public final ImageView ivTag;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding switchModeToSmartCard;

    public FragmentMrtrChangeSimIdFormBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, DtacCheckBox dtacCheckBox, DtacClearableEditText dtacClearableEditText, ImageView imageView, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding) {
        this.f83769a = constraintLayout;
        this.btnNext = dtacFontTextView;
        this.checkBoxNotifyIdCardExpired = dtacCheckBox;
        this.edtIdCard = dtacClearableEditText;
        this.ivTag = imageView;
        this.switchModeToSmartCard = zIncludeSwitchModeCameraBinding;
    }

    @NonNull
    public static FragmentMrtrChangeSimIdFormBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnNext;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.checkBoxNotifyIdCardExpired;
            DtacCheckBox dtacCheckBox = (DtacCheckBox) ViewBindings.findChildViewById(view, i);
            if (dtacCheckBox != null) {
                i = R.id.edtIdCard;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    i = R.id.ivTag;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.switchModeToSmartCard))) != null) {
                        return new FragmentMrtrChangeSimIdFormBinding((ConstraintLayout) view, dtacFontTextView, dtacCheckBox, dtacClearableEditText, imageView, ZIncludeSwitchModeCameraBinding.bind(findChildViewById));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrChangeSimIdFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrChangeSimIdFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_change_sim_id_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83769a;
    }
}
