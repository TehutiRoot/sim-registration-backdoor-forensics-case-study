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

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogChangeImeiBinding */
/* loaded from: classes7.dex */
public final class DialogChangeImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83612a;
    @NonNull
    public final ImageView ivDeviceType;
    @NonNull
    public final DtacFontTextView tvBrandModel;
    @NonNull
    public final DtacFontTextView tvIMEINumber;
    @NonNull
    public final DtacFontTextView tvTitleConfirmShop;

    public DialogChangeImeiBinding(LinearLayout linearLayout, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83612a = linearLayout;
        this.ivDeviceType = imageView;
        this.tvBrandModel = dtacFontTextView;
        this.tvIMEINumber = dtacFontTextView2;
        this.tvTitleConfirmShop = dtacFontTextView3;
    }

    @NonNull
    public static DialogChangeImeiBinding bind(@NonNull View view) {
        int i = R.id.ivDeviceType;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvBrandModel;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvIMEINumber;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tvTitleConfirmShop;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        return new DialogChangeImeiBinding((LinearLayout) view, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogChangeImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogChangeImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_change_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83612a;
    }
}
