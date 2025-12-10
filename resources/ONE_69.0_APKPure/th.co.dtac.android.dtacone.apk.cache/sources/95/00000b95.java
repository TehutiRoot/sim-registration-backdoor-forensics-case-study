package p000;

import java.util.Date;
import org.joda.time.Chronology;
import org.joda.time.convert.AbstractConverter;
import org.joda.time.convert.InstantConverter;
import org.joda.time.convert.PartialConverter;

/* renamed from: MD */
/* loaded from: classes5.dex */
public final class C0850MD extends AbstractConverter implements InstantConverter, PartialConverter {

    /* renamed from: a */
    public static final C0850MD f3830a = new C0850MD();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Date) obj).getTime();
    }

    @Override // org.joda.time.convert.Converter
    public Class getSupportedType() {
        return Date.class;
    }
}