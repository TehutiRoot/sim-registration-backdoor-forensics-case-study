package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentShelfPackageViewBinding */
/* loaded from: classes7.dex */
public final class FragmentShelfPackageViewBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84296a;
    @NonNull
    public final LinearLayoutCompat backgroundShelf;
    @NonNull
    public final RecyclerView packageShelfListView;
    @NonNull
    public final DtacTabLayout tabShelfLayout;
    @NonNull
    public final DtacFontTextView textViewShelfTitle;

    public FragmentShelfPackageViewBinding(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, DtacTabLayout dtacTabLayout, DtacFontTextView dtacFontTextView) {
        this.f84296a = constraintLayout;
        this.backgroundShelf = linearLayoutCompat;
        this.packageShelfListView = recyclerView;
        this.tabShelfLayout = dtacTabLayout;
        this.textViewShelfTitle = dtacFontTextView;
    }

    @NonNull
    public static FragmentShelfPackageViewBinding bind(@NonNull View view) {
        int i = R.id.backgroundShelf;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.packageShelfListView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.tabShelfLayout;
                DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                if (dtacTabLayout != null) {
                    i = R.id.textViewShelfTitle;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new FragmentShelfPackageViewBinding((ConstraintLayout) view, linearLayoutCompat, recyclerView, dtacTabLayout, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentShelfPackageViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentShelfPackageViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_shelf_package_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84296a;
    }
}