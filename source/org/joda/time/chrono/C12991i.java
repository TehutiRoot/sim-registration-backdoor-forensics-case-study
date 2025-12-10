package org.joda.time.chrono;

import java.util.Locale;

/* renamed from: org.joda.time.chrono.i */
/* loaded from: classes5.dex */
public final class C12991i extends C12985c {
    public C12991i(BasicChronology basicChronology) {
        super(basicChronology, 2);
    }

    @Override // org.joda.time.field.BaseDateTimeField
    public int convertText(String str, Locale locale) {
        return B50.m69014h(locale).m69004r(str);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public String getAsShortText(int i, Locale locale) {
        return B50.m69014h(locale).m69003s(i);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public String getAsText(int i, Locale locale) {
        return B50.m69014h(locale).m69002t(i);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return B50.m69014h(locale).m69009m();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        return B50.m69014h(locale).m69008n();
    }
}
