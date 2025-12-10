package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentSuspendInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentSuspendInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84208a;
    @NonNull
    public final RecyclerView suspendInfoList;

    public FragmentSuspendInfoBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f84208a = constraintLayout;
        this.suspendInfoList = recyclerView;
    }

    @NonNull
    public static FragmentSuspendInfoBinding bind(@NonNull View view) {
        int i = R.id.suspendInfoList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new FragmentSuspendInfoBinding((ConstraintLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSuspendInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSuspendInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_suspend_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84208a;
    }
}
