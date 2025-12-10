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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncRetryReloadBinding */
/* loaded from: classes7.dex */
public final class OneIncRetryReloadBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84458a;
    @NonNull
    public final ConstraintLayout btnReload;
    @NonNull
    public final ImageView ivIcoReload;
    @NonNull
    public final OneFontTextView label1;
    @NonNull
    public final OneFontTextView label2;
    @NonNull
    public final ConstraintLayout tryToReloadContainer;
    @NonNull
    public final OneFontTextView tvBtnLabel;

    public OneIncRetryReloadBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView3) {
        this.f84458a = constraintLayout;
        this.btnReload = constraintLayout2;
        this.ivIcoReload = imageView;
        this.label1 = oneFontTextView;
        this.label2 = oneFontTextView2;
        this.tryToReloadContainer = constraintLayout3;
        this.tvBtnLabel = oneFontTextView3;
    }

    @NonNull
    public static OneIncRetryReloadBinding bind(@NonNull View view) {
        int i = R.id.btnReload;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.ivIcoReload;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.label1;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.label2;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        i = R.id.tvBtnLabel;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            return new OneIncRetryReloadBinding(constraintLayout2, constraintLayout, imageView, oneFontTextView, oneFontTextView2, constraintLayout2, oneFontTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncRetryReloadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncRetryReloadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_inc_retry_reload, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84458a;
    }
}
