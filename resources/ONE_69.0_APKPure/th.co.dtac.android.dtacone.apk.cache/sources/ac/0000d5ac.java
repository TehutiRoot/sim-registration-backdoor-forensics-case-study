package io.realm.internal.android;

import android.util.Base64;
import io.realm.exceptions.RealmException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class JsonUtils {

    /* renamed from: a */
    public static Pattern f66863a = Pattern.compile("/Date\\((\\d*)(?:[+-]\\d*)?\\)/");

    /* renamed from: b */
    public static Pattern f66864b = Pattern.compile("-?\\d+");

    /* renamed from: c */
    public static ParsePosition f66865c = new ParsePosition(0);

    public static byte[] stringToBytes(String str) {
        if (str != null && str.length() != 0) {
            return Base64.decode(str, 0);
        }
        return new byte[0];
    }

    @Nullable
    public static Date stringToDate(String str) {
        if (str != null && str.length() != 0) {
            Matcher matcher = f66863a.matcher(str);
            if (matcher.find()) {
                return new Date(Long.parseLong(matcher.group(1)));
            }
            if (f66864b.matcher(str).matches()) {
                try {
                    return new Date(Long.parseLong(str));
                } catch (NumberFormatException e) {
                    throw new RealmException(e.getMessage(), e);
                }
            }
            try {
                f66865c.setIndex(0);
                return ISO8601Utils.parse(str, f66865c);
            } catch (ParseException e2) {
                throw new RealmException(e2.getMessage(), e2);
            }
        }
        return null;
    }
}