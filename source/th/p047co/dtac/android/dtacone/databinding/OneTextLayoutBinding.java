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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneTextLayoutBinding */
/* loaded from: classes7.dex */
public final class OneTextLayoutBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84536a;
    @NonNull
    public final ImageView btnRight;
    @NonNull
    public final OneFontTextView labelName;
    @NonNull
    public final OneFontTextView labelValue;

    public OneTextLayoutBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84536a = constraintLayout;
        this.btnRight = imageView;
        this.labelName = oneFontTextView;
        this.labelValue = oneFontTextView2;
    }

    @NonNull
    public static OneTextLayoutBinding bind(@NonNull View view) {
        int i = R.id.btnRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.labelName;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.labelValue;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    return new OneTextLayoutBinding((ConstraintLayout) view, imageView, oneFontTextView, oneFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneTextLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneTextLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_text_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84536a;
    }
}
