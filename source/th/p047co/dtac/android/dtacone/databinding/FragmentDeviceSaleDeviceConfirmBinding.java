package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSaleDeviceConfirmBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSaleDeviceConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final ScrollView f83688a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final RecyclerView bundleItemListView;
    @NonNull
    public final FrameLayout framePrice;
    @NonNull
    public final DtacFontTextView tvBundleTitle;
    @NonNull
    public final DtacFontTextView tvDeviceName;
    @NonNull
    public final DtacFontTextView tvIMEI;
    @NonNull
    public final DtacFontTextView tvNoBundleItem;
    @NonNull
    public final DtacFontTextView tvPackage;
    @NonNull
    public final DtacFontTextView tvPrice;
    @NonNull
    public final DtacFontTextView tvSubscriber;
    @NonNull
    public final LinearLayout vgConditionBox;

    public FragmentDeviceSaleDeviceConfirmBinding(ScrollView scrollView, DtacFontButton dtacFontButton, RecyclerView recyclerView, FrameLayout frameLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, LinearLayout linearLayout) {
        this.f83688a = scrollView;
        this.btnNext = dtacFontButton;
        this.bundleItemListView = recyclerView;
        this.framePrice = frameLayout;
        this.tvBundleTitle = dtacFontTextView;
        this.tvDeviceName = dtacFontTextView2;
        this.tvIMEI = dtacFontTextView3;
        this.tvNoBundleItem = dtacFontTextView4;
        this.tvPackage = dtacFontTextView5;
        this.tvPrice = dtacFontTextView6;
        this.tvSubscriber = dtacFontTextView7;
        this.vgConditionBox = linearLayout;
    }

    @NonNull
    public static FragmentDeviceSaleDeviceConfirmBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.bundleItemListView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.framePrice;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.tvBundleTitle;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tvDeviceName;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.tvIMEI;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.tvNoBundleItem;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    i = R.id.tvPackage;
                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView5 != null) {
                                        i = R.id.tvPrice;
                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView6 != null) {
                                            i = R.id.tvSubscriber;
                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView7 != null) {
                                                i = R.id.vgConditionBox;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    return new FragmentDeviceSaleDeviceConfirmBinding((ScrollView) view, dtacFontButton, recyclerView, frameLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, linearLayout);
                                                }
                                            }
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
    public static FragmentDeviceSaleDeviceConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSaleDeviceConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_device_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.f83688a;
    }
}
