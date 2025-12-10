package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZOtherMenuItemRowBinding */
/* loaded from: classes7.dex */
public final class ZOtherMenuItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84674a;
    @NonNull
    public final DtacCardView cardviewSetting;
    @NonNull
    public final ImageView iconRight;
    @NonNull
    public final ImageView settingIcon;
    @NonNull
    public final DtacFontTextView settingTitle;
    @NonNull
    public final DtacFontTextView subSettingTitle;

    public ZOtherMenuItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, ImageView imageView, ImageView imageView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84674a = dtacCardView;
        this.cardviewSetting = dtacCardView2;
        this.iconRight = imageView;
        this.settingIcon = imageView2;
        this.settingTitle = dtacFontTextView;
        this.subSettingTitle = dtacFontTextView2;
    }

    @NonNull
    public static ZOtherMenuItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.icon_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.setting_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.setting_title;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.sub_setting_title;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new ZOtherMenuItemRowBinding(dtacCardView, dtacCardView, imageView, imageView2, dtacFontTextView, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZOtherMenuItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZOtherMenuItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_other_menu_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84674a;
    }
}
