package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMainPackageSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentMainPackageSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83761a;
    @NonNull
    public final ZIncludePackageSummaryBinding incPackageSummary;

    public FragmentMainPackageSummaryBinding(NestedScrollView nestedScrollView, ZIncludePackageSummaryBinding zIncludePackageSummaryBinding) {
        this.f83761a = nestedScrollView;
        this.incPackageSummary = zIncludePackageSummaryBinding;
    }

    @NonNull
    public static FragmentMainPackageSummaryBinding bind(@NonNull View view) {
        int i = R.id.incPackageSummary;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMainPackageSummaryBinding((NestedScrollView) view, ZIncludePackageSummaryBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMainPackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMainPackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_main_package_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83761a;
    }
}
