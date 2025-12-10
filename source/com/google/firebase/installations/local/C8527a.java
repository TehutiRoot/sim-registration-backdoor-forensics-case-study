package com.google.firebase.installations.local;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* renamed from: com.google.firebase.installations.local.a */
/* loaded from: classes4.dex */
public final class C8527a extends PersistedInstallationEntry {

    /* renamed from: a */
    public final String f55531a;

    /* renamed from: b */
    public final PersistedInstallation.RegistrationStatus f55532b;

    /* renamed from: c */
    public final String f55533c;

    /* renamed from: d */
    public final String f55534d;

    /* renamed from: e */
    public final long f55535e;

    /* renamed from: f */
    public final long f55536f;

    /* renamed from: g */
    public final String f55537g;

    /* renamed from: com.google.firebase.installations.local.a$b */
    /* loaded from: classes4.dex */
    public static final class C8529b extends PersistedInstallationEntry.Builder {

        /* renamed from: a */
        public String f55538a;

        /* renamed from: b */
        public PersistedInstallation.RegistrationStatus f55539b;

        /* renamed from: c */
        public String f55540c;

        /* renamed from: d */
        public String f55541d;

        /* renamed from: e */
        public Long f55542e;

        /* renamed from: f */
        public Long f55543f;

        /* renamed from: g */
        public String f55544g;

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry build() {
            String str = "";
            if (this.f55539b == null) {
                str = " registrationStatus";
            }
            if (this.f55542e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f55543f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C8527a(this.f55538a, this.f55539b, this.f55540c, this.f55541d, this.f55542e.longValue(), this.f55543f.longValue(), this.f55544g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setAuthToken(String str) {
            this.f55540c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setExpiresInSecs(long j) {
            this.f55542e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
            this.f55538a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setFisError(String str) {
            this.f55544g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setRefreshToken(String str) {
            this.f55541d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.f55539b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j) {
            this.f55543f = Long.valueOf(j);
            return this;
        }

        public C8529b() {
        }

        public C8529b(PersistedInstallationEntry persistedInstallationEntry) {
            this.f55538a = persistedInstallationEntry.getFirebaseInstallationId();
            this.f55539b = persistedInstallationEntry.getRegistrationStatus();
            this.f55540c = persistedInstallationEntry.getAuthToken();
            this.f55541d = persistedInstallationEntry.getRefreshToken();
            this.f55542e = Long.valueOf(persistedInstallationEntry.getExpiresInSecs());
            this.f55543f = Long.valueOf(persistedInstallationEntry.getTokenCreationEpochInSecs());
            this.f55544g = persistedInstallationEntry.getFisError();
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str3 = this.f55531a;
        if (str3 != null ? str3.equals(persistedInstallationEntry.getFirebaseInstallationId()) : persistedInstallationEntry.getFirebaseInstallationId() == null) {
            if (this.f55532b.equals(persistedInstallationEntry.getRegistrationStatus()) && ((str = this.f55533c) != null ? str.equals(persistedInstallationEntry.getAuthToken()) : persistedInstallationEntry.getAuthToken() == null) && ((str2 = this.f55534d) != null ? str2.equals(persistedInstallationEntry.getRefreshToken()) : persistedInstallationEntry.getRefreshToken() == null) && this.f55535e == persistedInstallationEntry.getExpiresInSecs() && this.f55536f == persistedInstallationEntry.getTokenCreationEpochInSecs()) {
                String str4 = this.f55537g;
                if (str4 == null) {
                    if (persistedInstallationEntry.getFisError() == null) {
                        return true;
                    }
                } else if (str4.equals(persistedInstallationEntry.getFisError())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public String getAuthToken() {
        return this.f55533c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getExpiresInSecs() {
        return this.f55535e;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public String getFirebaseInstallationId() {
        return this.f55531a;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public String getFisError() {
        return this.f55537g;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public String getRefreshToken() {
        return this.f55534d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.f55532b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getTokenCreationEpochInSecs() {
        return this.f55536f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f55531a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f55532b.hashCode()) * 1000003;
        String str2 = this.f55533c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f55534d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.f55535e;
        long j2 = this.f55536f;
        int i3 = (((((i2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f55537g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public PersistedInstallationEntry.Builder toBuilder() {
        return new C8529b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f55531a + ", registrationStatus=" + this.f55532b + ", authToken=" + this.f55533c + ", refreshToken=" + this.f55534d + ", expiresInSecs=" + this.f55535e + ", tokenCreationEpochInSecs=" + this.f55536f + ", fisError=" + this.f55537g + "}";
    }

    public C8527a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.f55531a = str;
        this.f55532b = registrationStatus;
        this.f55533c = str2;
        this.f55534d = str3;
        this.f55535e = j;
        this.f55536f = j2;
        this.f55537g = str4;
    }
}
