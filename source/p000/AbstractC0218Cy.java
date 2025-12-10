package p000;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.cli.Converter;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;

/* renamed from: Cy */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0218Cy {
    static {
        Converter<?, RuntimeException> converter = Converter.DEFAULT;
    }

    /* renamed from: b */
    public static /* synthetic */ Path m68715b(String str) {
        Path path;
        path = Paths.get(str, new String[0]);
        return path;
    }

    /* renamed from: c */
    public static /* synthetic */ Number m68714c(String str) {
        if (str.indexOf(46) != -1) {
            return Double.valueOf(str);
        }
        return Long.valueOf(str);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m68713d(String str) {
        return Converter.CLASS.apply(str).getConstructor(null).newInstance(null);
    }

    /* renamed from: e */
    public static /* synthetic */ Date m68712e(String str) {
        return new SimpleDateFormat(DateUtil.FORMAT_NEW_DATE).parse(str);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m68716a(String str) {
        return str;
    }
}
