package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneOwnerManagementUserBinding */
/* loaded from: classes7.dex */
public final class ItemOneOwnerManagementUserBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84469a;
    @NonNull
    public final AppCompatImageView ownerImageView;
    @NonNull
    public final OneFontTextView ownerRegisterDateTextView;
    @NonNull
    public final OneFontTextView ownerRegisterTimeTextView;
    @NonNull
    public final OneFontTextView ownerUserIdTextView;
    @NonNull
    public final AppCompatImageView userItemArrowImageView;

    public ItemOneOwnerManagementUserBinding(CardView cardView, AppCompatImageView appCompatImageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, AppCompatImageView appCompatImageView2) {
        this.f84469a = cardView;
        this.ownerImageView = appCompatImageView;
        this.ownerRegisterDateTextView = oneFontTextView;
        this.ownerRegisterTimeTextView = oneFontTextView2;
        this.ownerUserIdTextView = oneFontTextView3;
        this.userItemArrowImageView = appCompatImageView2;
    }

    @NonNull
    public static ItemOneOwnerManagementUserBinding bind(@NonNull View view) {
        int i = R.id.ownerImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.ownerRegisterDateTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.ownerRegisterTimeTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.ownerUserIdTextView;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.userItemArrowImageView;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView2 != null) {
                            return new ItemOneOwnerManagementUserBinding((CardView) view, appCompatImageView, oneFontTextView, oneFontTextView2, oneFontTextView3, appCompatImageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneOwnerManagementUserBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneOwnerManagementUserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_owner_management_user, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84469a;
    }
}