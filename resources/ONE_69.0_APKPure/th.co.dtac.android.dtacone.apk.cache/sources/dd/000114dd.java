package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogFragmentOneOnlineRegistAddressBinding */
/* loaded from: classes7.dex */
public final class DialogFragmentOneOnlineRegistAddressBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f83720a;
    @NonNull
    public final FrameLayout contentLayout;
    @NonNull
    public final FrameLayout contentLayoutSecond;
    @NonNull
    public final AppCompatImageView ivBtnBack;
    @NonNull
    public final AppCompatImageView ivBtnClose;
    @NonNull
    public final ConstraintLayout layoutTitle;
    @NonNull
    public final RecyclerView recyclerViewContent;
    @NonNull
    public final RecyclerView recyclerViewContentSecond;
    @NonNull
    public final OneFontTextView tvTitle;
    @NonNull
    public final View vSeparateLine;

    public DialogFragmentOneOnlineRegistAddressBinding(LinearLayoutCompat linearLayoutCompat, FrameLayout frameLayout, FrameLayout frameLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2, OneFontTextView oneFontTextView, View view) {
        this.f83720a = linearLayoutCompat;
        this.contentLayout = frameLayout;
        this.contentLayoutSecond = frameLayout2;
        this.ivBtnBack = appCompatImageView;
        this.ivBtnClose = appCompatImageView2;
        this.layoutTitle = constraintLayout;
        this.recyclerViewContent = recyclerView;
        this.recyclerViewContentSecond = recyclerView2;
        this.tvTitle = oneFontTextView;
        this.vSeparateLine = view;
    }

    @NonNull
    public static DialogFragmentOneOnlineRegistAddressBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.contentLayoutSecond;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = R.id.ivBtnBack;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.ivBtnClose;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = R.id.layoutTitle;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.recyclerViewContent;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.recyclerViewContentSecond;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView2 != null) {
                                    i = R.id.tvTitle;
                                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLine))) != null) {
                                        return new DialogFragmentOneOnlineRegistAddressBinding((LinearLayoutCompat) view, frameLayout, frameLayout2, appCompatImageView, appCompatImageView2, constraintLayout, recyclerView, recyclerView2, oneFontTextView, findChildViewById);
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
    public static DialogFragmentOneOnlineRegistAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogFragmentOneOnlineRegistAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fragment_one_online_regist_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f83720a;
    }
}