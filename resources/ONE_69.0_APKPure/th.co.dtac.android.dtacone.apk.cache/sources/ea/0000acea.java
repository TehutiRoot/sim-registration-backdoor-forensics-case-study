package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public final class TypeResolver {

    /* renamed from: a */
    public final C8133c f54123a;

    /* renamed from: com.google.common.reflect.TypeResolver$a */
    /* loaded from: classes4.dex */
    public class C8131a extends AbstractC19759eX1 {

        /* renamed from: b */
        public final /* synthetic */ Map f54124b;

        /* renamed from: c */
        public final /* synthetic */ Type f54125c;

        public C8131a(Map map, Type type) {
            this.f54124b = map;
            this.f54125c = type;
        }

        @Override // p000.AbstractC19759eX1
        /* renamed from: b */
        public void mo31679b(Class cls) {
            if (this.f54125c instanceof WildcardType) {
                return;
            }
            throw new IllegalArgumentException("No type mapping from " + cls + " to " + this.f54125c);
        }

        @Override // p000.AbstractC19759eX1
        /* renamed from: c */
        public void mo31678c(GenericArrayType genericArrayType) {
            boolean z;
            Type type = this.f54125c;
            if (type instanceof WildcardType) {
                return;
            }
            Type m39703i = Types.m39703i(type);
            if (m39703i != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "%s is not an array type.", this.f54125c);
            TypeResolver.m39753g(this.f54124b, genericArrayType.getGenericComponentType(), m39703i);
        }

        @Override // p000.AbstractC19759eX1
        /* renamed from: d */
        public void mo31677d(ParameterizedType parameterizedType) {
            boolean z;
            Type type = this.f54125c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType2 = (ParameterizedType) TypeResolver.m39755e(ParameterizedType.class, type);
            if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                TypeResolver.m39753g(this.f54124b, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            Preconditions.checkArgument(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.f54125c);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            if (actualTypeArguments.length == actualTypeArguments2.length) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                TypeResolver.m39753g(this.f54124b, actualTypeArguments[i], actualTypeArguments2[i]);
            }
        }

        @Override // p000.AbstractC19759eX1
        /* renamed from: e */
        public void mo31676e(TypeVariable typeVariable) {
            this.f54124b.put(new C8135d(typeVariable), this.f54125c);
        }

        @Override // p000.AbstractC19759eX1
        /* renamed from: f */
        public void mo31675f(WildcardType wildcardType) {
            boolean z;
            Type type = this.f54125c;
            if (!(type instanceof WildcardType)) {
                return;
            }
            WildcardType wildcardType2 = (WildcardType) type;
            Type[] upperBounds = wildcardType.getUpperBounds();
            Type[] upperBounds2 = wildcardType2.getUpperBounds();
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] lowerBounds2 = wildcardType2.getLowerBounds();
            if (upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Incompatible type: %s vs. %s", wildcardType, this.f54125c);
            for (int i = 0; i < upperBounds.length; i++) {
                TypeResolver.m39753g(this.f54124b, upperBounds[i], upperBounds2[i]);
            }
            for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                TypeResolver.m39753g(this.f54124b, lowerBounds[i2], lowerBounds2[i2]);
            }
        }
    }

    /* renamed from: com.google.common.reflect.TypeResolver$b */
    /* loaded from: classes4.dex */
    public static final class C8132b extends AbstractC19759eX1 {

        /* renamed from: b */
        public final Map f54126b = Maps.newHashMap();

        /* renamed from: g */
        public static ImmutableMap m39746g(Type type) {
            Preconditions.checkNotNull(type);
            C8132b c8132b = new C8132b();
            c8132b.m31680a(type);
            return ImmutableMap.copyOf(c8132b.f54126b);
        }

        @Override // p000.AbstractC19759eX1
        /* renamed from: b */
        public void mo31679b(Class cls) {
            m31680a(cls.getGenericSuperclass());
            m31680a(cls.getGenericInterfaces());
        }

        @Override // p000.AbstractC19759eX1
        /* renamed from: d */
        public void mo31677d(ParameterizedType parameterizedType) {
            boolean z;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (typeParameters.length == actualTypeArguments.length) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            for (int i = 0; i < typeParameters.length; i++) {
                m39745h(new C8135d(typeParameters[i]), actualTypeArguments[i]);
            }
            m31680a(cls);
            m31680a(parameterizedType.getOwnerType());
        }

        @Override // p000.AbstractC19759eX1
        /* renamed from: e */
        public void mo31676e(TypeVariable typeVariable) {
            m31680a(typeVariable.getBounds());
        }

        @Override // p000.AbstractC19759eX1
        /* renamed from: f */
        public void mo31675f(WildcardType wildcardType) {
            m31680a(wildcardType.getUpperBounds());
        }

        /* renamed from: h */
        public final void m39745h(C8135d c8135d, Type type) {
            if (this.f54126b.containsKey(c8135d)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (c8135d.m39741a(type2)) {
                    while (type != null) {
                        type = (Type) this.f54126b.remove(C8135d.m39739c(type));
                    }
                    return;
                }
                type2 = (Type) this.f54126b.get(C8135d.m39739c(type2));
            }
            this.f54126b.put(c8135d, type);
        }
    }

    /* renamed from: com.google.common.reflect.TypeResolver$d */
    /* loaded from: classes4.dex */
    public static final class C8135d {

        /* renamed from: a */
        public final TypeVariable f54131a;

        public C8135d(TypeVariable typeVariable) {
            this.f54131a = (TypeVariable) Preconditions.checkNotNull(typeVariable);
        }

        /* renamed from: c */
        public static C8135d m39739c(Type type) {
            if (type instanceof TypeVariable) {
                return new C8135d((TypeVariable) type);
            }
            return null;
        }

        /* renamed from: a */
        public boolean m39741a(Type type) {
            if (type instanceof TypeVariable) {
                return m39740b((TypeVariable) type);
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m39740b(TypeVariable typeVariable) {
            if (this.f54131a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f54131a.getName().equals(typeVariable.getName())) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8135d) {
                return m39740b(((C8135d) obj).f54131a);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f54131a.getGenericDeclaration(), this.f54131a.getName());
        }

        public String toString() {
            return this.f54131a.toString();
        }
    }

    /* renamed from: com.google.common.reflect.TypeResolver$e */
    /* loaded from: classes4.dex */
    public static class C8136e {

        /* renamed from: b */
        public static final C8136e f54132b = new C8136e();

        /* renamed from: a */
        public final AtomicInteger f54133a;

        /* renamed from: com.google.common.reflect.TypeResolver$e$a */
        /* loaded from: classes4.dex */
        public class C8137a extends C8136e {

            /* renamed from: c */
            public final /* synthetic */ TypeVariable f54134c;

            /* renamed from: d */
            public final /* synthetic */ C8136e f54135d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8137a(C8136e c8136e, AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, null);
                this.f54134c = typeVariable;
                this.f54135d = c8136e;
            }

            @Override // com.google.common.reflect.TypeResolver.C8136e
            /* renamed from: b */
            public TypeVariable mo39734b(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.f54134c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.mo39734b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        public /* synthetic */ C8136e(AtomicInteger atomicInteger, C8131a c8131a) {
            this(atomicInteger);
        }

        /* renamed from: a */
        public final Type m39738a(Type type) {
            Preconditions.checkNotNull(type);
            if (type instanceof Class) {
                return type;
            }
            if (type instanceof TypeVariable) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.m39702j(m39735e().m39738a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = m39736d(typeParameters[i]).m39738a(actualTypeArguments[i]);
                }
                return Types.m39699m(m39735e().m39737c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length == 0) {
                    return mo39734b(wildcardType.getUpperBounds());
                }
                return type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }

        /* renamed from: b */
        public TypeVariable mo39734b(Type[] typeArr) {
            return Types.m39701k(C8136e.class, "capture#" + this.f54133a.incrementAndGet() + "-of ? extends " + Joiner.m41310on((char) Typography.amp).join(typeArr), typeArr);
        }

        /* renamed from: c */
        public final Type m39737c(Type type) {
            if (type == null) {
                return null;
            }
            return m39738a(type);
        }

        /* renamed from: d */
        public final C8136e m39736d(TypeVariable typeVariable) {
            return new C8137a(this, this.f54133a, typeVariable);
        }

        /* renamed from: e */
        public final C8136e m39735e() {
            return new C8136e(this.f54133a);
        }

        public C8136e() {
            this(new AtomicInteger());
        }

        public C8136e(AtomicInteger atomicInteger) {
            this.f54133a = atomicInteger;
        }
    }

    public /* synthetic */ TypeResolver(C8133c c8133c, C8131a c8131a) {
        this(c8133c);
    }

    /* renamed from: d */
    public static TypeResolver m39756d(Type type) {
        return new TypeResolver().m39747m(C8132b.m39746g(type));
    }

    /* renamed from: e */
    public static Object m39755e(Class cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(obj + " is not a " + cls.getSimpleName());
        }
    }

    /* renamed from: f */
    public static TypeResolver m39754f(Type type) {
        return new TypeResolver().m39747m(C8132b.m39746g(C8136e.f54132b.m39738a(type)));
    }

    /* renamed from: g */
    public static void m39753g(Map map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new C8131a(map, type2).m31680a(type);
    }

    /* renamed from: h */
    public final Type m39752h(GenericArrayType genericArrayType) {
        return Types.m39702j(resolveType(genericArrayType.getGenericComponentType()));
    }

    /* renamed from: i */
    public final ParameterizedType m39751i(ParameterizedType parameterizedType) {
        Type resolveType;
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType == null) {
            resolveType = null;
        } else {
            resolveType = resolveType(ownerType);
        }
        return Types.m39699m(resolveType, (Class) resolveType(parameterizedType.getRawType()), m39750j(parameterizedType.getActualTypeArguments()));
    }

    /* renamed from: j */
    public final Type[] m39750j(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = resolveType(typeArr[i]);
        }
        return typeArr2;
    }

    /* renamed from: k */
    public Type[] m39749k(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = resolveType(typeArr[i]);
        }
        return typeArr;
    }

    /* renamed from: l */
    public final WildcardType m39748l(WildcardType wildcardType) {
        return new Types.WildcardTypeImpl(m39750j(wildcardType.getLowerBounds()), m39750j(wildcardType.getUpperBounds()));
    }

    /* renamed from: m */
    public TypeResolver m39747m(Map map) {
        return new TypeResolver(this.f54123a.m39743c(map));
    }

    public Type resolveType(Type type) {
        Preconditions.checkNotNull(type);
        if (type instanceof TypeVariable) {
            return this.f54123a.m39744a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return m39751i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return m39752h((GenericArrayType) type);
        }
        if (type instanceof WildcardType) {
            return m39748l((WildcardType) type);
        }
        return type;
    }

    public TypeResolver where(Type type, Type type2) {
        HashMap newHashMap = Maps.newHashMap();
        m39753g(newHashMap, (Type) Preconditions.checkNotNull(type), (Type) Preconditions.checkNotNull(type2));
        return m39747m(newHashMap);
    }

    /* renamed from: com.google.common.reflect.TypeResolver$c */
    /* loaded from: classes4.dex */
    public static class C8133c {

        /* renamed from: a */
        public final ImmutableMap f54127a;

        /* renamed from: com.google.common.reflect.TypeResolver$c$a */
        /* loaded from: classes4.dex */
        public class C8134a extends C8133c {

            /* renamed from: b */
            public final /* synthetic */ TypeVariable f54128b;

            /* renamed from: c */
            public final /* synthetic */ C8133c f54129c;

            /* renamed from: d */
            public final /* synthetic */ C8133c f54130d;

            public C8134a(C8133c c8133c, TypeVariable typeVariable, C8133c c8133c2) {
                this.f54128b = typeVariable;
                this.f54129c = c8133c2;
                this.f54130d = c8133c;
            }

            @Override // com.google.common.reflect.TypeResolver.C8133c
            /* renamed from: b */
            public Type mo39742b(TypeVariable typeVariable, C8133c c8133c) {
                if (typeVariable.getGenericDeclaration().equals(this.f54128b.getGenericDeclaration())) {
                    return typeVariable;
                }
                return this.f54129c.mo39742b(typeVariable, c8133c);
            }
        }

        public C8133c() {
            this.f54127a = ImmutableMap.m40965of();
        }

        /* renamed from: a */
        public final Type m39744a(TypeVariable typeVariable) {
            return mo39742b(typeVariable, new C8134a(this, typeVariable, this));
        }

        /* renamed from: b */
        public Type mo39742b(TypeVariable typeVariable, C8133c c8133c) {
            Type type = (Type) this.f54127a.get(new C8135d(typeVariable));
            if (type == null) {
                Type[] bounds = typeVariable.getBounds();
                if (bounds.length != 0) {
                    Type[] m39750j = new TypeResolver(c8133c, null).m39750j(bounds);
                    if (Types.C8162b.f54151a && Arrays.equals(bounds, m39750j)) {
                        return typeVariable;
                    }
                    return Types.m39701k(typeVariable.getGenericDeclaration(), typeVariable.getName(), m39750j);
                }
                return typeVariable;
            }
            return new TypeResolver(c8133c, null).resolveType(type);
        }

        /* renamed from: c */
        public final C8133c m39743c(Map map) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.putAll(this.f54127a);
            for (Map.Entry entry : map.entrySet()) {
                C8135d c8135d = (C8135d) entry.getKey();
                Type type = (Type) entry.getValue();
                Preconditions.checkArgument(!c8135d.m39741a(type), "Type variable %s bound to itself", c8135d);
                builder.put(c8135d, type);
            }
            return new C8133c(builder.buildOrThrow());
        }

        public C8133c(ImmutableMap immutableMap) {
            this.f54127a = immutableMap;
        }
    }

    public TypeResolver() {
        this.f54123a = new C8133c();
    }

    public TypeResolver(C8133c c8133c) {
        this.f54123a = c8133c;
    }
}