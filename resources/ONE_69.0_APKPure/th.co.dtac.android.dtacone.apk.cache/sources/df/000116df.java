package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOwnerDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentOwnerDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84238a;
    @NonNull
    public final ZOwnerDetailItemRowBinding boxOwnerProfile;
    @NonNull
    public final DtacFontButton btnDelete;
    @NonNull
    public final CardView cardviewLastLogin;
    @NonNull
    public final DtacRecyclerView recyclerViewTransaction;
    @NonNull
    public final CoordinatorLayout rootLayout;
    @NonNull
    public final AppBarLayout stvPhoenixAppBar;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;
    @NonNull
    public final DtacFontTextView tvLastLogin;

    public FragmentOwnerDetailBinding(FrameLayout frameLayout, ZOwnerDetailItemRowBinding zOwnerDetailItemRowBinding, DtacFontButton dtacFontButton, CardView cardView, DtacRecyclerView dtacRecyclerView, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, DtacSwipeRefresh dtacSwipeRefresh, DtacFontTextView dtacFontTextView) {
        this.f84238a = frameLayout;
        this.boxOwnerProfile = zOwnerDetailItemRowBinding;
        this.btnDelete = dtacFontButton;
        this.cardviewLastLogin = cardView;
        this.recyclerViewTransaction = dtacRecyclerView;
        this.rootLayout = coordinatorLayout;
        this.stvPhoenixAppBar = appBarLayout;
        this.swipeRefresh = dtacSwipeRefresh;
        this.tvLastLogin = dtacFontTextView;
    }

    @NonNull
    public static FragmentOwnerDetailBinding bind(@NonNull View view) {
        int i = R.id.box_owner_profile;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZOwnerDetailItemRowBinding bind = ZOwnerDetailItemRowBinding.bind(findChildViewById);
            i = R.id.btnDelete;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.cardview_last_login;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.recyclerViewTransaction;
                    DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                    if (dtacRecyclerView != null) {
                        i = R.id.rootLayout;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                        if (coordinatorLayout != null) {
                            i = R.id.stv_phoenix_app_bar;
                            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
                            if (appBarLayout != null) {
                                i = R.id.swipeRefresh;
                                DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                                if (dtacSwipeRefresh != null) {
                                    i = R.id.tv_last_login;
                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView != null) {
                                        return new FragmentOwnerDetailBinding((FrameLayout) view, bind, dtacFontButton, cardView, dtacRecyclerView, coordinatorLayout, appBarLayout, dtacSwipeRefresh, dtacFontTextView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOwnerDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOwnerDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_owner_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84238a;
    }
}