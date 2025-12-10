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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncRetryReloadBinding */
/* loaded from: classes7.dex */
public final class ZIncRetryReloadBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84613a;
    @NonNull
    public final ConstraintLayout btnReload;
    @NonNull
    public final ImageView ivIcoReload;
    @NonNull
    public final DtacFontTextView label1;
    @NonNull
    public final DtacFontTextView label2;
    @NonNull
    public final ConstraintLayout tryToReloadContainer;
    @NonNull
    public final DtacFontTextView tvBtnLabel;

    public ZIncRetryReloadBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, ConstraintLayout constraintLayout3, DtacFontTextView dtacFontTextView3) {
        this.f84613a = constraintLayout;
        this.btnReload = constraintLayout2;
        this.ivIcoReload = imageView;
        this.label1 = dtacFontTextView;
        this.label2 = dtacFontTextView2;
        this.tryToReloadContainer = constraintLayout3;
        this.tvBtnLabel = dtacFontTextView3;
    }

    @NonNull
    public static ZIncRetryReloadBinding bind(@NonNull View view) {
        int i = R.id.btnReload;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.ivIcoReload;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.label1;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.label2;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        i = R.id.tvBtnLabel;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            return new ZIncRetryReloadBinding(constraintLayout2, constraintLayout, imageView, dtacFontTextView, dtacFontTextView2, constraintLayout2, dtacFontTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncRetryReloadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncRetryReloadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_inc_retry_reload, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84613a;
    }
}
