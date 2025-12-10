package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemRemainingPackagesBinding */
/* loaded from: classes7.dex */
public final class ItemRemainingPackagesBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84390a;
    @NonNull
    public final OneFontTextView labelTime;
    @NonNull
    public final View line;
    @NonNull
    public final ConstraintLayout linearLayoutCompat3;
    @NonNull
    public final OneFontTextView tvDateExpire;
    @NonNull
    public final OneFontTextView tvPackageName;
    @NonNull
    public final OneFontTextView tvPeriod;

    public ItemRemainingPackagesBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, View view, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84390a = constraintLayout;
        this.labelTime = oneFontTextView;
        this.line = view;
        this.linearLayoutCompat3 = constraintLayout2;
        this.tvDateExpire = oneFontTextView2;
        this.tvPackageName = oneFontTextView3;
        this.tvPeriod = oneFontTextView4;
    }

    @NonNull
    public static ItemRemainingPackagesBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.labelTime;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
            i = R.id.linearLayoutCompat3;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.tvDateExpire;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.tvPackageName;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.tvPeriod;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            return new ItemRemainingPackagesBinding((ConstraintLayout) view, oneFontTextView, findChildViewById, constraintLayout, oneFontTextView2, oneFontTextView3, oneFontTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemRemainingPackagesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemRemainingPackagesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_remaining_packages, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84390a;
    }
}
