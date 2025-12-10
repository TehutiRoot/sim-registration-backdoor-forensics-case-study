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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeLikeBinding */
/* loaded from: classes7.dex */
public final class OneIncludeLikeBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84470a;
    @NonNull
    public final ImageView ivLike;
    @NonNull
    public final OneFontTextView tvCountLike;

    public OneIncludeLikeBinding(LinearLayout linearLayout, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f84470a = linearLayout;
        this.ivLike = imageView;
        this.tvCountLike = oneFontTextView;
    }

    @NonNull
    public static OneIncludeLikeBinding bind(@NonNull View view) {
        int i = R.id.ivLike;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvCountLike;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                return new OneIncludeLikeBinding((LinearLayout) view, imageView, oneFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeLikeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeLikeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_like, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84470a;
    }
}
