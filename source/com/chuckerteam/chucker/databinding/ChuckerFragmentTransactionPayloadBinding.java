package com.chuckerteam.chucker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.chuckerteam.chucker.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes3.dex */
public final class ChuckerFragmentTransactionPayloadBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f42783a;
    @NonNull
    public final ImageView emptyPayloadImage;
    @NonNull
    public final TextView emptyPayloadTextView;
    @NonNull
    public final Group emptyStateGroup;
    @NonNull
    public final CircularProgressIndicator loadingProgress;
    @NonNull
    public final RecyclerView payloadRecyclerView;
    @NonNull
    public final LinearLayoutCompat rootSearchSummary;
    @NonNull
    public final ImageButton searchNavButton;
    @NonNull
    public final ImageButton searchNavButtonUp;
    @NonNull
    public final TextView searchSummary;

    public ChuckerFragmentTransactionPayloadBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, Group group, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, LinearLayoutCompat linearLayoutCompat, ImageButton imageButton, ImageButton imageButton2, TextView textView2) {
        this.f42783a = constraintLayout;
        this.emptyPayloadImage = imageView;
        this.emptyPayloadTextView = textView;
        this.emptyStateGroup = group;
        this.loadingProgress = circularProgressIndicator;
        this.payloadRecyclerView = recyclerView;
        this.rootSearchSummary = linearLayoutCompat;
        this.searchNavButton = imageButton;
        this.searchNavButtonUp = imageButton2;
        this.searchSummary = textView2;
    }

    @NonNull
    public static ChuckerFragmentTransactionPayloadBinding bind(@NonNull View view) {
        int i = R.id.emptyPayloadImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.emptyPayloadTextView;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.emptyStateGroup;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null) {
                    i = R.id.loadingProgress;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
                    if (circularProgressIndicator != null) {
                        i = R.id.payloadRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.rootSearchSummary;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.searchNavButton;
                                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                                if (imageButton != null) {
                                    i = R.id.searchNavButtonUp;
                                    ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                                    if (imageButton2 != null) {
                                        i = R.id.searchSummary;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            return new ChuckerFragmentTransactionPayloadBinding((ConstraintLayout) view, imageView, textView, group, circularProgressIndicator, recyclerView, linearLayoutCompat, imageButton, imageButton2, textView2);
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
    public static ChuckerFragmentTransactionPayloadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ChuckerFragmentTransactionPayloadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chucker_fragment_transaction_payload, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f42783a;
    }
}
