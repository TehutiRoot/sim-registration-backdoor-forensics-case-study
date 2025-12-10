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

/* renamed from: QD */
/* loaded from: classes.dex */
public class C1156QD implements InterfaceC1185QY {

    /* renamed from: a */
    public final SimpleDateFormat f4992a;

    /* renamed from: b */
    public final Pattern f4993b;

    public C1156QD(FileNamePattern fileNamePattern) {
        this.f4992a = m66637c(fileNamePattern);
        this.f4993b = Pattern.compile(fileNamePattern.toRegex(true, false));
    }

    /* renamed from: b */
    public final String m66638b(String str) {
        Matcher matcher = this.f4993b.matcher(str);
        if (matcher.find() && matcher.groupCount() >= 1) {
            return matcher.group(1);
        }
        return "";
    }

    /* renamed from: c */
    public final SimpleDateFormat m66637c(FileNamePattern fileNamePattern) {
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
    public Date m66636d(String str) {
        return this.f4992a.parse(str);
    }

    @Override // p000.InterfaceC1185QY
    /* renamed from: e */
    public Date mo30618a(String str) {
        try {
            return m66636d(m66638b(str));
        } catch (ParseException unused) {
            return null;
        }
    }
}
