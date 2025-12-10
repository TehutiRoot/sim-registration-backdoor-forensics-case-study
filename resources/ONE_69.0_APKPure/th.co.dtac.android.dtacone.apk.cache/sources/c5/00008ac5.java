package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@KeepForSdkWithMembers
@SafeParcelable.Class(creator = "ProxyRequestCreator")
/* loaded from: classes3.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final int VERSION_CODE = 2;

    /* renamed from: a */
    public final int f44514a;

    /* renamed from: b */
    public Bundle f44515b;
    @SafeParcelable.Field(m48386id = 4)
    public final byte[] body;
    @SafeParcelable.Field(m48386id = 2)
    public final int httpMethod;
    @SafeParcelable.Field(m48386id = 3)
    public final long timeoutMillis;
    @SafeParcelable.Field(m48386id = 1)
    public final String url;
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int LAST_CODE = 7;

    @KeepForSdkWithMembers
    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public String f44516a;

        /* renamed from: b */
        public int f44517b = ProxyRequest.HTTP_METHOD_GET;

        /* renamed from: c */
        public long f44518c = 3000;

        /* renamed from: d */
        public byte[] f44519d = null;

        /* renamed from: e */
        public Bundle f44520e = new Bundle();

        public Builder(String str) {
            Preconditions.checkNotEmpty(str);
            if (Patterns.WEB_URL.matcher(str).matches()) {
                this.f44516a = str;
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("The supplied url [ ");
            sb.append(str);
            sb.append("] is not match Patterns.WEB_URL!");
            throw new IllegalArgumentException(sb.toString());
        }

        public ProxyRequest build() {
            if (this.f44519d == null) {
                this.f44519d = new byte[0];
            }
            return new ProxyRequest(2, this.f44516a, this.f44517b, this.f44518c, this.f44519d, this.f44520e);
        }

        public Builder putHeader(String str, String str2) {
            Preconditions.checkNotEmpty(str, "Header name cannot be null or empty!");
            Bundle bundle = this.f44520e;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        public Builder setBody(byte[] bArr) {
            this.f44519d = bArr;
            return this;
        }

        public Builder setHttpMethod(int i) {
            boolean z;
            if (i >= 0 && i <= ProxyRequest.LAST_CODE) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Unrecognized http method code.");
            this.f44517b = i;
            return this;
        }

        public Builder setTimeoutMillis(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "The specified timeout must be non-negative.");
            this.f44518c = j;
            return this;
        }
    }

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f44514a = i;
        this.url = str;
        this.httpMethod = i2;
        this.timeoutMillis = j;
        this.body = bArr;
        this.f44515b = bundle;
    }

    public Map<String, String> getHeaderMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f44515b.size());
        for (String str : this.f44515b.keySet()) {
            linkedHashMap.put(str, this.f44515b.getString(str));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public String toString() {
        String str = this.url;
        int i = this.httpMethod;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.url, false);
        SafeParcelWriter.writeInt(parcel, 2, this.httpMethod);
        SafeParcelWriter.writeLong(parcel, 3, this.timeoutMillis);
        SafeParcelWriter.writeByteArray(parcel, 4, this.body, false);
        SafeParcelWriter.writeBundle(parcel, 5, this.f44515b, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f44514a);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}