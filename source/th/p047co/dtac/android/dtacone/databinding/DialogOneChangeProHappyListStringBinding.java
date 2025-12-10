package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogOneChangeProHappyListStringBinding */
/* loaded from: classes7.dex */
public final class DialogOneChangeProHappyListStringBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f83627a;
    @NonNull
    public final AppCompatImageView ivBtnClose;
    @NonNull
    public final ConstraintLayout layoutTitle;
    @NonNull
    public final RecyclerView rvListString;
    @NonNull
    public final OneFontTextView tvTitle;
    @NonNull
    public final View vSeparateLine;

    public DialogOneChangeProHappyListStringBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, RecyclerView recyclerView, OneFontTextView oneFontTextView, View view) {
        this.f83627a = linearLayoutCompat;
        this.ivBtnClose = appCompatImageView;
        this.layoutTitle = constraintLayout;
        this.rvListString = recyclerView;
        this.tvTitle = oneFontTextView;
        this.vSeparateLine = view;
    }

    @NonNull
    public static DialogOneChangeProHappyListStringBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivBtnClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.layoutTitle;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.rvListString;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.tvTitle;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLine))) != null) {
                        return new DialogOneChangeProHappyListStringBinding((LinearLayoutCompat) view, appCompatImageView, constraintLayout, recyclerView, oneFontTextView, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogOneChangeProHappyListStringBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogOneChangeProHappyListStringBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_one_change_pro_happy_list_string, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f83627a;
    }
}
