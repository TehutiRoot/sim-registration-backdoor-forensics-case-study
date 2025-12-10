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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeLikeBinding */
/* loaded from: classes7.dex */
public final class ZIncludeLikeBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84623a;
    @NonNull
    public final ImageView ivLike;
    @NonNull
    public final DtacFontTextView tvCountLike;

    public ZIncludeLikeBinding(LinearLayout linearLayout, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f84623a = linearLayout;
        this.ivLike = imageView;
        this.tvCountLike = dtacFontTextView;
    }

    @NonNull
    public static ZIncludeLikeBinding bind(@NonNull View view) {
        int i = R.id.ivLike;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvCountLike;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new ZIncludeLikeBinding((LinearLayout) view, imageView, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeLikeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeLikeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_like, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84623a;
    }
}
