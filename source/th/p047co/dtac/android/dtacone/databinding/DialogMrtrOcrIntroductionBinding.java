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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogMrtrOcrIntroductionBinding */
/* loaded from: classes7.dex */
public final class DialogMrtrOcrIntroductionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83625a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final ImageView ivOcrIntro;
    @NonNull
    public final DtacFontTextView tvOcrDetailIntro;

    public DialogMrtrOcrIntroductionBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f83625a = constraintLayout;
        this.btnOk = dtacFontButton;
        this.ivOcrIntro = imageView;
        this.tvOcrDetailIntro = dtacFontTextView;
    }

    @NonNull
    public static DialogMrtrOcrIntroductionBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.ivOcrIntro;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvOcrDetailIntro;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new DialogMrtrOcrIntroductionBinding((ConstraintLayout) view, dtacFontButton, imageView, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogMrtrOcrIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogMrtrOcrIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mrtr_ocr_introduction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83625a;
    }
}
