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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneTooltipLayoutBinding */
/* loaded from: classes7.dex */
public final class OneTooltipLayoutBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84540a;
    @NonNull
    public final ImageView ivArrowDown;
    @NonNull
    public final OneFontTextView tvTooltipText;

    public OneTooltipLayoutBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f84540a = constraintLayout;
        this.ivArrowDown = imageView;
        this.tvTooltipText = oneFontTextView;
    }

    @NonNull
    public static OneTooltipLayoutBinding bind(@NonNull View view) {
        int i = R.id.ivArrowDown;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvTooltipText;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                return new OneTooltipLayoutBinding((ConstraintLayout) view, imageView, oneFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneTooltipLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneTooltipLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_tooltip_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84540a;
    }
}
