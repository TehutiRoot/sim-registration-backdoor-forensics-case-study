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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncErrorCannotLoadContainerBinding */
/* loaded from: classes7.dex */
public final class ZIncErrorCannotLoadContainerBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84610a;
    @NonNull
    public final ConstraintLayout btnReload;
    @NonNull
    public final ConstraintLayout errorCannotLoadContaner;
    @NonNull
    public final ImageView ivIcoReload;
    @NonNull
    public final DtacFontTextView tvBtnReloadLabel;
    @NonNull
    public final DtacFontTextView tvErrorLine1;
    @NonNull
    public final DtacFontTextView tvErrorLine2;

    public ZIncErrorCannotLoadContainerBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84610a = constraintLayout;
        this.btnReload = constraintLayout2;
        this.errorCannotLoadContaner = constraintLayout3;
        this.ivIcoReload = imageView;
        this.tvBtnReloadLabel = dtacFontTextView;
        this.tvErrorLine1 = dtacFontTextView2;
        this.tvErrorLine2 = dtacFontTextView3;
    }

    @NonNull
    public static ZIncErrorCannotLoadContainerBinding bind(@NonNull View view) {
        int i = R.id.btnReload;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            i = R.id.ivIcoReload;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvBtnReloadLabel;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvErrorLine1;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvErrorLine2;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            return new ZIncErrorCannotLoadContainerBinding(constraintLayout2, constraintLayout, constraintLayout2, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncErrorCannotLoadContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncErrorCannotLoadContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_inc_error_cannot_load_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84610a;
    }
}
