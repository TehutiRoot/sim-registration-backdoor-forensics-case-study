package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangePackSubscriberBinding */
/* loaded from: classes7.dex */
public final class FragmentChangePackSubscriberBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83670a;

    public FragmentChangePackSubscriberBinding(ConstraintLayout constraintLayout) {
        this.f83670a = constraintLayout;
    }

    @NonNull
    public static FragmentChangePackSubscriberBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentChangePackSubscriberBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentChangePackSubscriberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangePackSubscriberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_pack_subscriber, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83670a;
    }
}
