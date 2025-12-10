package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRegisterManySimRBinding */
/* loaded from: classes7.dex */
public final class FragmentRegisterManySimRBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84159a;
    @NonNull
    public final RecyclerView recyclerViewSimList;

    public FragmentRegisterManySimRBinding(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f84159a = frameLayout;
        this.recyclerViewSimList = recyclerView;
    }

    @NonNull
    public static FragmentRegisterManySimRBinding bind(@NonNull View view) {
        int i = R.id.recyclerViewSimList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new FragmentRegisterManySimRBinding((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRegisterManySimRBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRegisterManySimRBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_register_many_sim_r, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84159a;
    }
}
