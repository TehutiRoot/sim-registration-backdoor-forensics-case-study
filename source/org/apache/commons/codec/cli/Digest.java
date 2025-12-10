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
    public final String f73068a;

    /* renamed from: b */
    public final String[] f73069b;

    /* renamed from: c */
    public final String[] f73070c;

    public Digest(String[] strArr) {
        Objects.requireNonNull(strArr);
        int length = strArr.length;
        if (length != 0) {
            this.f73069b = strArr;
            this.f73068a = strArr[0];
            if (length <= 1) {
                this.f73070c = null;
                return;
            } else {
                this.f73070c = (String[]) Arrays.copyOfRange(strArr, 1, length);
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Usage: java %s [algorithm] [FILE|DIRECTORY|string] ...", Digest.class.getName()));
    }

    public static void main(String[] strArr) throws IOException {
        new Digest(strArr).m25648c();
    }

    /* renamed from: a */
    public final void m25650a(String str, byte[] bArr) {
        m25649b(str, bArr, null);
    }

    /* renamed from: b */
    public final void m25649b(String str, byte[] bArr, String str2) {
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
    public final void m25648c() {
        if (!this.f73068a.equalsIgnoreCase(Rule.ALL) && !this.f73068a.equals(Marker.ANY_MARKER)) {
            MessageDigest digest = DigestUtils.getDigest(this.f73068a, null);
            if (digest != null) {
                m25646e("", digest);
                return;
            } else {
                m25646e("", DigestUtils.getDigest(this.f73068a.toUpperCase(Locale.ROOT)));
                return;
            }
        }
        m25644g(MessageDigestAlgorithms.values());
    }

    /* renamed from: d */
    public final void m25647d(String str, String str2) {
        m25646e(str, DigestUtils.getDigest(str2));
    }

    /* renamed from: e */
    public final void m25646e(String str, MessageDigest messageDigest) {
        String[] strArr = this.f73070c;
        if (strArr == null) {
            m25650a(str, DigestUtils.digest(messageDigest, System.in));
            return;
        }
        for (String str2 : strArr) {
            File file = new File(str2);
            if (file.isFile()) {
                m25649b(str, DigestUtils.digest(messageDigest, file), str2);
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    m25645f(str, messageDigest, listFiles);
                }
            } else {
                m25650a(str, DigestUtils.digest(messageDigest, str2.getBytes(Charset.defaultCharset())));
            }
        }
    }

    /* renamed from: f */
    public final void m25645f(String str, MessageDigest messageDigest, File[] fileArr) {
        for (File file : fileArr) {
            if (file.isFile()) {
                m25649b(str, DigestUtils.digest(messageDigest, file), file.getName());
            }
        }
    }

    /* renamed from: g */
    public final void m25644g(String[] strArr) {
        for (String str : strArr) {
            if (DigestUtils.isAvailable(str)) {
                m25647d(str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, str);
            }
        }
    }

    public String toString() {
        return String.format("%s %s", super.toString(), Arrays.toString(this.f73069b));
    }
}
