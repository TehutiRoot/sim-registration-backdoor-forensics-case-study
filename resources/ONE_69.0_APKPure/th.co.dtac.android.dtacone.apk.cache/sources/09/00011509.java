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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangeMainPackSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentChangeMainPackSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83764a;
    @NonNull
    public final DtacFontButton btnGoHome;
    @NonNull
    public final ImageView ivSuccess;
    @NonNull
    public final DtacFontTextView tvSuccessTitle;

    public FragmentChangeMainPackSuccessBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f83764a = linearLayout;
        this.btnGoHome = dtacFontButton;
        this.ivSuccess = imageView;
        this.tvSuccessTitle = dtacFontTextView;
    }

    @NonNull
    public static FragmentChangeMainPackSuccessBinding bind(@NonNull View view) {
        int i = R.id.btnGoHome;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.ivSuccess;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvSuccessTitle;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new FragmentChangeMainPackSuccessBinding((LinearLayout) view, dtacFontButton, imageView, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChangeMainPackSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangeMainPackSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_main_pack_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83764a;
    }
}