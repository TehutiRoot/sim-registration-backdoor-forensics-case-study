package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.C12928f;
import org.bson.codecs.pojo.TypeData;

/* renamed from: Go1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17686Go1 {

    /* renamed from: a */
    public final String f2011a;

    /* renamed from: b */
    public final String f2012b;

    /* renamed from: c */
    public final TypeData f2013c;

    /* renamed from: d */
    public final Map f2014d = new HashMap();

    /* renamed from: e */
    public final Map f2015e = new HashMap();

    /* renamed from: f */
    public C12928f f2016f;

    /* renamed from: g */
    public List f2017g;

    /* renamed from: h */
    public String f2018h;

    /* renamed from: i */
    public Field f2019i;

    /* renamed from: j */
    public Method f2020j;

    /* renamed from: k */
    public Method f2021k;

    public C17686Go1(String str, String str2, TypeData typeData) {
        this.f2011a = str;
        this.f2012b = str2;
        this.f2013c = typeData;
    }

    /* renamed from: a */
    public C17686Go1 m68178a(Annotation annotation) {
        if (this.f2014d.containsKey(annotation.annotationType())) {
            if (annotation.equals(this.f2014d.get(annotation.annotationType()))) {
                return this;
            }
            throw new CodecConfigurationException(String.format("Read annotation %s for '%s' already exists in %s", annotation.annotationType(), this.f2011a, this.f2012b));
        }
        this.f2014d.put(annotation.annotationType(), annotation);
        return this;
    }

    /* renamed from: b */
    public C17686Go1 m68177b(Annotation annotation) {
        if (this.f2015e.containsKey(annotation.annotationType())) {
            if (annotation.equals(this.f2015e.get(annotation.annotationType()))) {
                return this;
            }
            throw new CodecConfigurationException(String.format("Write annotation %s for '%s' already exists in %s", annotation.annotationType(), this.f2011a, this.f2012b));
        }
        this.f2015e.put(annotation.annotationType(), annotation);
        return this;
    }

    /* renamed from: c */
    public C17686Go1 m68176c(Field field) {
        this.f2019i = field;
        return this;
    }

    /* renamed from: d */
    public String m68175d() {
        return this.f2012b;
    }

    /* renamed from: e */
    public String m68174e() {
        return this.f2018h;
    }

    /* renamed from: f */
    public Field m68173f() {
        return this.f2019i;
    }

    /* renamed from: g */
    public Method m68172g() {
        return this.f2020j;
    }

    /* renamed from: h */
    public String m68171h() {
        return this.f2011a;
    }

    /* renamed from: i */
    public List m68170i() {
        return new ArrayList(this.f2014d.values());
    }

    /* renamed from: j */
    public Method m68169j() {
        return this.f2021k;
    }

    /* renamed from: k */
    public TypeData m68168k() {
        return this.f2013c;
    }

    /* renamed from: l */
    public C12928f m68167l() {
        return this.f2016f;
    }

    /* renamed from: m */
    public List m68166m() {
        return this.f2017g;
    }

    /* renamed from: n */
    public List m68165n() {
        return new ArrayList(this.f2015e.values());
    }

    /* renamed from: o */
    public boolean m68164o() {
        if (this.f2021k != null) {
            Field field = this.f2019i;
            if (field == null) {
                return true;
            }
            if (!Modifier.isFinal(field.getModifiers()) && m68161r(this.f2019i.getModifiers())) {
                return true;
            }
            return false;
        }
        Field field2 = this.f2019i;
        if (field2 != null && !Modifier.isFinal(field2.getModifiers()) && m68163p(this.f2019i.getModifiers())) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m68163p(int i) {
        if (Modifier.isPublic(i) && m68161r(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean m68162q() {
        if (this.f2020j != null) {
            Field field = this.f2019i;
            if (field == null || m68161r(field.getModifiers())) {
                return true;
            }
            return false;
        }
        Field field2 = this.f2019i;
        if (field2 != null && m68163p(field2.getModifiers())) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m68161r(int i) {
        if (!Modifier.isTransient(i) && !Modifier.isStatic(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public void m68160s(String str) {
        this.f2018h = str;
    }

    /* renamed from: t */
    public void m68159t(Method method) {
        this.f2020j = method;
    }

    /* renamed from: u */
    public void m68158u(Method method) {
        this.f2021k = method;
    }

    /* renamed from: v */
    public C17686Go1 m68157v(C12928f c12928f, TypeData typeData) {
        if (c12928f != null && typeData != null) {
            this.f2016f = c12928f;
            this.f2017g = typeData.getTypeParameters();
        }
        return this;
    }
}
