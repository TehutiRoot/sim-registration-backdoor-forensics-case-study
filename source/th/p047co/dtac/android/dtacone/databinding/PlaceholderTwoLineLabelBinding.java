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

/* renamed from: th.co.dtac.android.dtacone.databinding.PlaceholderTwoLineLabelBinding */
/* loaded from: classes7.dex */
public final class PlaceholderTwoLineLabelBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84558a;
    @NonNull
    public final View line1;

    public PlaceholderTwoLineLabelBinding(ConstraintLayout constraintLayout, View view) {
        this.f84558a = constraintLayout;
        this.line1 = view;
    }

    @NonNull
    public static PlaceholderTwoLineLabelBinding bind(@NonNull View view) {
        int i = R.id.line1;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new PlaceholderTwoLineLabelBinding((ConstraintLayout) view, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlaceholderTwoLineLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PlaceholderTwoLineLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.placeholder_two_line_label, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84558a;
    }
}
