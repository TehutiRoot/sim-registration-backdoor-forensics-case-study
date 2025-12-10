package ch.qos.logback.core.spi;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.util.COWArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class AppenderAttachableImpl<E> implements AppenderAttachable<E> {

    /* renamed from: b */
    public static final long f40115b = System.currentTimeMillis();

    /* renamed from: a */
    public final COWArrayList f40116a = new COWArrayList(new Appender[0]);

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void addAppender(Appender<E> appender) {
        if (appender == null) {
            throw new IllegalArgumentException("Null argument disallowed");
        }
        this.f40116a.addIfAbsent(appender);
    }

    public int appendLoopOnAppenders(E e) {
        int i = 0;
        for (Appender appender : (Appender[]) this.f40116a.asTypedArray()) {
            appender.doAppend(e);
            i++;
        }
        return i;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        Iterator<E> it = this.f40116a.iterator();
        while (it.hasNext()) {
            ((Appender) it.next()).stop();
        }
        this.f40116a.clear();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<E> appender) {
        if (appender == null) {
            return false;
        }
        return this.f40116a.remove(appender);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<E> getAppender(String str) {
        if (str == null) {
            return null;
        }
        Iterator<E> it = this.f40116a.iterator();
        while (it.hasNext()) {
            Appender<E> appender = (Appender) it.next();
            if (str.equals(appender.getName())) {
                return appender;
            }
        }
        return null;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<E> appender) {
        if (appender == null) {
            return false;
        }
        Iterator<E> it = this.f40116a.iterator();
        while (it.hasNext()) {
            if (((Appender) it.next()) == appender) {
                return true;
            }
        }
        return false;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<E>> iteratorForAppenders() {
        return this.f40116a.iterator();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        if (str == null) {
            return false;
        }
        Iterator<E> it = this.f40116a.iterator();
        while (it.hasNext()) {
            Appender appender = (Appender) it.next();
            if (str.equals(appender.getName())) {
                return this.f40116a.remove(appender);
            }
        }
        return false;
    }
}
