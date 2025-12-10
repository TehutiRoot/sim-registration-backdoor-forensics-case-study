package org.apache.http.impl.auth;

import ch.qos.logback.core.net.ssl.SSL;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.Consts;

/* loaded from: classes6.dex */
public final class NTLMEngineImpl implements NTLMEngine {

    /* renamed from: a */
    public static final Charset f73945a = Charset.forName("UnicodeLittleUnmarked");

    /* renamed from: b */
    public static final Charset f73946b = Consts.ASCII;

    /* renamed from: c */
    public static final SecureRandom f73947c;

    /* renamed from: d */
    public static final byte[] f73948d;

    /* renamed from: e */
    public static final byte[] f73949e;

    /* renamed from: f */
    public static final byte[] f73950f;

    /* renamed from: g */
    public static final byte[] f73951g;

    /* renamed from: h */
    public static final byte[] f73952h;

    /* renamed from: i */
    public static final byte[] f73953i;

    /* renamed from: j */
    public static final String f73954j;

    /* loaded from: classes6.dex */
    public static class CipherGen {
        protected final byte[] challenge;
        protected byte[] clientChallenge;
        protected byte[] clientChallenge2;
        protected final long currentTime;
        protected final String domain;
        protected byte[] lanManagerSessionKey;
        protected byte[] lm2SessionResponse;
        protected byte[] lmHash;
        protected byte[] lmResponse;
        protected byte[] lmUserSessionKey;
        protected byte[] lmv2Hash;
        protected byte[] lmv2Response;
        protected byte[] ntlm2SessionResponse;
        protected byte[] ntlm2SessionResponseUserSessionKey;
        protected byte[] ntlmHash;
        protected byte[] ntlmResponse;
        protected byte[] ntlmUserSessionKey;
        protected byte[] ntlmv2Blob;
        protected byte[] ntlmv2Hash;
        protected byte[] ntlmv2Response;
        protected byte[] ntlmv2UserSessionKey;
        protected final String password;
        protected final Random random;
        protected byte[] secondaryKey;
        protected final String target;
        protected final byte[] targetInformation;
        protected byte[] timestamp;
        protected final String user;

        @Deprecated
        public CipherGen(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this(NTLMEngineImpl.f73947c, System.currentTimeMillis(), str, str2, str3, bArr, str4, bArr2, bArr3, bArr4, bArr5, bArr6);
        }

        public byte[] getClientChallenge() throws NTLMEngineException {
            if (this.clientChallenge == null) {
                this.clientChallenge = NTLMEngineImpl.m24748L(this.random);
            }
            return this.clientChallenge;
        }

        public byte[] getClientChallenge2() throws NTLMEngineException {
            if (this.clientChallenge2 == null) {
                this.clientChallenge2 = NTLMEngineImpl.m24748L(this.random);
            }
            return this.clientChallenge2;
        }

        public byte[] getLM2SessionResponse() throws NTLMEngineException {
            if (this.lm2SessionResponse == null) {
                byte[] clientChallenge = getClientChallenge();
                byte[] bArr = new byte[24];
                this.lm2SessionResponse = bArr;
                System.arraycopy(clientChallenge, 0, bArr, 0, clientChallenge.length);
                byte[] bArr2 = this.lm2SessionResponse;
                Arrays.fill(bArr2, clientChallenge.length, bArr2.length, (byte) 0);
            }
            return this.lm2SessionResponse;
        }

        public byte[] getLMHash() throws NTLMEngineException {
            if (this.lmHash == null) {
                this.lmHash = NTLMEngineImpl.m24752H(this.password);
            }
            return this.lmHash;
        }

        public byte[] getLMResponse() throws NTLMEngineException {
            if (this.lmResponse == null) {
                this.lmResponse = NTLMEngineImpl.m24751I(getLMHash(), this.challenge);
            }
            return this.lmResponse;
        }

        public byte[] getLMUserSessionKey() throws NTLMEngineException {
            if (this.lmUserSessionKey == null) {
                this.lmUserSessionKey = new byte[16];
                System.arraycopy(getLMHash(), 0, this.lmUserSessionKey, 0, 8);
                Arrays.fill(this.lmUserSessionKey, 8, 16, (byte) 0);
            }
            return this.lmUserSessionKey;
        }

        public byte[] getLMv2Hash() throws NTLMEngineException {
            if (this.lmv2Hash == null) {
                this.lmv2Hash = NTLMEngineImpl.m24750J(this.domain, this.user, getNTLMHash());
            }
            return this.lmv2Hash;
        }

        public byte[] getLMv2Response() throws NTLMEngineException {
            if (this.lmv2Response == null) {
                this.lmv2Response = NTLMEngineImpl.m24749K(getLMv2Hash(), this.challenge, getClientChallenge());
            }
            return this.lmv2Response;
        }

        public byte[] getLanManagerSessionKey() throws NTLMEngineException {
            if (this.lanManagerSessionKey == null) {
                try {
                    byte[] bArr = new byte[14];
                    System.arraycopy(getLMHash(), 0, bArr, 0, 8);
                    Arrays.fill(bArr, 8, 14, (byte) -67);
                    Key m24759A = NTLMEngineImpl.m24759A(bArr, 0);
                    Key m24759A2 = NTLMEngineImpl.m24759A(bArr, 7);
                    byte[] bArr2 = new byte[8];
                    System.arraycopy(getLMResponse(), 0, bArr2, 0, 8);
                    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher.init(1, m24759A);
                    byte[] doFinal = cipher.doFinal(bArr2);
                    Cipher cipher2 = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher2.init(1, m24759A2);
                    byte[] doFinal2 = cipher2.doFinal(bArr2);
                    byte[] bArr3 = new byte[16];
                    this.lanManagerSessionKey = bArr3;
                    System.arraycopy(doFinal, 0, bArr3, 0, doFinal.length);
                    System.arraycopy(doFinal2, 0, this.lanManagerSessionKey, doFinal.length, doFinal2.length);
                } catch (Exception e) {
                    throw new NTLMEngineException(e.getMessage(), e);
                }
            }
            return this.lanManagerSessionKey;
        }

