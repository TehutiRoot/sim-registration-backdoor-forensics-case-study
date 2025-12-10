package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSalePackageBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSalePackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83691a;
    @NonNull
    public final DtacEditText editTextSearch;
    @NonNull
    public final DtacCardView edittextSearch;
    @NonNull
    public final Guideline guideTopContent;
    @NonNull
    public final RecyclerView itemListView;
    @NonNull
    public final DtacFontTextView textViewContract;
    @NonNull
    public final DtacFontTextView textViewHeaderScreen;
    @NonNull
    public final DtacFontTextView textViewMenu;
    @NonNull
    public final DtacFontTextView textViewNoPackage;
    @NonNull
    public final DtacFontTextView tvWarningMessage;

    public FragmentDeviceSalePackageBinding(ConstraintLayout constraintLayout, DtacEditText dtacEditText, DtacCardView dtacCardView, Guideline guideline, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f83691a = constraintLayout;
        this.editTextSearch = dtacEditText;
        this.edittextSearch = dtacCardView;
        this.guideTopContent = guideline;
        this.itemListView = recyclerView;
        this.textViewContract = dtacFontTextView;
        this.textViewHeaderScreen = dtacFontTextView2;
        this.textViewMenu = dtacFontTextView3;
        this.textViewNoPackage = dtacFontTextView4;
        this.tvWarningMessage = dtacFontTextView5;
    }

    @NonNull
    public static FragmentDeviceSalePackageBinding bind(@NonNull View view) {
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
                        i = R.id.textViewContract;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.textViewHeaderScreen;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.textViewMenu;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.textViewNoPackage;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.tvWarningMessage;
                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView5 != null) {
                                            return new FragmentDeviceSalePackageBinding((ConstraintLayout) view, dtacEditText, dtacCardView, guideline, recyclerView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
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
    public static FragmentDeviceSalePackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSalePackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83691a;
    }
}
