package com.chuckerteam.chucker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.chuckerteam.chucker.R;

/* loaded from: classes3.dex */
public final class ChuckerFragmentTransactionOverviewBinding implements ViewBinding {

    /* renamed from: a */
    public final ScrollView f42782a;
    @NonNull
    public final Barrier barrierRequestSize;
    @NonNull
    public final Barrier barrierRequestTime;
    @NonNull
    public final Barrier barrierResponseSize;
    @NonNull
    public final Barrier barrierResponseTime;
    @NonNull
    public final TextView cipherSuite;
    @NonNull
    public final Group cipherSuiteGroup;
    @NonNull
    public final TextView cipherSuiteValue;
    @NonNull
    public final TextView duration;
    @NonNull
    public final TextView method;
    @NonNull
    public final Guideline overviewGuideline;
    @NonNull
    public final TextView protocol;
    @NonNull
    public final TextView requestSize;
    @NonNull
    public final TextView requestSizeLabel;
    @NonNull
    public final TextView requestTime;
    @NonNull
    public final TextView requestTimeLabel;
    @NonNull
    public final TextView response;
    @NonNull
    public final TextView responseSize;
    @NonNull
    public final TextView responseSizeLabel;
    @NonNull
    public final TextView responseTime;
    @NonNull
    public final TextView responseTimeLabel;
    @NonNull
    public final TextView ssl;
    @NonNull
    public final Group sslGroup;
    @NonNull
    public final TextView sslValue;
    @NonNull
    public final TextView status;
    @NonNull
    public final Group tlsGroup;
    @NonNull
    public final TextView tlsVersion;
    @NonNull
    public final TextView tlsVersionValue;
    @NonNull
    public final TextView totalSize;
    @NonNull
    public final TextView url;

    public ChuckerFragmentTransactionOverviewBinding(ScrollView scrollView, Barrier barrier, Barrier barrier2, Barrier barrier3, Barrier barrier4, TextView textView, Group group, TextView textView2, TextView textView3, TextView textView4, Guideline guideline, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, Group group2, TextView textView16, TextView textView17, Group group3, TextView textView18, TextView textView19, TextView textView20, TextView textView21) {
        this.f42782a = scrollView;
        this.barrierRequestSize = barrier;
        this.barrierRequestTime = barrier2;
        this.barrierResponseSize = barrier3;
        this.barrierResponseTime = barrier4;
        this.cipherSuite = textView;
        this.cipherSuiteGroup = group;
        this.cipherSuiteValue = textView2;
        this.duration = textView3;
        this.method = textView4;
        this.overviewGuideline = guideline;
        this.protocol = textView5;
        this.requestSize = textView6;
        this.requestSizeLabel = textView7;
        this.requestTime = textView8;
        this.requestTimeLabel = textView9;
        this.response = textView10;
        this.responseSize = textView11;
        this.responseSizeLabel = textView12;
        this.responseTime = textView13;
        this.responseTimeLabel = textView14;
        this.ssl = textView15;
        this.sslGroup = group2;
        this.sslValue = textView16;
        this.status = textView17;
        this.tlsGroup = group3;
        this.tlsVersion = textView18;
        this.tlsVersionValue = textView19;
        this.totalSize = textView20;
        this.url = textView21;
    }

    @NonNull
    public static ChuckerFragmentTransactionOverviewBinding bind(@NonNull View view) {
        int i = R.id.barrierRequestSize;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = R.id.barrierRequestTime;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null) {
                i = R.id.barrierResponseSize;
                Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i);
                if (barrier3 != null) {
                    i = R.id.barrierResponseTime;
                    Barrier barrier4 = (Barrier) ViewBindings.findChildViewById(view, i);
                    if (barrier4 != null) {
                        i = R.id.cipherSuite;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.cipherSuiteGroup;
                            Group group = (Group) ViewBindings.findChildViewById(view, i);
                            if (group != null) {
                                i = R.id.cipherSuiteValue;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.duration;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.method;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = R.id.overviewGuideline;
                                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                            if (guideline != null) {
                                                i = R.id.protocol;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = R.id.requestSize;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        i = R.id.requestSizeLabel;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView7 != null) {
                                                            i = R.id.requestTime;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView8 != null) {
                                                                i = R.id.requestTimeLabel;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView9 != null) {
                                                                    i = R.id.response;
                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView10 != null) {
                                                                        i = R.id.responseSize;
                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView11 != null) {
                                                                            i = R.id.responseSizeLabel;
                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView12 != null) {
                                                                                i = R.id.responseTime;
                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView13 != null) {
                                                                                    i = R.id.responseTimeLabel;
                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView14 != null) {
                                                                                        i = R.id.ssl;
                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView15 != null) {
                                                                                            i = R.id.sslGroup;
                                                                                            Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                                                                                            if (group2 != null) {
                                                                                                i = R.id.sslValue;
                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView16 != null) {
                                                                                                    i = R.id.status;
                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView17 != null) {
                                                                                                        i = R.id.tlsGroup;
                                                                                                        Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                                                                                                        if (group3 != null) {
                                                                                                            i = R.id.tlsVersion;
                                                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textView18 != null) {
                                                                                                                i = R.id.tlsVersionValue;
                                                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textView19 != null) {
                                                                                                                    i = R.id.totalSize;
                                                                                                                    TextView textView20 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (textView20 != null) {
                                                                                                                        i = R.id.url;
                                                                                                                        TextView textView21 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (textView21 != null) {
                                                                                                                            return new ChuckerFragmentTransactionOverviewBinding((ScrollView) view, barrier, barrier2, barrier3, barrier4, textView, group, textView2, textView3, textView4, guideline, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, group2, textView16, textView17, group3, textView18, textView19, textView20, textView21);
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
    public static ChuckerFragmentTransactionOverviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ChuckerFragmentTransactionOverviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chucker_fragment_transaction_overview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.f42782a;
    }
}
