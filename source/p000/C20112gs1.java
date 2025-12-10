package p000;

import org.joda.time.Chronology;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;
import org.joda.time.convert.AbstractConverter;
import org.joda.time.convert.PeriodConverter;

/* renamed from: gs1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C20112gs1 extends AbstractConverter implements PeriodConverter {

    /* renamed from: a */
    public static final C20112gs1 f62335a = new C20112gs1();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PeriodConverter
    public PeriodType getPeriodType(Object obj) {
        return ((ReadablePeriod) obj).getPeriodType();
    }

    @Override // org.joda.time.convert.Converter
    public Class getSupportedType() {
        return ReadablePeriod.class;
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        readWritablePeriod.setPeriod((ReadablePeriod) obj);
    }
}
