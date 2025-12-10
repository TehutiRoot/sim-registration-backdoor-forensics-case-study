package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;

/* renamed from: th.co.dtac.android.dtacone.databinding.MrtrTransparentToolbarBinding */
/* loaded from: classes7.dex */
public final class MrtrTransparentToolbarBinding implements ViewBinding {

    /* renamed from: a */
    public final AppBarLayout f84418a;
    @NonNull
    public final AppBarLayout appBarTransparentLayout;
    @NonNull
    public final DtacToolbar toolbarTransparent;
    @NonNull
    public final DtacFontTextView tvToolbarTransparentTitle;

    public MrtrTransparentToolbarBinding(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, DtacToolbar dtacToolbar, DtacFontTextView dtacFontTextView) {
        this.f84418a = appBarLayout;
        this.appBarTransparentLayout = appBarLayout2;
        this.toolbarTransparent = dtacToolbar;
        this.tvToolbarTransparentTitle = dtacFontTextView;
    }

    @NonNull
    public static MrtrTransparentToolbarBinding bind(@NonNull View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i = R.id.toolbarTransparent;
        DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
        if (dtacToolbar != null) {
            i = R.id.tvToolbarTransparentTitle;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new MrtrTransparentToolbarBinding(appBarLayout, appBarLayout, dtacToolbar, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static MrtrTransparentToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MrtrTransparentToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mrtr_transparent_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppBarLayout getRoot() {
        return this.f84418a;
    }
}
