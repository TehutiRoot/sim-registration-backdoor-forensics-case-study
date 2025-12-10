package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemCampaignHistoryDescriptionBinding */
/* loaded from: classes7.dex */
public final class ItemCampaignHistoryDescriptionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84307a;
    @NonNull
    public final RelativeLayout layoutDescription;
    @NonNull
    public final DtacFontTextView tvHistoryDescriptionTitle;
    @NonNull
    public final DtacFontTextView tvHistoryDescriptionValue;
    @NonNull
    public final View vSeparateLine;

    public ItemCampaignHistoryDescriptionBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, View view) {
        this.f84307a = relativeLayout;
        this.layoutDescription = relativeLayout2;
        this.tvHistoryDescriptionTitle = dtacFontTextView;
        this.tvHistoryDescriptionValue = dtacFontTextView2;
        this.vSeparateLine = view;
    }

    @NonNull
    public static ItemCampaignHistoryDescriptionBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.layoutDescription;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.tvHistoryDescriptionTitle;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvHistoryDescriptionValue;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLine))) != null) {
                    return new ItemCampaignHistoryDescriptionBinding((RelativeLayout) view, relativeLayout, dtacFontTextView, dtacFontTextView2, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemCampaignHistoryDescriptionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemCampaignHistoryDescriptionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_campaign_history_description, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84307a;
    }
}
