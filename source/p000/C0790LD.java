package p000;

import java.util.Date;
import org.joda.time.Chronology;
import org.joda.time.convert.AbstractConverter;
import org.joda.time.convert.InstantConverter;
import org.joda.time.convert.PartialConverter;

/* renamed from: LD */
/* loaded from: classes5.dex */
public final class C0790LD extends AbstractConverter implements InstantConverter, PartialConverter {

    /* renamed from: a */
    public static final C0790LD f3408a = new C0790LD();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Date) obj).getTime();
    }

    @Override // org.joda.time.convert.Converter
    public Class getSupportedType() {
        return Date.class;
    }
}
