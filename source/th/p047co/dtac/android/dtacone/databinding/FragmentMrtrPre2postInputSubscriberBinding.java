package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPre2postInputSubscriberBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPre2postInputSubscriberBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83852a;

    public FragmentMrtrPre2postInputSubscriberBinding(NestedScrollView nestedScrollView) {
        this.f83852a = nestedScrollView;
    }

    @NonNull
    public static FragmentMrtrPre2postInputSubscriberBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentMrtrPre2postInputSubscriberBinding((NestedScrollView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentMrtrPre2postInputSubscriberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPre2postInputSubscriberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_pre2post_input_subscriber, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83852a;
    }
}
