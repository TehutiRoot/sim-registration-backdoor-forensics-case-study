package ch.qos.logback.core.joran.spi;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class DefaultNestedComponentRegistry {

    /* renamed from: a */
    public Map f39802a = new HashMap();

    /* renamed from: a */
    public final Class m51502a(Class cls, String str) {
        return (Class) this.f39802a.get(new HostClassAndPropertyDouble(cls, str));
    }

    public void add(Class<?> cls, String str, Class<?> cls2) {
        this.f39802a.put(new HostClassAndPropertyDouble(cls, str.toLowerCase(Locale.US)), cls2);
    }

    public Class<?> findDefaultComponentType(Class<?> cls, String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        while (cls != null) {
            Class<?> m51502a = m51502a(cls, lowerCase);
            if (m51502a != null) {
                return m51502a;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }
}