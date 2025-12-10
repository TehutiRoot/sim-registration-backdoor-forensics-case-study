package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonBlue;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogPasswordSuccessBinding */
/* loaded from: classes7.dex */
public final class OneDialogPasswordSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84554a;
    @NonNull
    public final OneButtonBlue btnOK;
    @NonNull
    public final ImageView iconSuccess;
    @NonNull
    public final OneFontTextView tvSubTitle;
    @NonNull
    public final OneFontTextView tvTitle;

    public OneDialogPasswordSuccessBinding(LinearLayoutCompat linearLayoutCompat, OneButtonBlue oneButtonBlue, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84554a = linearLayoutCompat;
        this.btnOK = oneButtonBlue;
        this.iconSuccess = imageView;
        this.tvSubTitle = oneFontTextView;
        this.tvTitle = oneFontTextView2;
    }

    @NonNull
    public static OneDialogPasswordSuccessBinding bind(@NonNull View view) {
        int i = R.id.btnOK;
        OneButtonBlue oneButtonBlue = (OneButtonBlue) ViewBindings.findChildViewById(view, i);
        if (oneButtonBlue != null) {
            i = R.id.iconSuccess;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvSubTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.tvTitle;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        return new OneDialogPasswordSuccessBinding((LinearLayoutCompat) view, oneButtonBlue, imageView, oneFontTextView, oneFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogPasswordSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogPasswordSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_password_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84554a;
    }
}