        public byte[] getNTLM2SessionResponse() throws NTLMEngineException {
            if (this.ntlm2SessionResponse == null) {
                this.ntlm2SessionResponse = NTLMEngineImpl.m24746N(getNTLMHash(), this.challenge, getClientChallenge());
            }
            return this.ntlm2SessionResponse;
        }

        public byte[] getNTLM2SessionResponseUserSessionKey() throws NTLMEngineException {
            if (this.ntlm2SessionResponseUserSessionKey == null) {
                byte[] lM2SessionResponse = getLM2SessionResponse();
                byte[] bArr = this.challenge;
                byte[] bArr2 = new byte[bArr.length + lM2SessionResponse.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                System.arraycopy(lM2SessionResponse, 0, bArr2, this.challenge.length, lM2SessionResponse.length);
                this.ntlm2SessionResponseUserSessionKey = NTLMEngineImpl.m24753G(bArr2, getNTLMUserSessionKey());
            }
            return this.ntlm2SessionResponseUserSessionKey;
        }

        public byte[] getNTLMHash() throws NTLMEngineException {
            if (this.ntlmHash == null) {
                this.ntlmHash = NTLMEngineImpl.m24745O(this.password);
            }
            return this.ntlmHash;
        }

        public byte[] getNTLMResponse() throws NTLMEngineException {
            if (this.ntlmResponse == null) {
                this.ntlmResponse = NTLMEngineImpl.m24751I(getNTLMHash(), this.challenge);
            }
            return this.ntlmResponse;
        }

        public byte[] getNTLMUserSessionKey() throws NTLMEngineException {
            if (this.ntlmUserSessionKey == null) {
                C12576b c12576b = new C12576b();
                c12576b.m24702f(getNTLMHash());
                this.ntlmUserSessionKey = c12576b.m24707a();
            }
            return this.ntlmUserSessionKey;
        }

        public byte[] getNTLMv2Blob() throws NTLMEngineException {
            if (this.ntlmv2Blob == null) {
                this.ntlmv2Blob = NTLMEngineImpl.m24710z(getClientChallenge2(), this.targetInformation, getTimestamp());
            }
            return this.ntlmv2Blob;
        }

        public byte[] getNTLMv2Hash() throws NTLMEngineException {
            if (this.ntlmv2Hash == null) {
                this.ntlmv2Hash = NTLMEngineImpl.m24744P(this.domain, this.user, getNTLMHash());
            }
            return this.ntlmv2Hash;
        }

        public byte[] getNTLMv2Response() throws NTLMEngineException {
            if (this.ntlmv2Response == null) {
                this.ntlmv2Response = NTLMEngineImpl.m24749K(getNTLMv2Hash(), this.challenge, getNTLMv2Blob());
            }
            return this.ntlmv2Response;
        }

        public byte[] getNTLMv2UserSessionKey() throws NTLMEngineException {
            if (this.ntlmv2UserSessionKey == null) {
                byte[] nTLMv2Hash = getNTLMv2Hash();
                byte[] bArr = new byte[16];
                System.arraycopy(getNTLMv2Response(), 0, bArr, 0, 16);
                this.ntlmv2UserSessionKey = NTLMEngineImpl.m24753G(bArr, nTLMv2Hash);
            }
            return this.ntlmv2UserSessionKey;
        }

        public byte[] getSecondaryKey() throws NTLMEngineException {
            if (this.secondaryKey == null) {
                this.secondaryKey = NTLMEngineImpl.m24747M(this.random);
            }
            return this.secondaryKey;
        }

        public byte[] getTimestamp() {
            if (this.timestamp == null) {
                long j = (this.currentTime + 11644473600000L) * 10000;
                this.timestamp = new byte[8];
                for (int i = 0; i < 8; i++) {
                    this.timestamp[i] = (byte) j;
                    j >>>= 8;
                }
            }
            return this.timestamp;
        }

        public CipherGen(Random random, long j, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this.lmHash = null;
            this.lmResponse = null;
            this.ntlmHash = null;
            this.ntlmResponse = null;
            this.ntlmv2Hash = null;
            this.lmv2Hash = null;
            this.lmv2Response = null;
            this.ntlmv2Blob = null;
            this.ntlmv2Response = null;
            this.ntlm2SessionResponse = null;
            this.lm2SessionResponse = null;
            this.lmUserSessionKey = null;
            this.ntlmUserSessionKey = null;
            this.ntlmv2UserSessionKey = null;
            this.ntlm2SessionResponseUserSessionKey = null;
            this.lanManagerSessionKey = null;
            this.random = random;
            this.currentTime = j;
            this.domain = str;
            this.target = str4;
            this.user = str2;
            this.password = str3;
            this.challenge = bArr;
            this.targetInformation = bArr2;
            this.clientChallenge = bArr3;
            this.clientChallenge2 = bArr4;
            this.secondaryKey = bArr5;
            this.timestamp = bArr6;
        }

        @Deprecated
        public CipherGen(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(NTLMEngineImpl.f73947c, System.currentTimeMillis(), str, str2, str3, bArr, str4, bArr2);
        }

        public CipherGen(Random random, long j, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(random, j, str, str2, str3, bArr, str4, bArr2, null, null, null, null);
        }
    }

    /* loaded from: classes6.dex */
    public enum Mode {
        CLIENT,
        SERVER
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$a */
    /* loaded from: classes6.dex */
    public static class C12575a {

        /* renamed from: a */
        public final byte[] f73955a;

        /* renamed from: b */
        public final byte[] f73956b;

        /* renamed from: c */
        public final MessageDigest f73957c;

