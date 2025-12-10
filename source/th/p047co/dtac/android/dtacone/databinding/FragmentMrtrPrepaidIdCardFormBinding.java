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
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacLaserIdEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidIdCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidIdCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83861a;
    @NonNull
    public final ImageView ivOcrIcon;
    @NonNull
    public final ConstraintLayout layoutOcrIntro;
    @NonNull
    public final DtacClearableEditText prepaidRegisterIdCardNumber;
    @NonNull
    public final DtacLaserIdEditText prepaidRegisterLaserId;
    @NonNull
    public final DtacFontTextView tvOcrIntro;

    public FragmentMrtrPrepaidIdCardFormBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, DtacClearableEditText dtacClearableEditText, DtacLaserIdEditText dtacLaserIdEditText, DtacFontTextView dtacFontTextView) {
        this.f83861a = constraintLayout;
        this.ivOcrIcon = imageView;
        this.layoutOcrIntro = constraintLayout2;
        this.prepaidRegisterIdCardNumber = dtacClearableEditText;
        this.prepaidRegisterLaserId = dtacLaserIdEditText;
        this.tvOcrIntro = dtacFontTextView;
    }

    @NonNull
    public static FragmentMrtrPrepaidIdCardFormBinding bind(@NonNull View view) {
        int i = R.id.ivOcrIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.layoutOcrIntro;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.prepaid_register_id_card_number;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    i = R.id.prepaid_register_laser_id;
                    DtacLaserIdEditText dtacLaserIdEditText = (DtacLaserIdEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacLaserIdEditText != null) {
                        i = R.id.tvOcrIntro;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            return new FragmentMrtrPrepaidIdCardFormBinding((ConstraintLayout) view, imageView, constraintLayout, dtacClearableEditText, dtacLaserIdEditText, dtacFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_id_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83861a;
    }
}
