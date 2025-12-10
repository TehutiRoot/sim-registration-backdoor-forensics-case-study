package p000;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.convert.AbstractConverter;
import org.joda.time.convert.DurationConverter;
import org.joda.time.convert.PeriodConverter;

/* renamed from: cs1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C19424cs1 extends AbstractConverter implements DurationConverter, PeriodConverter {

    /* renamed from: a */
    public static final C19424cs1 f60994a = new C19424cs1();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        return ((ReadableDuration) obj).getMillis();
    }

    @Override // org.joda.time.convert.Converter
    public Class getSupportedType() {
        return ReadableDuration.class;
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        int[] iArr = DateTimeUtils.getChronology(chronology).get(readWritablePeriod, ((ReadableDuration) obj).getMillis());
        for (int i = 0; i < iArr.length; i++) {
            readWritablePeriod.setValue(i, iArr[i]);
        }
    }
}
