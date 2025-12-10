package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.EventInternal;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.a */
/* loaded from: classes3.dex */
public final class C6253a extends EventInternal {

    /* renamed from: a */
    public final String f44053a;

    /* renamed from: b */
    public final Integer f44054b;

    /* renamed from: c */
    public final EncodedPayload f44055c;

    /* renamed from: d */
    public final long f44056d;

    /* renamed from: e */
    public final long f44057e;

    /* renamed from: f */
    public final Map f44058f;

    /* renamed from: g */
    public final Integer f44059g;

    /* renamed from: h */
    public final String f44060h;

    /* renamed from: i */
    public final byte[] f44061i;

    /* renamed from: j */
    public final byte[] f44062j;

    /* renamed from: com.google.android.datatransport.runtime.a$b */
    /* loaded from: classes3.dex */
    public static final class C6255b extends EventInternal.Builder {

        /* renamed from: a */
        public String f44063a;

        /* renamed from: b */
        public Integer f44064b;

        /* renamed from: c */
        public EncodedPayload f44065c;

        /* renamed from: d */
        public Long f44066d;

        /* renamed from: e */
        public Long f44067e;

        /* renamed from: f */
        public Map f44068f;

        /* renamed from: g */
        public Integer f44069g;

        /* renamed from: h */
        public String f44070h;

        /* renamed from: i */
        public byte[] f44071i;

        /* renamed from: j */
        public byte[] f44072j;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal build() {
            String str = "";
            if (this.f44063a == null) {
                str = " transportName";
            }
            if (this.f44065c == null) {
                str = str + " encodedPayload";
            }
            if (this.f44066d == null) {
                str = str + " eventMillis";
            }
            if (this.f44067e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f44068f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C6253a(this.f44063a, this.f44064b, this.f44065c, this.f44066d.longValue(), this.f44067e.longValue(), this.f44068f, this.f44069g, this.f44070h, this.f44071i, this.f44072j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public Map getAutoMetadata() {
            Map map = this.f44068f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setAutoMetadata(Map map) {
            if (map != null) {
                this.f44068f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setCode(Integer num) {
            this.f44064b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEncodedPayload(EncodedPayload encodedPayload) {
            if (encodedPayload != null) {
                this.f44065c = encodedPayload;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEventMillis(long j) {
            this.f44066d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setExperimentIdsClear(byte[] bArr) {
            this.f44071i = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.f44072j = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setProductId(Integer num) {
            this.f44069g = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setPseudonymousId(String str) {
            this.f44070h = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setTransportName(String str) {
            if (str != null) {
                this.f44063a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setUptimeMillis(long j) {
            this.f44067e = Long.valueOf(j);
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
        if (this.f44053a.equals(eventInternal.getTransportName()) && ((num = this.f44054b) != null ? num.equals(eventInternal.getCode()) : eventInternal.getCode() == null) && this.f44055c.equals(eventInternal.getEncodedPayload()) && this.f44056d == eventInternal.getEventMillis() && this.f44057e == eventInternal.getUptimeMillis() && this.f44058f.equals(eventInternal.getAutoMetadata()) && ((num2 = this.f44059g) != null ? num2.equals(eventInternal.getProductId()) : eventInternal.getProductId() == null) && ((str = this.f44060h) != null ? str.equals(eventInternal.getPseudonymousId()) : eventInternal.getPseudonymousId() == null)) {
            byte[] bArr = this.f44061i;
            boolean z = eventInternal instanceof C6253a;
            if (z) {
                experimentIdsClear = ((C6253a) eventInternal).f44061i;
            } else {
                experimentIdsClear = eventInternal.getExperimentIdsClear();
            }
            if (Arrays.equals(bArr, experimentIdsClear)) {
                byte[] bArr2 = this.f44062j;
                if (z) {
                    experimentIdsEncrypted = ((C6253a) eventInternal).f44062j;
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
        return this.f44058f;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public Integer getCode() {
        return this.f44054b;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public EncodedPayload getEncodedPayload() {
        return this.f44055c;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
        return this.f44056d;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public byte[] getExperimentIdsClear() {
        return this.f44061i;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public byte[] getExperimentIdsEncrypted() {
        return this.f44062j;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public Integer getProductId() {
        return this.f44059g;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public String getPseudonymousId() {
        return this.f44060h;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public String getTransportName() {
        return this.f44053a;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
        return this.f44057e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f44053a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f44054b;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.f44056d;
        long j2 = this.f44057e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f44055c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f44058f.hashCode()) * 1000003;
        Integer num2 = this.f44059g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str = this.f44060h;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f44061i)) * 1000003) ^ Arrays.hashCode(this.f44062j);
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f44053a + ", code=" + this.f44054b + ", encodedPayload=" + this.f44055c + ", eventMillis=" + this.f44056d + ", uptimeMillis=" + this.f44057e + ", autoMetadata=" + this.f44058f + ", productId=" + this.f44059g + ", pseudonymousId=" + this.f44060h + ", experimentIdsClear=" + Arrays.toString(this.f44061i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f44062j) + "}";
    }

    public C6253a(String str, Integer num, EncodedPayload encodedPayload, long j, long j2, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f44053a = str;
        this.f44054b = num;
        this.f44055c = encodedPayload;
        this.f44056d = j;
        this.f44057e = j2;
        this.f44058f = map;
        this.f44059g = num2;
        this.f44060h = str2;
        this.f44061i = bArr;
        this.f44062j = bArr2;
    }
}