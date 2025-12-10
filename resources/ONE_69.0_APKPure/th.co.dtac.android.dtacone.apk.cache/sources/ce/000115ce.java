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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidReregistFormBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidReregistFormBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83965a;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final NestedScrollView scrollView;

    public FragmentMrtrPrepaidReregistFormBinding(NestedScrollView nestedScrollView, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding, NestedScrollView nestedScrollView2) {
        this.f83965a = nestedScrollView;
        this.btnOpenSmartCard = zIncludeSwitchModeCameraBinding;
        this.scrollView = nestedScrollView2;
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistFormBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            return new FragmentMrtrPrepaidReregistFormBinding(nestedScrollView, ZIncludeSwitchModeCameraBinding.bind(findChildViewById), nestedScrollView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_reregist_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83965a;
    }
}