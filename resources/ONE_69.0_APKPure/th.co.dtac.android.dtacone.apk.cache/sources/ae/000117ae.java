package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneAddBankAccountBinding */
/* loaded from: classes7.dex */
public final class ItemOneAddBankAccountBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84445a;
    @NonNull
    public final AppCompatImageView addBankAccountBankBandImageView;
    @NonNull
    public final ImageView addBankAccountImageView;
    @NonNull
    public final ConstraintLayout addBankAccountLayout;
    @NonNull
    public final OneFontTextView addBankAccountNameAccountTextView;
    @NonNull
    public final ConstraintLayout bankAccountItem;

    public ItemOneAddBankAccountBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout3) {
        this.f84445a = constraintLayout;
        this.addBankAccountBankBandImageView = appCompatImageView;
        this.addBankAccountImageView = imageView;
        this.addBankAccountLayout = constraintLayout2;
        this.addBankAccountNameAccountTextView = oneFontTextView;
        this.bankAccountItem = constraintLayout3;
    }

    @NonNull
    public static ItemOneAddBankAccountBinding bind(@NonNull View view) {
        int i = R.id.addBankAccountBankBandImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.addBankAccountImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.addBankAccountLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.addBankAccountNameAccountTextView;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        return new ItemOneAddBankAccountBinding(constraintLayout2, appCompatImageView, imageView, constraintLayout, oneFontTextView, constraintLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneAddBankAccountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneAddBankAccountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_add_bank_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84445a;
    }
}