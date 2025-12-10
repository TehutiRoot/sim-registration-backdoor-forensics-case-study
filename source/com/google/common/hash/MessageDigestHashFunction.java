package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Immutable
/* loaded from: classes4.dex */
final class MessageDigestHashFunction extends AbstractC0710K implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    /* loaded from: classes4.dex */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        private Object readResolve() {
            return new MessageDigestHashFunction(this.algorithmName, this.bytes, this.toString);
        }

        private SerializedForm(String str, int i, String str2) {
            this.algorithmName = str;
            this.bytes = i;
            this.toString = str2;
        }
    }

    /* renamed from: com.google.common.hash.MessageDigestHashFunction$b */
    /* loaded from: classes4.dex */
    public static final class C8064b extends AbstractC17090y {

        /* renamed from: b */
        public final MessageDigest f53849b;

        /* renamed from: c */
        public final int f53850c;

        /* renamed from: d */
        public boolean f53851d;

        /* renamed from: f */
        private void m40042f() {
            Preconditions.checkState(!this.f53851d, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // p000.AbstractC17090y
        /* renamed from: b */
        public void mo357b(byte b) {
            m40042f();
            this.f53849b.update(b);
        }

        @Override // p000.AbstractC17090y
        /* renamed from: c */
        public void mo356c(ByteBuffer byteBuffer) {
            m40042f();
            this.f53849b.update(byteBuffer);
        }

        @Override // p000.AbstractC17090y
        /* renamed from: e */
        public void mo354e(byte[] bArr, int i, int i2) {
            m40042f();
            this.f53849b.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            m40042f();
            this.f53851d = true;
            if (this.f53850c == this.f53849b.getDigestLength()) {
                return HashCode.fromBytesNoCopy(this.f53849b.digest());
            }
            return HashCode.fromBytesNoCopy(Arrays.copyOf(this.f53849b.digest(), this.f53850c));
        }

        public C8064b(MessageDigest messageDigest, int i) {
            this.f53849b = messageDigest;
            this.f53850c = i;
        }
    }

    public MessageDigestHashFunction(String str, String str2) {
        MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        this.bytes = messageDigest.getDigestLength();
        this.toString = (String) Preconditions.checkNotNull(str2);
        this.supportsClone = supportsClone(messageDigest);
    }

    private static MessageDigest getMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private static boolean supportsClone(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.bytes * 8;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        if (this.supportsClone) {
            try {
                return new C8064b((MessageDigest) this.prototype.clone(), this.bytes);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C8064b(getMessageDigest(this.prototype.getAlgorithm()), this.bytes);
    }

    public String toString() {
        return this.toString;
    }

    public Object writeReplace() {
        return new SerializedForm(this.prototype.getAlgorithm(), this.bytes, this.toString);
    }

    public MessageDigestHashFunction(String str, int i, String str2) {
        this.toString = (String) Preconditions.checkNotNull(str2);
        MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        int digestLength = messageDigest.getDigestLength();
        Preconditions.checkArgument(i >= 4 && i <= digestLength, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.bytes = i;
        this.supportsClone = supportsClone(messageDigest);
    }
}
