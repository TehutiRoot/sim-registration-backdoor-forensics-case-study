package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPrepaidConsentNonTelcoBinding */
/* loaded from: classes7.dex */
public final class FragmentPrepaidConsentNonTelcoBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84253a;
    @NonNull
    public final DtacFontButton btnAllow;
    @NonNull
    public final DtacFontButton btnNotAllow;
    @NonNull
    public final DtacFontTextView nontelcoDetail;
    @NonNull
    public final DtacFontTextView nontelcoTitle;
    @NonNull
    public final ScrollView scrollViewNontelco;
    @NonNull
    public final DtacTabLayout tabLanguage;

    public FragmentPrepaidConsentNonTelcoBinding(FrameLayout frameLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, ScrollView scrollView, DtacTabLayout dtacTabLayout) {
        this.f84253a = frameLayout;
        this.btnAllow = dtacFontButton;
        this.btnNotAllow = dtacFontButton2;
        this.nontelcoDetail = dtacFontTextView;
        this.nontelcoTitle = dtacFontTextView2;
        this.scrollViewNontelco = scrollView;
        this.tabLanguage = dtacTabLayout;
    }

    @NonNull
    public static FragmentPrepaidConsentNonTelcoBinding bind(@NonNull View view) {
        int i = R.id.btn_allow;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btn_not_allow;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.nontelco_detail;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.nontelco_title;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.scroll_view_nontelco;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                        if (scrollView != null) {
                            i = R.id.tab_language;
                            DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                            if (dtacTabLayout != null) {
                                return new FragmentPrepaidConsentNonTelcoBinding((FrameLayout) view, dtacFontButton, dtacFontButton2, dtacFontTextView, dtacFontTextView2, scrollView, dtacTabLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPrepaidConsentNonTelcoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPrepaidConsentNonTelcoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_prepaid_consent_non_telco, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84253a;
    }
}