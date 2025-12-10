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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentConsentTelcoBinding */
/* loaded from: classes7.dex */
public final class FragmentConsentTelcoBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83683a;
    @NonNull
    public final DtacFontButton btnAllow;
    @NonNull
    public final ScrollView scrollViewTelco;
    @NonNull
    public final DtacFontTextView telcoDetail;
    @NonNull
    public final DtacTabLayout telcoTabLanguage;
    @NonNull
    public final DtacFontTextView telcoTitle;

    public FragmentConsentTelcoBinding(FrameLayout frameLayout, DtacFontButton dtacFontButton, ScrollView scrollView, DtacFontTextView dtacFontTextView, DtacTabLayout dtacTabLayout, DtacFontTextView dtacFontTextView2) {
        this.f83683a = frameLayout;
        this.btnAllow = dtacFontButton;
        this.scrollViewTelco = scrollView;
        this.telcoDetail = dtacFontTextView;
        this.telcoTabLanguage = dtacTabLayout;
        this.telcoTitle = dtacFontTextView2;
    }

    @NonNull
    public static FragmentConsentTelcoBinding bind(@NonNull View view) {
        int i = R.id.btn_allow;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.scroll_view_telco;
            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
            if (scrollView != null) {
                i = R.id.telco_detail;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.telco_tab_language;
                    DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                    if (dtacTabLayout != null) {
                        i = R.id.telco_title;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            return new FragmentConsentTelcoBinding((FrameLayout) view, dtacFontButton, scrollView, dtacFontTextView, dtacTabLayout, dtacFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentConsentTelcoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentConsentTelcoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_consent_telco, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83683a;
    }
}
