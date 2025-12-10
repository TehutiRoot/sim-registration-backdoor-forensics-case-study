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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneFilterBinding */
/* loaded from: classes7.dex */
public final class ItemOneFilterBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84460a;
    @NonNull
    public final OneFontTextView filterTitleItemTextView;
    @NonNull
    public final View spaceView;
    @NonNull
    public final ImageView statusImageView;

    public ItemOneFilterBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, View view, ImageView imageView) {
        this.f84460a = constraintLayout;
        this.filterTitleItemTextView = oneFontTextView;
        this.spaceView = view;
        this.statusImageView = imageView;
    }

    @NonNull
    public static ItemOneFilterBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.filterTitleItemTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.spaceView))) != null) {
            i = R.id.statusImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new ItemOneFilterBinding((ConstraintLayout) view, oneFontTextView, findChildViewById, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneFilterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneFilterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84460a;
    }
}