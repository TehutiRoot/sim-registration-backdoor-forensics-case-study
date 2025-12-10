package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2postSearchPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2postSearchPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84180a;
    @NonNull
    public final AppBarLayout onePre2PostAppBarLayout;
    @NonNull
    public final OneFontTextView onePre2PostCancelSearchTextView;
    @NonNull
    public final OneFontTextView onePre2PostNotFoundTextView;
    @NonNull
    public final OneEditText onePre2PostSearchPackageEditText;
    @NonNull
    public final ImageView onePre2PostSearchPackageImageView;
    @NonNull
    public final RecyclerView onePre2PostSearchPackageRecyclerView;
    @NonNull
    public final OneFontTextView onePre2PostWarningMessageTextView;
    @NonNull
    public final ProgressBar progressBar;

    public FragmentOnePre2postSearchPackageBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneEditText oneEditText, ImageView imageView, RecyclerView recyclerView, OneFontTextView oneFontTextView3, ProgressBar progressBar) {
        this.f84180a = constraintLayout;
        this.onePre2PostAppBarLayout = appBarLayout;
        this.onePre2PostCancelSearchTextView = oneFontTextView;
        this.onePre2PostNotFoundTextView = oneFontTextView2;
        this.onePre2PostSearchPackageEditText = oneEditText;
        this.onePre2PostSearchPackageImageView = imageView;
        this.onePre2PostSearchPackageRecyclerView = recyclerView;
        this.onePre2PostWarningMessageTextView = oneFontTextView3;
        this.progressBar = progressBar;
    }

    @NonNull
    public static FragmentOnePre2postSearchPackageBinding bind(@NonNull View view) {
        int i = R.id.onePre2PostAppBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = R.id.onePre2PostCancelSearchTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.onePre2PostNotFoundTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.onePre2PostSearchPackageEditText;
                    OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
                    if (oneEditText != null) {
                        i = R.id.onePre2PostSearchPackageImageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.onePre2PostSearchPackageRecyclerView;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.onePre2PostWarningMessageTextView;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.progressBar;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                    if (progressBar != null) {
                                        return new FragmentOnePre2postSearchPackageBinding((ConstraintLayout) view, appBarLayout, oneFontTextView, oneFontTextView2, oneEditText, imageView, recyclerView, oneFontTextView3, progressBar);
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
    public static FragmentOnePre2postSearchPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2postSearchPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2post_search_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84180a;
    }
}