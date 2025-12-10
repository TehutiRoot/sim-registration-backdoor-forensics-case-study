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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDolSimRListBinding */
/* loaded from: classes7.dex */
public final class FragmentDolSimRListBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83805a;
    @NonNull
    public final RecyclerView recyclerViewSimRList;

    public FragmentDolSimRListBinding(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f83805a = frameLayout;
        this.recyclerViewSimRList = recyclerView;
    }

    @NonNull
    public static FragmentDolSimRListBinding bind(@NonNull View view) {
        int i = R.id.recyclerViewSimRList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new FragmentDolSimRListBinding((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDolSimRListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDolSimRListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dol_sim_r_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83805a;
    }
}