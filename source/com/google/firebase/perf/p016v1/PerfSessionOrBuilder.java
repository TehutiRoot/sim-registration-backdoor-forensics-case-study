package com.google.firebase.perf.p016v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* renamed from: com.google.firebase.perf.v1.PerfSessionOrBuilder */
/* loaded from: classes4.dex */
public interface PerfSessionOrBuilder extends MessageLiteOrBuilder {
    String getSessionId();

    ByteString getSessionIdBytes();

    SessionVerbosity getSessionVerbosity(int i);

    int getSessionVerbosityCount();

    List<SessionVerbosity> getSessionVerbosityList();

    boolean hasSessionId();
}
