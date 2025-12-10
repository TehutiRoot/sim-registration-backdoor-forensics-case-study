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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemPrepaidCampaignBinding */
/* loaded from: classes7.dex */
public final class ItemPrepaidCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84496a;
    @NonNull
    public final ImageView arrow;
    @NonNull
    public final ConstraintLayout itemCampaign;
    @NonNull
    public final OneFontTextView tvCampaignName;

    public ItemPrepaidCampaignBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f84496a = constraintLayout;
        this.arrow = imageView;
        this.itemCampaign = constraintLayout2;
        this.tvCampaignName = oneFontTextView;
    }

    @NonNull
    public static ItemPrepaidCampaignBinding bind(@NonNull View view) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.tvCampaignName;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i2);
            if (oneFontTextView != null) {
                return new ItemPrepaidCampaignBinding(constraintLayout, imageView, constraintLayout, oneFontTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPrepaidCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemPrepaidCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_prepaid_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84496a;
    }
}