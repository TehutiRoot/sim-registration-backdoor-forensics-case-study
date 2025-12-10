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
    public final boolean f63428a;

    /* renamed from: b */
    public final byte[] f63429b;

    /* renamed from: c */
    public final byte[] f63430c;

    /* renamed from: d */
    public final String f63431d;

    /* renamed from: e */
    public final List f63432e;

    /* renamed from: f */
    public final byte[] f63433f;

    /* renamed from: g */
    public final List f63434g;

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f63435a;

        /* renamed from: b */
        public byte[] f63436b;

        /* renamed from: c */
        public byte[] f63437c;

        /* renamed from: d */
        public String f63438d;

        /* renamed from: e */
        public List f63439e;

        /* renamed from: f */
        public byte[] f63440f;

        /* renamed from: g */
        public List f63441g;

        public ChannelCredentials build() {
            return new TlsChannelCredentials(this);
        }

        /* renamed from: h */
        public final void m30297h() {
            this.f63436b = null;
            this.f63437c = null;
            this.f63438d = null;
            this.f63439e = null;
        }

        /* renamed from: i */
        public final void m30296i() {
            this.f63440f = null;
            this.f63441g = null;
        }

        public Builder keyManager(File file, File file2) throws IOException {
            return keyManager(file, file2, (String) null);
        }

        public Builder requireFakeFeature() {
            this.f63435a = true;
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
            m30296i();
            this.f63440f = byteArray;
            return this;
        }

        public Builder trustManager(TrustManager... trustManagerArr) {
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
            m30296i();
            this.f63441g = unmodifiableList;
            return this;
        }

        public Builder keyManager(InputStream inputStream, InputStream inputStream2) throws IOException {
            return keyManager(inputStream, inputStream2, (String) null);
        }

        public Builder keyManager(InputStream inputStream, InputStream inputStream2, String str) throws IOException {
            byte[] byteArray = ByteStreams.toByteArray(inputStream);
            byte[] byteArray2 = ByteStreams.toByteArray(inputStream2);
            m30297h();
            this.f63436b = byteArray;
            this.f63437c = byteArray2;
            this.f63438d = str;
            return this;
        }

        public Builder keyManager(KeyManager... keyManagerArr) {
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
            m30297h();
            this.f63439e = unmodifiableList;
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
        this.f63428a = builder.f63435a;
        this.f63429b = builder.f63436b;
        this.f63430c = builder.f63437c;
        this.f63431d = builder.f63438d;
        this.f63432e = builder.f63439e;
        this.f63433f = builder.f63440f;
        this.f63434g = builder.f63441g;
    }

    /* renamed from: a */
    public static void m30305a(Set set, Set set2, Feature feature) {
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
        byte[] bArr = this.f63429b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<KeyManager> getKeyManagers() {
        return this.f63432e;
    }

    public byte[] getPrivateKey() {
        byte[] bArr = this.f63430c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getPrivateKeyPassword() {
        return this.f63431d;
    }

    public byte[] getRootCertificates() {
        byte[] bArr = this.f63433f;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> getTrustManagers() {
        return this.f63434g;
    }

    public Set<Feature> incomprehensible(Set<Feature> set) {
        EnumSet noneOf = EnumSet.noneOf(Feature.class);
        if (this.f63428a) {
            m30305a(set, noneOf, Feature.FAKE);
        }
        if (this.f63433f != null || this.f63430c != null || this.f63432e != null) {
            m30305a(set, noneOf, Feature.MTLS);
        }
        if (this.f63432e != null || this.f63434g != null) {
            m30305a(set, noneOf, Feature.CUSTOM_MANAGERS);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    @Override // io.grpc.ChannelCredentials
    public ChannelCredentials withoutBearerTokens() {
        return this;
    }
}
