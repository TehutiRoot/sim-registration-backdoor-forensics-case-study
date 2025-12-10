package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneConsentNonTelcoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneConsentNonTelcoBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83917a;
    @NonNull
    public final OneFontButton btnAllow;
    @NonNull
    public final OneFontButton btnNotAllow;
    @NonNull
    public final LinearLayoutCompat contentScroll;
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
    public final View spaceView;
    @NonNull
    public final OneTabLayout tabLanguage;
    @NonNull
    public final TextView textView4;

    public FragmentOneConsentNonTelcoBinding(FrameLayout frameLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, LinearLayoutCompat linearLayoutCompat, ImageView imageView, ImageView imageView2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ScrollView scrollView, View view, OneTabLayout oneTabLayout, TextView textView) {
        this.f83917a = frameLayout;
        this.btnAllow = oneFontButton;
        this.btnNotAllow = oneFontButton2;
        this.contentScroll = linearLayoutCompat;
        this.ivConsentNonTelco = imageView;
        this.ivLogo = imageView2;
        this.nontelcoDetail = oneFontTextView;
        this.nontelcoTitle = oneFontTextView2;
        this.scrollViewNontelco = scrollView;
        this.spaceView = view;
        this.tabLanguage = oneTabLayout;
        this.textView4 = textView;
    }

    @NonNull
    public static FragmentOneConsentNonTelcoBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btn_allow;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btn_not_allow;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.contentScroll;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
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
                                    if (scrollView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.spaceView))) != null) {
                                        i = R.id.tab_language;
                                        OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                                        if (oneTabLayout != null) {
                                            i = R.id.textView4;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                return new FragmentOneConsentNonTelcoBinding((FrameLayout) view, oneFontButton, oneFontButton2, linearLayoutCompat, imageView, imageView2, oneFontTextView, oneFontTextView2, scrollView, findChildViewById, oneTabLayout, textView);
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
    public static FragmentOneConsentNonTelcoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneConsentNonTelcoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_consent_non_telco, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83917a;
    }
}
