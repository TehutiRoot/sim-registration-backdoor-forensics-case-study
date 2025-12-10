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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPre2postAllPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPre2postAllPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83947a;
    @NonNull
    public final RecyclerView packageListView;
    @NonNull
    public final DtacFontTextView warningMessage;

    public FragmentMrtrPre2postAllPackageBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, DtacFontTextView dtacFontTextView) {
        this.f83947a = constraintLayout;
        this.packageListView = recyclerView;
        this.warningMessage = dtacFontTextView;
    }

    @NonNull
    public static FragmentMrtrPre2postAllPackageBinding bind(@NonNull View view) {
        int i = R.id.packageListView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.warningMessage;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new FragmentMrtrPre2postAllPackageBinding((ConstraintLayout) view, recyclerView, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPre2postAllPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPre2postAllPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_pre2post_all_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83947a;
    }
}