        public C12575a(byte[] bArr) {
            MessageDigest m24757C = NTLMEngineImpl.m24757C();
            this.f73957c = m24757C;
            this.f73955a = new byte[64];
            this.f73956b = new byte[64];
            int length = bArr.length;
            if (length > 64) {
                m24757C.update(bArr);
                bArr = m24757C.digest();
                length = bArr.length;
            }
            int i = 0;
            while (i < length) {
                this.f73955a[i] = (byte) (54 ^ bArr[i]);
                this.f73956b[i] = (byte) (92 ^ bArr[i]);
                i++;
            }
            while (i < 64) {
                this.f73955a[i] = 54;
                this.f73956b[i] = 92;
                i++;
            }
            this.f73957c.reset();
            this.f73957c.update(this.f73955a);
        }

        /* renamed from: a */
        public byte[] m24709a() {
            byte[] digest = this.f73957c.digest();
            this.f73957c.update(this.f73956b);
            return this.f73957c.digest(digest);
        }

        /* renamed from: b */
        public void m24708b(byte[] bArr) {
            this.f73957c.update(bArr);
        }
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$b */
    /* loaded from: classes6.dex */
    public static class C12576b {

        /* renamed from: a */
        public int f73958a = 1732584193;

        /* renamed from: b */
        public int f73959b = -271733879;

        /* renamed from: c */
        public int f73960c = -1732584194;

        /* renamed from: d */
        public int f73961d = 271733878;

        /* renamed from: e */
        public long f73962e = 0;

        /* renamed from: f */
        public final byte[] f73963f = new byte[64];

        /* renamed from: a */
        public byte[] m24707a() {
            int i;
            int i2 = (int) (this.f73962e & 63);
            if (i2 < 56) {
                i = 56 - i2;
            } else {
                i = 120 - i2;
            }
            byte[] bArr = new byte[i + 8];
            bArr[0] = Byte.MIN_VALUE;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i + i3] = (byte) ((this.f73962e * 8) >>> (i3 * 8));
            }
            m24702f(bArr);
            byte[] bArr2 = new byte[16];
            NTLMEngineImpl.m24737W(bArr2, this.f73958a, 0);
            NTLMEngineImpl.m24737W(bArr2, this.f73959b, 4);
            NTLMEngineImpl.m24737W(bArr2, this.f73960c, 8);
            NTLMEngineImpl.m24737W(bArr2, this.f73961d, 12);
            return bArr2;
        }

        /* renamed from: b */
        public void m24706b() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                byte[] bArr = this.f73963f;
                int i2 = i * 4;
                iArr[i] = (bArr[i2] & 255) + ((bArr[i2 + 1] & 255) << 8) + ((bArr[i2 + 2] & 255) << 16) + ((bArr[i2 + 3] & 255) << 24);
            }
            int i3 = this.f73958a;
            int i4 = this.f73959b;
            int i5 = this.f73960c;
            int i6 = this.f73961d;
            m24705c(iArr);
            m24704d(iArr);
            m24703e(iArr);
            this.f73958a += i3;
            this.f73959b += i4;
            this.f73960c += i5;
            this.f73961d += i6;
        }

