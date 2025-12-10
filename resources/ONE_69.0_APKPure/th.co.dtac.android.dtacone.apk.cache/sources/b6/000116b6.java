package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePhoneBookEditText;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRectifyListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRectifyListBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84197a;
    @NonNull
    public final ImageView btnClearPhoneText;
    @NonNull
    public final OneFontTextView message;
    @NonNull
    public final OnePhoneBookEditText onePhoneBookEditText;
    @NonNull
    public final CoordinatorLayout rootLayout;
    @NonNull
    public final RecyclerView rvRectify;
    @NonNull
    public final AppBarLayout stvPhoenixAppBar;
    @NonNull
    public final DtacSwipeRefresh swipeContainer;

    public FragmentOneRectifyListBinding(FrameLayout frameLayout, ImageView imageView, OneFontTextView oneFontTextView, OnePhoneBookEditText onePhoneBookEditText, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, AppBarLayout appBarLayout, DtacSwipeRefresh dtacSwipeRefresh) {
        this.f84197a = frameLayout;
        this.btnClearPhoneText = imageView;
        this.message = oneFontTextView;
        this.onePhoneBookEditText = onePhoneBookEditText;
        this.rootLayout = coordinatorLayout;
        this.rvRectify = recyclerView;
        this.stvPhoenixAppBar = appBarLayout;
        this.swipeContainer = dtacSwipeRefresh;
    }

    @NonNull
    public static FragmentOneRectifyListBinding bind(@NonNull View view) {
        int i = R.id.btnClearPhoneText;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.message;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.onePhoneBookEditText;
                OnePhoneBookEditText onePhoneBookEditText = (OnePhoneBookEditText) ViewBindings.findChildViewById(view, i);
                if (onePhoneBookEditText != null) {
                    i = R.id.rootLayout;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                    if (coordinatorLayout != null) {
                        i = R.id.rvRectify;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.stv_phoenix_app_bar;
                            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
                            if (appBarLayout != null) {
                                i = R.id.swipeContainer;
                                DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                                if (dtacSwipeRefresh != null) {
                                    return new FragmentOneRectifyListBinding((FrameLayout) view, imageView, oneFontTextView, onePhoneBookEditText, coordinatorLayout, recyclerView, appBarLayout, dtacSwipeRefresh);
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
    public static FragmentOneRectifyListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRectifyListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_rectify_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84197a;
    }
}