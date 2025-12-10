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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneChangeProHappySuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentOneChangeProHappySuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83914a;
    @NonNull
    public final OneFontButton btnGoHome;
    @NonNull
    public final ImageView ivSuccess;
    @NonNull
    public final OneFontTextView tvSuccessTitle;

    public FragmentOneChangeProHappySuccessBinding(LinearLayout linearLayout, OneFontButton oneFontButton, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f83914a = linearLayout;
        this.btnGoHome = oneFontButton;
        this.ivSuccess = imageView;
        this.tvSuccessTitle = oneFontTextView;
    }

    @NonNull
    public static FragmentOneChangeProHappySuccessBinding bind(@NonNull View view) {
        int i = R.id.btnGoHome;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.ivSuccess;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvSuccessTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new FragmentOneChangeProHappySuccessBinding((LinearLayout) view, oneFontButton, imageView, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneChangeProHappySuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneChangeProHappySuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_change_pro_happy_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83914a;
    }
}
