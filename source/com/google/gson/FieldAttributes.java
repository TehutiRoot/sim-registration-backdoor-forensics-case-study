package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class FieldAttributes {

    /* renamed from: a */
    public final Field f56636a;

    public FieldAttributes(Field field) {
        Objects.requireNonNull(field);
        this.f56636a = field;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.f56636a.getAnnotation(cls);
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.f56636a.getAnnotations());
    }

    public Class<?> getDeclaredClass() {
        return this.f56636a.getType();
    }

    public Type getDeclaredType() {
        return this.f56636a.getGenericType();
    }

    public Class<?> getDeclaringClass() {
        return this.f56636a.getDeclaringClass();
    }

    public String getName() {
        return this.f56636a.getName();
    }

    public boolean hasModifier(int i) {
        if ((i & this.f56636a.getModifiers()) != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f56636a.toString();
    }
}
