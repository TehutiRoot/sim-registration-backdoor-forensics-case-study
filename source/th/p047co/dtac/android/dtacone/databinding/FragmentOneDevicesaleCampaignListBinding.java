package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDevicesaleCampaignListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDevicesaleCampaignListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83948a;
    @NonNull
    public final CardView cardList;
    @NonNull
    public final ConstraintLayout constraintLayout11;
    @NonNull
    public final OneCustomClearableEditText editTextSearch;
    @NonNull
    public final DtacCardView edittextSearch;
    @NonNull
    public final RecyclerView itemListView;
    @NonNull
    public final ImageView ivDeviceType;
    @NonNull
    public final ConstraintLayout root;
    @NonNull
    public final OneFontTextView textViewContract;
    @NonNull
    public final OneFontTextView textViewHeaderScreen;
    @NonNull
    public final OneFontTextView textViewNoCampaign;

    public FragmentOneDevicesaleCampaignListBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, OneCustomClearableEditText oneCustomClearableEditText, DtacCardView dtacCardView, RecyclerView recyclerView, ImageView imageView, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f83948a = constraintLayout;
        this.cardList = cardView;
        this.constraintLayout11 = constraintLayout2;
        this.editTextSearch = oneCustomClearableEditText;
        this.edittextSearch = dtacCardView;
        this.itemListView = recyclerView;
        this.ivDeviceType = imageView;
        this.root = constraintLayout3;
        this.textViewContract = oneFontTextView;
        this.textViewHeaderScreen = oneFontTextView2;
        this.textViewNoCampaign = oneFontTextView3;
    }

    @NonNull
    public static FragmentOneDevicesaleCampaignListBinding bind(@NonNull View view) {
        int i = R.id.cardList;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.constraintLayout11;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.editTextSearch;
                OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText != null) {
                    i = R.id.edittextSearch;
                    DtacCardView dtacCardView = (DtacCardView) ViewBindings.findChildViewById(view, i);
                    if (dtacCardView != null) {
                        i = R.id.itemListView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.ivDeviceType;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                i = R.id.textViewContract;
                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView != null) {
                                    i = R.id.textViewHeaderScreen;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        i = R.id.textViewNoCampaign;
                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView3 != null) {
                                            return new FragmentOneDevicesaleCampaignListBinding(constraintLayout2, cardView, constraintLayout, oneCustomClearableEditText, dtacCardView, recyclerView, imageView, constraintLayout2, oneFontTextView, oneFontTextView2, oneFontTextView3);
                                        }
                                    }
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
    public static FragmentOneDevicesaleCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDevicesaleCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_devicesale_campaign_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83948a;
    }
}
