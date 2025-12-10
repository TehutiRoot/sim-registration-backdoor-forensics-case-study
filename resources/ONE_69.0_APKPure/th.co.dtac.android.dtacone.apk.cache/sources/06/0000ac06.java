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
    public static final int f53850a = (int) System.currentTimeMillis();

    @Immutable
    /* loaded from: classes4.dex */
    public enum ChecksumType implements InterfaceC18463Sd0 {
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
    public static final class C8038b extends AbstractC0069B {
        @Override // p000.AbstractC0069B
        /* renamed from: b */
        public HashCode mo40042b(Hasher[] hasherArr) {
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
            for (HashFunction hashFunction : this.f289a) {
                i += hashFunction.bits();
            }
            return i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8038b) {
                return Arrays.equals(this.f289a, ((C8038b) obj).f289a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f289a);
        }

        public C8038b(HashFunction... hashFunctionArr) {
            super(hashFunctionArr);
            for (HashFunction hashFunction : hashFunctionArr) {
                Preconditions.checkArgument(hashFunction.bits() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", hashFunction.bits(), (Object) hashFunction);
            }
        }
    }

    /* renamed from: com.google.common.hash.Hashing$c */
    /* loaded from: classes4.dex */
    public static final class C8039c {

        /* renamed from: a */
        public long f53851a;

        public C8039c(long j) {
            this.f53851a = j;
        }

        /* renamed from: a */
        public double m40041a() {
            long j = (this.f53851a * MurmurHash3.NULL_HASHCODE) + 1;
            this.f53851a = j;
            return (((int) (j >>> 33)) + 1) / 2.147483648E9d;
        }
    }

    /* renamed from: com.google.common.hash.Hashing$d */
    /* loaded from: classes4.dex */
    public static class C8040d {

        /* renamed from: a */
        public static final HashFunction f53852a = new MessageDigestHashFunction(MessageDigestAlgorithms.MD5, "Hashing.md5()");
    }

    /* renamed from: com.google.common.hash.Hashing$e */
    /* loaded from: classes4.dex */
    public static class C8041e {

        /* renamed from: a */
        public static final HashFunction f53853a = new MessageDigestHashFunction("SHA-1", "Hashing.sha1()");
    }

    /* renamed from: com.google.common.hash.Hashing$f */
    /* loaded from: classes4.dex */
    public static class C8042f {

        /* renamed from: a */
        public static final HashFunction f53854a = new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");
    }

    /* renamed from: com.google.common.hash.Hashing$g */
    /* loaded from: classes4.dex */
    public static class C8043g {

        /* renamed from: a */
        public static final HashFunction f53855a = new MessageDigestHashFunction("SHA-384", "Hashing.sha384()");
    }

    /* renamed from: com.google.common.hash.Hashing$h */
    /* loaded from: classes4.dex */
    public static class C8044h {

        /* renamed from: a */
        public static final HashFunction f53856a = new MessageDigestHashFunction("SHA-512", "Hashing.sha512()");
    }

    /* renamed from: a */
    public static int m40044a(int i) {
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
    public static String m40043b(String str, Key key) {
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
        return new C8038b((HashFunction[]) arrayList.toArray(new HashFunction[0]));
    }

    public static int consistentHash(HashCode hashCode, int i) {
        return consistentHash(hashCode.padToLong(), i);
    }

    public static HashFunction crc32() {
        return ChecksumType.CRC_32.hashFunction;
    }

    public static HashFunction crc32c() {
        return C0766Kz.f3470a;
    }

    public static HashFunction farmHashFingerprint64() {
        return C10150eW.f61590a;
    }

    public static HashFunction fingerprint2011() {
        return C20364i10.f62735a;
    }

    public static HashFunction goodFastHash(int i) {
        int m40044a = m40044a(i);
        if (m40044a == 32) {
            return Murmur3_32HashFunction.GOOD_FAST_HASH_32;
        }
        if (m40044a <= 128) {
            return Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        }
        int i2 = (m40044a + 127) / 128;
        HashFunction[] hashFunctionArr = new HashFunction[i2];
        hashFunctionArr[0] = Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        int i3 = f53850a;
        for (int i4 = 1; i4 < i2; i4++) {
            i3 += 1500450271;
            hashFunctionArr[i4] = murmur3_128(i3);
        }
        return new C8038b(hashFunctionArr);
    }

    public static HashFunction hmacMd5(Key key) {
        return new C17388Bn0("HmacMD5", key, m40043b("hmacMd5", key));
    }

    public static HashFunction hmacSha1(Key key) {
        return new C17388Bn0("HmacSHA1", key, m40043b("hmacSha1", key));
    }

    public static HashFunction hmacSha256(Key key) {
        return new C17388Bn0("HmacSHA256", key, m40043b("hmacSha256", key));
    }

    public static HashFunction hmacSha512(Key key) {
        return new C17388Bn0("HmacSHA512", key, m40043b("hmacSha512", key));
    }

    @Deprecated
    public static HashFunction md5() {
        return C8040d.f53852a;
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
        return C8041e.f53853a;
    }

    public static HashFunction sha256() {
        return C8042f.f53854a;
    }

    public static HashFunction sha384() {
        return C8043g.f53855a;
    }

    public static HashFunction sha512() {
        return C8044h.f53856a;
    }

    public static HashFunction sipHash24() {
        return SipHashFunction.SIP_HASH_24;
    }

    public static int consistentHash(long j, int i) {
        int i2 = 0;
        Preconditions.checkArgument(i > 0, "buckets must be positive: %s", i);
        C8039c c8039c = new C8039c(j);
        while (true) {
            int m40041a = (int) ((i2 + 1) / c8039c.m40041a());
            if (m40041a < 0 || m40041a >= i) {
                break;
            }
            i2 = m40041a;
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
        return new C8038b((HashFunction[]) arrayList.toArray(new HashFunction[0]));
    }
}