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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogChangeImeiBinding */
/* loaded from: classes7.dex */
public final class OneDialogChangeImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84549a;
    @NonNull
    public final OneFontButton btnCancel;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final ImageView ivDeviceType;
    @NonNull
    public final LinearLayout okCancelBox;
    @NonNull
    public final OneFontTextView textViewDeviceType;
    @NonNull
    public final OneFontTextView textViewDeviceTypeLabel;
    @NonNull
    public final OneFontTextView tvBrandModel;
    @NonNull
    public final OneFontTextView tvIMEINumber;
    @NonNull
    public final OneFontTextView tvTitleConfirmShop;

    public OneDialogChangeImeiBinding(LinearLayout linearLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, ImageView imageView, LinearLayout linearLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f84549a = linearLayout;
        this.btnCancel = oneFontButton;
        this.btnOk = oneFontButton2;
        this.ivDeviceType = imageView;
        this.okCancelBox = linearLayout2;
        this.textViewDeviceType = oneFontTextView;
        this.textViewDeviceTypeLabel = oneFontTextView2;
        this.tvBrandModel = oneFontTextView3;
        this.tvIMEINumber = oneFontTextView4;
        this.tvTitleConfirmShop = oneFontTextView5;
    }

    @NonNull
    public static OneDialogChangeImeiBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btnOk;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.ivDeviceType;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ok_cancel_box;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.textViewDeviceType;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.textViewDeviceTypeLabel;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.tvBrandModel;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.tvIMEINumber;
                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView4 != null) {
                                        i = R.id.tvTitleConfirmShop;
                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView5 != null) {
                                            return new OneDialogChangeImeiBinding((LinearLayout) view, oneFontButton, oneFontButton2, imageView, linearLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogChangeImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogChangeImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_change_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84549a;
    }
}