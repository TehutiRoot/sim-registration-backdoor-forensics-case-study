package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRectifyPhoneFoundListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRectifyPhoneFoundListBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84198a;
    @NonNull
    public final ImageView icPhone;
    @NonNull
    public final LinearLayoutCompat llvConfirmSubscriberNumber;
    @NonNull
    public final OneFontTextView message;
    @NonNull
    public final CoordinatorLayout rootLayout;
    @NonNull
    public final RecyclerView rvRectify;
    @NonNull
    public final AppBarLayout stvPhoenixAppBar;
    @NonNull
    public final OneFontTextView tvConfirmSubscriberNumber;

    public FragmentOneRectifyPhoneFoundListBinding(FrameLayout frameLayout, ImageView imageView, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, AppBarLayout appBarLayout, OneFontTextView oneFontTextView2) {
        this.f84198a = frameLayout;
        this.icPhone = imageView;
        this.llvConfirmSubscriberNumber = linearLayoutCompat;
        this.message = oneFontTextView;
        this.rootLayout = coordinatorLayout;
        this.rvRectify = recyclerView;
        this.stvPhoenixAppBar = appBarLayout;
        this.tvConfirmSubscriberNumber = oneFontTextView2;
    }

    @NonNull
    public static FragmentOneRectifyPhoneFoundListBinding bind(@NonNull View view) {
        int i = R.id.icPhone;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.llv_confirm_subscriber_number;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.message;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.rootLayout;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                    if (coordinatorLayout != null) {
                        i = R.id.rvRectify;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.stv_phoenix_app_bar;
                            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
                            if (appBarLayout != null) {
                                i = R.id.tv_confirm_subscriber_number;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    return new FragmentOneRectifyPhoneFoundListBinding((FrameLayout) view, imageView, linearLayoutCompat, oneFontTextView, coordinatorLayout, recyclerView, appBarLayout, oneFontTextView2);
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
    public static FragmentOneRectifyPhoneFoundListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRectifyPhoneFoundListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_rectify_phone_found_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84198a;
    }
}