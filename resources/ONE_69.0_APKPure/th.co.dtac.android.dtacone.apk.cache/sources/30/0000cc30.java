package io.grpc;

import com.google.common.p014io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* loaded from: classes5.dex */
public final class TlsChannelCredentials extends ChannelCredentials {

    /* renamed from: a */
    public final boolean f63491a;

    /* renamed from: b */
    public final byte[] f63492b;

    /* renamed from: c */
    public final byte[] f63493c;

    /* renamed from: d */
    public final String f63494d;

    /* renamed from: e */
    public final List f63495e;

    /* renamed from: f */
    public final byte[] f63496f;

    /* renamed from: g */
    public final List f63497g;

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f63498a;

        /* renamed from: b */
        public byte[] f63499b;

        /* renamed from: c */
        public byte[] f63500c;

        /* renamed from: d */
        public String f63501d;

        /* renamed from: e */
        public List f63502e;

        /* renamed from: f */
        public byte[] f63503f;

        /* renamed from: g */
        public List f63504g;

        public ChannelCredentials build() {
            return new TlsChannelCredentials(this);
        }

        /* renamed from: h */
        public final void m30637h() {
            this.f63499b = null;
            this.f63500c = null;
            this.f63501d = null;
            this.f63502e = null;
        }

        /* renamed from: i */
        public final void m30636i() {
            this.f63503f = null;
            this.f63504g = null;
        }

        public Builder keyManager(File file, File file2) throws IOException {
            return keyManager(file, file2, (String) null);
        }

        public Builder requireFakeFeature() {
            this.f63498a = true;
            return this;
        }

        public Builder trustManager(File file) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                return trustManager(fileInputStream);
            } finally {
                fileInputStream.close();
            }
        }

        public Builder() {
        }

        public Builder keyManager(File file, File file2, String str) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                Builder keyManager = keyManager(fileInputStream, fileInputStream2, str);
                fileInputStream2.close();
                return keyManager;
            } finally {
                fileInputStream.close();
            }
        }

        public Builder trustManager(InputStream inputStream) throws IOException {
            byte[] byteArray = ByteStreams.toByteArray(inputStream);
            m30636i();
            this.f63503f = byteArray;
            return this;
        }

        public Builder trustManager(TrustManager... trustManagerArr) {
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
            m30636i();
            this.f63504g = unmodifiableList;
            return this;
        }

        public Builder keyManager(InputStream inputStream, InputStream inputStream2) throws IOException {
            return keyManager(inputStream, inputStream2, (String) null);
        }

        public Builder keyManager(InputStream inputStream, InputStream inputStream2, String str) throws IOException {
            byte[] byteArray = ByteStreams.toByteArray(inputStream);
            byte[] byteArray2 = ByteStreams.toByteArray(inputStream2);
            m30637h();
            this.f63499b = byteArray;
            this.f63500c = byteArray2;
            this.f63501d = str;
            return this;
        }

        public Builder keyManager(KeyManager... keyManagerArr) {
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
            m30637h();
            this.f63502e = unmodifiableList;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum Feature {
        FAKE,
        MTLS,
        CUSTOM_MANAGERS
    }

    public TlsChannelCredentials(Builder builder) {
        this.f63491a = builder.f63498a;
        this.f63492b = builder.f63499b;
        this.f63493c = builder.f63500c;
        this.f63494d = builder.f63501d;
        this.f63495e = builder.f63502e;
        this.f63496f = builder.f63503f;
        this.f63497g = builder.f63504g;
    }

    /* renamed from: a */
    public static void m30645a(Set set, Set set2, Feature feature) {
        if (!set.contains(feature)) {
            set2.add(feature);
        }
    }

    public static ChannelCredentials create() {
        return newBuilder().build();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public byte[] getCertificateChain() {
        byte[] bArr = this.f63492b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<KeyManager> getKeyManagers() {
        return this.f63495e;
    }

    public byte[] getPrivateKey() {
        byte[] bArr = this.f63493c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getPrivateKeyPassword() {
        return this.f63494d;
    }

    public byte[] getRootCertificates() {
        byte[] bArr = this.f63496f;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> getTrustManagers() {
        return this.f63497g;
    }

    public Set<Feature> incomprehensible(Set<Feature> set) {
        EnumSet noneOf = EnumSet.noneOf(Feature.class);
        if (this.f63491a) {
            m30645a(set, noneOf, Feature.FAKE);
        }
        if (this.f63496f != null || this.f63493c != null || this.f63495e != null) {
            m30645a(set, noneOf, Feature.MTLS);
        }
        if (this.f63495e != null || this.f63497g != null) {
            m30645a(set, noneOf, Feature.CUSTOM_MANAGERS);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    @Override // io.grpc.ChannelCredentials
    public ChannelCredentials withoutBearerTokens() {
        return this;
    }
}