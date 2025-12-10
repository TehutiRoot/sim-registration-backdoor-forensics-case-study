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
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerExpandResultSubList;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMultiSimResultSubListBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMultiSimResultSubListBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83910a;
    @NonNull
    public final DtacRecyclerExpandResultSubList failList;
    @NonNull
    public final View line;
    @NonNull
    public final DtacRecyclerExpandResultSubList successList;

    public FragmentMrtrMultiSimResultSubListBinding(NestedScrollView nestedScrollView, DtacRecyclerExpandResultSubList dtacRecyclerExpandResultSubList, View view, DtacRecyclerExpandResultSubList dtacRecyclerExpandResultSubList2) {
        this.f83910a = nestedScrollView;
        this.failList = dtacRecyclerExpandResultSubList;
        this.line = view;
        this.successList = dtacRecyclerExpandResultSubList2;
    }

    @NonNull
    public static FragmentMrtrMultiSimResultSubListBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.failList;
        DtacRecyclerExpandResultSubList dtacRecyclerExpandResultSubList = (DtacRecyclerExpandResultSubList) ViewBindings.findChildViewById(view, i);
        if (dtacRecyclerExpandResultSubList != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
            i = R.id.successList;
            DtacRecyclerExpandResultSubList dtacRecyclerExpandResultSubList2 = (DtacRecyclerExpandResultSubList) ViewBindings.findChildViewById(view, i);
            if (dtacRecyclerExpandResultSubList2 != null) {
                return new FragmentMrtrMultiSimResultSubListBinding((NestedScrollView) view, dtacRecyclerExpandResultSubList, findChildViewById, dtacRecyclerExpandResultSubList2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMultiSimResultSubListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMultiSimResultSubListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_multi_sim_result_sub_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83910a;
    }
}