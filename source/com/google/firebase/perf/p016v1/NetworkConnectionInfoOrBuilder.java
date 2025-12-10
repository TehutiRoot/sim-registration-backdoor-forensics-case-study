package com.google.firebase.perf.p016v1;

import com.google.firebase.perf.p016v1.NetworkConnectionInfo;
import com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder */
/* loaded from: classes4.dex */
public interface NetworkConnectionInfoOrBuilder extends MessageLiteOrBuilder {
    NetworkConnectionInfo.MobileSubtype getMobileSubtype();

    NetworkConnectionInfo.NetworkType getNetworkType();

    boolean hasMobileSubtype();

    boolean hasNetworkType();
}
