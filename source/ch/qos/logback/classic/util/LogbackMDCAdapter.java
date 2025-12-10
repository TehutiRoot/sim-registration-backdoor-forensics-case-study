package ch.qos.logback.classic.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.spi.MDCAdapter;

/* loaded from: classes.dex */
public final class LogbackMDCAdapter implements MDCAdapter {

    /* renamed from: a */
    public final ThreadLocal f39693a = new ThreadLocal();

    /* renamed from: b */
    public final ThreadLocal f39694b = new ThreadLocal();

    /* renamed from: a */
    public final Map m51554a(Map map) {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        if (map != null) {
            synchronized (map) {
                synchronizedMap.putAll(map);
            }
        }
        this.f39693a.set(synchronizedMap);
        return synchronizedMap;
    }

    /* renamed from: b */
    public final Integer m51553b(int i) {
        Integer num = (Integer) this.f39694b.get();
        this.f39694b.set(Integer.valueOf(i));
        return num;
    }

    /* renamed from: c */
    public final boolean m51552c(Integer num) {
        return num == null || num.intValue() == 2;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
        this.f39694b.set(1);
        this.f39693a.remove();
    }

    @Override // org.slf4j.spi.MDCAdapter
    public String get(String str) {
        Map map = (Map) this.f39693a.get();
        if (map == null || str == null) {
            return null;
        }
        return (String) map.get(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public Map<String, String> getCopyOfContextMap() {
        Map map = (Map) this.f39693a.get();
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    public Set<String> getKeys() {
        Map<String, String> propertyMap = getPropertyMap();
        if (propertyMap != null) {
            return propertyMap.keySet();
        }
        return null;
    }

    public Map<String, String> getPropertyMap() {
        this.f39694b.set(2);
        return (Map) this.f39693a.get();
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void put(String str, String str2) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        Map map = (Map) this.f39693a.get();
        if (m51552c(m51553b(1)) || map == null) {
            map = m51554a(map);
        }
        map.put(str, str2);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void remove(String str) {
        Map map;
        if (str == null || (map = (Map) this.f39693a.get()) == null) {
            return;
        }
        if (m51552c(m51553b(1))) {
            map = m51554a(map);
        }
        map.remove(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void setContextMap(Map<String, String> map) {
        this.f39694b.set(1);
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronizedMap.putAll(map);
        this.f39693a.set(synchronizedMap);
    }
}
