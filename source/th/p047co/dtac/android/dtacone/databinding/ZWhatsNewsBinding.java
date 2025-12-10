package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.p020zl.reik.dilatingdotsprogressbar.DilatingDotsProgressBar;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZWhatsNewsBinding */
/* loaded from: classes7.dex */
public final class ZWhatsNewsBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84713a;
    @NonNull
    public final AppCompatImageView ivBanner;
    @NonNull
    public final DilatingDotsProgressBar progress;
    @NonNull
    public final DtacFontTextView tvLaterUpdate;
    @NonNull
    public final DtacFontTextView tvUpdate;

    public ZWhatsNewsBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, DilatingDotsProgressBar dilatingDotsProgressBar, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84713a = linearLayout;
        this.ivBanner = appCompatImageView;
        this.progress = dilatingDotsProgressBar;
        this.tvLaterUpdate = dtacFontTextView;
        this.tvUpdate = dtacFontTextView2;
    }

    @NonNull
    public static ZWhatsNewsBinding bind(@NonNull View view) {
        int i = R.id.ivBanner;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.progress;
            DilatingDotsProgressBar dilatingDotsProgressBar = (DilatingDotsProgressBar) ViewBindings.findChildViewById(view, i);
            if (dilatingDotsProgressBar != null) {
                i = R.id.tvLaterUpdate;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvUpdate;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new ZWhatsNewsBinding((LinearLayout) view, appCompatImageView, dilatingDotsProgressBar, dtacFontTextView, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZWhatsNewsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZWhatsNewsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_whats_news, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84713a;
    }
}
