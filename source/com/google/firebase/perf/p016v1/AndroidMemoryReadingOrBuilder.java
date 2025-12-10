package com.google.firebase.perf.p016v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder */
/* loaded from: classes4.dex */
public interface AndroidMemoryReadingOrBuilder extends MessageLiteOrBuilder {
    long getClientTimeUs();

    int getUsedAppJavaHeapMemoryKb();

    boolean hasClientTimeUs();

    boolean hasUsedAppJavaHeapMemoryKb();
}
