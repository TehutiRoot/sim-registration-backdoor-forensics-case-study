package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes4.dex */
public abstract class Invokable<T, R> implements AnnotatedElement, Member {

    /* renamed from: c */
    public static final boolean f54097c = m39777e();

    /* renamed from: a */
    public final AccessibleObject f54098a;

    /* renamed from: b */
    public final Member f54099b;

    /* renamed from: com.google.common.reflect.Invokable$a */
    /* loaded from: classes4.dex */
    public static class C8138a extends Invokable {

        /* renamed from: d */
        public final Constructor f54100d;

        public C8138a(Constructor constructor) {
            super(constructor);
            this.f54100d = constructor;
        }

        @Override // com.google.common.reflect.Invokable
        /* renamed from: a */
        public Type[] mo39738a() {
            return this.f54100d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        /* renamed from: b */
        public Type[] mo39737b() {
            Type[] genericParameterTypes = this.f54100d.getGenericParameterTypes();
            if (genericParameterTypes.length > 0 && m39776g()) {
                Class<?>[] parameterTypes = this.f54100d.getParameterTypes();
                if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) {
                    return (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                }
                return genericParameterTypes;
            }
            return genericParameterTypes;
        }

        @Override // com.google.common.reflect.Invokable
        /* renamed from: c */
        public Type mo39736c() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            if (typeParameters.length > 0) {
                return Types.m39708l(declaringClass, typeParameters);
            }
            return declaringClass;
        }

        @Override // com.google.common.reflect.Invokable
        /* renamed from: d */
        public final Annotation[][] mo39775d() {
            return this.f54100d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        /* renamed from: f */
        public final Object mo39774f(Object obj, Object[] objArr) {
            try {
                return this.f54100d.newInstance(objArr);
            } catch (InstantiationException e) {
                throw new RuntimeException(this.f54100d + " failed.", e);
            }
        }

        /* renamed from: g */
        public final boolean m39776g() {
            Class<T> declaringClass = this.f54100d.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            if (declaringClass.getEnclosingClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.reflect.Invokable
        public final TypeVariable[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<T>>[] typeParameters2 = this.f54100d.getTypeParameters();
            TypeVariable[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            return false;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.f54100d.isVarArgs();
        }
    }

    /* renamed from: com.google.common.reflect.Invokable$b */
    /* loaded from: classes4.dex */
    public static class C8139b extends Invokable {

        /* renamed from: d */
        public final Method f54101d;

        public C8139b(Method method) {
            super(method);
            this.f54101d = method;
        }

        @Override // com.google.common.reflect.Invokable
        /* renamed from: a */
        public Type[] mo39738a() {
            return this.f54101d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        /* renamed from: b */
        public Type[] mo39737b() {
            return this.f54101d.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.Invokable
        /* renamed from: c */
        public Type mo39736c() {
            return this.f54101d.getGenericReturnType();
        }

        @Override // com.google.common.reflect.Invokable
        /* renamed from: d */
        public final Annotation[][] mo39775d() {
            return this.f54101d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        /* renamed from: f */
        public final Object mo39774f(Object obj, Object[] objArr) {
            return this.f54101d.invoke(obj, objArr);
        }

        @Override // com.google.common.reflect.Invokable
        public final TypeVariable[] getTypeParameters() {
            return this.f54101d.getTypeParameters();
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            if (!isFinal() && !isPrivate() && !isStatic() && !Modifier.isFinal(getDeclaringClass().getModifiers())) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.f54101d.isVarArgs();
        }
    }

    public Invokable(AccessibleObject accessibleObject) {
        Preconditions.checkNotNull(accessibleObject);
        this.f54098a = accessibleObject;
        this.f54099b = (Member) accessibleObject;
    }

    /* renamed from: e */
    public static boolean m39777e() {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Invokable<?, Object> from(Method method) {
        return new C8139b(method);
    }

    /* renamed from: a */
    public abstract Type[] mo39738a();

    /* renamed from: b */
    public abstract Type[] mo39737b();

    /* renamed from: c */
    public abstract Type mo39736c();

    /* renamed from: d */
    public abstract Annotation[][] mo39775d();

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Invokable)) {
            return false;
        }
        Invokable invokable = (Invokable) obj;
        if (!getOwnerType().equals(invokable.getOwnerType()) || !this.f54099b.equals(invokable.f54099b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public abstract Object mo39774f(Object obj, Object[] objArr);

    @Override // java.lang.reflect.AnnotatedElement
    @CheckForNull
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f54098a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f54098a.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f54098a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f54099b.getDeclaringClass();
    }

    public final ImmutableList<TypeToken<? extends Throwable>> getExceptionTypes() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type : mo39738a()) {
            builder.add((ImmutableList.Builder) TypeToken.m39739of(type));
        }
        return builder.build();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f54099b.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f54099b.getName();
    }

    public TypeToken<T> getOwnerType() {
        return TypeToken.m39740of((Class) getDeclaringClass());
    }

    public final ImmutableList<Parameter> getParameters() {
        Type[] mo39737b = mo39737b();
        Annotation[][] mo39775d = mo39775d();
        Object[] objArr = new Object[mo39737b.length];
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < mo39737b.length; i++) {
            builder.add((ImmutableList.Builder) new Parameter(this, i, TypeToken.m39739of(mo39737b[i]), mo39775d[i], objArr[i]));
        }
        return builder.build();
    }

    public final TypeToken<? extends R> getReturnType() {
        return (TypeToken<? extends R>) TypeToken.m39739of(mo39736c());
    }

    public abstract TypeVariable<?>[] getTypeParameters();

    public int hashCode() {
        return this.f54099b.hashCode();
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public final R invoke(@CheckForNull T t, Object... objArr) throws InvocationTargetException, IllegalAccessException {
        return (R) mo39774f(t, (Object[]) Preconditions.checkNotNull(objArr));
    }

    public final boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    public final boolean isAccessible() {
        return this.f54098a.isAccessible();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f54098a.isAnnotationPresent(cls);
    }

    public final boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    public final boolean isNative() {
        return Modifier.isNative(getModifiers());
    }

    public abstract boolean isOverridable();

    public final boolean isPackagePrivate() {
        if (!isPrivate() && !isPublic() && !isProtected()) {
            return true;
        }
        return false;
    }

    public final boolean isPrivate() {
        return Modifier.isPrivate(getModifiers());
    }

    public final boolean isProtected() {
        return Modifier.isProtected(getModifiers());
    }

    public final boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean isSynchronized() {
        return Modifier.isSynchronized(getModifiers());
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f54099b.isSynthetic();
    }

    public abstract boolean isVarArgs();

    public final <R1 extends R> Invokable<T, R1> returning(Class<R1> cls) {
        return returning(TypeToken.m39740of((Class) cls));
    }

    public final void setAccessible(boolean z) {
        this.f54098a.setAccessible(z);
    }

    public String toString() {
        return this.f54099b.toString();
    }

    public final boolean trySetAccessible() {
        try {
            this.f54098a.setAccessible(true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static <T> Invokable<T, T> from(Constructor<T> constructor) {
        return new C8138a(constructor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> Invokable<T, R1> returning(TypeToken<R1> typeToken) {
        if (typeToken.isSupertypeOf(getReturnType())) {
            return this;
        }
        throw new IllegalArgumentException("Invokable is known to return " + getReturnType() + ", not " + typeToken);
    }
}
