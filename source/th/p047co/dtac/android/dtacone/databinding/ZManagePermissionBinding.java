package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZManagePermissionBinding */
/* loaded from: classes7.dex */
public final class ZManagePermissionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84663a;
    @NonNull
    public final LinearLayout checkBoxPermissionsLayout;
    @NonNull
    public final ZButtonOkCancelBinding incButtonOkCancel;
    @NonNull
    public final ScrollView scrollBox;
    @NonNull
    public final DtacFontTextView titleDialog;
    @NonNull
    public final DtacFontTextView tvName;

    public ZManagePermissionBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ZButtonOkCancelBinding zButtonOkCancelBinding, ScrollView scrollView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84663a = relativeLayout;
        this.checkBoxPermissionsLayout = linearLayout;
        this.incButtonOkCancel = zButtonOkCancelBinding;
        this.scrollBox = scrollView;
        this.titleDialog = dtacFontTextView;
        this.tvName = dtacFontTextView2;
    }

    @NonNull
    public static ZManagePermissionBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.checkBoxPermissionsLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incButtonOkCancel))) != null) {
            ZButtonOkCancelBinding bind = ZButtonOkCancelBinding.bind(findChildViewById);
            i = R.id.scrollBox;
            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
            if (scrollView != null) {
                i = R.id.titleDialog;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvName;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new ZManagePermissionBinding((RelativeLayout) view, linearLayout, bind, scrollView, dtacFontTextView, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZManagePermissionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZManagePermissionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_manage_permission, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84663a;
    }
}
