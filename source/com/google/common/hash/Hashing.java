package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.codec.digest.MurmurHash3;

/* loaded from: classes4.dex */
public final class Hashing {

    /* renamed from: a */
    public static final int f53838a = (int) System.currentTimeMillis();

    @Immutable
    /* loaded from: classes4.dex */
    public enum ChecksumType implements InterfaceC18038Md0 {
        CRC_32("Hashing.crc32()") { // from class: com.google.common.hash.Hashing.ChecksumType.1
            @Override // com.google.common.base.Supplier
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") { // from class: com.google.common.hash.Hashing.ChecksumType.2
            @Override // com.google.common.base.Supplier
            public Checksum get() {
                return new Adler32();
            }
        };
        
        public final HashFunction hashFunction;

        ChecksumType(String str) {
            this.hashFunction = new ChecksumHashFunction(this, 32, str);
        }
    }

    /* renamed from: com.google.common.hash.Hashing$b */
    /* loaded from: classes4.dex */
    public static final class C8049b extends AbstractC0067B {
        @Override // p000.AbstractC0067B
        /* renamed from: b */
        public HashCode mo40051b(Hasher[] hasherArr) {
            byte[] bArr = new byte[bits() / 8];
            int i = 0;
            for (Hasher hasher : hasherArr) {
                HashCode hash = hasher.hash();
                i += hash.writeBytesTo(bArr, i, hash.bits() / 8);
            }
            return HashCode.fromBytesNoCopy(bArr);
        }

        @Override // com.google.common.hash.HashFunction
        public int bits() {
            int i = 0;
            for (HashFunction hashFunction : this.f268a) {
                i += hashFunction.bits();
            }
            return i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8049b) {
                return Arrays.equals(this.f268a, ((C8049b) obj).f268a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f268a);
        }

        public C8049b(HashFunction... hashFunctionArr) {
            super(hashFunctionArr);
            for (HashFunction hashFunction : hashFunctionArr) {
                Preconditions.checkArgument(hashFunction.bits() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", hashFunction.bits(), (Object) hashFunction);
            }
        }
    }

    /* renamed from: com.google.common.hash.Hashing$c */
    /* loaded from: classes4.dex */
    public static final class C8050c {

        /* renamed from: a */
        public long f53839a;

        public C8050c(long j) {
            this.f53839a = j;
        }

        /* renamed from: a */
        public double m40050a() {
            long j = (this.f53839a * MurmurHash3.NULL_HASHCODE) + 1;
            this.f53839a = j;
            return (((int) (j >>> 33)) + 1) / 2.147483648E9d;
        }
    }

    /* renamed from: com.google.common.hash.Hashing$d */
    /* loaded from: classes4.dex */
    public static class C8051d {

        /* renamed from: a */
        public static final HashFunction f53840a = new MessageDigestHashFunction(MessageDigestAlgorithms.MD5, "Hashing.md5()");
    }

    /* renamed from: com.google.common.hash.Hashing$e */
    /* loaded from: classes4.dex */
    public static class C8052e {

        /* renamed from: a */
        public static final HashFunction f53841a = new MessageDigestHashFunction("SHA-1", "Hashing.sha1()");
    }

    /* renamed from: com.google.common.hash.Hashing$f */
    /* loaded from: classes4.dex */
    public static class C8053f {

        /* renamed from: a */
        public static final HashFunction f53842a = new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");
    }

    /* renamed from: com.google.common.hash.Hashing$g */
    /* loaded from: classes4.dex */
    public static class C8054g {

        /* renamed from: a */
        public static final HashFunction f53843a = new MessageDigestHashFunction("SHA-384", "Hashing.sha384()");
    }

    /* renamed from: com.google.common.hash.Hashing$h */
    /* loaded from: classes4.dex */
    public static class C8055h {

        /* renamed from: a */
        public static final HashFunction f53844a = new MessageDigestHashFunction("SHA-512", "Hashing.sha512()");
    }

    /* renamed from: a */
    public static int m40053a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Number of bits must be positive");
        return (i + 31) & (-32);
    }

    public static HashFunction adler32() {
        return ChecksumType.ADLER_32.hashFunction;
    }

    /* renamed from: b */
    public static String m40052b(String str, Key key) {
        return "Hashing." + str + "(Key[algorithm=" + key.getAlgorithm() + ", format=" + key.getFormat() + "])";
    }

