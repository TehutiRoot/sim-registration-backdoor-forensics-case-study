package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostInputIMEIBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostInputIMEIBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84162a;

    public FragmentOnePre2PostInputIMEIBinding(LinearLayout linearLayout) {
        this.f84162a = linearLayout;
    }

    @NonNull
    public static FragmentOnePre2PostInputIMEIBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOnePre2PostInputIMEIBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOnePre2PostInputIMEIBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostInputIMEIBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_input_i_m_e_i, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84162a;
    }
}