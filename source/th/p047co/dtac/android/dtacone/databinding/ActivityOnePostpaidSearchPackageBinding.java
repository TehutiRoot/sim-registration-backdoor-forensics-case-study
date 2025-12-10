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
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOnePostpaidSearchPackageBinding */
/* loaded from: classes7.dex */
public final class ActivityOnePostpaidSearchPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83552a;
    @NonNull
    public final AppBarLayout appBarLayout4;
    @NonNull
    public final ImageView imageView16;
    @NonNull
    public final DtacToolbar innerToolbar;
    @NonNull
    public final ConstraintLayout linearLayout5;
    @NonNull
    public final ConstraintLayout linearLayout6;
    @NonNull
    public final OneEditText onePostpaidEdtSearchBox;
    @NonNull
    public final RecyclerView onePostpaidRecyclerViewSearch;
    @NonNull
    public final OneFontTextView onePostpaidTvCancel;
    @NonNull
    public final OneFontTextView onePostpaidWarningMessage;
    @NonNull
    public final OneFontTextView onePostpaidWarningMessageNoData;
    @NonNull
    public final ProgressBar progressBar;

    public ActivityOnePostpaidSearchPackageBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ImageView imageView, DtacToolbar dtacToolbar, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, OneEditText oneEditText, RecyclerView recyclerView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, ProgressBar progressBar) {
        this.f83552a = constraintLayout;
        this.appBarLayout4 = appBarLayout;
        this.imageView16 = imageView;
        this.innerToolbar = dtacToolbar;
        this.linearLayout5 = constraintLayout2;
        this.linearLayout6 = constraintLayout3;
        this.onePostpaidEdtSearchBox = oneEditText;
        this.onePostpaidRecyclerViewSearch = recyclerView;
        this.onePostpaidTvCancel = oneFontTextView;
        this.onePostpaidWarningMessage = oneFontTextView2;
        this.onePostpaidWarningMessageNoData = oneFontTextView3;
        this.progressBar = progressBar;
    }

    @NonNull
    public static ActivityOnePostpaidSearchPackageBinding bind(@NonNull View view) {
        int i = R.id.appBarLayout4;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = R.id.imageView16;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.inner_toolbar;
                DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
                if (dtacToolbar != null) {
                    i = R.id.linearLayout5;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.linearLayout6;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            i = R.id.onePostpaidEdtSearchBox;
                            OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
                            if (oneEditText != null) {
                                i = R.id.onePostpaidRecyclerViewSearch;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = R.id.onePostpaidTvCancel;
                                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView != null) {
                                        i = R.id.onePostpaidWarningMessage;
                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView2 != null) {
                                            i = R.id.onePostpaidWarningMessageNoData;
                                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView3 != null) {
                                                i = R.id.progressBar;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                                if (progressBar != null) {
                                                    return new ActivityOnePostpaidSearchPackageBinding((ConstraintLayout) view, appBarLayout, imageView, dtacToolbar, constraintLayout, constraintLayout2, oneEditText, recyclerView, oneFontTextView, oneFontTextView2, oneFontTextView3, progressBar);
                                                }
                                            }
                                        }
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
    public static ActivityOnePostpaidSearchPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOnePostpaidSearchPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_postpaid_search_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83552a;
    }
}
