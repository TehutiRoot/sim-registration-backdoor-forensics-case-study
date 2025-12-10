package p000;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableInterval;
import org.joda.time.convert.AbstractConverter;
import org.joda.time.convert.DurationConverter;
import org.joda.time.convert.IntervalConverter;
import org.joda.time.convert.PeriodConverter;

/* renamed from: bt1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C19303bt1 extends AbstractConverter implements IntervalConverter, DurationConverter, PeriodConverter {

    /* renamed from: a */
    public static final C19303bt1 f39248a = new C19303bt1();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        return ((ReadableInterval) obj).toDurationMillis();
    }

    @Override // org.joda.time.convert.Converter
    public Class getSupportedType() {
        return ReadableInterval.class;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.IntervalConverter
    public boolean isReadableInterval(Object obj, Chronology chronology) {
        return true;
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        ReadableInterval readableInterval = (ReadableInterval) obj;
        if (chronology == null) {
            chronology = DateTimeUtils.getIntervalChronology(readableInterval);
        }
        int[] iArr = chronology.get(readWritablePeriod, readableInterval.getStartMillis(), readableInterval.getEndMillis());
        for (int i = 0; i < iArr.length; i++) {
            readWritablePeriod.setValue(i, iArr[i]);
        }
    }

    @Override // org.joda.time.convert.IntervalConverter
    public void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology) {
        ReadableInterval readableInterval = (ReadableInterval) obj;
        readWritableInterval.setInterval(readableInterval);
        if (chronology != null) {
            readWritableInterval.setChronology(chronology);
        } else {
            readWritableInterval.setChronology(readableInterval.getChronology());
        }
    }
}