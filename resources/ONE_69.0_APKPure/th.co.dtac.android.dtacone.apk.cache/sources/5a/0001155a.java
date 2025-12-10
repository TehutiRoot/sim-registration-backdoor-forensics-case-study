package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentForceChangePasswordBinding */
/* loaded from: classes7.dex */
public final class FragmentForceChangePasswordBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83848a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final DtacClearableEditText edtConfirmPassword;
    @NonNull
    public final DtacClearableEditText edtPassword;
    @NonNull
    public final DtacFontTextView tvHelper;

    public FragmentForceChangePasswordBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacFontTextView dtacFontTextView) {
        this.f83848a = nestedScrollView;
        this.btnConfirm = dtacFontButton;
        this.edtConfirmPassword = dtacClearableEditText;
        this.edtPassword = dtacClearableEditText2;
        this.tvHelper = dtacFontTextView;
    }

    @NonNull
    public static FragmentForceChangePasswordBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.edtConfirmPassword;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.edtPassword;
                DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText2 != null) {
                    i = R.id.tvHelper;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new FragmentForceChangePasswordBinding((NestedScrollView) view, dtacFontButton, dtacClearableEditText, dtacClearableEditText2, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentForceChangePasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentForceChangePasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_force_change_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83848a;
    }
}