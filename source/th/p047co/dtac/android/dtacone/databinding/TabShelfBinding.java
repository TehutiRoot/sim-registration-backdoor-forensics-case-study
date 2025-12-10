package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.TabShelfBinding */
/* loaded from: classes7.dex */
public final class TabShelfBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84575a;
    @NonNull
    public final LinearLayout backgroundShelf;
    @NonNull
    public final ImageView iconShelf;
    @NonNull
    public final DtacFontTextView textViewShelf;
    @NonNull
    public final View topLineBar;

    public TabShelfBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, DtacFontTextView dtacFontTextView, View view) {
        this.f84575a = linearLayout;
        this.backgroundShelf = linearLayout2;
        this.iconShelf = imageView;
        this.textViewShelf = dtacFontTextView;
        this.topLineBar = view;
    }

    @NonNull
    public static TabShelfBinding bind(@NonNull View view) {
        View findChildViewById;
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.iconShelf;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.textViewShelf;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.topLineBar))) != null) {
                return new TabShelfBinding(linearLayout, linearLayout, imageView, dtacFontTextView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static TabShelfBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static TabShelfBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.tab_shelf, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84575a;
    }
}
