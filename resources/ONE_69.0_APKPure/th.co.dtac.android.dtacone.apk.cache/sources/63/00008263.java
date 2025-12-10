package com.chuckerteam.chucker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.chuckerteam.chucker.R;

/* loaded from: classes3.dex */
public final class ChuckerTransactionItemHeadersBinding implements ViewBinding {

    /* renamed from: a */
    public final TextView f42798a;
    @NonNull
    public final TextView responseHeaders;

    public ChuckerTransactionItemHeadersBinding(TextView textView, TextView textView2) {
        this.f42798a = textView;
        this.responseHeaders = textView2;
    }

    @NonNull
    public static ChuckerTransactionItemHeadersBinding bind(@NonNull View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new ChuckerTransactionItemHeadersBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ChuckerTransactionItemHeadersBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ChuckerTransactionItemHeadersBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chucker_transaction_item_headers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.f42798a;
    }
}