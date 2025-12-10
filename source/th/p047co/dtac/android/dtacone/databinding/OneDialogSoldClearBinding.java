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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogSoldClearBinding */
/* loaded from: classes7.dex */
public final class OneDialogSoldClearBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84449a;
    @NonNull
    public final OneFontTextView btnCancel;
    @NonNull
    public final OneFontTextView btnConfirm;
    @NonNull
    public final LinearLayoutCompat linearBox;
    @NonNull
    public final OneFontTextView tvDescription;
    @NonNull
    public final OneFontTextView tvFirstText;
    @NonNull
    public final OneFontTextView tvLastText;
    @NonNull
    public final OneFontTextView tvSubTitle;
    @NonNull
    public final OneFontTextView tvTitle;

    public OneDialogSoldClearBinding(LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, LinearLayoutCompat linearLayoutCompat2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7) {
        this.f84449a = linearLayoutCompat;
        this.btnCancel = oneFontTextView;
        this.btnConfirm = oneFontTextView2;
        this.linearBox = linearLayoutCompat2;
        this.tvDescription = oneFontTextView3;
        this.tvFirstText = oneFontTextView4;
        this.tvLastText = oneFontTextView5;
        this.tvSubTitle = oneFontTextView6;
        this.tvTitle = oneFontTextView7;
    }

    @NonNull
    public static OneDialogSoldClearBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.btnConfirm;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.linearBox;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.tvDescription;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.tvFirstText;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            i = R.id.tvLastText;
                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView5 != null) {
                                i = R.id.tvSubTitle;
                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView6 != null) {
                                    i = R.id.tvTitle;
                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView7 != null) {
                                        return new OneDialogSoldClearBinding((LinearLayoutCompat) view, oneFontTextView, oneFontTextView2, linearLayoutCompat, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogSoldClearBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogSoldClearBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_sold_clear, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84449a;
    }
}
