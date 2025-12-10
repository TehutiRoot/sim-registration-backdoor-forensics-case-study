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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDevicesaleInputFieldBinding */
/* loaded from: classes7.dex */
public final class FragmentDevicesaleInputFieldBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83704a;
    @NonNull
    public final DtacFontButton buttonNext;
    @NonNull
    public final DtacCardView cardInputListView;
    @NonNull
    public final Guideline guideTopContent;
    @NonNull
    public final RecyclerView inputListView;
    @NonNull
    public final ImageView ivDeviceType;
    @NonNull
    public final DtacFontTextView textViewContract;
    @NonNull
    public final DtacFontTextView textViewHeaderScreen;
    @NonNull
    public final DtacFontTextView textViewNoCampaign;

    public FragmentDevicesaleInputFieldBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacCardView dtacCardView, Guideline guideline, RecyclerView recyclerView, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83704a = constraintLayout;
        this.buttonNext = dtacFontButton;
        this.cardInputListView = dtacCardView;
        this.guideTopContent = guideline;
        this.inputListView = recyclerView;
        this.ivDeviceType = imageView;
        this.textViewContract = dtacFontTextView;
        this.textViewHeaderScreen = dtacFontTextView2;
        this.textViewNoCampaign = dtacFontTextView3;
    }

    @NonNull
    public static FragmentDevicesaleInputFieldBinding bind(@NonNull View view) {
        int i = R.id.buttonNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.cardInputListView;
            DtacCardView dtacCardView = (DtacCardView) ViewBindings.findChildViewById(view, i);
            if (dtacCardView != null) {
                i = R.id.guideTopContent;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = R.id.inputListView;
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
                                        return new FragmentDevicesaleInputFieldBinding((ConstraintLayout) view, dtacFontButton, dtacCardView, guideline, recyclerView, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static FragmentDevicesaleInputFieldBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDevicesaleInputFieldBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_devicesale_input_field, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83704a;
    }
}
