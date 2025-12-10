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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneBgCampaignListBinding */
/* loaded from: classes7.dex */
public final class OneBgCampaignListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84537a;
    @NonNull
    public final ImageView ivBgIcon;
    @NonNull
    public final View view6;

    public OneBgCampaignListBinding(ConstraintLayout constraintLayout, ImageView imageView, View view) {
        this.f84537a = constraintLayout;
        this.ivBgIcon = imageView;
        this.view6 = view;
    }

    @NonNull
    public static OneBgCampaignListBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivBgIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view6))) != null) {
            return new OneBgCampaignListBinding((ConstraintLayout) view, imageView, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneBgCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneBgCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_bg_campaign_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84537a;
    }
}