package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogConfirmShopBinding */
/* loaded from: classes7.dex */
public final class DialogConfirmShopBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83714a;
    @NonNull
    public final DtacFontTextView tvShopCodeTitle;
    @NonNull
    public final DtacFontTextView tvShopCodeValue;
    @NonNull
    public final DtacFontTextView tvShopNameTitle;
    @NonNull
    public final DtacFontTextView tvShopNameValue;
    @NonNull
    public final DtacFontTextView tvTitleConfirmShop;

    public DialogConfirmShopBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f83714a = linearLayout;
        this.tvShopCodeTitle = dtacFontTextView;
        this.tvShopCodeValue = dtacFontTextView2;
        this.tvShopNameTitle = dtacFontTextView3;
        this.tvShopNameValue = dtacFontTextView4;
        this.tvTitleConfirmShop = dtacFontTextView5;
    }

    @NonNull
    public static DialogConfirmShopBinding bind(@NonNull View view) {
        int i = R.id.tvShopCodeTitle;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvShopCodeValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.tvShopNameTitle;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.tvShopNameValue;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        i = R.id.tvTitleConfirmShop;
                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView5 != null) {
                            return new DialogConfirmShopBinding((LinearLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogConfirmShopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogConfirmShopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_confirm_shop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83714a;
    }
}