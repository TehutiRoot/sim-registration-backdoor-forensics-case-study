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
    public final boolean f63505a;

    /* renamed from: b */
    public final byte[] f63506b;

    /* renamed from: c */
    public final byte[] f63507c;

    /* renamed from: d */
    public final String f63508d;

    /* renamed from: e */
    public final List f63509e;

    /* renamed from: f */
    public final ClientAuth f63510f;

    /* renamed from: g */
    public final byte[] f63511g;

    /* renamed from: h */
    public final List f63512h;

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f63513a;

        /* renamed from: b */
        public byte[] f63514b;

        /* renamed from: c */
        public byte[] f63515c;

        /* renamed from: d */
        public String f63516d;

        /* renamed from: e */
        public List f63517e;

        /* renamed from: f */
        public ClientAuth f63518f;

        /* renamed from: g */
        public byte[] f63519g;

        /* renamed from: h */
        public List f63520h;

        public ServerCredentials build() {
            if (this.f63514b == null && this.f63517e == null) {
                throw new IllegalStateException("A key manager is required");
            }
            return new TlsServerCredentials(this);
        }

        public Builder clientAuth(ClientAuth clientAuth) {
            Preconditions.checkNotNull(clientAuth, "clientAuth");
            this.f63518f = clientAuth;
            return this;
        }

        /* renamed from: i */
        public final void m30626i() {
            this.f63514b = null;
            this.f63515c = null;
            this.f63516d = null;
            this.f63517e = null;
        }

        /* renamed from: j */
        public final void m30625j() {
            this.f63519g = null;
            this.f63520h = null;
        }

        public Builder keyManager(File file, File file2) throws IOException {
            return keyManager(file, file2, (String) null);
        }

        public Builder requireFakeFeature() {
            this.f63513a = true;
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
            this.f63518f = ClientAuth.NONE;
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
            m30625j();
            this.f63519g = byteArray;
            return this;
        }

        public Builder trustManager(TrustManager... trustManagerArr) {
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
            m30625j();
            this.f63520h = unmodifiableList;
            return this;
        }

        public Builder keyManager(InputStream inputStream, InputStream inputStream2) throws IOException {
            return keyManager(inputStream, inputStream2, (String) null);
        }

        public Builder keyManager(InputStream inputStream, InputStream inputStream2, String str) throws IOException {
            byte[] byteArray = ByteStreams.toByteArray(inputStream);
            byte[] byteArray2 = ByteStreams.toByteArray(inputStream2);
            m30626i();
            this.f63514b = byteArray;
            this.f63515c = byteArray2;
            this.f63516d = str;
            return this;
        }

        public Builder keyManager(KeyManager... keyManagerArr) {
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
            m30626i();
            this.f63517e = unmodifiableList;
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
        this.f63505a = builder.f63513a;
        this.f63506b = builder.f63514b;
        this.f63507c = builder.f63515c;
        this.f63508d = builder.f63516d;
        this.f63509e = builder.f63517e;
        this.f63510f = builder.f63518f;
        this.f63511g = builder.f63519g;
        this.f63512h = builder.f63520h;
    }

    /* renamed from: a */
    public static void m30635a(Set set, Set set2, Feature feature) {
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
        byte[] bArr = this.f63506b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public ClientAuth getClientAuth() {
        return this.f63510f;
    }

    public List<KeyManager> getKeyManagers() {
        return this.f63509e;
    }

    public byte[] getPrivateKey() {
        byte[] bArr = this.f63507c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getPrivateKeyPassword() {
        return this.f63508d;
    }

    public byte[] getRootCertificates() {
        byte[] bArr = this.f63511g;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> getTrustManagers() {
        return this.f63512h;
    }

    public Set<Feature> incomprehensible(Set<Feature> set) {
        EnumSet noneOf = EnumSet.noneOf(Feature.class);
        if (this.f63505a) {
            m30635a(set, noneOf, Feature.FAKE);
        }
        if (this.f63510f != ClientAuth.NONE) {
            m30635a(set, noneOf, Feature.MTLS);
        }
        if (this.f63509e != null || this.f63512h != null) {
            m30635a(set, noneOf, Feature.CUSTOM_MANAGERS);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static ServerCredentials create(InputStream inputStream, InputStream inputStream2) throws IOException {
        return newBuilder().keyManager(inputStream, inputStream2).build();
    }
}