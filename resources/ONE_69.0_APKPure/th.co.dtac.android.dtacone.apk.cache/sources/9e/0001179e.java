package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemListOneChangeProHappyBinding */
/* loaded from: classes7.dex */
public final class ItemListOneChangeProHappyBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84429a;
    @NonNull
    public final ConstraintLayout layoutDataString;
    @NonNull
    public final LinearLayoutCompat layoutText;
    @NonNull
    public final OneFontTextView tvDataString;
    @NonNull
    public final View vSeparateLineItem;

    public ItemListOneChangeProHappyBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, View view) {
        this.f84429a = constraintLayout;
        this.layoutDataString = constraintLayout2;
        this.layoutText = linearLayoutCompat;
        this.tvDataString = oneFontTextView;
        this.vSeparateLineItem = view;
    }

    @NonNull
    public static ItemListOneChangeProHappyBinding bind(@NonNull View view) {
        View findChildViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.layoutText;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.tvDataString;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLineItem))) != null) {
                return new ItemListOneChangeProHappyBinding(constraintLayout, constraintLayout, linearLayoutCompat, oneFontTextView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemListOneChangeProHappyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemListOneChangeProHappyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_list_one_change_pro_happy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84429a;
    }
}