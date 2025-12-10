package org.joda.time.convert;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.JodaTimePermission;

/* loaded from: classes5.dex */
public final class ConverterManager {

    /* renamed from: f */
    public static ConverterManager f76133f;

    /* renamed from: a */
    public C0288Dy f76134a;

    /* renamed from: b */
    public C0288Dy f76135b;

    /* renamed from: c */
    public C0288Dy f76136c;

    /* renamed from: d */
    public C0288Dy f76137d;

    /* renamed from: e */
    public C0288Dy f76138e;

    public ConverterManager() {
        C19596ds1 c19596ds1 = C19596ds1.f61342a;
        TM1 tm1 = TM1.f6002a;
        C13943sg c13943sg = C13943sg.f79854a;
        C0790LD c0790ld = C0790LD.f3408a;
        C17617Fm0 c17617Fm0 = C17617Fm0.f1689a;
        C21052mJ0 c21052mJ0 = C21052mJ0.f71875a;
        this.f76134a = new C0288Dy(new Converter[]{c19596ds1, tm1, c13943sg, c0790ld, c17617Fm0, c21052mJ0});
        this.f76135b = new C0288Dy(new Converter[]{C19940fs1.f61959a, c19596ds1, tm1, c13943sg, c0790ld, c17617Fm0, c21052mJ0});
        C19424cs1 c19424cs1 = C19424cs1.f60994a;
        C19768es1 c19768es1 = C19768es1.f61641a;
        this.f76136c = new C0288Dy(new Converter[]{c19424cs1, c19768es1, tm1, c17617Fm0, c21052mJ0});
        this.f76137d = new C0288Dy(new Converter[]{c19424cs1, C20112gs1.f62335a, c19768es1, tm1, c21052mJ0});
        this.f76138e = new C0288Dy(new Converter[]{c19768es1, tm1, c21052mJ0});
    }

    public static ConverterManager getInstance() {
        if (f76133f == null) {
            f76133f = new ConverterManager();
        }
        return f76133f;
    }

