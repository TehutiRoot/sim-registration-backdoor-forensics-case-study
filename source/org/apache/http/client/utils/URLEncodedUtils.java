package org.apache.http.client.utils;

import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionURI;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import kotlin.text.Typography;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: classes6.dex */
public class URLEncodedUtils {
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";

    /* renamed from: a */
    public static final BitSet f73751a;

    /* renamed from: b */
    public static final BitSet f73752b;

    /* renamed from: c */
    public static final BitSet f73753c;

    /* renamed from: d */
    public static final BitSet f73754d;

    /* renamed from: e */
    public static final BitSet f73755e;

    /* renamed from: f */
    public static final BitSet f73756f;

    /* renamed from: g */
    public static final BitSet f73757g;

    /* renamed from: h */
    public static final BitSet f73758h;

    /* renamed from: i */
    public static final BitSet f73759i;

    static {
        BitSet bitSet = new BitSet(256);
        f73751a = bitSet;
        bitSet.set(47);
        f73752b = new BitSet(256);
        f73753c = new BitSet(256);
        f73754d = new BitSet(256);
        f73755e = new BitSet(256);
        f73756f = new BitSet(256);
        f73757g = new BitSet(256);
        f73758h = new BitSet(256);
        f73759i = new BitSet(256);
        for (int i = 97; i <= 122; i++) {
            f73752b.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f73752b.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            f73752b.set(i3);
        }
        BitSet bitSet2 = f73752b;
        bitSet2.set(95);
        bitSet2.set(45);
        bitSet2.set(46);
        bitSet2.set(42);
        f73758h.or(bitSet2);
        bitSet2.set(33);
        bitSet2.set(WebSocketProtocol.PAYLOAD_SHORT);
        bitSet2.set(39);
        bitSet2.set(40);
        bitSet2.set(41);
        BitSet bitSet3 = f73753c;
        bitSet3.set(44);
        bitSet3.set(59);
        bitSet3.set(58);
        bitSet3.set(36);
        bitSet3.set(38);
        bitSet3.set(43);
        bitSet3.set(61);
        BitSet bitSet4 = f73754d;
        bitSet4.or(bitSet2);
        bitSet4.or(bitSet3);
        BitSet bitSet5 = f73755e;
        bitSet5.or(bitSet2);
        bitSet5.set(59);
        bitSet5.set(58);
        bitSet5.set(64);
        bitSet5.set(38);
        bitSet5.set(61);
        bitSet5.set(43);
        bitSet5.set(36);
        bitSet5.set(44);
        BitSet bitSet6 = f73759i;
        bitSet6.or(bitSet5);
        bitSet6.set(47);
        BitSet bitSet7 = f73757g;
        bitSet7.set(59);
        bitSet7.set(47);
        bitSet7.set(63);
        bitSet7.set(58);
        bitSet7.set(64);
        bitSet7.set(38);
        bitSet7.set(61);
        bitSet7.set(43);
        bitSet7.set(36);
        bitSet7.set(44);
        bitSet7.set(91);
        bitSet7.set(93);
        BitSet bitSet8 = f73756f;
        bitSet8.or(bitSet7);
        bitSet8.or(bitSet2);
    }

    /* renamed from: a */
    public static List m24809a() {
        return new ArrayList(0);
    }

    /* renamed from: b */
    public static String m24808b(String str, String str2) {
        Charset charset;
        if (str == null) {
            return null;
        }
        if (str2 != null) {
            charset = Charset.forName(str2);
        } else {
            charset = Consts.UTF_8;
        }
        return m24800j(str, charset, true);
    }

    /* renamed from: c */
    public static String m24807c(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return m24800j(str, charset, true);
    }

    /* renamed from: d */
    public static String m24806d(String str, Charset charset) {
        return m24799k(str, charset, f73756f, false);
    }

    /* renamed from: e */
    public static String m24805e(String str, Charset charset) {
        return m24799k(str, charset, f73754d, false);
    }

    /* renamed from: f */
    public static String m24804f(String str, String str2) {
        Charset charset;
        if (str == null) {
            return null;
        }
        if (str2 != null) {
            charset = Charset.forName(str2);
        } else {
            charset = Consts.UTF_8;
        }
        return m24799k(str, charset, f73758h, true);
    }

    public static String format(List<? extends NameValuePair> list, String str) {
        return format(list, (char) Typography.amp, str);
    }

