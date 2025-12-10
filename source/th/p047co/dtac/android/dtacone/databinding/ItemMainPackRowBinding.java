package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemMainPackRowBinding */
/* loaded from: classes7.dex */
public final class ItemMainPackRowBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84328a;
    @NonNull
    public final LinearLayout itemLayout;
    @NonNull
    public final DtacFontTextView tvMainPackName;

    public ItemMainPackRowBinding(LinearLayout linearLayout, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView) {
        this.f84328a = linearLayout;
        this.itemLayout = linearLayout2;
        this.tvMainPackName = dtacFontTextView;
    }

    @NonNull
    public static ItemMainPackRowBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.tvMainPackName;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ItemMainPackRowBinding(linearLayout, linearLayout, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMainPackRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMainPackRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_main_pack_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84328a;
    }
}
