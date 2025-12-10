package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface TypeResolutionContext {

    /* loaded from: classes3.dex */
    public static class Basic implements TypeResolutionContext {

        /* renamed from: a */
        public final TypeFactory f43364a;

        /* renamed from: b */
        public final TypeBindings f43365b;

        public Basic(TypeFactory typeFactory, TypeBindings typeBindings) {
            this.f43364a = typeFactory;
            this.f43365b = typeBindings;
        }

        @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
        public JavaType resolveType(Type type) {
            return this.f43364a.constructType(type, this.f43365b);
        }
    }

    JavaType resolveType(Type type);
}
