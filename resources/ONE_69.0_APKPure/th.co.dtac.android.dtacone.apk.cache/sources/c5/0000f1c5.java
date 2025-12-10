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
    public static final Charset f74029a = Charset.forName("UnicodeLittleUnmarked");

    /* renamed from: b */
    public static final Charset f74030b = Consts.ASCII;

    /* renamed from: c */
    public static final SecureRandom f74031c;

    /* renamed from: d */
    public static final byte[] f74032d;

    /* renamed from: e */
    public static final byte[] f74033e;

    /* renamed from: f */
    public static final byte[] f74034f;

    /* renamed from: g */
    public static final byte[] f74035g;

    /* renamed from: h */
    public static final byte[] f74036h;

    /* renamed from: i */
    public static final byte[] f74037i;

    /* renamed from: j */
    public static final String f74038j;

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
            this(NTLMEngineImpl.f74031c, System.currentTimeMillis(), str, str2, str3, bArr, str4, bArr2, bArr3, bArr4, bArr5, bArr6);
        }

        public byte[] getClientChallenge() throws NTLMEngineException {
            if (this.clientChallenge == null) {
                this.clientChallenge = NTLMEngineImpl.m24938L(this.random);
            }
            return this.clientChallenge;
        }

        public byte[] getClientChallenge2() throws NTLMEngineException {
            if (this.clientChallenge2 == null) {
                this.clientChallenge2 = NTLMEngineImpl.m24938L(this.random);
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
                this.lmHash = NTLMEngineImpl.m24942H(this.password);
            }
            return this.lmHash;
        }

        public byte[] getLMResponse() throws NTLMEngineException {
            if (this.lmResponse == null) {
                this.lmResponse = NTLMEngineImpl.m24941I(getLMHash(), this.challenge);
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
                this.lmv2Hash = NTLMEngineImpl.m24940J(this.domain, this.user, getNTLMHash());
            }
            return this.lmv2Hash;
        }

        public byte[] getLMv2Response() throws NTLMEngineException {
            if (this.lmv2Response == null) {
                this.lmv2Response = NTLMEngineImpl.m24939K(getLMv2Hash(), this.challenge, getClientChallenge());
            }
            return this.lmv2Response;
        }

        public byte[] getLanManagerSessionKey() throws NTLMEngineException {
            if (this.lanManagerSessionKey == null) {
                try {
                    byte[] bArr = new byte[14];
                    System.arraycopy(getLMHash(), 0, bArr, 0, 8);
                    Arrays.fill(bArr, 8, 14, (byte) -67);
                    Key m24949A = NTLMEngineImpl.m24949A(bArr, 0);
                    Key m24949A2 = NTLMEngineImpl.m24949A(bArr, 7);
                    byte[] bArr2 = new byte[8];
                    System.arraycopy(getLMResponse(), 0, bArr2, 0, 8);
                    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher.init(1, m24949A);
                    byte[] doFinal = cipher.doFinal(bArr2);
                    Cipher cipher2 = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher2.init(1, m24949A2);
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
                this.ntlm2SessionResponse = NTLMEngineImpl.m24936N(getNTLMHash(), this.challenge, getClientChallenge());
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
                this.ntlm2SessionResponseUserSessionKey = NTLMEngineImpl.m24943G(bArr2, getNTLMUserSessionKey());
            }
            return this.ntlm2SessionResponseUserSessionKey;
        }

        public byte[] getNTLMHash() throws NTLMEngineException {
            if (this.ntlmHash == null) {
                this.ntlmHash = NTLMEngineImpl.m24935O(this.password);
            }
            return this.ntlmHash;
        }

        public byte[] getNTLMResponse() throws NTLMEngineException {
            if (this.ntlmResponse == null) {
                this.ntlmResponse = NTLMEngineImpl.m24941I(getNTLMHash(), this.challenge);
            }
            return this.ntlmResponse;
        }

        public byte[] getNTLMUserSessionKey() throws NTLMEngineException {
            if (this.ntlmUserSessionKey == null) {
                C12576b c12576b = new C12576b();
                c12576b.m24892f(getNTLMHash());
                this.ntlmUserSessionKey = c12576b.m24897a();
            }
            return this.ntlmUserSessionKey;
        }

        public byte[] getNTLMv2Blob() throws NTLMEngineException {
            if (this.ntlmv2Blob == null) {
                this.ntlmv2Blob = NTLMEngineImpl.m24900z(getClientChallenge2(), this.targetInformation, getTimestamp());
            }
            return this.ntlmv2Blob;
        }

        public byte[] getNTLMv2Hash() throws NTLMEngineException {
            if (this.ntlmv2Hash == null) {
                this.ntlmv2Hash = NTLMEngineImpl.m24934P(this.domain, this.user, getNTLMHash());
            }
            return this.ntlmv2Hash;
        }

        public byte[] getNTLMv2Response() throws NTLMEngineException {
            if (this.ntlmv2Response == null) {
                this.ntlmv2Response = NTLMEngineImpl.m24939K(getNTLMv2Hash(), this.challenge, getNTLMv2Blob());
            }
            return this.ntlmv2Response;
        }

        public byte[] getNTLMv2UserSessionKey() throws NTLMEngineException {
            if (this.ntlmv2UserSessionKey == null) {
                byte[] nTLMv2Hash = getNTLMv2Hash();
                byte[] bArr = new byte[16];
                System.arraycopy(getNTLMv2Response(), 0, bArr, 0, 16);
                this.ntlmv2UserSessionKey = NTLMEngineImpl.m24943G(bArr, nTLMv2Hash);
            }
            return this.ntlmv2UserSessionKey;
        }

        public byte[] getSecondaryKey() throws NTLMEngineException {
            if (this.secondaryKey == null) {
                this.secondaryKey = NTLMEngineImpl.m24937M(this.random);
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
            this(NTLMEngineImpl.f74031c, System.currentTimeMillis(), str, str2, str3, bArr, str4, bArr2);
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
        public final byte[] f74039a;

        /* renamed from: b */
        public final byte[] f74040b;

        /* renamed from: c */
        public final MessageDigest f74041c;

        public C12575a(byte[] bArr) {
            MessageDigest m24947C = NTLMEngineImpl.m24947C();
            this.f74041c = m24947C;
            this.f74039a = new byte[64];
            this.f74040b = new byte[64];
            int length = bArr.length;
            if (length > 64) {
                m24947C.update(bArr);
                bArr = m24947C.digest();
                length = bArr.length;
            }
            int i = 0;
            while (i < length) {
                this.f74039a[i] = (byte) (54 ^ bArr[i]);
                this.f74040b[i] = (byte) (92 ^ bArr[i]);
                i++;
            }
            while (i < 64) {
                this.f74039a[i] = 54;
                this.f74040b[i] = 92;
                i++;
            }
            this.f74041c.reset();
            this.f74041c.update(this.f74039a);
        }

        /* renamed from: a */
        public byte[] m24899a() {
            byte[] digest = this.f74041c.digest();
            this.f74041c.update(this.f74040b);
            return this.f74041c.digest(digest);
        }

        /* renamed from: b */
        public void m24898b(byte[] bArr) {
            this.f74041c.update(bArr);
        }
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$b */
    /* loaded from: classes6.dex */
    public static class C12576b {

        /* renamed from: a */
        public int f74042a = 1732584193;

        /* renamed from: b */
        public int f74043b = -271733879;

        /* renamed from: c */
        public int f74044c = -1732584194;

        /* renamed from: d */
        public int f74045d = 271733878;

        /* renamed from: e */
        public long f74046e = 0;

        /* renamed from: f */
        public final byte[] f74047f = new byte[64];

        /* renamed from: a */
        public byte[] m24897a() {
            int i;
            int i2 = (int) (this.f74046e & 63);
            if (i2 < 56) {
                i = 56 - i2;
            } else {
                i = 120 - i2;
            }
            byte[] bArr = new byte[i + 8];
            bArr[0] = Byte.MIN_VALUE;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i + i3] = (byte) ((this.f74046e * 8) >>> (i3 * 8));
            }
            m24892f(bArr);
            byte[] bArr2 = new byte[16];
            NTLMEngineImpl.m24927W(bArr2, this.f74042a, 0);
            NTLMEngineImpl.m24927W(bArr2, this.f74043b, 4);
            NTLMEngineImpl.m24927W(bArr2, this.f74044c, 8);
            NTLMEngineImpl.m24927W(bArr2, this.f74045d, 12);
            return bArr2;
        }

        /* renamed from: b */
        public void m24896b() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                byte[] bArr = this.f74047f;
                int i2 = i * 4;
                iArr[i] = (bArr[i2] & 255) + ((bArr[i2 + 1] & 255) << 8) + ((bArr[i2 + 2] & 255) << 16) + ((bArr[i2 + 3] & 255) << 24);
            }
            int i3 = this.f74042a;
            int i4 = this.f74043b;
            int i5 = this.f74044c;
            int i6 = this.f74045d;
            m24895c(iArr);
            m24894d(iArr);
            m24893e(iArr);
            this.f74042a += i3;
            this.f74043b += i4;
            this.f74044c += i5;
            this.f74045d += i6;
        }

        /* renamed from: c */
        public void m24895c(int[] iArr) {
            int m24929U = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24925a(this.f74043b, this.f74044c, this.f74045d) + iArr[0], 3);
            this.f74042a = m24929U;
            int m24929U2 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24925a(m24929U, this.f74043b, this.f74044c) + iArr[1], 7);
            this.f74045d = m24929U2;
            int m24929U3 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24925a(m24929U2, this.f74042a, this.f74043b) + iArr[2], 11);
            this.f74044c = m24929U3;
            int m24929U4 = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24925a(m24929U3, this.f74045d, this.f74042a) + iArr[3], 19);
            this.f74043b = m24929U4;
            int m24929U5 = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24925a(m24929U4, this.f74044c, this.f74045d) + iArr[4], 3);
            this.f74042a = m24929U5;
            int m24929U6 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24925a(m24929U5, this.f74043b, this.f74044c) + iArr[5], 7);
            this.f74045d = m24929U6;
            int m24929U7 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24925a(m24929U6, this.f74042a, this.f74043b) + iArr[6], 11);
            this.f74044c = m24929U7;
            int m24929U8 = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24925a(m24929U7, this.f74045d, this.f74042a) + iArr[7], 19);
            this.f74043b = m24929U8;
            int m24929U9 = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24925a(m24929U8, this.f74044c, this.f74045d) + iArr[8], 3);
            this.f74042a = m24929U9;
            int m24929U10 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24925a(m24929U9, this.f74043b, this.f74044c) + iArr[9], 7);
            this.f74045d = m24929U10;
            int m24929U11 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24925a(m24929U10, this.f74042a, this.f74043b) + iArr[10], 11);
            this.f74044c = m24929U11;
            int m24929U12 = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24925a(m24929U11, this.f74045d, this.f74042a) + iArr[11], 19);
            this.f74043b = m24929U12;
            int m24929U13 = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24925a(m24929U12, this.f74044c, this.f74045d) + iArr[12], 3);
            this.f74042a = m24929U13;
            int m24929U14 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24925a(m24929U13, this.f74043b, this.f74044c) + iArr[13], 7);
            this.f74045d = m24929U14;
            int m24929U15 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24925a(m24929U14, this.f74042a, this.f74043b) + iArr[14], 11);
            this.f74044c = m24929U15;
            this.f74043b = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24925a(m24929U15, this.f74045d, this.f74042a) + iArr[15], 19);
        }

        /* renamed from: d */
        public void m24894d(int[] iArr) {
            int m24929U = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24924b(this.f74043b, this.f74044c, this.f74045d) + iArr[0] + 1518500249, 3);
            this.f74042a = m24929U;
            int m24929U2 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24924b(m24929U, this.f74043b, this.f74044c) + iArr[4] + 1518500249, 5);
            this.f74045d = m24929U2;
            int m24929U3 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24924b(m24929U2, this.f74042a, this.f74043b) + iArr[8] + 1518500249, 9);
            this.f74044c = m24929U3;
            int m24929U4 = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24924b(m24929U3, this.f74045d, this.f74042a) + iArr[12] + 1518500249, 13);
            this.f74043b = m24929U4;
            int m24929U5 = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24924b(m24929U4, this.f74044c, this.f74045d) + iArr[1] + 1518500249, 3);
            this.f74042a = m24929U5;
            int m24929U6 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24924b(m24929U5, this.f74043b, this.f74044c) + iArr[5] + 1518500249, 5);
            this.f74045d = m24929U6;
            int m24929U7 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24924b(m24929U6, this.f74042a, this.f74043b) + iArr[9] + 1518500249, 9);
            this.f74044c = m24929U7;
            int m24929U8 = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24924b(m24929U7, this.f74045d, this.f74042a) + iArr[13] + 1518500249, 13);
            this.f74043b = m24929U8;
            int m24929U9 = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24924b(m24929U8, this.f74044c, this.f74045d) + iArr[2] + 1518500249, 3);
            this.f74042a = m24929U9;
            int m24929U10 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24924b(m24929U9, this.f74043b, this.f74044c) + iArr[6] + 1518500249, 5);
            this.f74045d = m24929U10;
            int m24929U11 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24924b(m24929U10, this.f74042a, this.f74043b) + iArr[10] + 1518500249, 9);
            this.f74044c = m24929U11;
            int m24929U12 = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24924b(m24929U11, this.f74045d, this.f74042a) + iArr[14] + 1518500249, 13);
            this.f74043b = m24929U12;
            int m24929U13 = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24924b(m24929U12, this.f74044c, this.f74045d) + iArr[3] + 1518500249, 3);
            this.f74042a = m24929U13;
            int m24929U14 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24924b(m24929U13, this.f74043b, this.f74044c) + iArr[7] + 1518500249, 5);
            this.f74045d = m24929U14;
            int m24929U15 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24924b(m24929U14, this.f74042a, this.f74043b) + iArr[11] + 1518500249, 9);
            this.f74044c = m24929U15;
            this.f74043b = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24924b(m24929U15, this.f74045d, this.f74042a) + iArr[15] + 1518500249, 13);
        }

        /* renamed from: e */
        public void m24893e(int[] iArr) {
            int m24929U = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24923c(this.f74043b, this.f74044c, this.f74045d) + iArr[0] + 1859775393, 3);
            this.f74042a = m24929U;
            int m24929U2 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24923c(m24929U, this.f74043b, this.f74044c) + iArr[8] + 1859775393, 9);
            this.f74045d = m24929U2;
            int m24929U3 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24923c(m24929U2, this.f74042a, this.f74043b) + iArr[4] + 1859775393, 11);
            this.f74044c = m24929U3;
            int m24929U4 = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24923c(m24929U3, this.f74045d, this.f74042a) + iArr[12] + 1859775393, 15);
            this.f74043b = m24929U4;
            int m24929U5 = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24923c(m24929U4, this.f74044c, this.f74045d) + iArr[2] + 1859775393, 3);
            this.f74042a = m24929U5;
            int m24929U6 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24923c(m24929U5, this.f74043b, this.f74044c) + iArr[10] + 1859775393, 9);
            this.f74045d = m24929U6;
            int m24929U7 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24923c(m24929U6, this.f74042a, this.f74043b) + iArr[6] + 1859775393, 11);
            this.f74044c = m24929U7;
            int m24929U8 = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24923c(m24929U7, this.f74045d, this.f74042a) + iArr[14] + 1859775393, 15);
            this.f74043b = m24929U8;
            int m24929U9 = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24923c(m24929U8, this.f74044c, this.f74045d) + iArr[1] + 1859775393, 3);
            this.f74042a = m24929U9;
            int m24929U10 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24923c(m24929U9, this.f74043b, this.f74044c) + iArr[9] + 1859775393, 9);
            this.f74045d = m24929U10;
            int m24929U11 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24923c(m24929U10, this.f74042a, this.f74043b) + iArr[5] + 1859775393, 11);
            this.f74044c = m24929U11;
            int m24929U12 = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24923c(m24929U11, this.f74045d, this.f74042a) + iArr[13] + 1859775393, 15);
            this.f74043b = m24929U12;
            int m24929U13 = NTLMEngineImpl.m24929U(this.f74042a + NTLMEngineImpl.m24923c(m24929U12, this.f74044c, this.f74045d) + iArr[3] + 1859775393, 3);
            this.f74042a = m24929U13;
            int m24929U14 = NTLMEngineImpl.m24929U(this.f74045d + NTLMEngineImpl.m24923c(m24929U13, this.f74043b, this.f74044c) + iArr[11] + 1859775393, 9);
            this.f74045d = m24929U14;
            int m24929U15 = NTLMEngineImpl.m24929U(this.f74044c + NTLMEngineImpl.m24923c(m24929U14, this.f74042a, this.f74043b) + iArr[7] + 1859775393, 11);
            this.f74044c = m24929U15;
            this.f74043b = NTLMEngineImpl.m24929U(this.f74043b + NTLMEngineImpl.m24923c(m24929U15, this.f74045d, this.f74042a) + iArr[15] + 1859775393, 15);
        }

        /* renamed from: f */
        public void m24892f(byte[] bArr) {
            byte[] bArr2;
            int i = (int) (this.f74046e & 63);
            int i2 = 0;
            while (true) {
                int length = (bArr.length - i2) + i;
                bArr2 = this.f74047f;
                if (length < bArr2.length) {
                    break;
                }
                int length2 = bArr2.length - i;
                System.arraycopy(bArr, i2, bArr2, i, length2);
                this.f74046e += length2;
                i2 += length2;
                m24896b();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length3 = bArr.length - i2;
                System.arraycopy(bArr, i2, bArr2, i, length3);
                this.f74046e += length3;
            }
        }
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$d */
    /* loaded from: classes6.dex */
    public static class C12578d extends C12577c {

        /* renamed from: c */
        public final byte[] f74050c = null;

        /* renamed from: d */
        public final byte[] f74051d = null;

        /* renamed from: e */
        public final int f74052e = m24880m();

        @Override // org.apache.http.impl.auth.NTLMEngineImpl.C12577c
        /* renamed from: e */
        public void mo24875e() {
            int i;
            byte[] bArr = this.f74051d;
            int i2 = 0;
            if (bArr != null) {
                i = bArr.length;
            } else {
                i = 0;
            }
            byte[] bArr2 = this.f74050c;
            if (bArr2 != null) {
                i2 = bArr2.length;
            }
            m24884i(i2 + 40 + i, 1);
            m24889c(this.f74052e);
            m24888d(i);
            m24888d(i);
            m24889c(i2 + 40);
            m24888d(i2);
            m24888d(i2);
            m24889c(40);
            m24888d(261);
            m24889c(2600);
            m24888d(3840);
            byte[] bArr3 = this.f74050c;
            if (bArr3 != null) {
                m24890b(bArr3);
            }
            byte[] bArr4 = this.f74051d;
            if (bArr4 != null) {
                m24890b(bArr4);
            }
        }

        /* renamed from: m */
        public final int m24880m() {
            return -1576500735;
        }
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$e */
    /* loaded from: classes6.dex */
    public static class C12579e extends C12577c {

        /* renamed from: c */
        public final byte[] f74053c;

        /* renamed from: d */
        public String f74054d;

        /* renamed from: e */
        public byte[] f74055e;

        /* renamed from: f */
        public final int f74056f;

        public C12579e(String str) {
            this(Base64.decodeBase64(str.getBytes(NTLMEngineImpl.f74030b)));
        }

        /* renamed from: m */
        public byte[] m24879m() {
            return this.f74053c;
        }

        /* renamed from: n */
        public int m24878n() {
            return this.f74056f;
        }

        /* renamed from: o */
        public String m24877o() {
            return this.f74054d;
        }

        /* renamed from: p */
        public byte[] m24876p() {
            return this.f74055e;
        }

        public C12579e(byte[] bArr) {
            super(bArr, 2);
            byte[] bArr2 = new byte[8];
            this.f74053c = bArr2;
            m24883j(bArr2, 24);
            int m24881l = m24881l(20);
            this.f74056f = m24881l;
            this.f74054d = null;
            if (m24886g() >= 20) {
                byte[] m24882k = m24882k(12);
                if (m24882k.length != 0) {
                    this.f74054d = new String(m24882k, NTLMEngineImpl.m24948B(m24881l));
                }
            }
            this.f74055e = null;
            if (m24886g() >= 48) {
                byte[] m24882k2 = m24882k(40);
                if (m24882k2.length != 0) {
                    this.f74055e = m24882k2;
                }
            }
        }
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$f */
    /* loaded from: classes6.dex */
    public static class C12580f extends C12577c {

        /* renamed from: c */
        public final byte[] f74057c;

        /* renamed from: d */
        public final byte[] f74058d;

        /* renamed from: e */
        public final int f74059e;

        /* renamed from: f */
        public final byte[] f74060f;

        /* renamed from: g */
        public final byte[] f74061g;

        /* renamed from: h */
        public final byte[] f74062h;

        /* renamed from: i */
        public byte[] f74063i;

        /* renamed from: j */
        public byte[] f74064j;

        /* renamed from: k */
        public final byte[] f74065k;

        /* renamed from: l */
        public final byte[] f74066l;

        /* renamed from: m */
        public final boolean f74067m;

        public C12580f(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
            this(str, str2, str3, str4, bArr, i, str5, bArr2, null, null, null);
        }

        @Override // org.apache.http.impl.auth.NTLMEngineImpl.C12577c
        /* renamed from: e */
        public void mo24875e() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int length = this.f74064j.length;
            int length2 = this.f74063i.length;
            byte[] bArr = this.f74060f;
            if (bArr != null) {
                i = bArr.length;
            } else {
                i = 0;
            }
            byte[] bArr2 = this.f74061g;
            if (bArr2 != null) {
                i2 = bArr2.length;
            } else {
                i2 = 0;
            }
            int length3 = this.f74062h.length;
            byte[] bArr3 = this.f74065k;
            if (bArr3 != null) {
                i3 = bArr3.length;
            } else {
                i3 = 0;
            }
            if (this.f74067m) {
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
            m24884i(i11 + i3, 3);
            m24888d(length2);
            m24888d(length2);
            m24889c(i6);
            m24888d(length);
            m24888d(length);
            m24889c(i7);
            m24888d(i);
            m24888d(i);
            m24889c(i8);
            m24888d(length3);
            m24888d(length3);
            m24889c(i9);
            m24888d(i2);
            m24888d(i2);
            m24889c(i10);
            m24888d(i3);
            m24888d(i3);
            m24889c(i11);
            m24889c(this.f74059e);
            m24888d(261);
            m24889c(2600);
            m24888d(3840);
            if (this.f74067m) {
                i5 = this.f74049b;
                this.f74049b = i5 + 16;
            } else {
                i5 = -1;
            }
            m24890b(this.f74063i);
            m24890b(this.f74064j);
            m24890b(this.f74060f);
            m24890b(this.f74062h);
            m24890b(this.f74061g);
            byte[] bArr4 = this.f74065k;
            if (bArr4 != null) {
                m24890b(bArr4);
            }
            if (this.f74067m) {
                C12575a c12575a = new C12575a(this.f74066l);
                c12575a.m24898b(this.f74057c);
                c12575a.m24898b(this.f74058d);
                c12575a.m24898b(this.f74048a);
                byte[] m24899a = c12575a.m24899a();
                System.arraycopy(m24899a, 0, this.f74048a, i5, m24899a.length);
            }
        }

        /* renamed from: m */
        public final byte[] m24874m(byte[] bArr, Certificate certificate) {
            byte[] bArr2 = new byte[bArr.length + 28];
            int length = bArr.length;
            int i = length - 4;
            System.arraycopy(bArr, 0, bArr2, 0, i);
            NTLMEngineImpl.m24926X(bArr2, 6, i);
            NTLMEngineImpl.m24926X(bArr2, 4, length - 2);
            NTLMEngineImpl.m24927W(bArr2, 2, length);
            NTLMEngineImpl.m24926X(bArr2, 10, length + 4);
            NTLMEngineImpl.m24926X(bArr2, 16, length + 6);
            try {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(certificate.getEncoded());
                byte[] bArr3 = new byte[NTLMEngineImpl.f74037i.length + 20 + digest.length];
                NTLMEngineImpl.m24927W(bArr3, 53, 16);
                System.arraycopy(NTLMEngineImpl.f74037i, 0, bArr3, 20, NTLMEngineImpl.f74037i.length);
                System.arraycopy(digest, 0, bArr3, NTLMEngineImpl.f74037i.length + 20, digest.length);
                System.arraycopy(NTLMEngineImpl.m24947C().digest(bArr3), 0, bArr2, length + 8, 16);
                return bArr2;
            } catch (NoSuchAlgorithmException e) {
                throw new NTLMEngineException(e.getMessage(), e);
            } catch (CertificateEncodingException e2) {
                throw new NTLMEngineException(e2.getMessage(), e2);
            }
        }

        public C12580f(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) {
            this(NTLMEngineImpl.f74031c, System.currentTimeMillis(), str, str2, str3, str4, bArr, i, str5, bArr2, certificate, bArr3, bArr4);
        }

        public C12580f(Random random, long j, String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) {
            byte[] bArr5;
            byte[] lMUserSessionKey;
            if (random != null) {
                this.f74059e = i;
                this.f74057c = bArr3;
                this.f74058d = bArr4;
                String m24901y = NTLMEngineImpl.m24901y(str2);
                String m24902x = NTLMEngineImpl.m24902x(str);
                if (certificate != null) {
                    byte[] m24874m = m24874m(bArr2, certificate);
                    this.f74067m = true;
                    bArr5 = m24874m;
                } else {
                    this.f74067m = false;
                    bArr5 = bArr2;
                }
                CipherGen cipherGen = new CipherGen(random, j, m24902x, str3, str4, bArr, str5, bArr5);
                try {
                    if ((8388608 & i) != 0 && bArr2 != null && str5 != null) {
                        this.f74064j = cipherGen.getNTLMv2Response();
                        this.f74063i = cipherGen.getLMv2Response();
                        if ((i & 128) != 0) {
                            lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                        } else {
                            lMUserSessionKey = cipherGen.getNTLMv2UserSessionKey();
                        }
                    } else if ((524288 & i) != 0) {
                        this.f74064j = cipherGen.getNTLM2SessionResponse();
                        this.f74063i = cipherGen.getLM2SessionResponse();
                        if ((i & 128) != 0) {
                            lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                        } else {
                            lMUserSessionKey = cipherGen.getNTLM2SessionResponseUserSessionKey();
                        }
                    } else {
                        this.f74064j = cipherGen.getNTLMResponse();
                        this.f74063i = cipherGen.getLMResponse();
                        if ((i & 128) != 0) {
                            lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                        } else {
                            lMUserSessionKey = cipherGen.getNTLMUserSessionKey();
                        }
                    }
                } catch (NTLMEngineException unused) {
                    this.f74064j = new byte[0];
                    this.f74063i = cipherGen.getLMResponse();
                    if ((i & 128) != 0) {
                        lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                    } else {
                        lMUserSessionKey = cipherGen.getLMUserSessionKey();
                    }
                }
                if ((i & 16) != 0) {
                    if ((1073741824 & i) != 0) {
                        byte[] secondaryKey = cipherGen.getSecondaryKey();
                        this.f74066l = secondaryKey;
                        this.f74065k = NTLMEngineImpl.m24922d(secondaryKey, lMUserSessionKey);
                    } else {
                        this.f74065k = lMUserSessionKey;
                        this.f74066l = lMUserSessionKey;
                    }
                } else if (!this.f74067m) {
                    this.f74065k = null;
                    this.f74066l = null;
                } else {
                    throw new NTLMEngineException("Cannot sign/seal: no exported session key");
                }
                Charset m24948B = NTLMEngineImpl.m24948B(i);
                this.f74061g = m24901y != null ? m24901y.getBytes(m24948B) : null;
                this.f74060f = m24902x != null ? m24902x.toUpperCase(Locale.ROOT).getBytes(m24948B) : null;
                this.f74062h = str3.getBytes(m24948B);
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
        f74031c = secureRandom;
        f74032d = m24946D("NTLMSSP");
        f74033e = m24946D("session key to server-to-client signing key magic constant");
        f74034f = m24946D("session key to client-to-server signing key magic constant");
        f74035g = m24946D("session key to server-to-client sealing key magic constant");
        f74036h = m24946D("session key to client-to-server sealing key magic constant");
        f74037i = "tls-server-end-point:".getBytes(Consts.ASCII);
        f74038j = new C12578d().m24885h();
    }

    /* renamed from: A */
    public static Key m24949A(byte[] bArr, int i) {
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
        m24933Q(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    /* renamed from: B */
    public static Charset m24948B(int i) {
        if ((i & 1) == 0) {
            return f74030b;
        }
        Charset charset = f74029a;
        if (charset != null) {
            return charset;
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    /* renamed from: C */
    public static MessageDigest m24947C() {
        try {
            return MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 message digest doesn't seem to exist - fatal error: " + e.getMessage(), e);
        }
    }

    /* renamed from: D */
    public static byte[] m24946D(String str) {
        byte[] bytes = str.getBytes(Consts.ASCII);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 0;
        return bArr;
    }

    /* renamed from: E */
    public static String m24945E(String str, String str2) {
        return f74038j;
    }

    /* renamed from: F */
    public static String m24944F(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
        return new C12580f(str4, str3, str, str2, bArr, i, str5, bArr2).m24885h();
    }

    /* renamed from: G */
    public static byte[] m24943G(byte[] bArr, byte[] bArr2) {
        C12575a c12575a = new C12575a(bArr2);
        c12575a.m24898b(bArr);
        return c12575a.m24899a();
    }

    /* renamed from: H */
    public static byte[] m24942H(String str) {
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Charset charset = Consts.ASCII;
            byte[] bytes = upperCase.getBytes(charset);
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key m24949A = m24949A(bArr, 0);
            Key m24949A2 = m24949A(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes(charset);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, m24949A);
            byte[] doFinal = cipher.doFinal(bytes2);
            cipher.init(1, m24949A2);
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
    public static byte[] m24941I(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key m24949A = m24949A(bArr3, 0);
            Key m24949A2 = m24949A(bArr3, 7);
            Key m24949A3 = m24949A(bArr3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, m24949A);
            byte[] doFinal = cipher.doFinal(bArr2);
            cipher.init(1, m24949A2);
            byte[] doFinal2 = cipher.doFinal(bArr2);
            cipher.init(1, m24949A3);
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
    public static byte[] m24940J(String str, String str2, byte[] bArr) {
        Charset charset = f74029a;
        if (charset != null) {
            C12575a c12575a = new C12575a(bArr);
            Locale locale = Locale.ROOT;
            c12575a.m24898b(str2.toUpperCase(locale).getBytes(charset));
            if (str != null) {
                c12575a.m24898b(str.toUpperCase(locale).getBytes(charset));
            }
            return c12575a.m24899a();
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    /* renamed from: K */
    public static byte[] m24939K(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C12575a c12575a = new C12575a(bArr);
        c12575a.m24898b(bArr2);
        c12575a.m24898b(bArr3);
        byte[] m24899a = c12575a.m24899a();
        byte[] bArr4 = new byte[m24899a.length + bArr3.length];
        System.arraycopy(m24899a, 0, bArr4, 0, m24899a.length);
        System.arraycopy(bArr3, 0, bArr4, m24899a.length, bArr3.length);
        return bArr4;
    }

    /* renamed from: L */
    public static byte[] m24938L(Random random) {
        byte[] bArr = new byte[8];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    /* renamed from: M */
    public static byte[] m24937M(Random random) {
        byte[] bArr = new byte[16];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    /* renamed from: N */
    public static byte[] m24936N(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest m24947C = m24947C();
            m24947C.update(bArr2);
            m24947C.update(bArr3);
            byte[] digest = m24947C.digest();
            byte[] bArr4 = new byte[8];
            System.arraycopy(digest, 0, bArr4, 0, 8);
            return m24941I(bArr, bArr4);
        } catch (Exception e) {
            if (e instanceof NTLMEngineException) {
                throw ((NTLMEngineException) e);
            }
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* renamed from: O */
    public static byte[] m24935O(String str) {
        Charset charset = f74029a;
        if (charset != null) {
            byte[] bytes = str.getBytes(charset);
            C12576b c12576b = new C12576b();
            c12576b.m24892f(bytes);
            return c12576b.m24897a();
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    /* renamed from: P */
    public static byte[] m24934P(String str, String str2, byte[] bArr) {
        Charset charset = f74029a;
        if (charset != null) {
            C12575a c12575a = new C12575a(bArr);
            c12575a.m24898b(str2.toUpperCase(Locale.ROOT).getBytes(charset));
            if (str != null) {
                c12575a.m24898b(str.getBytes(charset));
            }
            return c12575a.m24899a();
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    /* renamed from: Q */
    public static void m24933Q(byte[] bArr) {
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
    public static byte[] m24932R(byte[] bArr, int i) {
        int m24930T = m24930T(bArr, i);
        int m24931S = m24931S(bArr, i + 4);
        if (bArr.length < m24931S + m24930T) {
            return new byte[m24930T];
        }
        byte[] bArr2 = new byte[m24930T];
        System.arraycopy(bArr, m24931S, bArr2, 0, m24930T);
        return bArr2;
    }

    /* renamed from: S */
    public static int m24931S(byte[] bArr, int i) {
        if (bArr.length < i + 4) {
            return 0;
        }
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: T */
    public static int m24930T(byte[] bArr, int i) {
        if (bArr.length < i + 2) {
            return 0;
        }
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: U */
    public static int m24929U(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: V */
    public static String m24928V(String str) {
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
    public static void m24927W(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    /* renamed from: X */
    public static void m24926X(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
    }

    /* renamed from: a */
    public static int m24925a(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: b */
    public static int m24924b(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    /* renamed from: c */
    public static int m24923c(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: d */
    public static byte[] m24922d(byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr2, "RC4"));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* renamed from: x */
    public static String m24902x(String str) {
        return m24928V(str);
    }

    /* renamed from: y */
    public static String m24901y(String str) {
        return m24928V(str);
    }

    /* renamed from: z */
    public static byte[] m24900z(byte[] bArr, byte[] bArr2, byte[] bArr3) {
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
        return m24945E(str2, str);
    }

    @Override // org.apache.http.impl.auth.NTLMEngine
    public String generateType3Msg(String str, String str2, String str3, String str4, String str5) {
        C12579e c12579e = new C12579e(str5);
        return m24944F(str, str2, str4, str3, c12579e.m24879m(), c12579e.m24878n(), c12579e.m24877o(), c12579e.m24876p());
    }

    /* renamed from: org.apache.http.impl.auth.NTLMEngineImpl$c */
    /* loaded from: classes6.dex */
    public static class C12577c {

        /* renamed from: a */
        public byte[] f74048a;

        /* renamed from: b */
        public int f74049b;

        public C12577c() {
            this.f74048a = null;
            this.f74049b = 0;
        }

        /* renamed from: a */
        public void m24891a(byte b) {
            byte[] bArr = this.f74048a;
            int i = this.f74049b;
            bArr[i] = b;
            this.f74049b = i + 1;
        }

        /* renamed from: b */
        public void m24890b(byte[] bArr) {
            if (bArr == null) {
                return;
            }
            for (byte b : bArr) {
                byte[] bArr2 = this.f74048a;
                int i = this.f74049b;
                bArr2[i] = b;
                this.f74049b = i + 1;
            }
        }

        /* renamed from: c */
        public void m24889c(int i) {
            m24891a((byte) (i & 255));
            m24891a((byte) ((i >> 8) & 255));
            m24891a((byte) ((i >> 16) & 255));
            m24891a((byte) ((i >> 24) & 255));
        }

        /* renamed from: d */
        public void m24888d(int i) {
            m24891a((byte) (i & 255));
            m24891a((byte) ((i >> 8) & 255));
        }

        /* renamed from: e */
        public void mo24875e() {
            throw new RuntimeException("Message builder not implemented for " + getClass().getName());
        }

        /* renamed from: f */
        public byte[] m24887f() {
            if (this.f74048a == null) {
                mo24875e();
            }
            byte[] bArr = this.f74048a;
            int length = bArr.length;
            int i = this.f74049b;
            if (length > i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.f74048a = bArr2;
            }
            return this.f74048a;
        }

        /* renamed from: g */
        public int m24886g() {
            return this.f74049b;
        }

        /* renamed from: h */
        public String m24885h() {
            return new String(Base64.encodeBase64(m24887f()), Consts.ASCII);
        }

        /* renamed from: i */
        public void m24884i(int i, int i2) {
            this.f74048a = new byte[i];
            this.f74049b = 0;
            m24890b(NTLMEngineImpl.f74032d);
            m24889c(i2);
        }

        /* renamed from: j */
        public void m24883j(byte[] bArr, int i) {
            byte[] bArr2 = this.f74048a;
            if (bArr2.length >= bArr.length + i) {
                System.arraycopy(bArr2, i, bArr, 0, bArr.length);
                return;
            }
            throw new NTLMEngineException("NTLM: Message too short");
        }

        /* renamed from: k */
        public byte[] m24882k(int i) {
            return NTLMEngineImpl.m24932R(this.f74048a, i);
        }

        /* renamed from: l */
        public int m24881l(int i) {
            return NTLMEngineImpl.m24931S(this.f74048a, i);
        }

        public C12577c(byte[] bArr, int i) {
            this.f74049b = 0;
            this.f74048a = bArr;
            if (bArr.length >= NTLMEngineImpl.f74032d.length) {
                for (int i2 = 0; i2 < NTLMEngineImpl.f74032d.length; i2++) {
                    if (this.f74048a[i2] != NTLMEngineImpl.f74032d[i2]) {
                        throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                    }
                }
                int m24881l = m24881l(NTLMEngineImpl.f74032d.length);
                if (m24881l == i) {
                    this.f74049b = this.f74048a.length;
                    return;
                }
                throw new NTLMEngineException("NTLM type " + Integer.toString(i) + " message expected - instead got type " + Integer.toString(m24881l));
            }
            throw new NTLMEngineException("NTLM message decoding error - packet too short");
        }
    }
}