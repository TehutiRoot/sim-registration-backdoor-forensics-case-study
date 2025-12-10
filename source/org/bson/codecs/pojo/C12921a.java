package org.bson.codecs.pojo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.codecs.pojo.annotations.BsonProperty;

/* renamed from: org.bson.codecs.pojo.a */
/* loaded from: classes6.dex */
public final class C12921a implements Convention {
    /* renamed from: f */
    public static void m24238f(Class cls, PropertyModelBuilder propertyModelBuilder, Type type) {
        if (cls.isAssignableFrom(propertyModelBuilder.m24255a().getType())) {
            propertyModelBuilder.m24252d(TypeData.m24244h(type, cls));
        }
    }

    /* renamed from: a */
    public final PropertyModelBuilder m24243a(ClassModelBuilder classModelBuilder, String str, Class cls) {
        PropertyModelBuilder writeName = AbstractC12924c.m24232c(new C17686Go1(str, classModelBuilder.getType().getSimpleName(), TypeData.m24250b(cls).build())).readName(null).writeName(str);
        classModelBuilder.m24269a(writeName);
        return writeName;
    }

    @Override // org.bson.codecs.pojo.Convention
    public void apply(ClassModelBuilder classModelBuilder) {
        for (Annotation annotation : classModelBuilder.getAnnotations()) {
            m24241c(classModelBuilder, annotation);
        }
        for (PropertyModelBuilder<?> propertyModelBuilder : classModelBuilder.getPropertyModelBuilders()) {
            m24239e(classModelBuilder, propertyModelBuilder);
        }
        m24240d(classModelBuilder);
        m24242b(classModelBuilder);
    }

    /* renamed from: b */
    public final void m24242b(ClassModelBuilder classModelBuilder) {
        ArrayList<String> arrayList = new ArrayList();
        for (PropertyModelBuilder<?> propertyModelBuilder : classModelBuilder.getPropertyModelBuilders()) {
            if (!propertyModelBuilder.isReadable() && !propertyModelBuilder.isWritable()) {
                arrayList.add(propertyModelBuilder.getName());
            }
        }
        for (String str : arrayList) {
            classModelBuilder.removeProperty(str);
        }
    }

    /* renamed from: c */
    public final void m24241c(ClassModelBuilder classModelBuilder, Annotation annotation) {
        if (annotation instanceof BsonDiscriminator) {
            BsonDiscriminator bsonDiscriminator = (BsonDiscriminator) annotation;
            String key = bsonDiscriminator.key();
            if (!key.equals("")) {
                classModelBuilder.discriminatorKey(key);
            }
            String value = bsonDiscriminator.value();
            if (!value.equals("")) {
                classModelBuilder.discriminator(value);
            }
            classModelBuilder.enableDiscriminator(true);
        }
    }

