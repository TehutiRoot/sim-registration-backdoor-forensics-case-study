package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ClientMetrics {

    /* renamed from: e */
    public static final ClientMetrics f44114e = new Builder().build();

    /* renamed from: a */
    public final TimeWindow f44115a;

    /* renamed from: b */
    public final List f44116b;

    /* renamed from: c */
    public final GlobalMetrics f44117c;

    /* renamed from: d */
    public final String f44118d;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public TimeWindow f44119a = null;

        /* renamed from: b */
        public List f44120b = new ArrayList();

        /* renamed from: c */
        public GlobalMetrics f44121c = null;

        /* renamed from: d */
        public String f44122d = "";

        public Builder addLogSourceMetrics(LogSourceMetrics logSourceMetrics) {
            this.f44120b.add(logSourceMetrics);
            return this;
        }

        public ClientMetrics build() {
            return new ClientMetrics(this.f44119a, Collections.unmodifiableList(this.f44120b), this.f44121c, this.f44122d);
        }

        public Builder setAppNamespace(String str) {
            this.f44122d = str;
            return this;
        }

        public Builder setGlobalMetrics(GlobalMetrics globalMetrics) {
            this.f44121c = globalMetrics;
            return this;
        }

        public Builder setLogSourceMetricsList(List<LogSourceMetrics> list) {
            this.f44120b = list;
            return this;
        }

        public Builder setWindow(TimeWindow timeWindow) {
            this.f44119a = timeWindow;
            return this;
        }
    }

    public ClientMetrics(TimeWindow timeWindow, List list, GlobalMetrics globalMetrics, String str) {
        this.f44115a = timeWindow;
        this.f44116b = list;
        this.f44117c = globalMetrics;
        this.f44118d = str;
    }

    public static ClientMetrics getDefaultInstance() {
        return f44114e;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 4)
    public String getAppNamespace() {
        return this.f44118d;
    }

    @Encodable.Ignore
    public GlobalMetrics getGlobalMetrics() {
        GlobalMetrics globalMetrics = this.f44117c;
        if (globalMetrics == null) {
            return GlobalMetrics.getDefaultInstance();
        }
        return globalMetrics;
    }

    @Protobuf(tag = 3)
    @Encodable.Field(name = "globalMetrics")
    public GlobalMetrics getGlobalMetricsInternal() {
        return this.f44117c;
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logSourceMetrics")
    public List<LogSourceMetrics> getLogSourceMetricsList() {
        return this.f44116b;
    }

    @Encodable.Ignore
    public TimeWindow getWindow() {
        TimeWindow timeWindow = this.f44115a;
        if (timeWindow == null) {
            return TimeWindow.getDefaultInstance();
        }
        return timeWindow;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "window")
    public TimeWindow getWindowInternal() {
        return this.f44115a;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}
