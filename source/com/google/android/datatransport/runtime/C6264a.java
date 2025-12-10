package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.EventInternal;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.a */
/* loaded from: classes3.dex */
public final class C6264a extends EventInternal {

    /* renamed from: a */
    public final String f44041a;

    /* renamed from: b */
    public final Integer f44042b;

    /* renamed from: c */
    public final EncodedPayload f44043c;

    /* renamed from: d */
    public final long f44044d;

    /* renamed from: e */
    public final long f44045e;

    /* renamed from: f */
    public final Map f44046f;

    /* renamed from: g */
    public final Integer f44047g;

    /* renamed from: h */
    public final String f44048h;

    /* renamed from: i */
    public final byte[] f44049i;

    /* renamed from: j */
    public final byte[] f44050j;

    /* renamed from: com.google.android.datatransport.runtime.a$b */
    /* loaded from: classes3.dex */
    public static final class C6266b extends EventInternal.Builder {

        /* renamed from: a */
        public String f44051a;

        /* renamed from: b */
        public Integer f44052b;

        /* renamed from: c */
        public EncodedPayload f44053c;

        /* renamed from: d */
        public Long f44054d;

        /* renamed from: e */
        public Long f44055e;

        /* renamed from: f */
        public Map f44056f;

        /* renamed from: g */
        public Integer f44057g;

        /* renamed from: h */
        public String f44058h;

        /* renamed from: i */
        public byte[] f44059i;

        /* renamed from: j */
        public byte[] f44060j;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal build() {
            String str = "";
            if (this.f44051a == null) {
                str = " transportName";
            }
            if (this.f44053c == null) {
                str = str + " encodedPayload";
            }
            if (this.f44054d == null) {
                str = str + " eventMillis";
            }
            if (this.f44055e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f44056f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C6264a(this.f44051a, this.f44052b, this.f44053c, this.f44054d.longValue(), this.f44055e.longValue(), this.f44056f, this.f44057g, this.f44058h, this.f44059i, this.f44060j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public Map getAutoMetadata() {
            Map map = this.f44056f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setAutoMetadata(Map map) {
            if (map != null) {
                this.f44056f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setCode(Integer num) {
            this.f44052b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEncodedPayload(EncodedPayload encodedPayload) {
            if (encodedPayload != null) {
                this.f44053c = encodedPayload;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEventMillis(long j) {
            this.f44054d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setExperimentIdsClear(byte[] bArr) {
            this.f44059i = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.f44060j = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setProductId(Integer num) {
            this.f44057g = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setPseudonymousId(String str) {
            this.f44058h = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setTransportName(String str) {
            if (str != null) {
                this.f44051a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setUptimeMillis(long j) {
            this.f44055e = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        byte[] experimentIdsClear;
        byte[] experimentIdsEncrypted;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        if (this.f44041a.equals(eventInternal.getTransportName()) && ((num = this.f44042b) != null ? num.equals(eventInternal.getCode()) : eventInternal.getCode() == null) && this.f44043c.equals(eventInternal.getEncodedPayload()) && this.f44044d == eventInternal.getEventMillis() && this.f44045e == eventInternal.getUptimeMillis() && this.f44046f.equals(eventInternal.getAutoMetadata()) && ((num2 = this.f44047g) != null ? num2.equals(eventInternal.getProductId()) : eventInternal.getProductId() == null) && ((str = this.f44048h) != null ? str.equals(eventInternal.getPseudonymousId()) : eventInternal.getPseudonymousId() == null)) {
            byte[] bArr = this.f44049i;
            boolean z = eventInternal instanceof C6264a;
            if (z) {
                experimentIdsClear = ((C6264a) eventInternal).f44049i;
            } else {
                experimentIdsClear = eventInternal.getExperimentIdsClear();
            }
            if (Arrays.equals(bArr, experimentIdsClear)) {
                byte[] bArr2 = this.f44050j;
                if (z) {
                    experimentIdsEncrypted = ((C6264a) eventInternal).f44050j;
                } else {
                    experimentIdsEncrypted = eventInternal.getExperimentIdsEncrypted();
                }
                if (Arrays.equals(bArr2, experimentIdsEncrypted)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public Map getAutoMetadata() {
        return this.f44046f;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public Integer getCode() {
        return this.f44042b;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public EncodedPayload getEncodedPayload() {
        return this.f44043c;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
        return this.f44044d;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public byte[] getExperimentIdsClear() {
        return this.f44049i;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public byte[] getExperimentIdsEncrypted() {
        return this.f44050j;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public Integer getProductId() {
        return this.f44047g;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public String getPseudonymousId() {
        return this.f44048h;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public String getTransportName() {
        return this.f44041a;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
        return this.f44045e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f44041a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f44042b;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.f44044d;
        long j2 = this.f44045e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f44043c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f44046f.hashCode()) * 1000003;
        Integer num2 = this.f44047g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str = this.f44048h;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f44049i)) * 1000003) ^ Arrays.hashCode(this.f44050j);
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f44041a + ", code=" + this.f44042b + ", encodedPayload=" + this.f44043c + ", eventMillis=" + this.f44044d + ", uptimeMillis=" + this.f44045e + ", autoMetadata=" + this.f44046f + ", productId=" + this.f44047g + ", pseudonymousId=" + this.f44048h + ", experimentIdsClear=" + Arrays.toString(this.f44049i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f44050j) + "}";
    }

    public C6264a(String str, Integer num, EncodedPayload encodedPayload, long j, long j2, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f44041a = str;
        this.f44042b = num;
        this.f44043c = encodedPayload;
        this.f44044d = j;
        this.f44045e = j2;
        this.f44046f = map;
        this.f44047g = num2;
        this.f44048h = str2;
        this.f44049i = bArr;
        this.f44050j = bArr2;
    }
}
