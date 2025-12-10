package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimInProgressBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimInProgressBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83722a;
    @NonNull
    public final DtacFontTextView dtacFontTextView60;
    @NonNull
    public final ImageView imageView37;
    @NonNull
    public final ProgressBar progress;
    @NonNull
    public final DtacFontTextView tvPercent;

    public FragmentEsimInProgressBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, ImageView imageView, ProgressBar progressBar, DtacFontTextView dtacFontTextView2) {
        this.f83722a = constraintLayout;
        this.dtacFontTextView60 = dtacFontTextView;
        this.imageView37 = imageView;
        this.progress = progressBar;
        this.tvPercent = dtacFontTextView2;
    }

    @NonNull
    public static FragmentEsimInProgressBinding bind(@NonNull View view) {
        int i = R.id.dtacFontTextView60;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.imageView37;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.tvPercent;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new FragmentEsimInProgressBinding((ConstraintLayout) view, dtacFontTextView, imageView, progressBar, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEsimInProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimInProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_in_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83722a;
    }
}
