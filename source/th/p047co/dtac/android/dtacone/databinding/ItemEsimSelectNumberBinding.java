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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemEsimSelectNumberBinding */
/* loaded from: classes7.dex */
public final class ItemEsimSelectNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84314a;
    @NonNull
    public final DtacFontTextView labelNumber;

    public ItemEsimSelectNumberBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView) {
        this.f84314a = constraintLayout;
        this.labelNumber = dtacFontTextView;
    }

    @NonNull
    public static ItemEsimSelectNumberBinding bind(@NonNull View view) {
        int i = R.id.label_number;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ItemEsimSelectNumberBinding((ConstraintLayout) view, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemEsimSelectNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemEsimSelectNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_esim_select_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84314a;
    }
}
