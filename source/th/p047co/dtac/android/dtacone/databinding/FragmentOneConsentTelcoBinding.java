package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneConsentTelcoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneConsentTelcoBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83918a;
    @NonNull
    public final OneFontButton btnAllow;
    @NonNull
    public final ImageView ivConsentTelco;
    @NonNull
    public final ImageView ivLogo;
    @NonNull
    public final ScrollView scrollViewTelco;
    @NonNull
    public final OneFontTextView telcoDetail;
    @NonNull
    public final OneTabLayout telcoTabLanguage;
    @NonNull
    public final OneFontTextView telcoTitle;

    public FragmentOneConsentTelcoBinding(FrameLayout frameLayout, OneFontButton oneFontButton, ImageView imageView, ImageView imageView2, ScrollView scrollView, OneFontTextView oneFontTextView, OneTabLayout oneTabLayout, OneFontTextView oneFontTextView2) {
        this.f83918a = frameLayout;
        this.btnAllow = oneFontButton;
        this.ivConsentTelco = imageView;
        this.ivLogo = imageView2;
        this.scrollViewTelco = scrollView;
        this.telcoDetail = oneFontTextView;
        this.telcoTabLanguage = oneTabLayout;
        this.telcoTitle = oneFontTextView2;
    }

    @NonNull
    public static FragmentOneConsentTelcoBinding bind(@NonNull View view) {
        int i = R.id.btn_allow;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.ivConsentTelco;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ivLogo;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.scroll_view_telco;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = R.id.telco_detail;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.telco_tab_language;
                            OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                            if (oneTabLayout != null) {
                                i = R.id.telco_title;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    return new FragmentOneConsentTelcoBinding((FrameLayout) view, oneFontButton, imageView, imageView2, scrollView, oneFontTextView, oneTabLayout, oneFontTextView2);
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
    public static FragmentOneConsentTelcoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneConsentTelcoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_consent_telco, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83918a;
    }
}
