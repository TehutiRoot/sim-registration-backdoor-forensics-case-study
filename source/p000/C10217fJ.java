package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.ClassModel;

/* renamed from: fJ */
/* loaded from: classes6.dex */
public final class C10217fJ {

    /* renamed from: a */
    public final Map f61783a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Set f61784b;

    public C10217fJ(Map map, Set set) {
        for (ClassModel classModel : map.values()) {
            if (classModel.getDiscriminator() != null) {
                this.f61783a.put(classModel.getDiscriminator(), classModel.getType());
            }
        }
        this.f61784b = set;
    }

    /* renamed from: a */
    public void m31324a(ClassModel classModel) {
        if (classModel.getDiscriminator() != null) {
            this.f61783a.put(classModel.getDiscriminator(), classModel.getType());
        }
    }

    /* renamed from: b */
    public final Class m31323b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public Class m31322c(String str) {
        if (this.f61783a.containsKey(str)) {
            return (Class) this.f61783a.get(str);
        }
        Class m31323b = m31323b(str);
        if (m31323b == null) {
            m31323b = m31321d(str);
        }
        if (m31323b != null) {
            this.f61783a.put(str, m31323b);
            return m31323b;
        }
        throw new CodecConfigurationException(String.format("A class could not be found for the discriminator: '%s'.", str));
    }

    /* renamed from: d */
    public final Class m31321d(String str) {
        Iterator it = this.f61784b.iterator();
        Class cls = null;
        while (it.hasNext()) {
            cls = m31323b(((String) it.next()) + "." + str);
            if (cls != null) {
                break;
            }
        }
        return cls;
    }
}
