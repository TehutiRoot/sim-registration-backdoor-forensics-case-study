package com.google.firebase.perf.p016v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: com.google.firebase.perf.v1.CpuMetricReadingOrBuilder */
/* loaded from: classes4.dex */
public interface CpuMetricReadingOrBuilder extends MessageLiteOrBuilder {
    long getClientTimeUs();

    long getSystemTimeUs();

    long getUserTimeUs();

    boolean hasClientTimeUs();

    boolean hasSystemTimeUs();

    boolean hasUserTimeUs();
}