    /* renamed from: a */
    public final void m24047a() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterDurationConverters"));
        }
    }

    public DurationConverter addDurationConverter(DurationConverter durationConverter) throws SecurityException {
        m24047a();
        if (durationConverter == null) {
            return null;
        }
        DurationConverter[] durationConverterArr = new DurationConverter[1];
        this.f76136c = this.f76136c.m68572a(durationConverter, durationConverterArr);
        return durationConverterArr[0];
    }

    public InstantConverter addInstantConverter(InstantConverter instantConverter) throws SecurityException {
        m24046b();
        if (instantConverter == null) {
            return null;
        }
        InstantConverter[] instantConverterArr = new InstantConverter[1];
        this.f76134a = this.f76134a.m68572a(instantConverter, instantConverterArr);
        return instantConverterArr[0];
    }

    public IntervalConverter addIntervalConverter(IntervalConverter intervalConverter) throws SecurityException {
        m24045c();
        if (intervalConverter == null) {
            return null;
        }
        IntervalConverter[] intervalConverterArr = new IntervalConverter[1];
        this.f76138e = this.f76138e.m68572a(intervalConverter, intervalConverterArr);
        return intervalConverterArr[0];
    }

    public PartialConverter addPartialConverter(PartialConverter partialConverter) throws SecurityException {
        m24044d();
        if (partialConverter == null) {
            return null;
        }
        PartialConverter[] partialConverterArr = new PartialConverter[1];
        this.f76135b = this.f76135b.m68572a(partialConverter, partialConverterArr);
        return partialConverterArr[0];
    }

    public PeriodConverter addPeriodConverter(PeriodConverter periodConverter) throws SecurityException {
        m24043e();
        if (periodConverter == null) {
            return null;
        }
        PeriodConverter[] periodConverterArr = new PeriodConverter[1];
        this.f76137d = this.f76137d.m68572a(periodConverter, periodConverterArr);
        return periodConverterArr[0];
    }

    /* renamed from: b */
    public final void m24046b() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterInstantConverters"));
        }
    }

    /* renamed from: c */
    public final void m24045c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterIntervalConverters"));
        }
    }

    /* renamed from: d */
    public final void m24044d() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterPartialConverters"));
        }
    }

    /* renamed from: e */
    public final void m24043e() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterPeriodConverters"));
        }
    }

    public DurationConverter getDurationConverter(Object obj) {
        Class<?> cls;
        String name;
        C0288Dy c0288Dy = this.f76136c;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        DurationConverter durationConverter = (DurationConverter) c0288Dy.m68568e(cls);
        if (durationConverter != null) {
            return durationConverter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No duration converter found for type: ");
        if (obj == null) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            name = obj.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    public DurationConverter[] getDurationConverters() {
        C0288Dy c0288Dy = this.f76136c;
        DurationConverter[] durationConverterArr = new DurationConverter[c0288Dy.m68566g()];
        c0288Dy.m68571b(durationConverterArr);
        return durationConverterArr;
    }

    public InstantConverter getInstantConverter(Object obj) {
        Class<?> cls;
        String name;
        C0288Dy c0288Dy = this.f76134a;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        InstantConverter instantConverter = (InstantConverter) c0288Dy.m68568e(cls);
        if (instantConverter != null) {
            return instantConverter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No instant converter found for type: ");
        if (obj == null) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            name = obj.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    public InstantConverter[] getInstantConverters() {
        C0288Dy c0288Dy = this.f76134a;
        InstantConverter[] instantConverterArr = new InstantConverter[c0288Dy.m68566g()];
        c0288Dy.m68571b(instantConverterArr);
        return instantConverterArr;
    }

    public IntervalConverter getIntervalConverter(Object obj) {
        Class<?> cls;
        String name;
        C0288Dy c0288Dy = this.f76138e;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        IntervalConverter intervalConverter = (IntervalConverter) c0288Dy.m68568e(cls);
        if (intervalConverter != null) {
            return intervalConverter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No interval converter found for type: ");
        if (obj == null) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            name = obj.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    public IntervalConverter[] getIntervalConverters() {
        C0288Dy c0288Dy = this.f76138e;
        IntervalConverter[] intervalConverterArr = new IntervalConverter[c0288Dy.m68566g()];
        c0288Dy.m68571b(intervalConverterArr);
        return intervalConverterArr;
    }

    public PartialConverter getPartialConverter(Object obj) {
        Class<?> cls;
        String name;
        C0288Dy c0288Dy = this.f76135b;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        PartialConverter partialConverter = (PartialConverter) c0288Dy.m68568e(cls);
        if (partialConverter != null) {
            return partialConverter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No partial converter found for type: ");
        if (obj == null) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            name = obj.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    public PartialConverter[] getPartialConverters() {
        C0288Dy c0288Dy = this.f76135b;
        PartialConverter[] partialConverterArr = new PartialConverter[c0288Dy.m68566g()];
        c0288Dy.m68571b(partialConverterArr);
        return partialConverterArr;
    }

    public PeriodConverter getPeriodConverter(Object obj) {
        Class<?> cls;
        String name;
        C0288Dy c0288Dy = this.f76137d;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        PeriodConverter periodConverter = (PeriodConverter) c0288Dy.m68568e(cls);
        if (periodConverter != null) {
            return periodConverter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No period converter found for type: ");
        if (obj == null) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            name = obj.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    public PeriodConverter[] getPeriodConverters() {
        C0288Dy c0288Dy = this.f76137d;
        PeriodConverter[] periodConverterArr = new PeriodConverter[c0288Dy.m68566g()];
        c0288Dy.m68571b(periodConverterArr);
        return periodConverterArr;
    }

    public DurationConverter removeDurationConverter(DurationConverter durationConverter) throws SecurityException {
        m24047a();
        if (durationConverter == null) {
            return null;
        }
        DurationConverter[] durationConverterArr = new DurationConverter[1];
        this.f76136c = this.f76136c.m68569d(durationConverter, durationConverterArr);
        return durationConverterArr[0];
    }

    public InstantConverter removeInstantConverter(InstantConverter instantConverter) throws SecurityException {
        m24046b();
        if (instantConverter == null) {
            return null;
        }
        InstantConverter[] instantConverterArr = new InstantConverter[1];
        this.f76134a = this.f76134a.m68569d(instantConverter, instantConverterArr);
        return instantConverterArr[0];
    }

    public IntervalConverter removeIntervalConverter(IntervalConverter intervalConverter) throws SecurityException {
        m24045c();
        if (intervalConverter == null) {
            return null;
        }
        IntervalConverter[] intervalConverterArr = new IntervalConverter[1];
        this.f76138e = this.f76138e.m68569d(intervalConverter, intervalConverterArr);
        return intervalConverterArr[0];
    }

    public PartialConverter removePartialConverter(PartialConverter partialConverter) throws SecurityException {
        m24044d();
        if (partialConverter == null) {
            return null;
        }
        PartialConverter[] partialConverterArr = new PartialConverter[1];
        this.f76135b = this.f76135b.m68569d(partialConverter, partialConverterArr);
        return partialConverterArr[0];
    }

    public PeriodConverter removePeriodConverter(PeriodConverter periodConverter) throws SecurityException {
        m24043e();
        if (periodConverter == null) {
            return null;
        }
        PeriodConverter[] periodConverterArr = new PeriodConverter[1];
        this.f76137d = this.f76137d.m68569d(periodConverter, periodConverterArr);
        return periodConverterArr[0];
    }

    public String toString() {
        return "ConverterManager[" + this.f76134a.m68566g() + " instant," + this.f76135b.m68566g() + " partial," + this.f76136c.m68566g() + " duration," + this.f76137d.m68566g() + " period," + this.f76138e.m68566g() + " interval]";
    }
}
