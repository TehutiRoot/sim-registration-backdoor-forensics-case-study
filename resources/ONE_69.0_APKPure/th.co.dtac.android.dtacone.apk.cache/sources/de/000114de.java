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

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogFragmentOnlineRegistAddressBinding */
/* loaded from: classes7.dex */
public final class DialogFragmentOnlineRegistAddressBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83721a;
    @NonNull
    public final FrameLayout contentLayout;
    @NonNull
    public final FrameLayout contentLayoutSecond;
    @NonNull
    public final CoordinatorLayout coordinator;
    @NonNull
    public final RecyclerView recyclerViewContent;
    @NonNull
    public final RecyclerView recyclerViewContentSecond;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final DtacFontTextView tvToolbarTitle;

    public DialogFragmentOnlineRegistAddressBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, FrameLayout frameLayout2, CoordinatorLayout coordinatorLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, DtacToolbar dtacToolbar, DtacFontTextView dtacFontTextView) {
        this.f83721a = coordinatorLayout;
        this.contentLayout = frameLayout;
        this.contentLayoutSecond = frameLayout2;
        this.coordinator = coordinatorLayout2;
        this.recyclerViewContent = recyclerView;
        this.recyclerViewContentSecond = recyclerView2;
        this.toolbar = dtacToolbar;
        this.tvToolbarTitle = dtacFontTextView;
    }

    @NonNull
    public static DialogFragmentOnlineRegistAddressBinding bind(@NonNull View view) {
        int i = R.id.contentLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.contentLayoutSecond;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                i = R.id.recyclerViewContent;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.recyclerViewContentSecond;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView2 != null) {
                        i = R.id.toolbar;
                        DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
                        if (dtacToolbar != null) {
                            i = R.id.tv_toolbar_title;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                return new DialogFragmentOnlineRegistAddressBinding(coordinatorLayout, frameLayout, frameLayout2, coordinatorLayout, recyclerView, recyclerView2, dtacToolbar, dtacFontTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogFragmentOnlineRegistAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogFragmentOnlineRegistAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fragment_online_regist_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83721a;
    }
}