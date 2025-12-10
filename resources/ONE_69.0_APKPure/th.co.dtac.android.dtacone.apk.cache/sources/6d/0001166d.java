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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidConsentTmnBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidConsentTmnBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84124a;
    @NonNull
    public final OneFontButton btnAllow;
    @NonNull
    public final OneFontButton btnNotAllow;
    @NonNull
    public final LinearLayout caution;
    @NonNull
    public final LinearLayout contentScroll;
    @NonNull
    public final ImageView infoImageView;
    @NonNull
    public final ImageView ivTMN;
    @NonNull
    public final ScrollView scrollViewNontelco;
    @NonNull
    public final OneTabLayout tabLanguage;
    @NonNull
    public final OneFontTextView tmnDetail;
    @NonNull
    public final OneFontTextView tmnTitle;

    public FragmentOnePostpaidConsentTmnBinding(FrameLayout frameLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, ScrollView scrollView, OneTabLayout oneTabLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84124a = frameLayout;
        this.btnAllow = oneFontButton;
        this.btnNotAllow = oneFontButton2;
        this.caution = linearLayout;
        this.contentScroll = linearLayout2;
        this.infoImageView = imageView;
        this.ivTMN = imageView2;
        this.scrollViewNontelco = scrollView;
        this.tabLanguage = oneTabLayout;
        this.tmnDetail = oneFontTextView;
        this.tmnTitle = oneFontTextView2;
    }

    @NonNull
    public static FragmentOnePostpaidConsentTmnBinding bind(@NonNull View view) {
        int i = R.id.btn_allow;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btn_not_allow;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.caution;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.contentScroll;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.infoImageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.ivTMN;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.scroll_view_nontelco;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                if (scrollView != null) {
                                    i = R.id.tab_language;
                                    OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                                    if (oneTabLayout != null) {
                                        i = R.id.tmn_detail;
                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView != null) {
                                            i = R.id.tmn_title;
                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView2 != null) {
                                                return new FragmentOnePostpaidConsentTmnBinding((FrameLayout) view, oneFontButton, oneFontButton2, linearLayout, linearLayout2, imageView, imageView2, scrollView, oneTabLayout, oneFontTextView, oneFontTextView2);
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
    public static FragmentOnePostpaidConsentTmnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidConsentTmnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_consent_tmn, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84124a;
    }
}