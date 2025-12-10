package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class LogSourceMetrics {

    /* renamed from: c */
    public static final LogSourceMetrics f44131c = new Builder().build();

    /* renamed from: a */
    public final String f44132a;

    /* renamed from: b */
    public final List f44133b;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public String f44134a = "";

        /* renamed from: b */
        public List f44135b = new ArrayList();

        public Builder addLogEventDropped(LogEventDropped logEventDropped) {
            this.f44135b.add(logEventDropped);
            return this;
        }

        public LogSourceMetrics build() {
            return new LogSourceMetrics(this.f44134a, Collections.unmodifiableList(this.f44135b));
        }

        public Builder setLogEventDroppedList(List<LogEventDropped> list) {
            this.f44135b = list;
            return this;
        }

        public Builder setLogSource(String str) {
            this.f44134a = str;
            return this;
        }
    }

    public LogSourceMetrics(String str, List list) {
        this.f44132a = str;
        this.f44133b = list;
    }

    public static LogSourceMetrics getDefaultInstance() {
        return f44131c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    public List<LogEventDropped> getLogEventDroppedList() {
        return this.f44133b;
    }

    @Protobuf(tag = 1)
    public String getLogSource() {
        return this.f44132a;
    }
}
