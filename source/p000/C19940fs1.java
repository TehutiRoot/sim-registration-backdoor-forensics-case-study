package p000;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.convert.AbstractConverter;
import org.joda.time.convert.PartialConverter;

/* renamed from: fs1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C19940fs1 extends AbstractConverter implements PartialConverter {

    /* renamed from: a */
    public static final C19940fs1 f61959a = new C19940fs1();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, DateTimeZone dateTimeZone) {
        return getChronology(obj, (Chronology) null).withZone(dateTimeZone);
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PartialConverter
    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology) {
        ReadablePartial readablePartial2 = (ReadablePartial) obj;
        int size = readablePartial.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readablePartial2.get(readablePartial.getFieldType(i));
        }
        chronology.validate(readablePartial, iArr);
        return iArr;
    }

    @Override // org.joda.time.convert.Converter
    public Class getSupportedType() {
        return ReadablePartial.class;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, Chronology chronology) {
        return chronology == null ? DateTimeUtils.getChronology(((ReadablePartial) obj).getChronology()) : chronology;
    }
}
