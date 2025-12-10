package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class EncodedPayload {

    /* renamed from: a */
    public final Encoding f44027a;

    /* renamed from: b */
    public final byte[] f44028b;

    public EncodedPayload(@NonNull Encoding encoding, @NonNull byte[] bArr) {
        if (encoding != null) {
            if (bArr != null) {
                this.f44027a = encoding;
                this.f44028b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (!this.f44027a.equals(encodedPayload.f44027a)) {
            return false;
        }
        return Arrays.equals(this.f44028b, encodedPayload.f44028b);
    }

    public byte[] getBytes() {
        return this.f44028b;
    }

    public Encoding getEncoding() {
        return this.f44027a;
    }

    public int hashCode() {
        return ((this.f44027a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f44028b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f44027a + ", bytes=[...]}";
    }
}
