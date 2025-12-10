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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneCampaignListBinding */
/* loaded from: classes7.dex */
public final class ItemOneCampaignListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84453a;
    @NonNull
    public final ImageView imageView45;
    @NonNull
    public final OneFontTextView tvCampaignName;

    public ItemOneCampaignListBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f84453a = constraintLayout;
        this.imageView45 = imageView;
        this.tvCampaignName = oneFontTextView;
    }

    @NonNull
    public static ItemOneCampaignListBinding bind(@NonNull View view) {
        int i = R.id.imageView45;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvCampaignName;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                return new ItemOneCampaignListBinding((ConstraintLayout) view, imageView, oneFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_campaign_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84453a;
    }
}