        /* renamed from: c */
        public void m24705c(int[] iArr) {
            int m24739U = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24735a(this.f73959b, this.f73960c, this.f73961d) + iArr[0], 3);
            this.f73958a = m24739U;
            int m24739U2 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24735a(m24739U, this.f73959b, this.f73960c) + iArr[1], 7);
            this.f73961d = m24739U2;
            int m24739U3 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24735a(m24739U2, this.f73958a, this.f73959b) + iArr[2], 11);
            this.f73960c = m24739U3;
            int m24739U4 = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24735a(m24739U3, this.f73961d, this.f73958a) + iArr[3], 19);
            this.f73959b = m24739U4;
            int m24739U5 = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24735a(m24739U4, this.f73960c, this.f73961d) + iArr[4], 3);
            this.f73958a = m24739U5;
            int m24739U6 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24735a(m24739U5, this.f73959b, this.f73960c) + iArr[5], 7);
            this.f73961d = m24739U6;
            int m24739U7 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24735a(m24739U6, this.f73958a, this.f73959b) + iArr[6], 11);
            this.f73960c = m24739U7;
            int m24739U8 = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24735a(m24739U7, this.f73961d, this.f73958a) + iArr[7], 19);
            this.f73959b = m24739U8;
            int m24739U9 = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24735a(m24739U8, this.f73960c, this.f73961d) + iArr[8], 3);
            this.f73958a = m24739U9;
            int m24739U10 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24735a(m24739U9, this.f73959b, this.f73960c) + iArr[9], 7);
            this.f73961d = m24739U10;
            int m24739U11 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24735a(m24739U10, this.f73958a, this.f73959b) + iArr[10], 11);
            this.f73960c = m24739U11;
            int m24739U12 = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24735a(m24739U11, this.f73961d, this.f73958a) + iArr[11], 19);
            this.f73959b = m24739U12;
            int m24739U13 = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24735a(m24739U12, this.f73960c, this.f73961d) + iArr[12], 3);
            this.f73958a = m24739U13;
            int m24739U14 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24735a(m24739U13, this.f73959b, this.f73960c) + iArr[13], 7);
            this.f73961d = m24739U14;
            int m24739U15 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24735a(m24739U14, this.f73958a, this.f73959b) + iArr[14], 11);
            this.f73960c = m24739U15;
            this.f73959b = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24735a(m24739U15, this.f73961d, this.f73958a) + iArr[15], 19);
        }

        /* renamed from: d */
        public void m24704d(int[] iArr) {
            int m24739U = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24734b(this.f73959b, this.f73960c, this.f73961d) + iArr[0] + 1518500249, 3);
            this.f73958a = m24739U;
            int m24739U2 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24734b(m24739U, this.f73959b, this.f73960c) + iArr[4] + 1518500249, 5);
            this.f73961d = m24739U2;
            int m24739U3 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24734b(m24739U2, this.f73958a, this.f73959b) + iArr[8] + 1518500249, 9);
            this.f73960c = m24739U3;
            int m24739U4 = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24734b(m24739U3, this.f73961d, this.f73958a) + iArr[12] + 1518500249, 13);
            this.f73959b = m24739U4;
            int m24739U5 = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24734b(m24739U4, this.f73960c, this.f73961d) + iArr[1] + 1518500249, 3);
            this.f73958a = m24739U5;
            int m24739U6 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24734b(m24739U5, this.f73959b, this.f73960c) + iArr[5] + 1518500249, 5);
            this.f73961d = m24739U6;
            int m24739U7 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24734b(m24739U6, this.f73958a, this.f73959b) + iArr[9] + 1518500249, 9);
            this.f73960c = m24739U7;
            int m24739U8 = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24734b(m24739U7, this.f73961d, this.f73958a) + iArr[13] + 1518500249, 13);
            this.f73959b = m24739U8;
            int m24739U9 = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24734b(m24739U8, this.f73960c, this.f73961d) + iArr[2] + 1518500249, 3);
            this.f73958a = m24739U9;
            int m24739U10 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24734b(m24739U9, this.f73959b, this.f73960c) + iArr[6] + 1518500249, 5);
            this.f73961d = m24739U10;
            int m24739U11 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24734b(m24739U10, this.f73958a, this.f73959b) + iArr[10] + 1518500249, 9);
            this.f73960c = m24739U11;
            int m24739U12 = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24734b(m24739U11, this.f73961d, this.f73958a) + iArr[14] + 1518500249, 13);
            this.f73959b = m24739U12;
            int m24739U13 = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24734b(m24739U12, this.f73960c, this.f73961d) + iArr[3] + 1518500249, 3);
            this.f73958a = m24739U13;
            int m24739U14 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24734b(m24739U13, this.f73959b, this.f73960c) + iArr[7] + 1518500249, 5);
            this.f73961d = m24739U14;
            int m24739U15 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24734b(m24739U14, this.f73958a, this.f73959b) + iArr[11] + 1518500249, 9);
            this.f73960c = m24739U15;
            this.f73959b = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24734b(m24739U15, this.f73961d, this.f73958a) + iArr[15] + 1518500249, 13);
        }

        /* renamed from: e */
        public void m24703e(int[] iArr) {
            int m24739U = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24733c(this.f73959b, this.f73960c, this.f73961d) + iArr[0] + 1859775393, 3);
            this.f73958a = m24739U;
            int m24739U2 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24733c(m24739U, this.f73959b, this.f73960c) + iArr[8] + 1859775393, 9);
            this.f73961d = m24739U2;
            int m24739U3 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24733c(m24739U2, this.f73958a, this.f73959b) + iArr[4] + 1859775393, 11);
            this.f73960c = m24739U3;
            int m24739U4 = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24733c(m24739U3, this.f73961d, this.f73958a) + iArr[12] + 1859775393, 15);
            this.f73959b = m24739U4;
            int m24739U5 = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24733c(m24739U4, this.f73960c, this.f73961d) + iArr[2] + 1859775393, 3);
            this.f73958a = m24739U5;
            int m24739U6 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24733c(m24739U5, this.f73959b, this.f73960c) + iArr[10] + 1859775393, 9);
            this.f73961d = m24739U6;
            int m24739U7 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24733c(m24739U6, this.f73958a, this.f73959b) + iArr[6] + 1859775393, 11);
            this.f73960c = m24739U7;
            int m24739U8 = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24733c(m24739U7, this.f73961d, this.f73958a) + iArr[14] + 1859775393, 15);
            this.f73959b = m24739U8;
            int m24739U9 = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24733c(m24739U8, this.f73960c, this.f73961d) + iArr[1] + 1859775393, 3);
            this.f73958a = m24739U9;
            int m24739U10 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24733c(m24739U9, this.f73959b, this.f73960c) + iArr[9] + 1859775393, 9);
            this.f73961d = m24739U10;
            int m24739U11 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24733c(m24739U10, this.f73958a, this.f73959b) + iArr[5] + 1859775393, 11);
            this.f73960c = m24739U11;
            int m24739U12 = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24733c(m24739U11, this.f73961d, this.f73958a) + iArr[13] + 1859775393, 15);
            this.f73959b = m24739U12;
            int m24739U13 = NTLMEngineImpl.m24739U(this.f73958a + NTLMEngineImpl.m24733c(m24739U12, this.f73960c, this.f73961d) + iArr[3] + 1859775393, 3);
            this.f73958a = m24739U13;
            int m24739U14 = NTLMEngineImpl.m24739U(this.f73961d + NTLMEngineImpl.m24733c(m24739U13, this.f73959b, this.f73960c) + iArr[11] + 1859775393, 9);
            this.f73961d = m24739U14;
            int m24739U15 = NTLMEngineImpl.m24739U(this.f73960c + NTLMEngineImpl.m24733c(m24739U14, this.f73958a, this.f73959b) + iArr[7] + 1859775393, 11);
            this.f73960c = m24739U15;
            this.f73959b = NTLMEngineImpl.m24739U(this.f73959b + NTLMEngineImpl.m24733c(m24739U15, this.f73961d, this.f73958a) + iArr[15] + 1859775393, 15);
        }

        /* renamed from: f */
        public void m24702f(byte[] bArr) {
            byte[] bArr2;
            int i = (int) (this.f73962e & 63);
            int i2 = 0;
            while (true) {
                int length = (bArr.length - i2) + i;
                bArr2 = this.f73963f;
                if (length < bArr2.length) {
                    break;
                }
                int length2 = bArr2.length - i;
                System.arraycopy(bArr, i2, bArr2, i, length2);
                this.f73962e += length2;
                i2 += length2;
                m24706b();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length3 = bArr.length - i2;
                System.arraycopy(bArr, i2, bArr2, i, length3);
                this.f73962e += length3;
            }
        }
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$d */
    /* loaded from: classes6.dex */
    public static class C12578d extends C12577c {

        /* renamed from: c */
        public final byte[] f73966c = null;

        /* renamed from: d */
        public final byte[] f73967d = null;

        /* renamed from: e */
        public final int f73968e = m24690m();

        @Override // org.apache.http.impl.auth.NTLMEngineImpl.C12577c
        /* renamed from: e */
        public void mo24685e() {
            int i;
            byte[] bArr = this.f73967d;
            int i2 = 0;
            if (bArr != null) {
                i = bArr.length;
            } else {
                i = 0;
            }
            byte[] bArr2 = this.f73966c;
            if (bArr2 != null) {
                i2 = bArr2.length;
            }
            m24694i(i2 + 40 + i, 1);
            m24699c(this.f73968e);
            m24698d(i);
            m24698d(i);
            m24699c(i2 + 40);
            m24698d(i2);
            m24698d(i2);
            m24699c(40);
            m24698d(261);
            m24699c(2600);
            m24698d(3840);
            byte[] bArr3 = this.f73966c;
            if (bArr3 != null) {
                m24700b(bArr3);
            }
            byte[] bArr4 = this.f73967d;
            if (bArr4 != null) {
                m24700b(bArr4);
            }
        }

        /* renamed from: m */
        public final int m24690m() {
            return -1576500735;
        }
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$e */
    /* loaded from: classes6.dex */
    public static class C12579e extends C12577c {

        /* renamed from: c */
        public final byte[] f73969c;

        /* renamed from: d */
        public String f73970d;

        /* renamed from: e */
        public byte[] f73971e;

        /* renamed from: f */
        public final int f73972f;

        public C12579e(String str) {
            this(Base64.decodeBase64(str.getBytes(NTLMEngineImpl.f73946b)));
        }

        /* renamed from: m */
        public byte[] m24689m() {
            return this.f73969c;
        }

        /* renamed from: n */
        public int m24688n() {
            return this.f73972f;
        }

        /* renamed from: o */
        public String m24687o() {
            return this.f73970d;
        }

        /* renamed from: p */
        public byte[] m24686p() {
            return this.f73971e;
        }

        public C12579e(byte[] bArr) {
            super(bArr, 2);
            byte[] bArr2 = new byte[8];
            this.f73969c = bArr2;
            m24693j(bArr2, 24);
            int m24691l = m24691l(20);
            this.f73972f = m24691l;
            this.f73970d = null;
            if (m24696g() >= 20) {
                byte[] m24692k = m24692k(12);
                if (m24692k.length != 0) {
                    this.f73970d = new String(m24692k, NTLMEngineImpl.m24758B(m24691l));
                }
            }
            this.f73971e = null;
            if (m24696g() >= 48) {
                byte[] m24692k2 = m24692k(40);
                if (m24692k2.length != 0) {
                    this.f73971e = m24692k2;
                }
            }
        }
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$f */
    /* loaded from: classes6.dex */
    public static class C12580f extends C12577c {

        /* renamed from: c */
        public final byte[] f73973c;

        /* renamed from: d */
        public final byte[] f73974d;

        /* renamed from: e */
        public final int f73975e;

        /* renamed from: f */
        public final byte[] f73976f;

        /* renamed from: g */
        public final byte[] f73977g;

        /* renamed from: h */
        public final byte[] f73978h;

        /* renamed from: i */
        public byte[] f73979i;

        /* renamed from: j */
        public byte[] f73980j;

        /* renamed from: k */
        public final byte[] f73981k;

        /* renamed from: l */
        public final byte[] f73982l;

        /* renamed from: m */
        public final boolean f73983m;

        public C12580f(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
            this(str, str2, str3, str4, bArr, i, str5, bArr2, null, null, null);
        }

        @Override // org.apache.http.impl.auth.NTLMEngineImpl.C12577c
        /* renamed from: e */
        public void mo24685e() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int length = this.f73980j.length;
            int length2 = this.f73979i.length;
            byte[] bArr = this.f73976f;
            if (bArr != null) {
                i = bArr.length;
            } else {
                i = 0;
            }
            byte[] bArr2 = this.f73977g;
            if (bArr2 != null) {
                i2 = bArr2.length;
            } else {
                i2 = 0;
            }
            int length3 = this.f73978h.length;
            byte[] bArr3 = this.f73981k;
            if (bArr3 != null) {
                i3 = bArr3.length;
            } else {
                i3 = 0;
            }
            if (this.f73983m) {
                i4 = 16;
            } else {
                i4 = 0;
            }
            int i6 = i4 + 72;
            int i7 = i6 + length2;
            int i8 = i7 + length;
            int i9 = i8 + i;
            int i10 = i9 + length3;
            int i11 = i10 + i2;
            m24694i(i11 + i3, 3);
            m24698d(length2);
            m24698d(length2);
            m24699c(i6);
            m24698d(length);
            m24698d(length);
            m24699c(i7);
            m24698d(i);
            m24698d(i);
            m24699c(i8);
            m24698d(length3);
            m24698d(length3);
            m24699c(i9);
            m24698d(i2);
            m24698d(i2);
            m24699c(i10);
            m24698d(i3);
            m24698d(i3);
            m24699c(i11);
            m24699c(this.f73975e);
            m24698d(261);
            m24699c(2600);
            m24698d(3840);
            if (this.f73983m) {
                i5 = this.f73965b;
                this.f73965b = i5 + 16;
            } else {
                i5 = -1;
            }
            m24700b(this.f73979i);
            m24700b(this.f73980j);
            m24700b(this.f73976f);
            m24700b(this.f73978h);
            m24700b(this.f73977g);
            byte[] bArr4 = this.f73981k;
            if (bArr4 != null) {
                m24700b(bArr4);
            }
            if (this.f73983m) {
                C12575a c12575a = new C12575a(this.f73982l);
                c12575a.m24708b(this.f73973c);
                c12575a.m24708b(this.f73974d);
                c12575a.m24708b(this.f73964a);
                byte[] m24709a = c12575a.m24709a();
                System.arraycopy(m24709a, 0, this.f73964a, i5, m24709a.length);
            }
        }

        /* renamed from: m */
        public final byte[] m24684m(byte[] bArr, Certificate certificate) {
            byte[] bArr2 = new byte[bArr.length + 28];
            int length = bArr.length;
            int i = length - 4;
            System.arraycopy(bArr, 0, bArr2, 0, i);
            NTLMEngineImpl.m24736X(bArr2, 6, i);
            NTLMEngineImpl.m24736X(bArr2, 4, length - 2);
            NTLMEngineImpl.m24737W(bArr2, 2, length);
            NTLMEngineImpl.m24736X(bArr2, 10, length + 4);
            NTLMEngineImpl.m24736X(bArr2, 16, length + 6);
            try {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(certificate.getEncoded());
                byte[] bArr3 = new byte[NTLMEngineImpl.f73953i.length + 20 + digest.length];
                NTLMEngineImpl.m24737W(bArr3, 53, 16);
                System.arraycopy(NTLMEngineImpl.f73953i, 0, bArr3, 20, NTLMEngineImpl.f73953i.length);
                System.arraycopy(digest, 0, bArr3, NTLMEngineImpl.f73953i.length + 20, digest.length);
                System.arraycopy(NTLMEngineImpl.m24757C().digest(bArr3), 0, bArr2, length + 8, 16);
                return bArr2;
            } catch (NoSuchAlgorithmException e) {
                throw new NTLMEngineException(e.getMessage(), e);
            } catch (CertificateEncodingException e2) {
                throw new NTLMEngineException(e2.getMessage(), e2);
            }
        }

        public C12580f(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) {
            this(NTLMEngineImpl.f73947c, System.currentTimeMillis(), str, str2, str3, str4, bArr, i, str5, bArr2, certificate, bArr3, bArr4);
        }

        public C12580f(Random random, long j, String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) {
            byte[] bArr5;
            byte[] lMUserSessionKey;
            if (random != null) {
                this.f73975e = i;
                this.f73973c = bArr3;
                this.f73974d = bArr4;
                String m24711y = NTLMEngineImpl.m24711y(str2);
                String m24712x = NTLMEngineImpl.m24712x(str);
                if (certificate != null) {
                    byte[] m24684m = m24684m(bArr2, certificate);
                    this.f73983m = true;
                    bArr5 = m24684m;
                } else {
                    this.f73983m = false;
                    bArr5 = bArr2;
                }
                CipherGen cipherGen = new CipherGen(random, j, m24712x, str3, str4, bArr, str5, bArr5);
                try {
                    if ((8388608 & i) != 0 && bArr2 != null && str5 != null) {
                        this.f73980j = cipherGen.getNTLMv2Response();
                        this.f73979i = cipherGen.getLMv2Response();
                        if ((i & 128) != 0) {
                            lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                        } else {
                            lMUserSessionKey = cipherGen.getNTLMv2UserSessionKey();
                        }
                    } else if ((524288 & i) != 0) {
                        this.f73980j = cipherGen.getNTLM2SessionResponse();
                        this.f73979i = cipherGen.getLM2SessionResponse();
                        if ((i & 128) != 0) {
                            lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                        } else {
                            lMUserSessionKey = cipherGen.getNTLM2SessionResponseUserSessionKey();
                        }
                    } else {
                        this.f73980j = cipherGen.getNTLMResponse();
                        this.f73979i = cipherGen.getLMResponse();
                        if ((i & 128) != 0) {
                            lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                        } else {
                            lMUserSessionKey = cipherGen.getNTLMUserSessionKey();
                        }
                    }
                } catch (NTLMEngineException unused) {
                    this.f73980j = new byte[0];
                    this.f73979i = cipherGen.getLMResponse();
                    if ((i & 128) != 0) {
                        lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                    } else {
                        lMUserSessionKey = cipherGen.getLMUserSessionKey();
                    }
                }
                if ((i & 16) != 0) {
                    if ((1073741824 & i) != 0) {
                        byte[] secondaryKey = cipherGen.getSecondaryKey();
                        this.f73982l = secondaryKey;
                        this.f73981k = NTLMEngineImpl.m24732d(secondaryKey, lMUserSessionKey);
                    } else {
                        this.f73981k = lMUserSessionKey;
                        this.f73982l = lMUserSessionKey;
                    }
                } else if (!this.f73983m) {
                    this.f73981k = null;
                    this.f73982l = null;
                } else {
                    throw new NTLMEngineException("Cannot sign/seal: no exported session key");
                }
                Charset m24758B = NTLMEngineImpl.m24758B(i);
                this.f73977g = m24711y != null ? m24711y.getBytes(m24758B) : null;
                this.f73976f = m24712x != null ? m24712x.toUpperCase(Locale.ROOT).getBytes(m24758B) : null;
                this.f73978h = str3.getBytes(m24758B);
                return;
            }
            throw new NTLMEngineException("Random generator not available");
        }
    }

    static {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance(SSL.DEFAULT_SECURE_RANDOM_ALGORITHM);
        } catch (Exception unused) {
            secureRandom = null;
        }
        f73947c = secureRandom;
        f73948d = m24756D("NTLMSSP");
        f73949e = m24756D("session key to server-to-client signing key magic constant");
        f73950f = m24756D("session key to client-to-server signing key magic constant");
        f73951g = m24756D("session key to server-to-client sealing key magic constant");
        f73952h = m24756D("session key to client-to-server sealing key magic constant");
        f73953i = "tls-server-end-point:".getBytes(Consts.ASCII);
        f73954j = new C12578d().m24695h();
    }

    /* renamed from: A */
    public static Key m24759A(byte[] bArr, int i) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i, bArr2, 0, 7);
        byte b = bArr2[0];
        byte b2 = bArr2[1];
        byte b3 = bArr2[2];
        byte b4 = bArr2[3];
        byte b5 = bArr2[4];
        byte b6 = bArr2[5];
        byte b7 = bArr2[6];
        byte[] bArr3 = {b, (byte) ((b << 7) | ((b2 & 255) >>> 1)), (byte) ((b2 << 6) | ((b3 & 255) >>> 2)), (byte) ((b3 << 5) | ((b4 & 255) >>> 3)), (byte) ((b4 << 4) | ((b5 & 255) >>> 4)), (byte) (((b6 & 255) >>> 5) | (b5 << 3)), (byte) ((b6 << 2) | ((b7 & 255) >>> 6)), (byte) (b7 << 1)};
        m24743Q(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    /* renamed from: B */
    public static Charset m24758B(int i) {
        if ((i & 1) == 0) {
            return f73946b;
        }
        Charset charset = f73945a;
        if (charset != null) {
            return charset;
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    /* renamed from: C */
    public static MessageDigest m24757C() {
        try {
            return MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 message digest doesn't seem to exist - fatal error: " + e.getMessage(), e);
        }
    }

    /* renamed from: D */
    public static byte[] m24756D(String str) {
        byte[] bytes = str.getBytes(Consts.ASCII);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 0;
        return bArr;
    }

    /* renamed from: E */
    public static String m24755E(String str, String str2) {
        return f73954j;
    }

    /* renamed from: F */
    public static String m24754F(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
        return new C12580f(str4, str3, str, str2, bArr, i, str5, bArr2).m24695h();
    }

    /* renamed from: G */
    public static byte[] m24753G(byte[] bArr, byte[] bArr2) {
        C12575a c12575a = new C12575a(bArr2);
        c12575a.m24708b(bArr);
        return c12575a.m24709a();
    }

    /* renamed from: H */
    public static byte[] m24752H(String str) {
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Charset charset = Consts.ASCII;
            byte[] bytes = upperCase.getBytes(charset);
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key m24759A = m24759A(bArr, 0);
            Key m24759A2 = m24759A(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes(charset);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, m24759A);
            byte[] doFinal = cipher.doFinal(bytes2);
            cipher.init(1, m24759A2);
            byte[] doFinal2 = cipher.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            System.arraycopy(doFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* renamed from: I */
    public static byte[] m24751I(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key m24759A = m24759A(bArr3, 0);
            Key m24759A2 = m24759A(bArr3, 7);
            Key m24759A3 = m24759A(bArr3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, m24759A);
            byte[] doFinal = cipher.doFinal(bArr2);
            cipher.init(1, m24759A2);
            byte[] doFinal2 = cipher.doFinal(bArr2);
            cipher.init(1, m24759A3);
            byte[] doFinal3 = cipher.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(doFinal, 0, bArr4, 0, 8);
            System.arraycopy(doFinal2, 0, bArr4, 8, 8);
            System.arraycopy(doFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* renamed from: J */
    public static byte[] m24750J(String str, String str2, byte[] bArr) {
        Charset charset = f73945a;
        if (charset != null) {
            C12575a c12575a = new C12575a(bArr);
            Locale locale = Locale.ROOT;
            c12575a.m24708b(str2.toUpperCase(locale).getBytes(charset));
            if (str != null) {
                c12575a.m24708b(str.toUpperCase(locale).getBytes(charset));
            }
            return c12575a.m24709a();
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    /* renamed from: K */
    public static byte[] m24749K(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C12575a c12575a = new C12575a(bArr);
        c12575a.m24708b(bArr2);
        c12575a.m24708b(bArr3);
        byte[] m24709a = c12575a.m24709a();
        byte[] bArr4 = new byte[m24709a.length + bArr3.length];
        System.arraycopy(m24709a, 0, bArr4, 0, m24709a.length);
        System.arraycopy(bArr3, 0, bArr4, m24709a.length, bArr3.length);
        return bArr4;
    }

    /* renamed from: L */
    public static byte[] m24748L(Random random) {
        byte[] bArr = new byte[8];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    /* renamed from: M */
    public static byte[] m24747M(Random random) {
        byte[] bArr = new byte[16];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    /* renamed from: N */
    public static byte[] m24746N(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest m24757C = m24757C();
            m24757C.update(bArr2);
            m24757C.update(bArr3);
            byte[] digest = m24757C.digest();
            byte[] bArr4 = new byte[8];
            System.arraycopy(digest, 0, bArr4, 0, 8);
            return m24751I(bArr, bArr4);
        } catch (Exception e) {
            if (e instanceof NTLMEngineException) {
                throw ((NTLMEngineException) e);
            }
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* renamed from: O */
    public static byte[] m24745O(String str) {
        Charset charset = f73945a;
        if (charset != null) {
            byte[] bytes = str.getBytes(charset);
            C12576b c12576b = new C12576b();
            c12576b.m24702f(bytes);
            return c12576b.m24707a();
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    /* renamed from: P */
    public static byte[] m24744P(String str, String str2, byte[] bArr) {
        Charset charset = f73945a;
        if (charset != null) {
            C12575a c12575a = new C12575a(bArr);
            c12575a.m24708b(str2.toUpperCase(Locale.ROOT).getBytes(charset));
            if (str != null) {
                c12575a.m24708b(str.getBytes(charset));
            }
            return c12575a.m24709a();
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    /* renamed from: Q */
    public static void m24743Q(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (((((((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3)) ^ (b >>> 2)) ^ (b >>> 1)) & 1) == 0) {
                bArr[i] = (byte) (b | 1);
            } else {
                bArr[i] = (byte) (b & (-2));
            }
        }
    }

    /* renamed from: R */
    public static byte[] m24742R(byte[] bArr, int i) {
        int m24740T = m24740T(bArr, i);
        int m24741S = m24741S(bArr, i + 4);
        if (bArr.length < m24741S + m24740T) {
            return new byte[m24740T];
        }
        byte[] bArr2 = new byte[m24740T];
        System.arraycopy(bArr, m24741S, bArr2, 0, m24740T);
        return bArr2;
    }

    /* renamed from: S */
    public static int m24741S(byte[] bArr, int i) {
        if (bArr.length < i + 4) {
            return 0;
        }
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: T */
    public static int m24740T(byte[] bArr, int i) {
        if (bArr.length < i + 2) {
            return 0;
        }
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: U */
    public static int m24739U(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: V */
    public static String m24738V(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    /* renamed from: W */
    public static void m24737W(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    /* renamed from: X */
    public static void m24736X(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
    }

    /* renamed from: a */
    public static int m24735a(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: b */
    public static int m24734b(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    /* renamed from: c */
    public static int m24733c(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: d */
    public static byte[] m24732d(byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr2, "RC4"));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* renamed from: x */
    public static String m24712x(String str) {
        return m24738V(str);
    }

    /* renamed from: y */
    public static String m24711y(String str) {
        return m24738V(str);
    }

    /* renamed from: z */
    public static byte[] m24710z(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr3.length + 20 + bArr2.length + 4];
        System.arraycopy(new byte[]{1, 1, 0, 0}, 0, bArr4, 0, 4);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, 4, 4);
        System.arraycopy(bArr3, 0, bArr4, 8, bArr3.length);
        int length = bArr3.length;
        System.arraycopy(bArr, 0, bArr4, 8 + length, 8);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, length + 16, 4);
        int i = length + 20;
        System.arraycopy(bArr2, 0, bArr4, i, bArr2.length);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, i + bArr2.length, 4);
        return bArr4;
    }

    @Override // org.apache.http.impl.auth.NTLMEngine
    public String generateType1Msg(String str, String str2) {
        return m24755E(str2, str);
    }

    @Override // org.apache.http.impl.auth.NTLMEngine
    public String generateType3Msg(String str, String str2, String str3, String str4, String str5) {
        C12579e c12579e = new C12579e(str5);
        return m24754F(str, str2, str4, str3, c12579e.m24689m(), c12579e.m24688n(), c12579e.m24687o(), c12579e.m24686p());
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$c */
    /* loaded from: classes6.dex */
    public static class C12577c {

        /* renamed from: a */
        public byte[] f73964a;

        /* renamed from: b */
        public int f73965b;

        public C12577c() {
            this.f73964a = null;
            this.f73965b = 0;
        }

        /* renamed from: a */
        public void m24701a(byte b) {
            byte[] bArr = this.f73964a;
            int i = this.f73965b;
            bArr[i] = b;
            this.f73965b = i + 1;
        }

        /* renamed from: b */
        public void m24700b(byte[] bArr) {
            if (bArr == null) {
                return;
            }
            for (byte b : bArr) {
                byte[] bArr2 = this.f73964a;
                int i = this.f73965b;
                bArr2[i] = b;
                this.f73965b = i + 1;
            }
        }

        /* renamed from: c */
        public void m24699c(int i) {
            m24701a((byte) (i & 255));
            m24701a((byte) ((i >> 8) & 255));
            m24701a((byte) ((i >> 16) & 255));
            m24701a((byte) ((i >> 24) & 255));
        }

        /* renamed from: d */
        public void m24698d(int i) {
            m24701a((byte) (i & 255));
            m24701a((byte) ((i >> 8) & 255));
        }

        /* renamed from: e */
        public void mo24685e() {
            throw new RuntimeException("Message builder not implemented for " + getClass().getName());
        }

        /* renamed from: f */
        public byte[] m24697f() {
            if (this.f73964a == null) {
                mo24685e();
            }
            byte[] bArr = this.f73964a;
            int length = bArr.length;
            int i = this.f73965b;
            if (length > i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.f73964a = bArr2;
            }
            return this.f73964a;
        }

        /* renamed from: g */
        public int m24696g() {
            return this.f73965b;
        }

        /* renamed from: h */
        public String m24695h() {
            return new String(Base64.encodeBase64(m24697f()), Consts.ASCII);
        }

        /* renamed from: i */
        public void m24694i(int i, int i2) {
            this.f73964a = new byte[i];
            this.f73965b = 0;
            m24700b(NTLMEngineImpl.f73948d);
            m24699c(i2);
        }

        /* renamed from: j */
        public void m24693j(byte[] bArr, int i) {
            byte[] bArr2 = this.f73964a;
            if (bArr2.length >= bArr.length + i) {
                System.arraycopy(bArr2, i, bArr, 0, bArr.length);
                return;
            }
            throw new NTLMEngineException("NTLM: Message too short");
        }

        /* renamed from: k */
        public byte[] m24692k(int i) {
            return NTLMEngineImpl.m24742R(this.f73964a, i);
        }

        /* renamed from: l */
        public int m24691l(int i) {
            return NTLMEngineImpl.m24741S(this.f73964a, i);
        }

        public C12577c(byte[] bArr, int i) {
            this.f73965b = 0;
            this.f73964a = bArr;
            if (bArr.length >= NTLMEngineImpl.f73948d.length) {
                for (int i2 = 0; i2 < NTLMEngineImpl.f73948d.length; i2++) {
                    if (this.f73964a[i2] != NTLMEngineImpl.f73948d[i2]) {
                        throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                    }
                }
                int m24691l = m24691l(NTLMEngineImpl.f73948d.length);
                if (m24691l == i) {
                    this.f73965b = this.f73964a.length;
                    return;
                }
                throw new NTLMEngineException("NTLM type " + Integer.toString(i) + " message expected - instead got type " + Integer.toString(m24691l));
            }
            throw new NTLMEngineException("NTLM message decoding error - packet too short");
        }
    }
}
