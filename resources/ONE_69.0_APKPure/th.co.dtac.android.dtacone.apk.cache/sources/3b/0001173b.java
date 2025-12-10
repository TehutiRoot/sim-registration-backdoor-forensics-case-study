package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentWithDeviceSelectCampaignBinding */
/* loaded from: classes7.dex */
public final class FragmentWithDeviceSelectCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84330a;
    @NonNull
    public final ImageView ivWithDeviceBackground;
    @NonNull
    public final ConstraintLayout layoutHeader;
    @NonNull
    public final LinearLayout layoutListCampaign;
    @NonNull
    public final RecyclerView recyclerCampaignWithDevice;
    @NonNull
    public final DtacFontTextView tvContractType;
    @NonNull
    public final DtacFontTextView tvDeviceType;
    @NonNull
    public final DtacFontTextView tvSelectCampaignTitle;
    @NonNull
    public final View vBackgroundWhite;
    @NonNull
    public final View vGuildLine;

    public FragmentWithDeviceSelectCampaignBinding(NestedScrollView nestedScrollView, ImageView imageView, ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, View view, View view2) {
        this.f84330a = nestedScrollView;
        this.ivWithDeviceBackground = imageView;
        this.layoutHeader = constraintLayout;
        this.layoutListCampaign = linearLayout;
        this.recyclerCampaignWithDevice = recyclerView;
        this.tvContractType = dtacFontTextView;
        this.tvDeviceType = dtacFontTextView2;
        this.tvSelectCampaignTitle = dtacFontTextView3;
        this.vBackgroundWhite = view;
        this.vGuildLine = view2;
    }

    @NonNull
    public static FragmentWithDeviceSelectCampaignBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.ivWithDeviceBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.layoutHeader;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.layoutListCampaign;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.recyclerCampaignWithDevice;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.tvContractType;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.tvDeviceType;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tvSelectCampaignTitle;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vBackgroundWhite))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vGuildLine))) != null) {
                                    return new FragmentWithDeviceSelectCampaignBinding((NestedScrollView) view, imageView, constraintLayout, linearLayout, recyclerView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, findChildViewById, findChildViewById2);
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
    public static FragmentWithDeviceSelectCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWithDeviceSelectCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_with_device_select_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84330a;
    }
}