    public static String formatSegments(Iterable<String> iterable, Charset charset) {
        Args.notNull(iterable, "Segments");
        StringBuilder sb = new StringBuilder();
        for (String str : iterable) {
            sb.append('/');
            sb.append(m24799k(str, charset, f73755e, false));
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static String m24803g(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return m24799k(str, charset, f73758h, true);
    }

    /* renamed from: h */
    public static List m24802h(CharSequence charSequence) {
        return m24801i(charSequence, f73751a);
    }

    /* renamed from: i */
    public static List m24801i(CharSequence charSequence, BitSet bitSet) {
        ParserCursor parserCursor = new ParserCursor(0, charSequence.length());
        if (parserCursor.atEnd()) {
            return Collections.emptyList();
        }
        if (bitSet.get(charSequence.charAt(parserCursor.getPos()))) {
            parserCursor.updatePos(parserCursor.getPos() + 1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (!parserCursor.atEnd()) {
            char charAt = charSequence.charAt(parserCursor.getPos());
            if (bitSet.get(charAt)) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(charAt);
            }
            parserCursor.updatePos(parserCursor.getPos() + 1);
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    public static boolean isEncoded(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "HTTP entity");
        Header contentType = httpEntity.getContentType();
        if (contentType != null) {
            HeaderElement[] elements = contentType.getElements();
            if (elements.length > 0) {
                return elements[0].getName().equalsIgnoreCase("application/x-www-form-urlencoded");
            }
        }
        return false;
    }

    /* renamed from: j */
    public static String m24800j(String str, Charset charset, boolean z) {
        if (str == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(str.length());
        CharBuffer wrap = CharBuffer.wrap(str);
        while (wrap.hasRemaining()) {
            char c = wrap.get();
            if (c == '%' && wrap.remaining() >= 2) {
                char c2 = wrap.get();
                char c3 = wrap.get();
                int digit = Character.digit(c2, 16);
                int digit2 = Character.digit(c3, 16);
                if (digit != -1 && digit2 != -1) {
                    allocate.put((byte) ((digit << 4) + digit2));
                } else {
                    allocate.put((byte) 37);
                    allocate.put((byte) c2);
                    allocate.put((byte) c3);
                }
            } else if (z && c == '+') {
                allocate.put((byte) 32);
            } else {
                allocate.put((byte) c);
            }
        }
        allocate.flip();
        return charset.decode(allocate).toString();
    }

    /* renamed from: k */
    public static String m24799k(String str, Charset charset, BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer encode = charset.encode(str);
        while (encode.hasRemaining()) {
            byte b = encode.get();
            int i = b & 255;
            if (bitSet.get(i)) {
                sb.append((char) i);
            } else if (z && i == 32) {
                sb.append('+');
            } else {
                sb.append("%");
                char upperCase = Character.toUpperCase(Character.forDigit((i >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(b & 15, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            }
        }
        return sb.toString();
    }

    @Deprecated
    public static List<NameValuePair> parse(URI uri, String str) {
        return parse(uri, str != null ? Charset.forName(str) : null);
    }

    public static List<String> parsePathSegments(CharSequence charSequence, Charset charset) {
        Args.notNull(charSequence, "Char sequence");
        List<String> m24802h = m24802h(charSequence);
        for (int i = 0; i < m24802h.size(); i++) {
            m24802h.set(i, m24800j(m24802h.get(i), charset != null ? charset : Consts.UTF_8, false));
        }
        return m24802h;
    }

    public static String format(List<? extends NameValuePair> list, char c, String str) {
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : list) {
            String m24804f = m24804f(nameValuePair.getName(), str);
            String m24804f2 = m24804f(nameValuePair.getValue(), str);
            if (sb.length() > 0) {
                sb.append(c);
            }
            sb.append(m24804f);
            if (m24804f2 != null) {
                sb.append("=");
                sb.append(m24804f2);
            }
        }
        return sb.toString();
    }

    public static List<NameValuePair> parse(URI uri, Charset charset) {
        Args.notNull(uri, PDActionURI.SUB_TYPE);
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && !rawQuery.isEmpty()) {
            return parse(rawQuery, charset);
        }
        return m24809a();
    }

    public static List<String> parsePathSegments(CharSequence charSequence) {
        return parsePathSegments(charSequence, Consts.UTF_8);
    }

    public static String formatSegments(String... strArr) {
        return formatSegments(Arrays.asList(strArr), Consts.UTF_8);
    }

    public static List<NameValuePair> parse(HttpEntity httpEntity) throws IOException {
        Args.notNull(httpEntity, "HTTP entity");
        ContentType contentType = ContentType.get(httpEntity);
        if (contentType != null && contentType.getMimeType().equalsIgnoreCase("application/x-www-form-urlencoded")) {
            long contentLength = httpEntity.getContentLength();
            Args.check(contentLength <= 2147483647L, "HTTP entity is too large");
            Charset charset = contentType.getCharset() != null ? contentType.getCharset() : HTTP.DEF_CONTENT_CHARSET;
            InputStream content = httpEntity.getContent();
            if (content == null) {
                return m24809a();
            }
            try {
                CharArrayBuffer charArrayBuffer = new CharArrayBuffer(contentLength > 0 ? (int) contentLength : 1024);
                InputStreamReader inputStreamReader = new InputStreamReader(content, charset);
                char[] cArr = new char[1024];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read == -1) {
                        break;
                    }
                    charArrayBuffer.append(cArr, 0, read);
                }
                content.close();
                return charArrayBuffer.isEmpty() ? m24809a() : parse(charArrayBuffer, charset, Typography.amp);
            } catch (Throwable th2) {
                content.close();
                throw th2;
            }
        }
        return m24809a();
    }

    public static String format(Iterable<? extends NameValuePair> iterable, Charset charset) {
        return format(iterable, (char) Typography.amp, charset);
    }

    public static String format(Iterable<? extends NameValuePair> iterable, char c, Charset charset) {
        Args.notNull(iterable, "Parameters");
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : iterable) {
            String m24803g = m24803g(nameValuePair.getName(), charset);
            String m24803g2 = m24803g(nameValuePair.getValue(), charset);
            if (sb.length() > 0) {
                sb.append(c);
            }
            sb.append(m24803g);
            if (m24803g2 != null) {
                sb.append("=");
                sb.append(m24803g2);
            }
        }
        return sb.toString();
    }

    @Deprecated
    public static void parse(List<NameValuePair> list, Scanner scanner, String str) {
        parse(list, scanner, "[&;]", str);
    }

    @Deprecated
    public static void parse(List<NameValuePair> list, Scanner scanner, String str, String str2) {
        String m24808b;
        String str3;
        scanner.useDelimiter(str);
        while (scanner.hasNext()) {
            String next = scanner.next();
            int indexOf = next.indexOf("=");
            if (indexOf != -1) {
                m24808b = m24808b(next.substring(0, indexOf).trim(), str2);
                str3 = m24808b(next.substring(indexOf + 1).trim(), str2);
            } else {
                m24808b = m24808b(next.trim(), str2);
                str3 = null;
            }
            list.add(new BasicNameValuePair(m24808b, str3));
        }
    }

    public static List<NameValuePair> parse(String str, Charset charset) {
        if (str == null) {
            return m24809a();
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return parse(charArrayBuffer, charset, Typography.amp, ';');
    }

    public static List<NameValuePair> parse(String str, Charset charset, char... cArr) {
        if (str == null) {
            return m24809a();
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return parse(charArrayBuffer, charset, cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<org.apache.http.NameValuePair> parse(org.apache.http.util.CharArrayBuffer r7, java.nio.charset.Charset r8, char... r9) {
        /*
            java.lang.String r0 = "Char array buffer"
            org.apache.http.util.Args.notNull(r7, r0)
            org.apache.http.message.TokenParser r0 = org.apache.http.message.TokenParser.INSTANCE
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            int r2 = r9.length
            r3 = 0
            r4 = 0
        Lf:
            if (r4 >= r2) goto L19
            char r5 = r9[r4]
            r1.set(r5)
            int r4 = r4 + 1
            goto Lf
        L19:
            org.apache.http.message.ParserCursor r9 = new org.apache.http.message.ParserCursor
            int r2 = r7.length()
            r9.<init>(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L27:
            boolean r3 = r9.atEnd()
            if (r3 != 0) goto L7e
            r3 = 61
            r1.set(r3)
            java.lang.String r4 = r0.parseToken(r7, r9, r1)
            boolean r5 = r9.atEnd()
            if (r5 != 0) goto L66
            int r5 = r9.getPos()
            char r5 = r7.charAt(r5)
            int r6 = r9.getPos()
            int r6 = r6 + 1
            r9.updatePos(r6)
            if (r5 != r3) goto L66
            r1.clear(r3)
            java.lang.String r3 = r0.parseToken(r7, r9, r1)
            boolean r5 = r9.atEnd()
            if (r5 != 0) goto L67
            int r5 = r9.getPos()
            int r5 = r5 + 1
            r9.updatePos(r5)
            goto L67
        L66:
            r3 = 0
        L67:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L27
            org.apache.http.message.BasicNameValuePair r5 = new org.apache.http.message.BasicNameValuePair
            java.lang.String r4 = m24807c(r4, r8)
            java.lang.String r3 = m24807c(r3, r8)
            r5.<init>(r4, r3)
            r2.add(r5)
            goto L27
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.client.utils.URLEncodedUtils.parse(org.apache.http.util.CharArrayBuffer, java.nio.charset.Charset, char[]):java.util.List");
    }
}
