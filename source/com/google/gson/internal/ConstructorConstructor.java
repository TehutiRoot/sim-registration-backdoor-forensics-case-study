package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes4.dex */
public final class ConstructorConstructor {

    /* renamed from: a */
    public final Map f56697a;

    /* renamed from: b */
    public final boolean f56698b;

    /* renamed from: c */
    public final List f56699c;

    /* renamed from: com.google.gson.internal.ConstructorConstructor$a */
    /* loaded from: classes4.dex */
    public class C8694a implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new TreeSet();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$b */
    /* loaded from: classes4.dex */
    public class C8695b implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$c */
    /* loaded from: classes4.dex */
    public class C8696c implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$d */
    /* loaded from: classes4.dex */
    public class C8697d implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new ArrayList();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$e */
    /* loaded from: classes4.dex */
    public class C8698e implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new ConcurrentSkipListMap();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$f */
    /* loaded from: classes4.dex */
    public class C8699f implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$g */
    /* loaded from: classes4.dex */
    public class C8700g implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$h */
    /* loaded from: classes4.dex */
    public class C8701h implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$i */
    /* loaded from: classes4.dex */
    public class C8702i implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new LinkedTreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$j */
    /* loaded from: classes4.dex */
    public class C8703j implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ Class f56700a;

        public C8703j(Class cls) {
            this.f56700a = cls;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            try {
                return UnsafeAllocator.INSTANCE.newInstance(this.f56700a);
            } catch (Exception e) {
                throw new RuntimeException("Unable to create instance of " + this.f56700a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$k */
    /* loaded from: classes4.dex */
    public class C8704k implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ InstanceCreator f56702a;

        /* renamed from: b */
        public final /* synthetic */ Type f56703b;

        public C8704k(InstanceCreator instanceCreator, Type type) {
            this.f56702a = instanceCreator;
            this.f56703b = type;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return this.f56702a.createInstance(this.f56703b);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$l */
    /* loaded from: classes4.dex */
    public class C8705l implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ String f56705a;

        public C8705l(String str) {
            this.f56705a = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            throw new JsonIOException(this.f56705a);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$m */
    /* loaded from: classes4.dex */
    public class C8706m implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ InstanceCreator f56707a;

        /* renamed from: b */
        public final /* synthetic */ Type f56708b;

        public C8706m(InstanceCreator instanceCreator, Type type) {
            this.f56707a = instanceCreator;
            this.f56708b = type;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return this.f56707a.createInstance(this.f56708b);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$n */
    /* loaded from: classes4.dex */
    public class C8707n implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ String f56710a;

        public C8707n(String str) {
            this.f56710a = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            throw new JsonIOException(this.f56710a);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$o */
    /* loaded from: classes4.dex */
    public class C8708o implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ String f56712a;

        public C8708o(String str) {
            this.f56712a = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            throw new JsonIOException(this.f56712a);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$p */
    /* loaded from: classes4.dex */
    public class C8709p implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ Type f56714a;

        public C8709p(Type type) {
            this.f56714a = type;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            Type type = this.f56714a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f56714a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f56714a.toString());
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$q */
    /* loaded from: classes4.dex */
    public class C8710q implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ Type f56715a;

        public C8710q(Type type) {
            this.f56715a = type;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            Type type = this.f56715a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                throw new JsonIOException("Invalid EnumMap type: " + this.f56715a.toString());
            }
            throw new JsonIOException("Invalid EnumMap type: " + this.f56715a.toString());
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$r */
    /* loaded from: classes4.dex */
    public class C8711r implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ String f56716a;

        public C8711r(String str) {
            this.f56716a = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            throw new JsonIOException(this.f56716a);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$s */
    /* loaded from: classes4.dex */
    public class C8712s implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ String f56717a;

        public C8712s(String str) {
            this.f56717a = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            throw new JsonIOException(this.f56717a);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$t */
    /* loaded from: classes4.dex */
    public class C8713t implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ Constructor f56718a;

        public C8713t(Constructor constructor) {
            this.f56718a = constructor;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            try {
                return this.f56718a.newInstance(null);
            } catch (IllegalAccessException e) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.f56718a) + "' with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.f56718a) + "' with no args", e3.getCause());
            }
        }
    }

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map, boolean z, List<ReflectionAccessFilter> list) {
        this.f56697a = map;
        this.f56698b = z;
        this.f56699c = list;
    }

    /* renamed from: a */
    public static String m37561a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        } else if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + TroubleshootingGuide.createUrl("r8-abstract-class");
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public static ObjectConstructor m37560b(Class cls, ReflectionAccessFilter.FilterResult filterResult) {
        String tryMakeAccessible;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            ReflectionAccessFilter.FilterResult filterResult2 = ReflectionAccessFilter.FilterResult.ALLOW;
            if (filterResult != filterResult2 && (!ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) || (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return new C8711r("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
            } else if (filterResult == filterResult2 && (tryMakeAccessible = ReflectionHelper.tryMakeAccessible(declaredConstructor)) != null) {
                return new C8712s(tryMakeAccessible);
            } else {
                return new C8713t(declaredConstructor);
            }
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static ObjectConstructor m37559c(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C8694a();
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C8695b();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C8696c();
            }
            return new C8697d();
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C8698e();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C8699f();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C8700g();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new C8701h();
            }
            return new C8702i();
        } else {
            return null;
        }
    }

    /* renamed from: d */
    public static ObjectConstructor m37558d(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new C8709p(type);
        }
        if (cls == EnumMap.class) {
            return new C8710q(type);
        }
        return null;
    }

    /* renamed from: e */
    public final ObjectConstructor m37557e(Class cls) {
        if (this.f56698b) {
            return new C8703j(cls);
        }
        String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new C8705l(str);
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        InstanceCreator instanceCreator = (InstanceCreator) this.f56697a.get(type);
        if (instanceCreator != null) {
            return new C8704k(instanceCreator, type);
        }
        InstanceCreator instanceCreator2 = (InstanceCreator) this.f56697a.get(rawType);
        if (instanceCreator2 != null) {
            return new C8706m(instanceCreator2, type);
        }
        ObjectConstructor<T> m37558d = m37558d(type, rawType);
        if (m37558d != null) {
            return m37558d;
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.f56699c, rawType);
        ObjectConstructor<T> m37560b = m37560b(rawType, filterResult);
        if (m37560b != null) {
            return m37560b;
        }
        ObjectConstructor<T> m37559c = m37559c(type, rawType);
        if (m37559c != null) {
            return m37559c;
        }
        String m37561a = m37561a(rawType);
        if (m37561a != null) {
            return new C8707n(m37561a);
        }
        if (filterResult == ReflectionAccessFilter.FilterResult.ALLOW) {
            return m37557e(rawType);
        }
        return new C8708o("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f56697a.toString();
    }
}
