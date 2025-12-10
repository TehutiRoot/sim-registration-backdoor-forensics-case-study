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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogMrtrAttorneySmartCardBinding */
/* loaded from: classes7.dex */
public final class DialogMrtrAttorneySmartCardBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83624a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final ImageView ivAttorneySmartCard;
    @NonNull
    public final DtacFontTextView tvAttorneyDetail;

    public DialogMrtrAttorneySmartCardBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f83624a = constraintLayout;
        this.btnOk = dtacFontButton;
        this.ivAttorneySmartCard = imageView;
        this.tvAttorneyDetail = dtacFontTextView;
    }

    @NonNull
    public static DialogMrtrAttorneySmartCardBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.ivAttorneySmartCard;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvAttorneyDetail;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new DialogMrtrAttorneySmartCardBinding((ConstraintLayout) view, dtacFontButton, imageView, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogMrtrAttorneySmartCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogMrtrAttorneySmartCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mrtr_attorney_smart_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83624a;
    }
}
