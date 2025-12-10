package com.chuckerteam.chucker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.chuckerteam.chucker.R;

/* loaded from: classes3.dex */
public final class ChuckerListItemTransactionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f42784a;
    @NonNull
    public final TextView code;
    @NonNull
    public final TextView duration;
    @NonNull
    public final ImageView graphqlIcon;
    @NonNull
    public final TextView graphqlPath;
    @NonNull
    public final Guideline guideline;
    @NonNull
    public final TextView host;
    @NonNull
    public final TextView path;
    @NonNull
    public final TextView size;
    @NonNull
    public final ImageView ssl;
    @NonNull
    public final TextView timeStart;

    public ChuckerListItemTransactionBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, Guideline guideline, TextView textView4, TextView textView5, TextView textView6, ImageView imageView2, TextView textView7) {
        this.f42784a = constraintLayout;
        this.code = textView;
        this.duration = textView2;
        this.graphqlIcon = imageView;
        this.graphqlPath = textView3;
        this.guideline = guideline;
        this.host = textView4;
        this.path = textView5;
        this.size = textView6;
        this.ssl = imageView2;
        this.timeStart = textView7;
    }

    @NonNull
    public static ChuckerListItemTransactionBinding bind(@NonNull View view) {
        int i = R.id.code;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.duration;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.graphqlIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.graphqlPath;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.guideline;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            i = R.id.host;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.path;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.size;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        i = R.id.ssl;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = R.id.timeStart;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                return new ChuckerListItemTransactionBinding((ConstraintLayout) view, textView, textView2, imageView, textView3, guideline, textView4, textView5, textView6, imageView2, textView7);
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
    public static ChuckerListItemTransactionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ChuckerListItemTransactionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chucker_list_item_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f42784a;
    }
}
