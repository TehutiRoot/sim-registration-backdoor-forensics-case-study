package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogFragmentChangeMainPackBinding */
/* loaded from: classes7.dex */
public final class DialogFragmentChangeMainPackBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83718a;
    @NonNull
    public final FrameLayout contentLayout;
    @NonNull
    public final CoordinatorLayout coordinator;
    @NonNull
    public final RecyclerView recyclerViewContent;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final DtacFontTextView tvToolbarTitle;

    public DialogFragmentChangeMainPackBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, CoordinatorLayout coordinatorLayout2, RecyclerView recyclerView, DtacToolbar dtacToolbar, DtacFontTextView dtacFontTextView) {
        this.f83718a = coordinatorLayout;
        this.contentLayout = frameLayout;
        this.coordinator = coordinatorLayout2;
        this.recyclerViewContent = recyclerView;
        this.toolbar = dtacToolbar;
        this.tvToolbarTitle = dtacFontTextView;
    }

    @NonNull
    public static DialogFragmentChangeMainPackBinding bind(@NonNull View view) {
        int i = R.id.contentLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i = R.id.recyclerViewContent;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.toolbar;
                DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
                if (dtacToolbar != null) {
                    i = R.id.tv_toolbar_title;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new DialogFragmentChangeMainPackBinding(coordinatorLayout, frameLayout, coordinatorLayout, recyclerView, dtacToolbar, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogFragmentChangeMainPackBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogFragmentChangeMainPackBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fragment_change_main_pack, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83718a;
    }
}