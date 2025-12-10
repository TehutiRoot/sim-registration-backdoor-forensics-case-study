package com.google.common.reflect;

import ch.qos.logback.classic.spi.CallerData;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.CheckForNull;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public abstract class Types {

    /* renamed from: a */
    public static final Joiner f54137a = Joiner.m41322on(", ").useForNull(AbstractJsonLexerKt.NULL);

    /* loaded from: classes4.dex */
    public enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            public Class<?> getOwnerType(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            public Class<?> getOwnerType(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        
        static final ClassOwnership JVM_BEHAVIOR = detectJvmBehavior();

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$a */
        /* loaded from: classes4.dex */
        public class C8164a {
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$b */
        /* loaded from: classes4.dex */
        public class C8165b extends C8164a {
        }

        private static ClassOwnership detectJvmBehavior() {
            ClassOwnership[] values;
            new C8165b();
            ParameterizedType parameterizedType = (ParameterizedType) C8165b.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(C8164a.class) == parameterizedType2.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }

        @CheckForNull
        public abstract Class<?> getOwnerType(Class<?> cls);

        /* synthetic */ ClassOwnership(C8172a c8172a) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = JavaVersion.CURRENT.usedInGenericType(type);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.Objects.equal(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return Types.m39701s(this.componentType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* loaded from: classes4.dex */
    public enum JavaVersion {
        JAVA6 { // from class: com.google.common.reflect.Types.JavaVersion.1
            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                Preconditions.checkNotNull(type);
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        return new GenericArrayTypeImpl(cls.getComponentType());
                    }
                    return type;
                }
                return type;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public GenericArrayType newArrayType(Type type) {
                return new GenericArrayTypeImpl(type);
            }
        },
        JAVA7 { // from class: com.google.common.reflect.Types.JavaVersion.2
            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
                if (type instanceof Class) {
                    return Types.m39712h((Class) type);
                }
                return new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return (Type) Preconditions.checkNotNull(type);
            }
        },
        JAVA8 { // from class: com.google.common.reflect.Types.JavaVersion.3
            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
                return JavaVersion.JAVA7.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return JavaVersion.JAVA7.usedInGenericType(type);
            }
        },
        JAVA9 { // from class: com.google.common.reflect.Types.JavaVersion.4
            @Override // com.google.common.reflect.Types.JavaVersion
            public boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
                return JavaVersion.JAVA8.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
                return JavaVersion.JAVA8.typeName(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return JavaVersion.JAVA8.usedInGenericType(type);
            }
        };
        
        static final JavaVersion CURRENT;

        /* renamed from: com.google.common.reflect.Types$JavaVersion$a */
        /* loaded from: classes4.dex */
        public class C8170a extends RV1 {
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$b */
        /* loaded from: classes4.dex */
        public class C8171b extends RV1 {
        }

        static {
            JavaVersion javaVersion;
            JavaVersion javaVersion2;
            JavaVersion javaVersion3;
            JavaVersion javaVersion4;
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new C8170a().capture().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = javaVersion3;
                } else {
                    CURRENT = javaVersion4;
                }
            } else if (new C8171b().capture() instanceof Class) {
                CURRENT = javaVersion2;
            } else {
                CURRENT = javaVersion;
            }
        }

        public boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        public abstract Type newArrayType(Type type);

        public String typeName(Type type) {
            return Types.m39701s(type);
        }

        public final ImmutableList<Type> usedInGenericType(Type[] typeArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (Type type : typeArr) {
                builder.add((ImmutableList.Builder) usedInGenericType(type));
            }
            return builder.build();
        }

        public abstract Type usedInGenericType(Type type);

        /* synthetic */ JavaVersion(C8172a c8172a) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> argumentsList;
        @CheckForNull
        private final Type ownerType;
        private final Class<?> rawType;

        public ParameterizedTypeImpl(@CheckForNull Type type, Class<?> cls, Type[] typeArr) {
            boolean z;
            Preconditions.checkNotNull(cls);
            if (typeArr.length == cls.getTypeParameters().length) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            Types.m39714f(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = JavaVersion.CURRENT.usedInGenericType(typeArr);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!getRawType().equals(parameterizedType.getRawType()) || !com.google.common.base.Objects.equal(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Types.m39702r(this.argumentsList);
        }

        @Override // java.lang.reflect.ParameterizedType
        @CheckForNull
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            int hashCode;
            Type type = this.ownerType;
            if (type == null) {
                hashCode = 0;
            } else {
                hashCode = type.hashCode();
            }
            return (hashCode ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.ownerType != null) {
                JavaVersion javaVersion = JavaVersion.CURRENT;
                if (javaVersion.jdkTypeDuplicatesOwnerName()) {
                    sb.append(javaVersion.typeName(this.ownerType));
                    sb.append('.');
                }
            }
            sb.append(this.rawType.getName());
            sb.append(Typography.less);
            Joiner joiner = Types.f54137a;
            ImmutableList<Type> immutableList = this.argumentsList;
            final JavaVersion javaVersion2 = JavaVersion.CURRENT;
            Objects.requireNonNull(javaVersion2);
            sb.append(joiner.join(Iterables.transform(immutableList, new Function() { // from class: com.google.common.reflect.a
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return javaVersion2.typeName((Type) obj);
                }
            })));
            sb.append(Typography.greater);
            return sb.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> lowerBounds;
        private final ImmutableList<Type> upperBounds;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.m39714f(typeArr, "lower bound for wildcard");
            Types.m39714f(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.CURRENT;
            this.lowerBounds = javaVersion.usedInGenericType(typeArr);
            this.upperBounds = javaVersion.usedInGenericType(typeArr2);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            if (!this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.upperBounds.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                return false;
            }
            return true;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return Types.m39702r(this.lowerBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Types.m39702r(this.upperBounds);
        }

        public int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(CallerData.f39639NA);
            UnmodifiableIterator<Type> it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                sb.append(" super ");
                sb.append(JavaVersion.CURRENT.typeName(it.next()));
            }
            for (Type type : Types.m39713g(this.upperBounds)) {
                sb.append(" extends ");
                sb.append(JavaVersion.CURRENT.typeName(type));
            }
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.reflect.Types$a */
    /* loaded from: classes4.dex */
    public class C8172a extends AbstractC20222hW1 {

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f54138b;

        public C8172a(AtomicReference atomicReference) {
            this.f54138b = atomicReference;
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: b */
        public void mo30866b(Class cls) {
            this.f54138b.set(cls.getComponentType());
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: c */
        public void mo30865c(GenericArrayType genericArrayType) {
            this.f54138b.set(genericArrayType.getGenericComponentType());
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: e */
        public void mo30863e(TypeVariable typeVariable) {
            this.f54138b.set(Types.m39704p(typeVariable.getBounds()));
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: f */
        public void mo30862f(WildcardType wildcardType) {
            this.f54138b.set(Types.m39704p(wildcardType.getUpperBounds()));
        }
    }

    /* renamed from: com.google.common.reflect.Types$b */
    /* loaded from: classes4.dex */
    public static final class C8173b {

        /* renamed from: a */
        public static final boolean f54139a = !C8173b.class.getTypeParameters()[0].equals(Types.m39709k(C8173b.class, "X", new Type[0]));
    }

    /* renamed from: com.google.common.reflect.Types$c */
    /* loaded from: classes4.dex */
    public static final class C8174c {

        /* renamed from: a */
        public final GenericDeclaration f54140a;

        /* renamed from: b */
        public final String f54141b;

        /* renamed from: c */
        public final ImmutableList f54142c;

        public C8174c(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
            Types.m39714f(typeArr, "bound for type variable");
            this.f54140a = (GenericDeclaration) Preconditions.checkNotNull(genericDeclaration);
            this.f54141b = (String) Preconditions.checkNotNull(str);
            this.f54142c = ImmutableList.copyOf(typeArr);
        }

        /* renamed from: a */
        public GenericDeclaration m39700a() {
            return this.f54140a;
        }

        /* renamed from: b */
        public String m39699b() {
            return this.f54141b;
        }

        public boolean equals(Object obj) {
            if (C8173b.f54139a) {
                if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof C8175d)) {
                    C8174c c8174c = ((C8175d) Proxy.getInvocationHandler(obj)).f54144a;
                    if (this.f54141b.equals(c8174c.m39699b()) && this.f54140a.equals(c8174c.m39700a()) && this.f54142c.equals(c8174c.f54142c)) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (this.f54141b.equals(typeVariable.getName()) && this.f54140a.equals(typeVariable.getGenericDeclaration())) {
                    return true;
                }
                return false;
            }
        }

        public int hashCode() {
            return this.f54140a.hashCode() ^ this.f54141b.hashCode();
        }

        public String toString() {
            return this.f54141b;
        }
    }

    /* renamed from: com.google.common.reflect.Types$d */
    /* loaded from: classes4.dex */
    public static final class C8175d implements InvocationHandler {

        /* renamed from: b */
        public static final ImmutableMap f54143b;

        /* renamed from: a */
        public final C8174c f54144a;

        static {
            Method[] methods;
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (Method method : C8174c.class.getMethods()) {
                if (method.getDeclaringClass().equals(C8174c.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.put(method.getName(), method);
                }
            }
            f54143b = builder.buildKeepingLast();
        }

        public C8175d(C8174c c8174c) {
            this.f54144a = c8174c;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Method method2 = (Method) f54143b.get(name);
            if (method2 != null) {
                try {
                    return method2.invoke(this.f54144a, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            }
            throw new UnsupportedOperationException(name);
        }
    }

    /* renamed from: f */
    public static void m39714f(Type[] typeArr, String str) {
        Class cls;
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Preconditions.checkArgument(!cls.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    /* renamed from: g */
    public static Iterable m39713g(Iterable iterable) {
        return Iterables.filter(iterable, Predicates.not(Predicates.equalTo(Object.class)));
    }

    /* renamed from: h */
    public static Class m39712h(Class cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: i */
    public static Type m39711i(Type type) {
        Preconditions.checkNotNull(type);
        AtomicReference atomicReference = new AtomicReference();
        new C8172a(atomicReference).m30867a(type);
        return (Type) atomicReference.get();
    }

    /* renamed from: j */
    public static Type m39710j(Type type) {
        boolean z;
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            boolean z2 = true;
            if (lowerBounds.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Wildcard cannot have more than one lower bounds.");
            if (lowerBounds.length == 1) {
                return m39703q(m39710j(lowerBounds[0]));
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length != 1) {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "Wildcard should have only one upper bound.");
            return m39705o(m39710j(upperBounds[0]));
        }
        return JavaVersion.CURRENT.newArrayType(type);
    }

    /* renamed from: k */
    public static TypeVariable m39709k(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return m39706n(genericDeclaration, str, typeArr);
    }

    /* renamed from: l */
    public static ParameterizedType m39708l(Class cls, Type... typeArr) {
        return new ParameterizedTypeImpl(ClassOwnership.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
    }

    /* renamed from: m */
    public static ParameterizedType m39707m(Type type, Class cls, Type... typeArr) {
        boolean z;
        if (type == null) {
            return m39708l(cls, typeArr);
        }
        Preconditions.checkNotNull(typeArr);
        if (cls.getEnclosingClass() != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    /* renamed from: n */
    public static TypeVariable m39706n(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        return (TypeVariable) Reflection.newProxy(TypeVariable.class, new C8175d(new C8174c(genericDeclaration, str, typeArr)));
    }

    /* renamed from: o */
    public static WildcardType m39705o(Type type) {
        return new WildcardTypeImpl(new Type[0], new Type[]{type});
    }

    /* renamed from: p */
    public static Type m39704p(Type[] typeArr) {
        for (Type type : typeArr) {
            Type m39711i = m39711i(type);
            if (m39711i != null) {
                if (m39711i instanceof Class) {
                    Class cls = (Class) m39711i;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m39705o(m39711i);
            }
        }
        return null;
    }

    /* renamed from: q */
    public static WildcardType m39703q(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, new Type[]{Object.class});
    }

    /* renamed from: r */
    public static Type[] m39702r(Collection collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    /* renamed from: s */
    public static String m39701s(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
