package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidNiceNumberTrueBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidNiceNumberTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84032a;
    @NonNull
    public final OneIncludeNiceNumberTrueBinding incNiceNumber;

    public FragmentOnePostpaidNiceNumberTrueBinding(FrameLayout frameLayout, OneIncludeNiceNumberTrueBinding oneIncludeNiceNumberTrueBinding) {
        this.f84032a = frameLayout;
        this.incNiceNumber = oneIncludeNiceNumberTrueBinding;
    }

    @NonNull
    public static FragmentOnePostpaidNiceNumberTrueBinding bind(@NonNull View view) {
        int i = R.id.incNiceNumber;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePostpaidNiceNumberTrueBinding((FrameLayout) view, OneIncludeNiceNumberTrueBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidNiceNumberTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidNiceNumberTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_nice_number_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84032a;
    }
}
