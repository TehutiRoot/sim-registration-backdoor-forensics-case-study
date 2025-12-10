package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class LogSourceMetrics {

    /* renamed from: c */
    public static final LogSourceMetrics f44143c = new Builder().build();

    /* renamed from: a */
    public final String f44144a;

    /* renamed from: b */
    public final List f44145b;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public String f44146a = "";

        /* renamed from: b */
        public List f44147b = new ArrayList();

        public Builder addLogEventDropped(LogEventDropped logEventDropped) {
            this.f44147b.add(logEventDropped);
            return this;
        }

        public LogSourceMetrics build() {
            return new LogSourceMetrics(this.f44146a, Collections.unmodifiableList(this.f44147b));
        }

        public Builder setLogEventDroppedList(List<LogEventDropped> list) {
            this.f44147b = list;
            return this;
        }

        public Builder setLogSource(String str) {
            this.f44146a = str;
            return this;
        }
    }

    public LogSourceMetrics(String str, List list) {
        this.f44144a = str;
        this.f44145b = list;
    }

    public static LogSourceMetrics getDefaultInstance() {
        return f44143c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    public List<LogEventDropped> getLogEventDroppedList() {
        return this.f44145b;
    }

    @Protobuf(tag = 1)
    public String getLogSource() {
        return this.f44144a;
    }
}