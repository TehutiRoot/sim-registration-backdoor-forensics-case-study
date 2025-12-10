package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneVerifyPasswordNewDialogBinding */
/* loaded from: classes7.dex */
public final class OneVerifyPasswordNewDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84544a;
    @NonNull
    public final OneFontTextView tvKycMessage;

    public OneVerifyPasswordNewDialogBinding(RelativeLayout relativeLayout, OneFontTextView oneFontTextView) {
        this.f84544a = relativeLayout;
        this.tvKycMessage = oneFontTextView;
    }

    @NonNull
    public static OneVerifyPasswordNewDialogBinding bind(@NonNull View view) {
        int i = R.id.tvKycMessage;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new OneVerifyPasswordNewDialogBinding((RelativeLayout) view, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneVerifyPasswordNewDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneVerifyPasswordNewDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_verify_password_new_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84544a;
    }
}
