package p000;

import org.joda.time.Chronology;
import org.joda.time.convert.AbstractConverter;
import org.joda.time.convert.DurationConverter;
import org.joda.time.convert.InstantConverter;
import org.joda.time.convert.PartialConverter;

/* renamed from: Lm0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18035Lm0 extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter {

    /* renamed from: a */
    public static final C18035Lm0 f3686a = new C18035Lm0();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Long) obj).longValue();
    }

    @Override // org.joda.time.convert.Converter
    public Class getSupportedType() {
        return Long.class;
    }
}