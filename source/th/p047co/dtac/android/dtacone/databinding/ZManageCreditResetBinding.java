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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZManageCreditResetBinding */
/* loaded from: classes7.dex */
public final class ZManageCreditResetBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84662a;
    @NonNull
    public final ZButtonOkCancelBinding incButtonOkCancel;
    @NonNull
    public final DtacFontTextView titleDialog;
    @NonNull
    public final DtacFontTextView tvName;
    @NonNull
    public final DtacFontTextView tvSoldAmount;

    public ZManageCreditResetBinding(RelativeLayout relativeLayout, ZButtonOkCancelBinding zButtonOkCancelBinding, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84662a = relativeLayout;
        this.incButtonOkCancel = zButtonOkCancelBinding;
        this.titleDialog = dtacFontTextView;
        this.tvName = dtacFontTextView2;
        this.tvSoldAmount = dtacFontTextView3;
    }

    @NonNull
    public static ZManageCreditResetBinding bind(@NonNull View view) {
        int i = R.id.incButtonOkCancel;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZButtonOkCancelBinding bind = ZButtonOkCancelBinding.bind(findChildViewById);
            i = R.id.titleDialog;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvName;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tvSoldAmount;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        return new ZManageCreditResetBinding((RelativeLayout) view, bind, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZManageCreditResetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZManageCreditResetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_manage_credit_reset, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84662a;
    }
}
