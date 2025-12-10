package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneSummaryHeaderBinding */
/* loaded from: classes7.dex */
public final class ItemOneSummaryHeaderBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84369a;
    @NonNull
    public final LinearLayout headerTitleLayout;
    @NonNull
    public final OneFontTextView headerTitleTextView;

    public ItemOneSummaryHeaderBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, OneFontTextView oneFontTextView) {
        this.f84369a = constraintLayout;
        this.headerTitleLayout = linearLayout;
        this.headerTitleTextView = oneFontTextView;
    }

    @NonNull
    public static ItemOneSummaryHeaderBinding bind(@NonNull View view) {
        int i = R.id.headerTitleLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.headerTitleTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                return new ItemOneSummaryHeaderBinding((ConstraintLayout) view, linearLayout, oneFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneSummaryHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneSummaryHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_summary_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84369a;
    }
}
