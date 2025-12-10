package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneConsentTmnBinding */
/* loaded from: classes7.dex */
public final class FragmentOneConsentTmnBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84017a;
    @NonNull
    public final OneFontButton btnAllow;
    @NonNull
    public final OneFontButton btnNotAllow;
    @NonNull
    public final LinearLayout contentScroll;
    @NonNull
    public final ImageView ivConsentNonTelco;
    @NonNull
    public final ImageView ivLogo;
    @NonNull
    public final OneFontTextView nontelcoDetail;
    @NonNull
    public final OneFontTextView nontelcoTitle;
    @NonNull
    public final ScrollView scrollViewNontelco;
    @NonNull
    public final OneTabLayout tabLanguage;

    public FragmentOneConsentTmnBinding(FrameLayout frameLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ScrollView scrollView, OneTabLayout oneTabLayout) {
        this.f84017a = frameLayout;
        this.btnAllow = oneFontButton;
        this.btnNotAllow = oneFontButton2;
        this.contentScroll = linearLayout;
        this.ivConsentNonTelco = imageView;
        this.ivLogo = imageView2;
        this.nontelcoDetail = oneFontTextView;
        this.nontelcoTitle = oneFontTextView2;
        this.scrollViewNontelco = scrollView;
        this.tabLanguage = oneTabLayout;
    }

    @NonNull
    public static FragmentOneConsentTmnBinding bind(@NonNull View view) {
        int i = R.id.btn_allow;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btn_not_allow;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.contentScroll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.ivConsentNonTelco;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.ivLogo;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.nontelco_detail;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.nontelco_title;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.scroll_view_nontelco;
                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                    if (scrollView != null) {
                                        i = R.id.tab_language;
                                        OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                                        if (oneTabLayout != null) {
                                            return new FragmentOneConsentTmnBinding((FrameLayout) view, oneFontButton, oneFontButton2, linearLayout, imageView, imageView2, oneFontTextView, oneFontTextView2, scrollView, oneTabLayout);
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
    public static FragmentOneConsentTmnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneConsentTmnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_consent_tmn, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84017a;
    }
}