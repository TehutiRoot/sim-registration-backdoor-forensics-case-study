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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentServiceListBinding */
/* loaded from: classes7.dex */
public final class FragmentServiceListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84190a;
    @NonNull
    public final RecyclerView serviceList;
    @NonNull
    public final DtacFontTextView serviceListLabel;

    public FragmentServiceListBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, DtacFontTextView dtacFontTextView) {
        this.f84190a = constraintLayout;
        this.serviceList = recyclerView;
        this.serviceListLabel = dtacFontTextView;
    }

    @NonNull
    public static FragmentServiceListBinding bind(@NonNull View view) {
        int i = R.id.serviceList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.serviceListLabel;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new FragmentServiceListBinding((ConstraintLayout) view, recyclerView, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentServiceListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentServiceListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_service_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84190a;
    }
}
