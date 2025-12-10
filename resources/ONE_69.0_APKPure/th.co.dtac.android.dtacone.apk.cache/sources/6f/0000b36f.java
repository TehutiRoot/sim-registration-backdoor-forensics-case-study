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
    public final Map f56709a;

    /* renamed from: b */
    public final boolean f56710b;

    /* renamed from: c */
    public final List f56711c;

    /* renamed from: com.google.gson.internal.ConstructorConstructor$a */
    /* loaded from: classes4.dex */
    public class C8683a implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new TreeSet();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$b */
    /* loaded from: classes4.dex */
    public class C8684b implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$c */
    /* loaded from: classes4.dex */
    public class C8685c implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$d */
    /* loaded from: classes4.dex */
    public class C8686d implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new ArrayList();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$e */
    /* loaded from: classes4.dex */
    public class C8687e implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new ConcurrentSkipListMap();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$f */
    /* loaded from: classes4.dex */
    public class C8688f implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$g */
    /* loaded from: classes4.dex */
    public class C8689g implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$h */
    /* loaded from: classes4.dex */
    public class C8690h implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$i */
    /* loaded from: classes4.dex */
    public class C8691i implements ObjectConstructor {
        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return new LinkedTreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$j */
    /* loaded from: classes4.dex */
    public class C8692j implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ Class f56712a;

        public C8692j(Class cls) {
            this.f56712a = cls;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            try {
                return UnsafeAllocator.INSTANCE.newInstance(this.f56712a);
            } catch (Exception e) {
                throw new RuntimeException("Unable to create instance of " + this.f56712a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$k */
    /* loaded from: classes4.dex */
    public class C8693k implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ InstanceCreator f56714a;

        /* renamed from: b */
        public final /* synthetic */ Type f56715b;

        public C8693k(InstanceCreator instanceCreator, Type type) {
            this.f56714a = instanceCreator;
            this.f56715b = type;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return this.f56714a.createInstance(this.f56715b);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$l */
    /* loaded from: classes4.dex */
    public class C8694l implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ String f56717a;

        public C8694l(String str) {
            this.f56717a = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            throw new JsonIOException(this.f56717a);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$m */
    /* loaded from: classes4.dex */
    public class C8695m implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ InstanceCreator f56719a;

        /* renamed from: b */
        public final /* synthetic */ Type f56720b;

        public C8695m(InstanceCreator instanceCreator, Type type) {
            this.f56719a = instanceCreator;
            this.f56720b = type;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            return this.f56719a.createInstance(this.f56720b);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$n */
    /* loaded from: classes4.dex */
    public class C8696n implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ String f56722a;

        public C8696n(String str) {
            this.f56722a = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            throw new JsonIOException(this.f56722a);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$o */
    /* loaded from: classes4.dex */
    public class C8697o implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ String f56724a;

        public C8697o(String str) {
            this.f56724a = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            throw new JsonIOException(this.f56724a);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$p */
    /* loaded from: classes4.dex */
    public class C8698p implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ Type f56726a;

        public C8698p(Type type) {
            this.f56726a = type;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            Type type = this.f56726a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f56726a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f56726a.toString());
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$q */
    /* loaded from: classes4.dex */
    public class C8699q implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ Type f56727a;

        public C8699q(Type type) {
            this.f56727a = type;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            Type type = this.f56727a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                throw new JsonIOException("Invalid EnumMap type: " + this.f56727a.toString());
            }
            throw new JsonIOException("Invalid EnumMap type: " + this.f56727a.toString());
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$r */
    /* loaded from: classes4.dex */
    public class C8700r implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ String f56728a;

        public C8700r(String str) {
            this.f56728a = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            throw new JsonIOException(this.f56728a);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$s */
    /* loaded from: classes4.dex */
    public class C8701s implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ String f56729a;

        public C8701s(String str) {
            this.f56729a = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            throw new JsonIOException(this.f56729a);
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$t */
    /* loaded from: classes4.dex */
    public class C8702t implements ObjectConstructor {

        /* renamed from: a */
        public final /* synthetic */ Constructor f56730a;

        public C8702t(Constructor constructor) {
            this.f56730a = constructor;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public Object construct() {
            try {
                return this.f56730a.newInstance(null);
            } catch (IllegalAccessException e) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.f56730a) + "' with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.f56730a) + "' with no args", e3.getCause());
            }
        }
    }

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map, boolean z, List<ReflectionAccessFilter> list) {
        this.f56709a = map;
        this.f56710b = z;
        this.f56711c = list;
    }

    /* renamed from: a */
    public static String m37553a(Class cls) {
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
    public static ObjectConstructor m37552b(Class cls, ReflectionAccessFilter.FilterResult filterResult) {
        String tryMakeAccessible;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            ReflectionAccessFilter.FilterResult filterResult2 = ReflectionAccessFilter.FilterResult.ALLOW;
            if (filterResult != filterResult2 && (!ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) || (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return new C8700r("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
            } else if (filterResult == filterResult2 && (tryMakeAccessible = ReflectionHelper.tryMakeAccessible(declaredConstructor)) != null) {
                return new C8701s(tryMakeAccessible);
            } else {
                return new C8702t(declaredConstructor);
            }
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static ObjectConstructor m37551c(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C8683a();
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C8684b();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C8685c();
            }
            return new C8686d();
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C8687e();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C8688f();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C8689g();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new C8690h();
            }
            return new C8691i();
        } else {
            return null;
        }
    }

    /* renamed from: d */
    public static ObjectConstructor m37550d(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new C8698p(type);
        }
        if (cls == EnumMap.class) {
            return new C8699q(type);
        }
        return null;
    }

    /* renamed from: e */
    public final ObjectConstructor m37549e(Class cls) {
        if (this.f56710b) {
            return new C8692j(cls);
        }
        String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new C8694l(str);
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        InstanceCreator instanceCreator = (InstanceCreator) this.f56709a.get(type);
        if (instanceCreator != null) {
            return new C8693k(instanceCreator, type);
        }
        InstanceCreator instanceCreator2 = (InstanceCreator) this.f56709a.get(rawType);
        if (instanceCreator2 != null) {
            return new C8695m(instanceCreator2, type);
        }
        ObjectConstructor<T> m37550d = m37550d(type, rawType);
        if (m37550d != null) {
            return m37550d;
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.f56711c, rawType);
        ObjectConstructor<T> m37552b = m37552b(rawType, filterResult);
        if (m37552b != null) {
            return m37552b;
        }
        ObjectConstructor<T> m37551c = m37551c(type, rawType);
        if (m37551c != null) {
            return m37551c;
        }
        String m37553a = m37553a(rawType);
        if (m37553a != null) {
            return new C8696n(m37553a);
        }
        if (filterResult == ReflectionAccessFilter.FilterResult.ALLOW) {
            return m37549e(rawType);
        }
        return new C8697o("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f56709a.toString();
    }
}