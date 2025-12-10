package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityNewRegisterBinding */
/* loaded from: classes7.dex */
public final class ActivityNewRegisterBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83624a;
    @NonNull
    public final FrameLayout contentRegister;
    @NonNull
    public final TransparentToolbarBinding toolbarLayout;

    public ActivityNewRegisterBinding(LinearLayout linearLayout, FrameLayout frameLayout, TransparentToolbarBinding transparentToolbarBinding) {
        this.f83624a = linearLayout;
        this.contentRegister = frameLayout;
        this.toolbarLayout = transparentToolbarBinding;
    }

    @NonNull
    public static ActivityNewRegisterBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentRegister;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbarLayout))) != null) {
            return new ActivityNewRegisterBinding((LinearLayout) view, frameLayout, TransparentToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityNewRegisterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityNewRegisterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_new_register, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83624a;
    }
}