    public static HashCode combineOrdered(Iterable<HashCode> iterable) {
        boolean z;
        Iterator<HashCode> it = iterable.iterator();
        Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int bits = it.next().bits() / 8;
        byte[] bArr = new byte[bits];
        for (HashCode hashCode : iterable) {
            byte[] asBytes = hashCode.asBytes();
            if (asBytes.length == bits) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "All hashcodes must have the same bit length.");
            for (int i = 0; i < asBytes.length; i++) {
                bArr[i] = (byte) ((bArr[i] * 37) ^ asBytes[i]);
            }
        }
        return HashCode.fromBytesNoCopy(bArr);
    }

    public static HashCode combineUnordered(Iterable<HashCode> iterable) {
        boolean z;
        Iterator<HashCode> it = iterable.iterator();
        Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int bits = it.next().bits() / 8;
        byte[] bArr = new byte[bits];
        for (HashCode hashCode : iterable) {
            byte[] asBytes = hashCode.asBytes();
            if (asBytes.length == bits) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "All hashcodes must have the same bit length.");
            for (int i = 0; i < asBytes.length; i++) {
                bArr[i] = (byte) (bArr[i] + asBytes[i]);
            }
        }
        return HashCode.fromBytesNoCopy(bArr);
    }

    public static HashFunction concatenating(HashFunction hashFunction, HashFunction hashFunction2, HashFunction... hashFunctionArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hashFunction);
        arrayList.add(hashFunction2);
        Collections.addAll(arrayList, hashFunctionArr);
        return new C8049b((HashFunction[]) arrayList.toArray(new HashFunction[0]));
    }

    public static int consistentHash(HashCode hashCode, int i) {
        return consistentHash(hashCode.padToLong(), i);
    }

    public static HashFunction crc32() {
        return ChecksumType.CRC_32.hashFunction;
    }

    public static HashFunction crc32c() {
        return C0774Kz.f3333a;
    }

    public static HashFunction farmHashFingerprint64() {
        return C1897aW.f8349a;
    }

    public static HashFunction fingerprint2011() {
        return C19622e10.f61388a;
    }

    public static HashFunction goodFastHash(int i) {
        int m40053a = m40053a(i);
        if (m40053a == 32) {
            return Murmur3_32HashFunction.GOOD_FAST_HASH_32;
        }
        if (m40053a <= 128) {
            return Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        }
        int i2 = (m40053a + 127) / 128;
        HashFunction[] hashFunctionArr = new HashFunction[i2];
        hashFunctionArr[0] = Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        int i3 = f53838a;
        for (int i4 = 1; i4 < i2; i4++) {
            i3 += 1500450271;
            hashFunctionArr[i4] = murmur3_128(i3);
        }
        return new C8049b(hashFunctionArr);
    }

    public static HashFunction hmacMd5(Key key) {
        return new C22676vn0("HmacMD5", key, m40052b("hmacMd5", key));
    }

    public static HashFunction hmacSha1(Key key) {
        return new C22676vn0("HmacSHA1", key, m40052b("hmacSha1", key));
    }

    public static HashFunction hmacSha256(Key key) {
        return new C22676vn0("HmacSHA256", key, m40052b("hmacSha256", key));
    }

    public static HashFunction hmacSha512(Key key) {
        return new C22676vn0("HmacSHA512", key, m40052b("hmacSha512", key));
    }

    @Deprecated
    public static HashFunction md5() {
        return C8051d.f53840a;
    }

    public static HashFunction murmur3_128(int i) {
        return new Murmur3_128HashFunction(i);
    }

    @Deprecated
    public static HashFunction murmur3_32(int i) {
        return new Murmur3_32HashFunction(i, false);
    }

    public static HashFunction murmur3_32_fixed(int i) {
        return new Murmur3_32HashFunction(i, true);
    }

    @Deprecated
    public static HashFunction sha1() {
        return C8052e.f53841a;
    }

    public static HashFunction sha256() {
        return C8053f.f53842a;
    }

    public static HashFunction sha384() {
        return C8054g.f53843a;
    }

    public static HashFunction sha512() {
        return C8055h.f53844a;
    }

    public static HashFunction sipHash24() {
        return SipHashFunction.SIP_HASH_24;
    }

    public static int consistentHash(long j, int i) {
        int i2 = 0;
        Preconditions.checkArgument(i > 0, "buckets must be positive: %s", i);
        C8050c c8050c = new C8050c(j);
        while (true) {
            int m40050a = (int) ((i2 + 1) / c8050c.m40050a());
            if (m40050a < 0 || m40050a >= i) {
                break;
            }
            i2 = m40050a;
        }
        return i2;
    }

    public static HashFunction hmacMd5(byte[] bArr) {
        return hmacMd5(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacMD5"));
    }

    public static HashFunction hmacSha1(byte[] bArr) {
        return hmacSha1(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacSHA1"));
    }

    public static HashFunction hmacSha256(byte[] bArr) {
        return hmacSha256(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacSHA256"));
    }

    public static HashFunction hmacSha512(byte[] bArr) {
        return hmacSha512(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacSHA512"));
    }

    public static HashFunction murmur3_128() {
        return Murmur3_128HashFunction.MURMUR3_128;
    }

    @Deprecated
    public static HashFunction murmur3_32() {
        return Murmur3_32HashFunction.MURMUR3_32;
    }

    public static HashFunction murmur3_32_fixed() {
        return Murmur3_32HashFunction.MURMUR3_32_FIXED;
    }

    public static HashFunction sipHash24(long j, long j2) {
        return new SipHashFunction(2, 4, j, j2);
    }

    public static HashFunction concatenating(Iterable<HashFunction> iterable) {
        Preconditions.checkNotNull(iterable);
        ArrayList arrayList = new ArrayList();
        for (HashFunction hashFunction : iterable) {
            arrayList.add(hashFunction);
        }
        Preconditions.checkArgument(!arrayList.isEmpty(), "number of hash functions (%s) must be > 0", arrayList.size());
        return new C8049b((HashFunction[]) arrayList.toArray(new HashFunction[0]));
    }
}
