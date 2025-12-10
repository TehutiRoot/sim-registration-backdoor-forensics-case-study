package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogDeviceSimInfoBinding */
/* loaded from: classes7.dex */
public final class DialogDeviceSimInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83619a;
    @NonNull
    public final DtacFontButton buttonOk;
    @NonNull
    public final DtacFontTextView deviceSim;
    @NonNull
    public final RecyclerView deviceSimList;
    @NonNull
    public final DtacFontTextView deviceSimNoData;
    @NonNull
    public final DtacFontTextView dtacApp;
    @NonNull
    public final RecyclerView dtacAppList;
    @NonNull
    public final DtacFontTextView dtacAppNoData;
    @NonNull
    public final ConstraintLayout innerView;
    @NonNull
    public final NestedScrollView scrollView3;
    @NonNull
    public final DtacFontTextView textView7;

    public DialogDeviceSimInfoBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, RecyclerView recyclerView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, RecyclerView recyclerView2, DtacFontTextView dtacFontTextView4, ConstraintLayout constraintLayout2, NestedScrollView nestedScrollView, DtacFontTextView dtacFontTextView5) {
        this.f83619a = constraintLayout;
        this.buttonOk = dtacFontButton;
        this.deviceSim = dtacFontTextView;
        this.deviceSimList = recyclerView;
        this.deviceSimNoData = dtacFontTextView2;
        this.dtacApp = dtacFontTextView3;
        this.dtacAppList = recyclerView2;
        this.dtacAppNoData = dtacFontTextView4;
        this.innerView = constraintLayout2;
        this.scrollView3 = nestedScrollView;
        this.textView7 = dtacFontTextView5;
    }

    @NonNull
    public static DialogDeviceSimInfoBinding bind(@NonNull View view) {
        int i = R.id.buttonOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.deviceSim;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.deviceSimList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.deviceSimNoData;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.dtacApp;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.dtacAppList;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView2 != null) {
                                i = R.id.dtacAppNoData;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    i = R.id.innerView;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.scrollView3;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                        if (nestedScrollView != null) {
                                            i = R.id.textView7;
                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView5 != null) {
                                                return new DialogDeviceSimInfoBinding((ConstraintLayout) view, dtacFontButton, dtacFontTextView, recyclerView, dtacFontTextView2, dtacFontTextView3, recyclerView2, dtacFontTextView4, constraintLayout, nestedScrollView, dtacFontTextView5);
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
    public static DialogDeviceSimInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogDeviceSimInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_device_sim_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83619a;
    }
}
