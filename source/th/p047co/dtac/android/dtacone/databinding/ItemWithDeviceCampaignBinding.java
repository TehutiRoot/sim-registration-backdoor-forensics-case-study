package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemWithDeviceCampaignBinding */
/* loaded from: classes7.dex */
public final class ItemWithDeviceCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84398a;
    @NonNull
    public final ImageView ivRightButton;
    @NonNull
    public final RelativeLayout layoutCampaignItem;
    @NonNull
    public final DtacFontTextView tvCampaignName;
    @NonNull
    public final View vLineSeparate;

    public ItemWithDeviceCampaignBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, View view) {
        this.f84398a = relativeLayout;
        this.ivRightButton = imageView;
        this.layoutCampaignItem = relativeLayout2;
        this.tvCampaignName = dtacFontTextView;
        this.vLineSeparate = view;
    }

    @NonNull
    public static ItemWithDeviceCampaignBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivRightButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.tvCampaignName;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null) {
                return new ItemWithDeviceCampaignBinding(relativeLayout, imageView, relativeLayout, dtacFontTextView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemWithDeviceCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemWithDeviceCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_with_device_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84398a;
    }
}
