package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogFragmentOneChangeProHappyBinding */
/* loaded from: classes7.dex */
public final class DialogFragmentOneChangeProHappyBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83719a;
    @NonNull
    public final ConstraintLayout bottomSheet;
    @NonNull
    public final OneFontTextView oneFontTextView;

    public DialogFragmentOneChangeProHappyBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f83719a = constraintLayout;
        this.bottomSheet = constraintLayout2;
        this.oneFontTextView = oneFontTextView;
    }

    @NonNull
    public static DialogFragmentOneChangeProHappyBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.oneFontTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new DialogFragmentOneChangeProHappyBinding(constraintLayout, constraintLayout, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogFragmentOneChangeProHappyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogFragmentOneChangeProHappyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fragment_one_change_pro_happy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83719a;
    }
}