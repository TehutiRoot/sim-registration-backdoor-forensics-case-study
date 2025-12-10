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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogInfoBinding */
/* loaded from: classes7.dex */
public final class OneDialogInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84552a;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final ConstraintLayout linearLayout2;
    @NonNull
    public final OneFontTextView messageInfomation;

    public OneDialogInfoBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f84552a = constraintLayout;
        this.btnOk = oneFontButton;
        this.linearLayout2 = constraintLayout2;
        this.messageInfomation = oneFontTextView;
    }

    @NonNull
    public static OneDialogInfoBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.messageInfomation;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i2);
            if (oneFontTextView != null) {
                return new OneDialogInfoBinding(constraintLayout, oneFontButton, constraintLayout, oneFontTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84552a;
    }
}