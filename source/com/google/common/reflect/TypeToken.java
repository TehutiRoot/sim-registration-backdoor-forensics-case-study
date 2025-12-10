package com.google.common.reflect;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeResolver;
import com.google.common.reflect.Types;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes4.dex */
public abstract class TypeToken<T> extends RV1 implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    @CheckForNull
    @LazyInit
    private transient TypeResolver covariantTypeResolver;
    @CheckForNull
    @LazyInit
    private transient TypeResolver invariantTypeResolver;
    private final Type runtimeType;

    /* loaded from: classes4.dex */
    public final class ClassSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        @CheckForNull
        private transient ImmutableSet<TypeToken<? super T>> classes;

        private ClassSet() {
            super();
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().classes();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) AbstractC8156f.f54132b.m39733a().mo39723c(TypeToken.this.getRawTypes()));
        }

        public /* synthetic */ ClassSet(TypeToken typeToken, C8151a c8151a) {
            this();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.classes;
            if (immutableSet == null) {
                ImmutableSet<TypeToken<? super T>> set = FluentIterable.from(AbstractC8156f.f54131a.m39733a().m39731d(TypeToken.this)).filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
                this.classes = set;
                return set;
            }
            return immutableSet;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        public SimpleTypeToken(Type type) {
            super(type, null);
        }
    }

    /* loaded from: classes4.dex */
    public enum TypeFilter implements Predicate<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.Predicate
            public boolean apply(TypeToken<?> typeToken) {
                return ((((TypeToken) typeToken).runtimeType instanceof TypeVariable) || (((TypeToken) typeToken).runtimeType instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.Predicate
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        };

        /* synthetic */ TypeFilter(C8151a c8151a) {
            this();
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$a */
    /* loaded from: classes4.dex */
    public class C8151a extends Invokable.C8139b {
        public C8151a(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.Invokable.C8139b, com.google.common.reflect.Invokable
        /* renamed from: a */
        public Type[] mo39738a() {
            return TypeToken.this.getCovariantTypeResolver().m39757k(super.mo39738a());
        }

        @Override // com.google.common.reflect.Invokable.C8139b, com.google.common.reflect.Invokable
        /* renamed from: b */
        public Type[] mo39737b() {
            return TypeToken.this.getInvariantTypeResolver().m39757k(super.mo39737b());
        }

        @Override // com.google.common.reflect.Invokable.C8139b, com.google.common.reflect.Invokable
        /* renamed from: c */
        public Type mo39736c() {
            return TypeToken.this.getCovariantTypeResolver().resolveType(super.mo39736c());
        }

        @Override // com.google.common.reflect.Invokable
        public TypeToken getOwnerType() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.Invokable
        public String toString() {
            return getOwnerType() + "." + super.toString();
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$b */
    /* loaded from: classes4.dex */
    public class C8152b extends Invokable.C8138a {
        public C8152b(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.Invokable.C8138a, com.google.common.reflect.Invokable
        /* renamed from: a */
        public Type[] mo39738a() {
            return TypeToken.this.getCovariantTypeResolver().m39757k(super.mo39738a());
        }

        @Override // com.google.common.reflect.Invokable.C8138a, com.google.common.reflect.Invokable
        /* renamed from: b */
        public Type[] mo39737b() {
            return TypeToken.this.getInvariantTypeResolver().m39757k(super.mo39737b());
        }

        @Override // com.google.common.reflect.Invokable.C8138a, com.google.common.reflect.Invokable
        /* renamed from: c */
        public Type mo39736c() {
            return TypeToken.this.getCovariantTypeResolver().resolveType(super.mo39736c());
        }

        @Override // com.google.common.reflect.Invokable
        public TypeToken getOwnerType() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.Invokable
        public String toString() {
            return getOwnerType() + "(" + Joiner.m41322on(", ").join(mo39737b()) + ")";
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$c */
    /* loaded from: classes4.dex */
    public class C8153c extends AbstractC20222hW1 {
        public C8153c() {
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: c */
        public void mo30865c(GenericArrayType genericArrayType) {
            m30867a(genericArrayType.getGenericComponentType());
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: d */
        public void mo30864d(ParameterizedType parameterizedType) {
            m30867a(parameterizedType.getActualTypeArguments());
            m30867a(parameterizedType.getOwnerType());
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: e */
        public void mo30863e(TypeVariable typeVariable) {
            throw new IllegalArgumentException(TypeToken.this.runtimeType + "contains a type variable and is not safe for the operation");
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: f */
        public void mo30862f(WildcardType wildcardType) {
            m30867a(wildcardType.getLowerBounds());
            m30867a(wildcardType.getUpperBounds());
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$d */
    /* loaded from: classes4.dex */
    public class C8154d extends AbstractC20222hW1 {

        /* renamed from: b */
        public final /* synthetic */ ImmutableSet.Builder f54127b;

        /* renamed from: c */
        public final /* synthetic */ TypeToken f54128c;

        public C8154d(TypeToken typeToken, ImmutableSet.Builder builder) {
            this.f54127b = builder;
            this.f54128c = typeToken;
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: b */
        public void mo30866b(Class cls) {
            this.f54127b.add((ImmutableSet.Builder) cls);
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: c */
        public void mo30865c(GenericArrayType genericArrayType) {
            this.f54127b.add((ImmutableSet.Builder) Types.m39712h(TypeToken.m39739of(genericArrayType.getGenericComponentType()).getRawType()));
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: d */
        public void mo30864d(ParameterizedType parameterizedType) {
            this.f54127b.add((ImmutableSet.Builder) ((Class) parameterizedType.getRawType()));
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: e */
        public void mo30863e(TypeVariable typeVariable) {
            m30867a(typeVariable.getBounds());
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: f */
        public void mo30862f(WildcardType wildcardType) {
            m30867a(wildcardType.getUpperBounds());
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$e */
    /* loaded from: classes4.dex */
    public static class C8155e {

        /* renamed from: a */
        public final Type[] f54129a;

        /* renamed from: b */
        public final boolean f54130b;

        public C8155e(Type[] typeArr, boolean z) {
            this.f54129a = typeArr;
            this.f54130b = z;
        }

        /* renamed from: a */
        public boolean m39735a(Type type) {
            for (Type type2 : this.f54129a) {
                boolean isSubtypeOf = TypeToken.m39739of(type2).isSubtypeOf(type);
                boolean z = this.f54130b;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f54130b;
        }

        /* renamed from: b */
        public boolean m39734b(Type type) {
            TypeToken<?> m39739of = TypeToken.m39739of(type);
            for (Type type2 : this.f54129a) {
                boolean isSubtypeOf = m39739of.isSubtypeOf(type2);
                boolean z = this.f54130b;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f54130b;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$f */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8156f {

        /* renamed from: a */
        public static final AbstractC8156f f54131a = new C8157a();

        /* renamed from: b */
        public static final AbstractC8156f f54132b = new C8158b();

        /* renamed from: com.google.common.reflect.TypeToken$f$a */
        /* loaded from: classes4.dex */
        public class C8157a extends AbstractC8156f {
            public C8157a() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC8156f
            /* renamed from: i */
            public Iterable mo39722e(TypeToken typeToken) {
                return typeToken.getGenericInterfaces();
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC8156f
            /* renamed from: j */
            public Class mo39721f(TypeToken typeToken) {
                return typeToken.getRawType();
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC8156f
            /* renamed from: k */
            public TypeToken mo39720g(TypeToken typeToken) {
                return typeToken.getGenericSuperclass();
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$f$b */
        /* loaded from: classes4.dex */
        public class C8158b extends AbstractC8156f {
            public C8158b() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC8156f
            /* renamed from: i */
            public Iterable mo39722e(Class cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC8156f
            /* renamed from: j */
            public Class mo39721f(Class cls) {
                return cls;
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC8156f
            /* renamed from: k */
            public Class mo39720g(Class cls) {
                return cls.getSuperclass();
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$f$c */
        /* loaded from: classes4.dex */
        public class C8159c extends C8161e {
            public C8159c(AbstractC8156f abstractC8156f) {
                super(abstractC8156f);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC8156f
            /* renamed from: c */
            public ImmutableList mo39723c(Iterable iterable) {
                ImmutableList.Builder builder = ImmutableList.builder();
                for (T t : iterable) {
                    if (!mo39721f(t).isInterface()) {
                        builder.add((ImmutableList.Builder) t);
                    }
                }
                return super.mo39723c(builder.build());
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC8156f
            /* renamed from: e */
            public Iterable mo39722e(Object obj) {
                return ImmutableSet.m40931of();
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$f$d */
        /* loaded from: classes4.dex */
        public class C8160d extends Ordering {

            /* renamed from: a */
            public final /* synthetic */ Comparator f54134a;

            /* renamed from: b */
            public final /* synthetic */ Map f54135b;

            public C8160d(Comparator comparator, Map map) {
                this.f54134a = comparator;
                this.f54135b = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Ordering, java.util.Comparator
            public int compare(Object obj, Object obj2) {
                Comparator comparator = this.f54134a;
                Object obj3 = this.f54135b.get(obj);
                Objects.requireNonNull(obj3);
                Object obj4 = this.f54135b.get(obj2);
                Objects.requireNonNull(obj4);
                return comparator.compare(obj3, obj4);
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$f$e */
        /* loaded from: classes4.dex */
        public static class C8161e extends AbstractC8156f {

            /* renamed from: c */
            public final AbstractC8156f f54136c;

            public C8161e(AbstractC8156f abstractC8156f) {
                super(null);
                this.f54136c = abstractC8156f;
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC8156f
            /* renamed from: f */
            public Class mo39721f(Object obj) {
                return this.f54136c.mo39721f(obj);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC8156f
            /* renamed from: g */
            public Object mo39720g(Object obj) {
                return this.f54136c.mo39720g(obj);
            }
        }

        public AbstractC8156f() {
        }

        /* renamed from: h */
        public static ImmutableList m39730h(Map map, Comparator comparator) {
            return new C8160d(comparator, map).immutableSortedCopy(map.keySet());
        }

        /* renamed from: a */
        public final AbstractC8156f m39733a() {
            return new C8159c(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final int m39732b(Object obj, Map map) {
            Integer num = (Integer) map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            boolean isInterface = mo39721f(obj).isInterface();
            int i = isInterface;
            for (T t : mo39722e(obj)) {
                i = Math.max(i, m39732b(t, map));
            }
            Object mo39720g = mo39720g(obj);
            int i2 = i;
            if (mo39720g != null) {
                i2 = Math.max(i, m39732b(mo39720g, map));
            }
            int i3 = i2 + 1;
            map.put(obj, Integer.valueOf(i3));
            return i3;
        }

        /* renamed from: c */
        public ImmutableList mo39723c(Iterable iterable) {
            HashMap newHashMap = Maps.newHashMap();
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                m39732b(it.next(), newHashMap);
            }
            return m39730h(newHashMap, Ordering.natural().reverse());
        }

        /* renamed from: d */
        public final ImmutableList m39731d(Object obj) {
            return mo39723c(ImmutableList.m40997of(obj));
        }

        /* renamed from: e */
        public abstract Iterable mo39722e(Object obj);

        /* renamed from: f */
        public abstract Class mo39721f(Object obj);

        /* renamed from: g */
        public abstract Object mo39720g(Object obj);

        public /* synthetic */ AbstractC8156f(C8151a c8151a) {
            this();
        }
    }

    public /* synthetic */ TypeToken(Type type, C8151a c8151a) {
        this(type);
    }

    private static C8155e any(Type[] typeArr) {
        return new C8155e(typeArr, true);
    }

    @CheckForNull
    private TypeToken<? super T> boundAsSuperclass(Type type) {
        TypeToken<? super T> typeToken = (TypeToken<? super T>) m39739of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    private ImmutableList<TypeToken<? super T>> boundsAsInterfaces(Type[] typeArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type : typeArr) {
            TypeToken<?> m39739of = m39739of(type);
            if (m39739of.getRawType().isInterface()) {
                builder.add((ImmutableList.Builder) m39739of);
            }
        }
        return builder.build();
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> typeVariable, Type type) {
        if (type instanceof WildcardType) {
            return canonicalizeWildcardType(typeVariable, (WildcardType) type);
        }
        return canonicalizeWildcardsInType(type);
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] upperBounds;
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!any(bounds).m39735a(type)) {
                arrayList.add(canonicalizeWildcardsInType(type));
            }
        }
        return new Types.WildcardTypeImpl(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = canonicalizeTypeArg(typeParameters[i], actualTypeArguments[i]);
        }
        return Types.m39707m(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type canonicalizeWildcardsInType(Type type) {
        if (type instanceof ParameterizedType) {
            return canonicalizeWildcardsInParameterizedType((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return Types.m39710j(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType()));
        }
        return type;
    }

    private static C8155e every(Type[] typeArr) {
        return new C8155e(typeArr, false);
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            TypeToken<?> componentType2 = getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? extends T>) m39739of(newArrayClassOrGenericArrayType(componentType2.getSubtype(componentType).runtimeType));
        }
        throw new IllegalArgumentException(cls + " does not appear to be a subtype of " + this);
    }

    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
        TypeToken<?> componentType = getComponentType();
        if (componentType != null) {
            Class componentType2 = cls.getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? super T>) m39739of(newArrayClassOrGenericArrayType(componentType.getSupertype(componentType2).runtimeType));
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TypeResolver getCovariantTypeResolver() {
        TypeResolver typeResolver = this.covariantTypeResolver;
        if (typeResolver == null) {
            TypeResolver m39764d = TypeResolver.m39764d(this.runtimeType);
            this.covariantTypeResolver = m39764d;
            return m39764d;
        }
        return typeResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TypeResolver getInvariantTypeResolver() {
        TypeResolver typeResolver = this.invariantTypeResolver;
        if (typeResolver == null) {
            TypeResolver m39762f = TypeResolver.m39762f(this.runtimeType);
            this.invariantTypeResolver = m39762f;
            return m39762f;
        }
        return typeResolver;
    }

    @CheckForNull
    private Type getOwnerTypeIfPresent() {
        Type type = this.runtimeType;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImmutableSet<Class<? super T>> getRawTypes() {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        new C8154d(this, builder).m30867a(this.runtimeType);
        return builder.build();
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (TypeToken<? extends T>) m39739of(typeArr[0]).getSubtype(cls);
        }
        throw new IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> m39739of = m39739of(type);
            if (m39739of.isSubtypeOf(cls)) {
                return (TypeToken<? super T>) m39739of.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    /* renamed from: is */
    private boolean m39741is(Type type, TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (type instanceof WildcardType) {
            WildcardType canonicalizeWildcardType = canonicalizeWildcardType(typeVariable, (WildcardType) type);
            if (every(canonicalizeWildcardType.getUpperBounds()).m39734b(this.runtimeType) && every(canonicalizeWildcardType.getLowerBounds()).m39735a(this.runtimeType)) {
                return true;
            }
            return false;
        }
        return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(type));
    }

    private boolean isOwnedBySubtypeOf(Type type) {
        Iterator<TypeToken<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = it.next().getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && m39739of(ownerTypeIfPresent).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return false;
            }
            return m39740of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        } else if (!(type instanceof GenericArrayType)) {
            return false;
        } else {
            return m39739of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = m39739of(parameterizedType).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < typeParameters.length; i++) {
            if (!m39739of(getCovariantTypeResolver().resolveType(typeParameters[i])).m39741is(actualTypeArguments[i], typeParameters[i])) {
                return false;
            }
        }
        if (!Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) && parameterizedType.getOwnerType() != null && !isOwnedBySubtypeOf(parameterizedType.getOwnerType())) {
            return false;
        }
        return true;
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return cls.isAssignableFrom(Object[].class);
            }
            return m39739of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        } else if (type instanceof GenericArrayType) {
            return m39739of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        } else {
            return false;
        }
    }

    private boolean isWrapper() {
        return Primitives.allWrapperTypes().contains(this.runtimeType);
    }

    private static Type newArrayClassOrGenericArrayType(Type type) {
        return Types.JavaVersion.JAVA7.newArrayType(type);
    }

    /* renamed from: of */
    public static <T> TypeToken<T> m39740of(Class<T> cls) {
        return new SimpleTypeToken(cls);
    }

    private TypeToken<?> resolveSupertype(Type type) {
        TypeToken<?> m39739of = m39739of(getCovariantTypeResolver().resolveType(type));
        m39739of.covariantTypeResolver = this.covariantTypeResolver;
        m39739of.invariantTypeResolver = this.invariantTypeResolver;
        return m39739of;
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken genericType = toGenericType(cls);
        return new TypeResolver().where(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).resolveType(genericType.runtimeType);
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
        UnmodifiableIterator<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        Type type;
        if (cls.isArray()) {
            return (TypeToken<? extends T>) m39739of(Types.m39710j(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            type = toGenericType(cls.getEnclosingClass()).runtimeType;
        } else {
            type = null;
        }
        if (typeParameters.length <= 0 && (type == null || type == cls.getEnclosingClass())) {
            return m39740of((Class) cls);
        }
        return (TypeToken<? extends T>) m39739of(Types.m39707m(type, cls, typeParameters));
    }

    public final Invokable<T, T> constructor(Constructor<?> constructor) {
        boolean z;
        if (constructor.getDeclaringClass() == getRawType()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "%s not declared by %s", constructor, getRawType());
        return new C8152b(constructor);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    @CheckForNull
    public final TypeToken<?> getComponentType() {
        Type m39711i = Types.m39711i(this.runtimeType);
        if (m39711i == null) {
            return null;
        }
        return m39739of(m39711i);
    }

    public final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            builder.add((ImmutableList.Builder) resolveSupertype(type2));
        }
        return builder.build();
    }

    @CheckForNull
    public final TypeToken<? super T> getGenericSuperclass() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundAsSuperclass(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return boundAsSuperclass(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (TypeToken<? super T>) resolveSupertype(genericSuperclass);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        Preconditions.checkArgument(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        Preconditions.checkArgument(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) m39739of(resolveTypeArgsForSubclass(cls));
        Preconditions.checkArgument(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        Preconditions.checkArgument(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return getSupertypeFromUpperBounds(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return getSupertypeFromUpperBounds(cls, ((WildcardType) type).getUpperBounds());
        }
        if (cls.isArray()) {
            return getArraySupertype(cls);
        }
        return (TypeToken<? super T>) resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final TypeToken<T>.TypeSet getTypes() {
        return new TypeSet();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        if (getComponentType() != null) {
            return true;
        }
        return false;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            return true;
        }
        return false;
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public final Invokable<T, Object> method(Method method) {
        Preconditions.checkArgument(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new C8151a(method);
    }

    @CanIgnoreReturnValue
    public final TypeToken<T> rejectTypeVariables() {
        new C8153c().m30867a(this.runtimeType);
        return this;
    }

    public final TypeToken<?> resolveType(Type type) {
        Preconditions.checkNotNull(type);
        return m39739of(getInvariantTypeResolver().resolveType(type));
    }

    public String toString() {
        return Types.m39701s(this.runtimeType);
    }

    public final TypeToken<T> unwrap() {
        if (isWrapper()) {
            return m39740of(Primitives.unwrap((Class) this.runtimeType));
        }
        return this;
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, TypeToken<X> typeToken) {
        return new SimpleTypeToken(new TypeResolver().m39755m(ImmutableMap.m40975of(new TypeResolver.C8146d(typeParameter.f54110a), typeToken.runtimeType)).resolveType(this.runtimeType));
    }

    public final TypeToken<T> wrap() {
        if (isPrimitive()) {
            return m39740of(Primitives.wrap((Class) this.runtimeType));
        }
        return this;
    }

    public Object writeReplace() {
        return m39739of(new TypeResolver().resolveType(this.runtimeType));
    }

    /* loaded from: classes4.dex */
    public final class InterfaceSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        private final transient TypeToken<T>.TypeSet allTypes;
        @CheckForNull
        private transient ImmutableSet<TypeToken<? super T>> interfaces;

        public InterfaceSet(TypeToken<T>.TypeSet typeSet) {
            super();
            this.allTypes = typeSet;
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().interfaces();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return FluentIterable.from(AbstractC8156f.f54132b.mo39723c(TypeToken.this.getRawTypes())).filter(new Predicate() { // from class: fW1
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).toSet();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.interfaces;
            if (immutableSet == null) {
                ImmutableSet<TypeToken<? super T>> set = FluentIterable.from(this.allTypes).filter(TypeFilter.INTERFACE_ONLY).toSet();
                this.interfaces = set;
                return set;
            }
            return immutableSet;
        }
    }

    /* loaded from: classes4.dex */
    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        @CheckForNull
        private transient ImmutableSet<TypeToken<? super T>> types;

        public TypeSet() {
        }

        public TypeToken<T>.TypeSet classes() {
            return new ClassSet(TypeToken.this, null);
        }

        public TypeToken<T>.TypeSet interfaces() {
            return new InterfaceSet(this);
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) AbstractC8156f.f54132b.mo39723c(TypeToken.this.getRawTypes()));
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.types;
            if (immutableSet == null) {
                ImmutableSet<TypeToken<? super T>> set = FluentIterable.from(AbstractC8156f.f54131a.m39731d(TypeToken.this)).filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
                this.types = set;
                return set;
            }
            return immutableSet;
        }
    }

    public TypeToken() {
        Type capture = capture();
        this.runtimeType = capture;
        Preconditions.checkState(!(capture instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", capture);
    }

    /* renamed from: of */
    public static TypeToken<?> m39739of(Type type) {
        return new SimpleTypeToken(type);
    }

    public final boolean isSubtypeOf(Type type) {
        Preconditions.checkNotNull(type);
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getLowerBounds()).m39734b(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return any(((WildcardType) type2).getUpperBounds()).m39735a(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || any(((TypeVariable) this.runtimeType).getBounds()).m39735a(type);
        } else if (type2 instanceof GenericArrayType) {
            return m39739of(type).isSupertypeOfArray((GenericArrayType) this.runtimeType);
        } else {
            if (type instanceof Class) {
                return someRawTypeIsSubclassOf((Class) type);
            }
            if (type instanceof ParameterizedType) {
                return isSubtypeOfParameterizedType((ParameterizedType) type);
            }
            if (type instanceof GenericArrayType) {
                return isSubtypeOfArrayType((GenericArrayType) type);
            }
            return false;
        }
    }

    public final boolean isSupertypeOf(Type type) {
        return m39739of(type).isSubtypeOf(getType());
    }

    public TypeToken(Class<?> cls) {
        Type capture = super.capture();
        if (capture instanceof Class) {
            this.runtimeType = capture;
        } else {
            this.runtimeType = TypeResolver.m39764d(cls).resolveType(capture);
        }
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, Class<X> cls) {
        return where(typeParameter, m39740of((Class) cls));
    }

    private TypeToken(Type type) {
        this.runtimeType = (Type) Preconditions.checkNotNull(type);
    }
}
