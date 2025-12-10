package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacNewClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDtacAtHomeCheckMapBinding */
/* loaded from: classes7.dex */
public final class FragmentDtacAtHomeCheckMapBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83709a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final FloatingActionButton currentLocation;
    @NonNull
    public final DtacNewClearableEditText etSearchMap;
    @NonNull
    public final RecyclerView recyclerSuggestion;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    public final LinearLayout subviewRootLayout;
    @NonNull
    public final DtacTabLayout tabSatellite;

    public FragmentDtacAtHomeCheckMapBinding(RelativeLayout relativeLayout, DtacFontButton dtacFontButton, FloatingActionButton floatingActionButton, DtacNewClearableEditText dtacNewClearableEditText, RecyclerView recyclerView, RelativeLayout relativeLayout2, LinearLayout linearLayout, DtacTabLayout dtacTabLayout) {
        this.f83709a = relativeLayout;
        this.btnConfirm = dtacFontButton;
        this.currentLocation = floatingActionButton;
        this.etSearchMap = dtacNewClearableEditText;
        this.recyclerSuggestion = recyclerView;
        this.rootLayout = relativeLayout2;
        this.subviewRootLayout = linearLayout;
        this.tabSatellite = dtacTabLayout;
    }

    @NonNull
    public static FragmentDtacAtHomeCheckMapBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.currentLocation;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, i);
            if (floatingActionButton != null) {
                i = R.id.etSearchMap;
                DtacNewClearableEditText dtacNewClearableEditText = (DtacNewClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacNewClearableEditText != null) {
                    i = R.id.recyclerSuggestion;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i = R.id.subviewRootLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.tab_satellite;
                            DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                            if (dtacTabLayout != null) {
                                return new FragmentDtacAtHomeCheckMapBinding(relativeLayout, dtacFontButton, floatingActionButton, dtacNewClearableEditText, recyclerView, relativeLayout, linearLayout, dtacTabLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDtacAtHomeCheckMapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDtacAtHomeCheckMapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dtac_at_home_check_map, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83709a;
    }
}
