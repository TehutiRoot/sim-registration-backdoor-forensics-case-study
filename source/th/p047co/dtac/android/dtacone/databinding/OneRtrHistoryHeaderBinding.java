package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneRtrHistoryHeaderBinding */
/* loaded from: classes7.dex */
public final class OneRtrHistoryHeaderBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84524a;
    @NonNull
    public final CardView cvRectify;
    @NonNull
    public final FrameLayout layoutTitle;
    @NonNull
    public final OneFontTextView listTitle;
    @NonNull
    public final OneFontTextView listValue;
    @NonNull
    public final OneFontTextView title;
    @NonNull
    public final OneFontTextView totalTitle;
    @NonNull
    public final OneFontTextView totalValue;
    @NonNull
    public final View vSeparateHeader;

    public OneRtrHistoryHeaderBinding(LinearLayoutCompat linearLayoutCompat, CardView cardView, FrameLayout frameLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, View view) {
        this.f84524a = linearLayoutCompat;
        this.cvRectify = cardView;
        this.layoutTitle = frameLayout;
        this.listTitle = oneFontTextView;
        this.listValue = oneFontTextView2;
        this.title = oneFontTextView3;
        this.totalTitle = oneFontTextView4;
        this.totalValue = oneFontTextView5;
        this.vSeparateHeader = view;
    }

    @NonNull
    public static OneRtrHistoryHeaderBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.cvRectify;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.layoutTitle;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.listTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.listValue;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.title;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.totalTitle;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.totalValue;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateHeader))) != null) {
                                    return new OneRtrHistoryHeaderBinding((LinearLayoutCompat) view, cardView, frameLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, findChildViewById);
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
    public static OneRtrHistoryHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneRtrHistoryHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_rtr_history_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84524a;
    }
}
