package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: RD */
/* loaded from: classes.dex */
public class C1206RD implements InterfaceC1451UY {

    /* renamed from: a */
    public final SimpleDateFormat f5430a;

    /* renamed from: b */
    public final Pattern f5431b;

    public C1206RD(FileNamePattern fileNamePattern) {
        this.f5430a = m66683c(fileNamePattern);
        this.f5431b = Pattern.compile(fileNamePattern.toRegex(true, false));
    }

    /* renamed from: b */
    public final String m66684b(String str) {
        Matcher matcher = this.f5431b.matcher(str);
        if (matcher.find() && matcher.groupCount() >= 1) {
            return matcher.group(1);
        }
        return "";
    }

    /* renamed from: c */
    public final SimpleDateFormat m66683c(FileNamePattern fileNamePattern) {
        String str;
        TimeZone timeZone;
        DateTokenConverter<Object> primaryDateTokenConverter = fileNamePattern.getPrimaryDateTokenConverter();
        if (primaryDateTokenConverter != null) {
            str = primaryDateTokenConverter.getDatePattern();
        } else {
            str = "yyyy-MM-dd";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        if (primaryDateTokenConverter != null) {
            timeZone = primaryDateTokenConverter.getTimeZone();
        } else {
            timeZone = TimeZone.getDefault();
        }
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat;
    }

    /* renamed from: d */
    public Date m66682d(String str) {
        return this.f5430a.parse(str);
    }

    @Override // p000.InterfaceC1451UY
    /* renamed from: e */
    public Date mo26093a(String str) {
        try {
            return m66682d(m66684b(str));
        } catch (ParseException unused) {
            return null;
        }
    }
}