package org.apache.http.impl.cookie;

import java.util.Date;
import java.util.regex.Pattern;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class LaxMaxAgeHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {

    /* renamed from: a */
    public static final Pattern f74357a = Pattern.compile("^\\-?[0-9]+$");

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.MAX_AGE_ATTR;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        Date date;
        Args.notNull(setCookie, "Cookie");
        if (!TextUtils.isBlank(str) && f74357a.matcher(str).matches()) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    date = new Date(System.currentTimeMillis() + (parseInt * 1000));
                } else {
                    date = new Date(Long.MIN_VALUE);
                }
                setCookie.setExpiryDate(date);
            } catch (NumberFormatException unused) {
            }
        }
    }
}
