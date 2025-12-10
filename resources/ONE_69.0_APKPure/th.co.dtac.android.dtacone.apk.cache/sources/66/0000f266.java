package org.apache.http.impl.cookie;

import com.google.firebase.perf.util.Constants;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class LaxExpiresHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {

    /* renamed from: a */
    public static final TimeZone f74434a = TimeZone.getTimeZone("UTC");

    /* renamed from: b */
    public static final BitSet f74435b;

    /* renamed from: c */
    public static final Map f74436c;

    /* renamed from: d */
    public static final Pattern f74437d;

    /* renamed from: e */
    public static final Pattern f74438e;

    /* renamed from: f */
    public static final Pattern f74439f;

    /* renamed from: g */
    public static final Pattern f74440g;

    static {
        BitSet bitSet = new BitSet();
        bitSet.set(9);
        for (int i = 32; i <= 47; i++) {
            bitSet.set(i);
        }
        for (int i2 = 59; i2 <= 64; i2++) {
            bitSet.set(i2);
        }
        for (int i3 = 91; i3 <= 96; i3++) {
            bitSet.set(i3);
        }
        for (int i4 = CameraActivity.REQUEST_CODE; i4 <= 126; i4++) {
            bitSet.set(i4);
        }
        f74435b = bitSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(12);
        concurrentHashMap.put("jan", 0);
        concurrentHashMap.put("feb", 1);
        concurrentHashMap.put("mar", 2);
        concurrentHashMap.put("apr", 3);
        concurrentHashMap.put("may", 4);
        concurrentHashMap.put("jun", 5);
        concurrentHashMap.put("jul", 6);
        concurrentHashMap.put("aug", 7);
        concurrentHashMap.put("sep", 8);
        concurrentHashMap.put("oct", 9);
        concurrentHashMap.put("nov", 10);
        concurrentHashMap.put("dec", 11);
        f74436c = concurrentHashMap;
        f74437d = Pattern.compile("^([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2})([^0-9].*)?$");
        f74438e = Pattern.compile("^([0-9]{1,2})([^0-9].*)?$");
        f74439f = Pattern.compile("^(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)(.*)?$", 2);
        f74440g = Pattern.compile("^([0-9]{2,4})([^0-9].*)?$");
    }

    /* renamed from: a */
    public final void m24800a(CharSequence charSequence, ParserCursor parserCursor, StringBuilder sb) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char charAt = charSequence.charAt(pos2);
            if (f74435b.get(charAt)) {
                break;
            }
            pos++;
            sb.append(charAt);
        }
        parserCursor.updatePos(pos);
    }

    /* renamed from: b */
    public final void m24799b(CharSequence charSequence, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            if (!f74435b.get(charSequence.charAt(pos2))) {
                break;
            }
            pos++;
        }
        parserCursor.updatePos(pos);
    }

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.EXPIRES_ATTR;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        LaxExpiresHandler laxExpiresHandler = this;
        Args.notNull(setCookie, "Cookie");
        if (TextUtils.isBlank(str)) {
            return;
        }
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (!parserCursor.atEnd()) {
            try {
                laxExpiresHandler.m24799b(str, parserCursor);
                sb.setLength(0);
                laxExpiresHandler.m24800a(str, parserCursor, sb);
                if (sb.length() == 0) {
                    break;
                }
                if (!z) {
                    Matcher matcher = f74437d.matcher(sb);
                    if (matcher.matches()) {
                        i3 = Integer.parseInt(matcher.group(1));
                        i4 = Integer.parseInt(matcher.group(2));
                        i5 = Integer.parseInt(matcher.group(3));
                        z = true;
                        laxExpiresHandler = this;
                    }
                }
                if (!z2) {
                    Matcher matcher2 = f74438e.matcher(sb);
                    if (matcher2.matches()) {
                        i2 = Integer.parseInt(matcher2.group(1));
                        z2 = true;
                        laxExpiresHandler = this;
                    }
                }
                if (!z3) {
                    Matcher matcher3 = f74439f.matcher(sb);
                    if (matcher3.matches()) {
                        i6 = ((Integer) f74436c.get(matcher3.group(1).toLowerCase(Locale.ROOT))).intValue();
                        z3 = true;
                        laxExpiresHandler = this;
                    }
                }
                if (!z4) {
                    Matcher matcher4 = f74440g.matcher(sb);
                    if (matcher4.matches()) {
                        i = Integer.parseInt(matcher4.group(1));
                        z4 = true;
                        laxExpiresHandler = this;
                    }
                }
                laxExpiresHandler = this;
            } catch (NumberFormatException unused) {
                throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
            }
        }
        if (z && z2 && z3 && z4) {
            if (i >= 70 && i <= 99) {
                i += 1900;
            }
            if (i >= 0 && i <= 69) {
                i += Constants.MAX_URL_LENGTH;
            }
            if (i2 >= 1 && i2 <= 31 && i >= 1601 && i3 <= 23 && i4 <= 59 && i5 <= 59) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeZone(f74434a);
                calendar.setTimeInMillis(0L);
                calendar.set(13, i5);
                calendar.set(12, i4);
                calendar.set(11, i3);
                calendar.set(5, i2);
                calendar.set(2, i6);
                calendar.set(1, i);
                setCookie.setExpiryDate(calendar.getTime());
                return;
            }
            throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
        }
        throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
    }
}