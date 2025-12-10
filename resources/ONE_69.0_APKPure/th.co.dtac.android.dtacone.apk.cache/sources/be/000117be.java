package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneFilterHeaderBinding */
/* loaded from: classes7.dex */
public final class ItemOneFilterHeaderBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84461a;
    @NonNull
    public final ImageView closeFilterImageView;
    @NonNull
    public final OneFontTextView headerTitleTextView;

    public ItemOneFilterHeaderBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f84461a = constraintLayout;
        this.closeFilterImageView = imageView;
        this.headerTitleTextView = oneFontTextView;
    }

    @NonNull
    public static ItemOneFilterHeaderBinding bind(@NonNull View view) {
        int i = R.id.closeFilterImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.headerTitleTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                return new ItemOneFilterHeaderBinding((ConstraintLayout) view, imageView, oneFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneFilterHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneFilterHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_filter_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84461a;
    }
}