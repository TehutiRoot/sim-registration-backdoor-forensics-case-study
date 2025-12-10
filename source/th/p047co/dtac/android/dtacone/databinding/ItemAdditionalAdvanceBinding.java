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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemAdditionalAdvanceBinding */
/* loaded from: classes7.dex */
public final class ItemAdditionalAdvanceBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84303a;
    @NonNull
    public final OneFontTextView labelTextView;
    @NonNull
    public final LinearLayout rowItemLayout;
    @NonNull
    public final OneFontTextView valueTextView;

    public ItemAdditionalAdvanceBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, LinearLayout linearLayout, OneFontTextView oneFontTextView2) {
        this.f84303a = constraintLayout;
        this.labelTextView = oneFontTextView;
        this.rowItemLayout = linearLayout;
        this.valueTextView = oneFontTextView2;
    }

    @NonNull
    public static ItemAdditionalAdvanceBinding bind(@NonNull View view) {
        int i = R.id.labelTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.rowItemLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.valueTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    return new ItemAdditionalAdvanceBinding((ConstraintLayout) view, oneFontTextView, linearLayout, oneFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAdditionalAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemAdditionalAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_additional_advance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84303a;
    }
}
