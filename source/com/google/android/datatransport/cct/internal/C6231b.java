package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;

/* renamed from: com.google.android.datatransport.cct.internal.b */
/* loaded from: classes3.dex */
public final class C6231b extends ClientInfo {

    /* renamed from: a */
    public final ClientInfo.ClientType f43954a;

    /* renamed from: b */
    public final AndroidClientInfo f43955b;

    /* renamed from: com.google.android.datatransport.cct.internal.b$b */
    /* loaded from: classes3.dex */
    public static final class C6233b extends ClientInfo.Builder {

        /* renamed from: a */
        public ClientInfo.ClientType f43956a;

        /* renamed from: b */
        public AndroidClientInfo f43957b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo build() {
            return new C6231b(this.f43956a, this.f43957b);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo.Builder setAndroidClientInfo(AndroidClientInfo androidClientInfo) {
            this.f43957b = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo.Builder setClientType(ClientInfo.ClientType clientType) {
            this.f43956a = clientType;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f43954a;
        if (clientType != null ? clientType.equals(clientInfo.getClientType()) : clientInfo.getClientType() == null) {
            AndroidClientInfo androidClientInfo = this.f43955b;
            if (androidClientInfo == null) {
                if (clientInfo.getAndroidClientInfo() == null) {
                    return true;
                }
            } else if (androidClientInfo.equals(clientInfo.getAndroidClientInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public AndroidClientInfo getAndroidClientInfo() {
        return this.f43955b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public ClientInfo.ClientType getClientType() {
        return this.f43954a;
    }

    public int hashCode() {
        int hashCode;
        ClientInfo.ClientType clientType = this.f43954a;
        int i = 0;
        if (clientType == null) {
            hashCode = 0;
        } else {
            hashCode = clientType.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.f43955b;
        if (androidClientInfo != null) {
            i = androidClientInfo.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f43954a + ", androidClientInfo=" + this.f43955b + "}";
    }

    public C6231b(ClientInfo.ClientType clientType, AndroidClientInfo androidClientInfo) {
        this.f43954a = clientType;
        this.f43955b = androidClientInfo;
    }
}
