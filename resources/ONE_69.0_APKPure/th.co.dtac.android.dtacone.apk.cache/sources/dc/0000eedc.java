package org.apache.commons.codec.cli;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.codec.language.p027bm.Rule;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public class Digest {

    /* renamed from: a */
    public final String f73152a;

    /* renamed from: b */
    public final String[] f73153b;

    /* renamed from: c */
    public final String[] f73154c;

    public Digest(String[] strArr) {
        Objects.requireNonNull(strArr);
        int length = strArr.length;
        if (length != 0) {
            this.f73153b = strArr;
            this.f73152a = strArr[0];
            if (length <= 1) {
                this.f73154c = null;
                return;
            } else {
                this.f73154c = (String[]) Arrays.copyOfRange(strArr, 1, length);
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Usage: java %s [algorithm] [FILE|DIRECTORY|string] ...", Digest.class.getName()));
    }

    public static void main(String[] strArr) throws IOException {
        new Digest(strArr).m25838c();
    }

    /* renamed from: a */
    public final void m25840a(String str, byte[] bArr) {
        m25839b(str, bArr, null);
    }

    /* renamed from: b */
    public final void m25839b(String str, byte[] bArr, String str2) {
        String str3;
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(Hex.encodeHexString(bArr));
        if (str2 != null) {
            str3 = "  " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        printStream.println(sb.toString());
    }

    /* renamed from: c */
    public final void m25838c() {
        if (!this.f73152a.equalsIgnoreCase(Rule.ALL) && !this.f73152a.equals(Marker.ANY_MARKER)) {
            MessageDigest digest = DigestUtils.getDigest(this.f73152a, null);
            if (digest != null) {
                m25836e("", digest);
                return;
            } else {
                m25836e("", DigestUtils.getDigest(this.f73152a.toUpperCase(Locale.ROOT)));
                return;
            }
        }
        m25834g(MessageDigestAlgorithms.values());
    }

    /* renamed from: d */
    public final void m25837d(String str, String str2) {
        m25836e(str, DigestUtils.getDigest(str2));
    }

    /* renamed from: e */
    public final void m25836e(String str, MessageDigest messageDigest) {
        String[] strArr = this.f73154c;
        if (strArr == null) {
            m25840a(str, DigestUtils.digest(messageDigest, System.in));
            return;
        }
        for (String str2 : strArr) {
            File file = new File(str2);
            if (file.isFile()) {
                m25839b(str, DigestUtils.digest(messageDigest, file), str2);
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    m25835f(str, messageDigest, listFiles);
                }
            } else {
                m25840a(str, DigestUtils.digest(messageDigest, str2.getBytes(Charset.defaultCharset())));
            }
        }
    }

    /* renamed from: f */
    public final void m25835f(String str, MessageDigest messageDigest, File[] fileArr) {
        for (File file : fileArr) {
            if (file.isFile()) {
                m25839b(str, DigestUtils.digest(messageDigest, file), file.getName());
            }
        }
    }

    /* renamed from: g */
    public final void m25834g(String[] strArr) {
        for (String str : strArr) {
            if (DigestUtils.isAvailable(str)) {
                m25837d(str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, str);
            }
        }
    }

    public String toString() {
        return String.format("%s %s", super.toString(), Arrays.toString(this.f73153b));
    }
}