package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.LogRequest;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.internal.h */
/* loaded from: classes3.dex */
public final class C6249h extends LogRequest {

    /* renamed from: a */
    public final long f43988a;

    /* renamed from: b */
    public final long f43989b;

    /* renamed from: c */
    public final ClientInfo f43990c;

    /* renamed from: d */
    public final Integer f43991d;

    /* renamed from: e */
    public final String f43992e;

    /* renamed from: f */
    public final List f43993f;

    /* renamed from: g */
    public final QosTier f43994g;

    /* renamed from: com.google.android.datatransport.cct.internal.h$b */
    /* loaded from: classes3.dex */
    public static final class C6251b extends LogRequest.Builder {

        /* renamed from: a */
        public Long f43995a;

        /* renamed from: b */
        public Long f43996b;

        /* renamed from: c */
        public ClientInfo f43997c;

        /* renamed from: d */
        public Integer f43998d;

        /* renamed from: e */
        public String f43999e;

        /* renamed from: f */
        public List f44000f;

        /* renamed from: g */
        public QosTier f44001g;

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: a */
        public LogRequest.Builder mo49153a(Integer num) {
            this.f43998d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: b */
        public LogRequest.Builder mo49152b(String str) {
            this.f43999e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest build() {
            String str = "";
            if (this.f43995a == null) {
                str = " requestTimeMs";
            }
            if (this.f43996b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C6249h(this.f43995a.longValue(), this.f43996b.longValue(), this.f43997c, this.f43998d, this.f43999e, this.f44000f, this.f44001g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setClientInfo(ClientInfo clientInfo) {
            this.f43997c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setLogEvents(List list) {
            this.f44000f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setQosTier(QosTier qosTier) {
            this.f44001g = qosTier;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setRequestTimeMs(long j) {
            this.f43995a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setRequestUptimeMs(long j) {
            this.f43996b = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.f43988a == logRequest.getRequestTimeMs() && this.f43989b == logRequest.getRequestUptimeMs() && ((clientInfo = this.f43990c) != null ? clientInfo.equals(logRequest.getClientInfo()) : logRequest.getClientInfo() == null) && ((num = this.f43991d) != null ? num.equals(logRequest.getLogSource()) : logRequest.getLogSource() == null) && ((str = this.f43992e) != null ? str.equals(logRequest.getLogSourceName()) : logRequest.getLogSourceName() == null) && ((list = this.f43993f) != null ? list.equals(logRequest.getLogEvents()) : logRequest.getLogEvents() == null)) {
            QosTier qosTier = this.f43994g;
            if (qosTier == null) {
                if (logRequest.getQosTier() == null) {
                    return true;
                }
            } else if (qosTier.equals(logRequest.getQosTier())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public ClientInfo getClientInfo() {
        return this.f43990c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public List getLogEvents() {
        return this.f43993f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public Integer getLogSource() {
        return this.f43991d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public String getLogSourceName() {
        return this.f43992e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public QosTier getQosTier() {
        return this.f43994g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public long getRequestTimeMs() {
        return this.f43988a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public long getRequestUptimeMs() {
        return this.f43989b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.f43988a;
        long j2 = this.f43989b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f43990c;
        int i2 = 0;
        if (clientInfo == null) {
            hashCode = 0;
        } else {
            hashCode = clientInfo.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        Integer num = this.f43991d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str = this.f43992e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        List list = this.f43993f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        QosTier qosTier = this.f43994g;
        if (qosTier != null) {
            i2 = qosTier.hashCode();
        }
        return i6 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f43988a + ", requestUptimeMs=" + this.f43989b + ", clientInfo=" + this.f43990c + ", logSource=" + this.f43991d + ", logSourceName=" + this.f43992e + ", logEvents=" + this.f43993f + ", qosTier=" + this.f43994g + "}";
    }

    public C6249h(long j, long j2, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f43988a = j;
        this.f43989b = j2;
        this.f43990c = clientInfo;
        this.f43991d = num;
        this.f43992e = str;
        this.f43993f = list;
        this.f43994g = qosTier;
    }
}
