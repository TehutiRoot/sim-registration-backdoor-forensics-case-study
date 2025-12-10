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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogOneOcrIntroductionBinding */
/* loaded from: classes7.dex */
public final class DialogOneOcrIntroductionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83730a;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final ImageView ivOcrIntro;
    @NonNull
    public final OneFontTextView tvOcrDetailIntro;

    public DialogOneOcrIntroductionBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f83730a = constraintLayout;
        this.btnOk = oneFontButton;
        this.ivOcrIntro = imageView;
        this.tvOcrDetailIntro = oneFontTextView;
    }

    @NonNull
    public static DialogOneOcrIntroductionBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.ivOcrIntro;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvOcrDetailIntro;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new DialogOneOcrIntroductionBinding((ConstraintLayout) view, oneFontButton, imageView, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogOneOcrIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogOneOcrIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_one_ocr_introduction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83730a;
    }
}