package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneDeviceSaleCampaignBinding */
/* loaded from: classes7.dex */
public final class ItemOneDeviceSaleCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84457a;
    @NonNull
    public final ImageView arrow;
    @NonNull
    public final OneFontTextView textViewName;
    @NonNull
    public final OneFontTextView textViewTime;
    @NonNull
    public final OneFontTextView textViewType;

    public ItemOneDeviceSaleCampaignBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84457a = constraintLayout;
        this.arrow = imageView;
        this.textViewName = oneFontTextView;
        this.textViewTime = oneFontTextView2;
        this.textViewType = oneFontTextView3;
    }

    @NonNull
    public static ItemOneDeviceSaleCampaignBinding bind(@NonNull View view) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.textViewName;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.textViewTime;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.textViewType;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        return new ItemOneDeviceSaleCampaignBinding((ConstraintLayout) view, imageView, oneFontTextView, oneFontTextView2, oneFontTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneDeviceSaleCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneDeviceSaleCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_device_sale_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84457a;
    }
}