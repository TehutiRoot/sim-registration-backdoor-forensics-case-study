package io.grpc;

import com.google.common.base.Preconditions;
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
public final class TlsServerCredentials extends ServerCredentials {

    /* renamed from: a */
    public final boolean f63442a;

    /* renamed from: b */
    public final byte[] f63443b;

    /* renamed from: c */
    public final byte[] f63444c;

    /* renamed from: d */
    public final String f63445d;

    /* renamed from: e */
    public final List f63446e;

    /* renamed from: f */
    public final ClientAuth f63447f;

    /* renamed from: g */
    public final byte[] f63448g;

    /* renamed from: h */
    public final List f63449h;

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f63450a;

        /* renamed from: b */
        public byte[] f63451b;

        /* renamed from: c */
        public byte[] f63452c;

        /* renamed from: d */
        public String f63453d;

        /* renamed from: e */
        public List f63454e;

        /* renamed from: f */
        public ClientAuth f63455f;

        /* renamed from: g */
        public byte[] f63456g;

        /* renamed from: h */
        public List f63457h;

        public ServerCredentials build() {
            if (this.f63451b == null && this.f63454e == null) {
                throw new IllegalStateException("A key manager is required");
            }
            return new TlsServerCredentials(this);
        }

        public Builder clientAuth(ClientAuth clientAuth) {
            Preconditions.checkNotNull(clientAuth, "clientAuth");
            this.f63455f = clientAuth;
            return this;
        }

        /* renamed from: i */
        public final void m30286i() {
            this.f63451b = null;
            this.f63452c = null;
            this.f63453d = null;
            this.f63454e = null;
        }

        /* renamed from: j */
        public final void m30285j() {
            this.f63456g = null;
            this.f63457h = null;
        }

        public Builder keyManager(File file, File file2) throws IOException {
            return keyManager(file, file2, (String) null);
        }

        public Builder requireFakeFeature() {
            this.f63450a = true;
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
            this.f63455f = ClientAuth.NONE;
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
            m30285j();
            this.f63456g = byteArray;
            return this;
        }

        public Builder trustManager(TrustManager... trustManagerArr) {
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
            m30285j();
            this.f63457h = unmodifiableList;
            return this;
        }

        public Builder keyManager(InputStream inputStream, InputStream inputStream2) throws IOException {
            return keyManager(inputStream, inputStream2, (String) null);
        }

        public Builder keyManager(InputStream inputStream, InputStream inputStream2, String str) throws IOException {
            byte[] byteArray = ByteStreams.toByteArray(inputStream);
            byte[] byteArray2 = ByteStreams.toByteArray(inputStream2);
            m30286i();
            this.f63451b = byteArray;
            this.f63452c = byteArray2;
            this.f63453d = str;
            return this;
        }

        public Builder keyManager(KeyManager... keyManagerArr) {
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
            m30286i();
            this.f63454e = unmodifiableList;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum ClientAuth {
        NONE,
        OPTIONAL,
        REQUIRE
    }

    /* loaded from: classes5.dex */
    public enum Feature {
        FAKE,
        MTLS,
        CUSTOM_MANAGERS
    }

    public TlsServerCredentials(Builder builder) {
        this.f63442a = builder.f63450a;
        this.f63443b = builder.f63451b;
        this.f63444c = builder.f63452c;
        this.f63445d = builder.f63453d;
        this.f63446e = builder.f63454e;
        this.f63447f = builder.f63455f;
        this.f63448g = builder.f63456g;
        this.f63449h = builder.f63457h;
    }

    /* renamed from: a */
    public static void m30295a(Set set, Set set2, Feature feature) {
        if (!set.contains(feature)) {
            set2.add(feature);
        }
    }

    public static ServerCredentials create(File file, File file2) throws IOException {
        return newBuilder().keyManager(file, file2).build();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public byte[] getCertificateChain() {
        byte[] bArr = this.f63443b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public ClientAuth getClientAuth() {
        return this.f63447f;
    }

    public List<KeyManager> getKeyManagers() {
        return this.f63446e;
    }

    public byte[] getPrivateKey() {
        byte[] bArr = this.f63444c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getPrivateKeyPassword() {
        return this.f63445d;
    }

    public byte[] getRootCertificates() {
        byte[] bArr = this.f63448g;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> getTrustManagers() {
        return this.f63449h;
    }

    public Set<Feature> incomprehensible(Set<Feature> set) {
        EnumSet noneOf = EnumSet.noneOf(Feature.class);
        if (this.f63442a) {
            m30295a(set, noneOf, Feature.FAKE);
        }
        if (this.f63447f != ClientAuth.NONE) {
            m30295a(set, noneOf, Feature.MTLS);
        }
        if (this.f63446e != null || this.f63449h != null) {
            m30295a(set, noneOf, Feature.CUSTOM_MANAGERS);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static ServerCredentials create(InputStream inputStream, InputStream inputStream2) throws IOException {
        return newBuilder().keyManager(inputStream, inputStream2).build();
    }
}
