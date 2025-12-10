package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneRedButtonBinding */
/* loaded from: classes7.dex */
public final class OneRedButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84633a;
    @NonNull
    public final ProgressBar progress;
    @NonNull
    public final ConstraintLayout rootButton;
    @NonNull
    public final OneFontTextView tvBtn;

    public OneRedButtonBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f84633a = constraintLayout;
        this.progress = progressBar;
        this.rootButton = constraintLayout2;
        this.tvBtn = oneFontTextView;
    }

    @NonNull
    public static OneRedButtonBinding bind(@NonNull View view) {
        int i = R.id.progress;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.tvBtn;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i2);
            if (oneFontTextView != null) {
                return new OneRedButtonBinding(constraintLayout, progressBar, constraintLayout, oneFontTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneRedButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneRedButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_red_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84633a;
    }
}