    /* renamed from: d */
    public final void m24240d(ClassModelBuilder classModelBuilder) {
        Constructor<?>[] declaredConstructors;
        boolean z;
        PropertyModelBuilder<?> propertyModelBuilder;
        PropertyModelBuilder<?> propertyModelBuilder2;
        int i = 1;
        Class type = classModelBuilder.getType();
        C0982Nz c0982Nz = null;
        for (Constructor<?> constructor : type.getDeclaredConstructors()) {
            if (Modifier.isPublic(constructor.getModifiers()) && !constructor.isSynthetic()) {
                for (Annotation annotation : constructor.getDeclaredAnnotations()) {
                    if (annotation.annotationType().equals(BsonCreator.class)) {
                        if (c0982Nz == null) {
                            c0982Nz = new C0982Nz(type, constructor);
                        } else {
                            throw new CodecConfigurationException("Found multiple constructors annotated with @BsonCreator");
                        }
                    }
                }
                continue;
            }
        }
        Class cls = type;
        boolean z2 = false;
        while (cls != null && !z2) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            for (int i2 = 0; i2 < length; i2 += i) {
                Method method = declaredMethods[i2];
                if (Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge()) {
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    int length2 = declaredAnnotations.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        if (declaredAnnotations[i3].annotationType().equals(BsonCreator.class)) {
                            if (c0982Nz == null) {
                                if (cls.isAssignableFrom(method.getReturnType())) {
                                    c0982Nz = new C0982Nz(type, method);
                                    i = 1;
                                    z2 = true;
                                } else {
                                    throw new CodecConfigurationException(String.format("Invalid method annotated with @BsonCreator. Returns '%s', expected %s", method.getReturnType(), cls));
                                }
                            } else {
                                throw new CodecConfigurationException("Found multiple constructors / methods annotated with @BsonCreator");
                            }
                        } else {
                            i = 1;
                        }
                        i3 += i;
                    }
                    continue;
                }
            }
            cls = cls.getSuperclass();
            i = 1;
        }
        if (c0982Nz != null) {
            List m67143i = c0982Nz.m67143i();
            List m67144h = c0982Nz.m67144h();
            List m67145g = c0982Nz.m67145g();
            if (m67143i.size() == m67144h.size()) {
                for (int i4 = 0; i4 < m67143i.size(); i4++) {
                    if (c0982Nz.m67148d() != null && c0982Nz.m67148d().equals(Integer.valueOf(i4))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Class cls2 = (Class) m67144h.get(i4);
                    Type type2 = (Type) m67145g.get(i4);
                    if (z) {
                        propertyModelBuilder2 = classModelBuilder.getProperty(classModelBuilder.getIdPropertyName());
                    } else {
                        BsonProperty bsonProperty = (BsonProperty) m67143i.get(i4);
                        Iterator<PropertyModelBuilder<?>> it = classModelBuilder.getPropertyModelBuilders().iterator();
                        PropertyModelBuilder<?> propertyModelBuilder3 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            PropertyModelBuilder<?> next = it.next();
                            if (bsonProperty.value().equals(next.getWriteName())) {
                                propertyModelBuilder3 = next;
                                break;
                            } else if (bsonProperty.value().equals(next.getReadName())) {
                                propertyModelBuilder3 = next;
                            }
                        }
                        if (propertyModelBuilder3 == null) {
                            propertyModelBuilder = classModelBuilder.getProperty(bsonProperty.value());
                        } else {
                            propertyModelBuilder = propertyModelBuilder3;
                        }
                        if (propertyModelBuilder == null) {
                            propertyModelBuilder2 = m24243a(classModelBuilder, bsonProperty.value(), cls2);
                        } else {
                            if (!bsonProperty.value().equals(propertyModelBuilder.getName())) {
                                propertyModelBuilder.writeName(bsonProperty.value());
                            }
                            m24238f(cls2, propertyModelBuilder, type2);
                            propertyModelBuilder2 = propertyModelBuilder;
                        }
                    }
                    if (!propertyModelBuilder2.m24255a().m24248d(cls2)) {
                        throw c0982Nz.m67150b(type, String.format("Invalid Property type for '%s'. Expected %s, found %s.", propertyModelBuilder2.getWriteName(), propertyModelBuilder2.m24255a().getType(), cls2));
                    }
                }
                classModelBuilder.instanceCreatorFactory(new C18873Ze0(c0982Nz));
                return;
            }
            throw c0982Nz.m67150b(type, "All parameters in the @BsonCreator method / constructor must be annotated with a @BsonProperty.");
        }
    }

    /* renamed from: e */
    public final void m24239e(ClassModelBuilder classModelBuilder, PropertyModelBuilder propertyModelBuilder) {
        for (Annotation annotation : propertyModelBuilder.getReadAnnotations()) {
            if (annotation instanceof BsonProperty) {
                BsonProperty bsonProperty = (BsonProperty) annotation;
                if (!"".equals(bsonProperty.value())) {
                    propertyModelBuilder.readName(bsonProperty.value());
                }
                propertyModelBuilder.discriminatorEnabled(bsonProperty.useDiscriminator());
                if (propertyModelBuilder.getName().equals(classModelBuilder.getIdPropertyName())) {
                    classModelBuilder.idPropertyName(null);
                }
            } else if (annotation instanceof BsonId) {
                classModelBuilder.idPropertyName(propertyModelBuilder.getName());
            } else if (annotation instanceof BsonIgnore) {
                propertyModelBuilder.readName(null);
            }
        }
        for (Annotation annotation2 : propertyModelBuilder.getWriteAnnotations()) {
            if (annotation2 instanceof BsonProperty) {
                BsonProperty bsonProperty2 = (BsonProperty) annotation2;
                if (!"".equals(bsonProperty2.value())) {
                    propertyModelBuilder.writeName(bsonProperty2.value());
                }
            } else if (annotation2 instanceof BsonIgnore) {
                propertyModelBuilder.writeName(null);
            }
        }
    }
}
