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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncErrorCannotLoadContainerBinding */
/* loaded from: classes7.dex */
public final class OneIncErrorCannotLoadContainerBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84457a;
    @NonNull
    public final ConstraintLayout btnReload;
    @NonNull
    public final ConstraintLayout errorCannotLoadContaner;
    @NonNull
    public final ImageView ivIcoReload;
    @NonNull
    public final OneFontTextView tvBtnReloadLabel;
    @NonNull
    public final OneFontTextView tvErrorLine1;
    @NonNull
    public final OneFontTextView tvErrorLine2;

    public OneIncErrorCannotLoadContainerBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84457a = constraintLayout;
        this.btnReload = constraintLayout2;
        this.errorCannotLoadContaner = constraintLayout3;
        this.ivIcoReload = imageView;
        this.tvBtnReloadLabel = oneFontTextView;
        this.tvErrorLine1 = oneFontTextView2;
        this.tvErrorLine2 = oneFontTextView3;
    }

    @NonNull
    public static OneIncErrorCannotLoadContainerBinding bind(@NonNull View view) {
        int i = R.id.btnReload;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            i = R.id.ivIcoReload;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvBtnReloadLabel;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.tvErrorLine1;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.tvErrorLine2;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            return new OneIncErrorCannotLoadContainerBinding(constraintLayout2, constraintLayout, constraintLayout2, imageView, oneFontTextView, oneFontTextView2, oneFontTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncErrorCannotLoadContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncErrorCannotLoadContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_inc_error_cannot_load_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84457a;
    }
}
