package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapableViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentByidSubscriberinfoBinding */
/* loaded from: classes7.dex */
public final class FragmentByidSubscriberinfoBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83658a;
    @NonNull
    public final WrapableViewPager pager;
    @NonNull
    public final DtacTabLayout tabs;
    @NonNull
    public final DtacFontTextView textViewNoData;

    public FragmentByidSubscriberinfoBinding(LinearLayout linearLayout, WrapableViewPager wrapableViewPager, DtacTabLayout dtacTabLayout, DtacFontTextView dtacFontTextView) {
        this.f83658a = linearLayout;
        this.pager = wrapableViewPager;
        this.tabs = dtacTabLayout;
        this.textViewNoData = dtacFontTextView;
    }

    @NonNull
    public static FragmentByidSubscriberinfoBinding bind(@NonNull View view) {
        int i = R.id.pager;
        WrapableViewPager wrapableViewPager = (WrapableViewPager) ViewBindings.findChildViewById(view, i);
        if (wrapableViewPager != null) {
            i = R.id.tabs;
            DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
            if (dtacTabLayout != null) {
                i = R.id.textViewNoData;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new FragmentByidSubscriberinfoBinding((LinearLayout) view, wrapableViewPager, dtacTabLayout, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentByidSubscriberinfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentByidSubscriberinfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_byid_subscriberinfo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83658a;
    }
}
