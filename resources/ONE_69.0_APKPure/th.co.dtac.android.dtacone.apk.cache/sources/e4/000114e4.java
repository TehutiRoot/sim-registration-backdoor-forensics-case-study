package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogOneCustomConfirmBinding */
/* loaded from: classes7.dex */
public final class DialogOneCustomConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f83727a;
    @NonNull
    public final OneFontTextView btnCancel;
    @NonNull
    public final OneFontTextView btnConfirm;
    @NonNull
    public final OneFontTextView tvDescription;
    @NonNull
    public final OneFontTextView tvTitle;

    public DialogOneCustomConfirmBinding(LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f83727a = linearLayoutCompat;
        this.btnCancel = oneFontTextView;
        this.btnConfirm = oneFontTextView2;
        this.tvDescription = oneFontTextView3;
        this.tvTitle = oneFontTextView4;
    }

    @NonNull
    public static DialogOneCustomConfirmBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.btnConfirm;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.tvDescription;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    i = R.id.tvTitle;
                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView4 != null) {
                        return new DialogOneCustomConfirmBinding((LinearLayoutCompat) view, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogOneCustomConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogOneCustomConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_one_custom_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f83727a;
    }
}