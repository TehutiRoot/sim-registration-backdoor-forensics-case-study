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
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonBlue;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogSuccessBinding */
/* loaded from: classes7.dex */
public final class OneDialogSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84450a;
    @NonNull
    public final OneButtonBlue btnOK;
    @NonNull
    public final ImageView ivIconCheck;
    @NonNull
    public final OneFontTextView tvSuccessDescription;
    @NonNull
    public final OneFontTextView tvSuccessTitle;

    public OneDialogSuccessBinding(ConstraintLayout constraintLayout, OneButtonBlue oneButtonBlue, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84450a = constraintLayout;
        this.btnOK = oneButtonBlue;
        this.ivIconCheck = imageView;
        this.tvSuccessDescription = oneFontTextView;
        this.tvSuccessTitle = oneFontTextView2;
    }

    @NonNull
    public static OneDialogSuccessBinding bind(@NonNull View view) {
        int i = R.id.btnOK;
        OneButtonBlue oneButtonBlue = (OneButtonBlue) ViewBindings.findChildViewById(view, i);
        if (oneButtonBlue != null) {
            i = R.id.ivIconCheck;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvSuccessDescription;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.tvSuccessTitle;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        return new OneDialogSuccessBinding((ConstraintLayout) view, oneButtonBlue, imageView, oneFontTextView, oneFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84450a;
    }
}
