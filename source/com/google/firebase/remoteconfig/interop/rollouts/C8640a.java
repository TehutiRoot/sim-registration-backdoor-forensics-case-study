package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;

/* renamed from: com.google.firebase.remoteconfig.interop.rollouts.a */
/* loaded from: classes4.dex */
public final class C8640a extends RolloutAssignment {

    /* renamed from: a */
    public final String f56467a;

    /* renamed from: b */
    public final String f56468b;

    /* renamed from: c */
    public final String f56469c;

    /* renamed from: d */
    public final String f56470d;

    /* renamed from: e */
    public final long f56471e;

    /* renamed from: com.google.firebase.remoteconfig.interop.rollouts.a$b */
    /* loaded from: classes4.dex */
    public static final class C8642b extends RolloutAssignment.Builder {

        /* renamed from: a */
        public String f56472a;

        /* renamed from: b */
        public String f56473b;

        /* renamed from: c */
        public String f56474c;

        /* renamed from: d */
        public String f56475d;

        /* renamed from: e */
        public long f56476e;

        /* renamed from: f */
        public byte f56477f;

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment build() {
            if (this.f56477f == 1 && this.f56472a != null && this.f56473b != null && this.f56474c != null && this.f56475d != null) {
                return new C8640a(this.f56472a, this.f56473b, this.f56474c, this.f56475d, this.f56476e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f56472a == null) {
                sb.append(" rolloutId");
            }
            if (this.f56473b == null) {
                sb.append(" variantId");
            }
            if (this.f56474c == null) {
                sb.append(" parameterKey");
            }
            if (this.f56475d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f56477f) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterKey(String str) {
            if (str != null) {
                this.f56474c = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterValue(String str) {
            if (str != null) {
                this.f56475d = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setRolloutId(String str) {
            if (str != null) {
                this.f56472a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setTemplateVersion(long j) {
            this.f56476e = j;
            this.f56477f = (byte) (this.f56477f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setVariantId(String str) {
            if (str != null) {
                this.f56473b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        if (this.f56467a.equals(rolloutAssignment.getRolloutId()) && this.f56468b.equals(rolloutAssignment.getVariantId()) && this.f56469c.equals(rolloutAssignment.getParameterKey()) && this.f56470d.equals(rolloutAssignment.getParameterValue()) && this.f56471e == rolloutAssignment.getTemplateVersion()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getParameterKey() {
        return this.f56469c;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getParameterValue() {
        return this.f56470d;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getRolloutId() {
        return this.f56467a;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public long getTemplateVersion() {
        return this.f56471e;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getVariantId() {
        return this.f56468b;
    }

    public int hashCode() {
        long j = this.f56471e;
        return ((((((((this.f56467a.hashCode() ^ 1000003) * 1000003) ^ this.f56468b.hashCode()) * 1000003) ^ this.f56469c.hashCode()) * 1000003) ^ this.f56470d.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f56467a + ", variantId=" + this.f56468b + ", parameterKey=" + this.f56469c + ", parameterValue=" + this.f56470d + ", templateVersion=" + this.f56471e + "}";
    }

    public C8640a(String str, String str2, String str3, String str4, long j) {
        this.f56467a = str;
        this.f56468b = str2;
        this.f56469c = str3;
        this.f56470d = str4;
        this.f56471e = j;
    }
}
