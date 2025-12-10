package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemMultiSimNumberBinding */
/* loaded from: classes7.dex */
public final class ItemMultiSimNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84330a;
    @NonNull
    public final ImageView remove;
    @NonNull
    public final DtacFontTextView tvSubscriberNumber;

    public ItemMultiSimNumberBinding(ConstraintLayout constraintLayout, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f84330a = constraintLayout;
        this.remove = imageView;
        this.tvSubscriberNumber = dtacFontTextView;
    }

    @NonNull
    public static ItemMultiSimNumberBinding bind(@NonNull View view) {
        int i = R.id.remove;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvSubscriberNumber;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new ItemMultiSimNumberBinding((ConstraintLayout) view, imageView, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMultiSimNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMultiSimNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_multi_sim_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84330a;
    }
}
