package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDevicesaleDiscountListBinding */
/* loaded from: classes7.dex */
public final class FragmentDevicesaleDiscountListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83703a;
    @NonNull
    public final DtacEditText editTextSearch;
    @NonNull
    public final DtacCardView edittextSearch;
    @NonNull
    public final Guideline guideTopContent;
    @NonNull
    public final RecyclerView itemListView;
    @NonNull
    public final ImageView ivDeviceType;
    @NonNull
    public final DtacFontTextView textViewContract;
    @NonNull
    public final DtacFontTextView textViewHeaderScreen;
    @NonNull
    public final DtacFontTextView textViewNoCampaign;

    public FragmentDevicesaleDiscountListBinding(ConstraintLayout constraintLayout, DtacEditText dtacEditText, DtacCardView dtacCardView, Guideline guideline, RecyclerView recyclerView, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83703a = constraintLayout;
        this.editTextSearch = dtacEditText;
        this.edittextSearch = dtacCardView;
        this.guideTopContent = guideline;
        this.itemListView = recyclerView;
        this.ivDeviceType = imageView;
        this.textViewContract = dtacFontTextView;
        this.textViewHeaderScreen = dtacFontTextView2;
        this.textViewNoCampaign = dtacFontTextView3;
    }

    @NonNull
    public static FragmentDevicesaleDiscountListBinding bind(@NonNull View view) {
        int i = R.id.editTextSearch;
        DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
        if (dtacEditText != null) {
            i = R.id.edittextSearch;
            DtacCardView dtacCardView = (DtacCardView) ViewBindings.findChildViewById(view, i);
            if (dtacCardView != null) {
                i = R.id.guideTopContent;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = R.id.itemListView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.ivDeviceType;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.textViewContract;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.textViewHeaderScreen;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.textViewNoCampaign;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        return new FragmentDevicesaleDiscountListBinding((ConstraintLayout) view, dtacEditText, dtacCardView, guideline, recyclerView, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static FragmentDevicesaleDiscountListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDevicesaleDiscountListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_devicesale_discount_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83703a;
    }
}
