package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneOtherMenuItemBinding */
/* loaded from: classes7.dex */
public final class ItemOneOtherMenuItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84357a;
    @NonNull
    public final AppCompatImageView ivLeftIcon;
    @NonNull
    public final AppCompatImageView ivRightIcon;
    @NonNull
    public final ConstraintLayout layoutOtherMenu;
    @NonNull
    public final OneFontTextView tvTitleMenu;
    @NonNull
    public final View vSeparateItem;

    public ItemOneOtherMenuItemBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, View view) {
        this.f84357a = constraintLayout;
        this.ivLeftIcon = appCompatImageView;
        this.ivRightIcon = appCompatImageView2;
        this.layoutOtherMenu = constraintLayout2;
        this.tvTitleMenu = oneFontTextView;
        this.vSeparateItem = view;
    }

    @NonNull
    public static ItemOneOtherMenuItemBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivLeftIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.ivRightIcon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.tvTitleMenu;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateItem))) != null) {
                    return new ItemOneOtherMenuItemBinding(constraintLayout, appCompatImageView, appCompatImageView2, constraintLayout, oneFontTextView, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneOtherMenuItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneOtherMenuItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_other_menu_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84357a;
    }
}
