package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZDialogRectifyConfirmBinding */
/* loaded from: classes7.dex */
public final class ZDialogRectifyConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84600a;
    @NonNull
    public final LinearLayout dialogRectifyList;
    @NonNull
    public final DtacFontTextView dialogTvTitle;
    @NonNull
    public final ZButtonConfirmCancelBinding incLayoutBtnOkCancel;
    @NonNull
    public final DtacFontTextView tvRectifyAmount;
    @NonNull
    public final DtacFontTextView tvRectifyDescription;
    @NonNull
    public final DtacFontTextView tvRectifyPhoneNumber;

    public ZDialogRectifyConfirmBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, DtacFontTextView dtacFontTextView, ZButtonConfirmCancelBinding zButtonConfirmCancelBinding, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84600a = relativeLayout;
        this.dialogRectifyList = linearLayout;
        this.dialogTvTitle = dtacFontTextView;
        this.incLayoutBtnOkCancel = zButtonConfirmCancelBinding;
        this.tvRectifyAmount = dtacFontTextView2;
        this.tvRectifyDescription = dtacFontTextView3;
        this.tvRectifyPhoneNumber = dtacFontTextView4;
    }

    @NonNull
    public static ZDialogRectifyConfirmBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.dialog_rectify_list;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.dialog_tv_title;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incLayoutBtnOkCancel))) != null) {
                ZButtonConfirmCancelBinding bind = ZButtonConfirmCancelBinding.bind(findChildViewById);
                i = R.id.tvRectifyAmount;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tvRectifyDescription;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.tvRectifyPhoneNumber;
                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView4 != null) {
                            return new ZDialogRectifyConfirmBinding((RelativeLayout) view, linearLayout, dtacFontTextView, bind, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZDialogRectifyConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZDialogRectifyConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_dialog_rectify_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84600a;
    }
}
