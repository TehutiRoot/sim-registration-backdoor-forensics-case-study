package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeIconKeywordLayoutBinding */
/* loaded from: classes7.dex */
public final class IncludeIconKeywordLayoutBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84342a;
    @NonNull
    public final ImageView ivAppIcon;

    public IncludeIconKeywordLayoutBinding(LinearLayout linearLayout, ImageView imageView) {
        this.f84342a = linearLayout;
        this.ivAppIcon = imageView;
    }

    @NonNull
    public static IncludeIconKeywordLayoutBinding bind(@NonNull View view) {
        int i = R.id.ivAppIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new IncludeIconKeywordLayoutBinding((LinearLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeIconKeywordLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeIconKeywordLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_icon_keyword_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84342a;
    }
}