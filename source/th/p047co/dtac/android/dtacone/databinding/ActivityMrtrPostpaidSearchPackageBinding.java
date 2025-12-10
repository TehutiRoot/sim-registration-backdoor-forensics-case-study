package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityMrtrPostpaidSearchPackageBinding */
/* loaded from: classes7.dex */
public final class ActivityMrtrPostpaidSearchPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83523a;
    @NonNull
    public final AppBarLayout appBarLayout4;
    @NonNull
    public final EditText edtSearchBox;
    @NonNull
    public final ImageView imageView16;
    @NonNull
    public final DtacToolbar innerToolbar;
    @NonNull
    public final ConstraintLayout linearLayout5;
    @NonNull
    public final ConstraintLayout linearLayout6;
    @NonNull
    public final ProgressBar progressBar;
    @NonNull
    public final RecyclerView recyclerViewSearch;
    @NonNull
    public final DtacFontTextView tvCancel;
    @NonNull
    public final DtacFontTextView warningMessage;
    @NonNull
    public final DtacFontTextView warningMessageNoDta;

    public ActivityMrtrPostpaidSearchPackageBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, EditText editText, ImageView imageView, DtacToolbar dtacToolbar, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ProgressBar progressBar, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83523a = constraintLayout;
        this.appBarLayout4 = appBarLayout;
        this.edtSearchBox = editText;
        this.imageView16 = imageView;
        this.innerToolbar = dtacToolbar;
        this.linearLayout5 = constraintLayout2;
        this.linearLayout6 = constraintLayout3;
        this.progressBar = progressBar;
        this.recyclerViewSearch = recyclerView;
        this.tvCancel = dtacFontTextView;
        this.warningMessage = dtacFontTextView2;
        this.warningMessageNoDta = dtacFontTextView3;
    }

    @NonNull
    public static ActivityMrtrPostpaidSearchPackageBinding bind(@NonNull View view) {
        int i = R.id.appBarLayout4;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = R.id.edtSearchBox;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
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
                                i = R.id.progressBar;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                if (progressBar != null) {
                                    i = R.id.recyclerViewSearch;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        i = R.id.tvCancel;
                                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView != null) {
                                            i = R.id.warningMessage;
                                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView2 != null) {
                                                i = R.id.warningMessageNoDta;
                                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView3 != null) {
                                                    return new ActivityMrtrPostpaidSearchPackageBinding((ConstraintLayout) view, appBarLayout, editText, imageView, dtacToolbar, constraintLayout, constraintLayout2, progressBar, recyclerView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static ActivityMrtrPostpaidSearchPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMrtrPostpaidSearchPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_mrtr_postpaid_search_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83523a;
    }
}
