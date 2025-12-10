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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentShowPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentShowPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84193a;
    @NonNull
    public final RecyclerView packageListView;
    @NonNull
    public final DtacFontTextView warningMessage;

    public FragmentShowPackageBinding(FrameLayout frameLayout, RecyclerView recyclerView, DtacFontTextView dtacFontTextView) {
        this.f84193a = frameLayout;
        this.packageListView = recyclerView;
        this.warningMessage = dtacFontTextView;
    }

    @NonNull
    public static FragmentShowPackageBinding bind(@NonNull View view) {
        int i = R.id.packageListView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.warningMessage;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new FragmentShowPackageBinding((FrameLayout) view, recyclerView, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentShowPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentShowPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_show_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84193a;
    }
}
