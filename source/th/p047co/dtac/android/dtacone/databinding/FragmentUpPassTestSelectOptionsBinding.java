package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentUpPassTestSelectOptionsBinding */
/* loaded from: classes7.dex */
public final class FragmentUpPassTestSelectOptionsBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84217a;
    @NonNull
    public final ComposeView selectThemesComposeView;

    public FragmentUpPassTestSelectOptionsBinding(ConstraintLayout constraintLayout, ComposeView composeView) {
        this.f84217a = constraintLayout;
        this.selectThemesComposeView = composeView;
    }

    @NonNull
    public static FragmentUpPassTestSelectOptionsBinding bind(@NonNull View view) {
        int i = R.id.selectThemesComposeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new FragmentUpPassTestSelectOptionsBinding((ConstraintLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentUpPassTestSelectOptionsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentUpPassTestSelectOptionsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_up_pass_test_select_options, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84217a;
    }
}
