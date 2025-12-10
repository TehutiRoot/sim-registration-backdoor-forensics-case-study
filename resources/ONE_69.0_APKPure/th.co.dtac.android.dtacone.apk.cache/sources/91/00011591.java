package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMultiSimInprogressBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMultiSimInprogressBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83903a;
    @NonNull
    public final DtacFontTextView dtacFontTextView60;
    @NonNull
    public final DtacFontTextView dtacFontTextView61;
    @NonNull
    public final DtacFontTextView dtacFontTextView63;
    @NonNull
    public final ImageView imageView37;
    @NonNull
    public final ImageView imageView38;
    @NonNull
    public final ImageView imageView39;
    @NonNull
    public final DtacFontTextView label1;
    @NonNull
    public final ConstraintLayout layoutFailed;
    @NonNull
    public final ConstraintLayout layoutSuccess;
    @NonNull
    public final LinearLayout linearLayout11;
    @NonNull
    public final ProgressBar progress;
    @NonNull
    public final DtacFontTextView tvErrorCount;
    @NonNull
    public final DtacFontTextView tvPercent;
    @NonNull
    public final DtacFontTextView tvSuccessCount;

    public FragmentMrtrMultiSimInprogressBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, ImageView imageView, ImageView imageView2, ImageView imageView3, DtacFontTextView dtacFontTextView4, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, LinearLayout linearLayout, ProgressBar progressBar, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7) {
        this.f83903a = constraintLayout;
        this.dtacFontTextView60 = dtacFontTextView;
        this.dtacFontTextView61 = dtacFontTextView2;
        this.dtacFontTextView63 = dtacFontTextView3;
        this.imageView37 = imageView;
        this.imageView38 = imageView2;
        this.imageView39 = imageView3;
        this.label1 = dtacFontTextView4;
        this.layoutFailed = constraintLayout2;
        this.layoutSuccess = constraintLayout3;
        this.linearLayout11 = linearLayout;
        this.progress = progressBar;
        this.tvErrorCount = dtacFontTextView5;
        this.tvPercent = dtacFontTextView6;
        this.tvSuccessCount = dtacFontTextView7;
    }

    @NonNull
    public static FragmentMrtrMultiSimInprogressBinding bind(@NonNull View view) {
        int i = R.id.dtacFontTextView60;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.dtacFontTextView61;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.dtacFontTextView63;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.imageView37;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.imageView38;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.imageView39;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.label1;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    i = R.id.layoutFailed;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.layoutSuccess;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = R.id.linearLayout11;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = R.id.progress;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                                if (progressBar != null) {
                                                    i = R.id.tvErrorCount;
                                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView5 != null) {
                                                        i = R.id.tvPercent;
                                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView6 != null) {
                                                            i = R.id.tvSuccessCount;
                                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView7 != null) {
                                                                return new FragmentMrtrMultiSimInprogressBinding((ConstraintLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, imageView, imageView2, imageView3, dtacFontTextView4, constraintLayout, constraintLayout2, linearLayout, progressBar, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMultiSimInprogressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMultiSimInprogressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_multi_sim_inprogress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83903a;
    }
}