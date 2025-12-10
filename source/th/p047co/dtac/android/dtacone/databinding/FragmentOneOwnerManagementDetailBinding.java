package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOwnerManagementDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOwnerManagementDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84010a;
    @NonNull
    public final OneFontButton deleteOwnerButton;
    @NonNull
    public final CardView deleteUserLayout;
    @NonNull
    public final AppCompatImageView ownerDetailImageView;
    @NonNull
    public final OneFontTextView ownerLastLoginDateDetailTextView;
    @NonNull
    public final OneFontTextView ownerLastLoginTimeDetailTextView;
    @NonNull
    public final OneFontTextView ownerRegisterTimeDetailTextView;
    @NonNull
    public final RecyclerView ownerTransactionDetailRecyclerView;
    @NonNull
    public final OneFontTextView ownerUserIdDetailTextView;
    @NonNull
    public final View userDetailBottomLineView;
    @NonNull
    public final View userDetailCenterLineView;

    public FragmentOneOwnerManagementDetailBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, CardView cardView, AppCompatImageView appCompatImageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, RecyclerView recyclerView, OneFontTextView oneFontTextView4, View view, View view2) {
        this.f84010a = constraintLayout;
        this.deleteOwnerButton = oneFontButton;
        this.deleteUserLayout = cardView;
        this.ownerDetailImageView = appCompatImageView;
        this.ownerLastLoginDateDetailTextView = oneFontTextView;
        this.ownerLastLoginTimeDetailTextView = oneFontTextView2;
        this.ownerRegisterTimeDetailTextView = oneFontTextView3;
        this.ownerTransactionDetailRecyclerView = recyclerView;
        this.ownerUserIdDetailTextView = oneFontTextView4;
        this.userDetailBottomLineView = view;
        this.userDetailCenterLineView = view2;
    }

    @NonNull
    public static FragmentOneOwnerManagementDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.deleteOwnerButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.deleteUserLayout;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.ownerDetailImageView;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.ownerLastLoginDateDetailTextView;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.ownerLastLoginTimeDetailTextView;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.ownerRegisterTimeDetailTextView;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                i = R.id.ownerTransactionDetailRecyclerView;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = R.id.ownerUserIdDetailTextView;
                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.userDetailBottomLineView))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.userDetailCenterLineView))) != null) {
                                        return new FragmentOneOwnerManagementDetailBinding((ConstraintLayout) view, oneFontButton, cardView, appCompatImageView, oneFontTextView, oneFontTextView2, oneFontTextView3, recyclerView, oneFontTextView4, findChildViewById, findChildViewById2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneOwnerManagementDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOwnerManagementDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_owner_management_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84010a;
    }
}
