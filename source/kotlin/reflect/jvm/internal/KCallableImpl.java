package kotlin.reflect.jvm.internal;

import androidx.core.app.NotificationCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u00028\u00002\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0013\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR.\u0010#\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020  !*\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R.\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f !*\n\u0012\u0004\u0012\u00020\f\u0018\u00010$0$0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\"\u0010'\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010&0&0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R.\u0010)\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( !*\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R2\u0010+\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 !*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u0018\u0010/\u001a\u0006\u0012\u0002\b\u00030,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020 0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010@\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010:R\u0016\u0010G\u001a\u0004\u0018\u00010D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u00108R\u0014\u0010I\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u00108R\u0014\u0010J\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u00108R\u0014\u0010K\u001a\u0002068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bK\u00108R\u0014\u0010O\u001a\u00020L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, m28850d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "<init>", "()V", "", "", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/reflect/KParameter;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "continuationArgument", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callDefaultMethod", "d", "()[Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/reflect/KType;", "type", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlin/reflect/KType;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", OperatorName.CURVE_TO, "()Ljava/lang/reflect/Type;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "_annotations", "Ljava/util/ArrayList;", "_parameters", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "_typeParameters", "e", "_absentArguments", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getDefaultCaller", "defaultCaller", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "isBound", "()Z", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n+ 2 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,243:1\n224#2,5:244\n224#2,2:249\n226#2,3:252\n224#2,5:255\n224#2,5:260\n224#2,2:269\n226#2,3:273\n26#3:251\n1549#4:265\n1620#4,3:266\n37#5,2:271\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n*L\n106#1:244,5\n148#1:249,2\n148#1:252,3\n187#1:255,5\n195#1:260,5\n215#1:269,2\n215#1:273,3\n149#1:251\n201#1:265\n201#1:266,3\n216#1:271,2\n*E\n"})
/* loaded from: classes6.dex */
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {

    /* renamed from: a */
    public final ReflectProperties.LazySoftVal f68379a;

    /* renamed from: b */
    public final ReflectProperties.LazySoftVal f68380b;

    /* renamed from: c */
    public final ReflectProperties.LazySoftVal f68381c;

    /* renamed from: d */
    public final ReflectProperties.LazySoftVal f68382d;

    /* renamed from: e */
    public final ReflectProperties.LazySoftVal f68383e;

    public KCallableImpl() {
        ReflectProperties.LazySoftVal lazySoft = ReflectProperties.lazySoft(new KCallableImpl$_annotations$1(this));
        Intrinsics.checkNotNullExpressionValue(lazySoft, "lazySoft { descriptor.computeAnnotations() }");
        this.f68379a = lazySoft;
        ReflectProperties.LazySoftVal lazySoft2 = ReflectProperties.lazySoft(new KCallableImpl$_parameters$1(this));
        Intrinsics.checkNotNullExpressionValue(lazySoft2, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.f68380b = lazySoft2;
        ReflectProperties.LazySoftVal lazySoft3 = ReflectProperties.lazySoft(new KCallableImpl$_returnType$1(this));
        Intrinsics.checkNotNullExpressionValue(lazySoft3, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.f68381c = lazySoft3;
        ReflectProperties.LazySoftVal lazySoft4 = ReflectProperties.lazySoft(new KCallableImpl$_typeParameters$1(this));
        Intrinsics.checkNotNullExpressionValue(lazySoft4, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.f68382d = lazySoft4;
        ReflectProperties.LazySoftVal lazySoft5 = ReflectProperties.lazySoft(new KCallableImpl$_absentArguments$1(this));
        Intrinsics.checkNotNullExpressionValue(lazySoft5, "lazySoft {\n        val p…\n\n        arguments\n    }");
        this.f68383e = lazySoft5;
    }

    /* renamed from: a */
    public final Object m28704a(Map map) {
        Object m28703b;
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (map.containsKey(kParameter)) {
                m28703b = map.get(kParameter);
                if (m28703b == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                }
            } else if (kParameter.isOptional()) {
                m28703b = null;
            } else if (kParameter.isVararg()) {
                m28703b = m28703b(kParameter.getType());
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            arrayList.add(m28703b);
        }
        Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller != null) {
            try {
                return defaultCaller.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
    }

    /* renamed from: b */
    public final Object m28703b(KType kType) {
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) KTypesJvm.getJvmErasure(kType));
        if (javaClass.isArray()) {
            Object newInstance = Array.newInstance(javaClass.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + javaClass.getSimpleName() + ", because it is not an array type");
    }

    /* renamed from: c */
    public final Type m28702c() {
        ParameterizedType parameterizedType;
        Type type;
        WildcardType wildcardType;
        Type[] lowerBounds;
        if (!isSuspend()) {
            return null;
        }
        Object lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) getCaller().getParameterTypes());
        if (lastOrNull instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) lastOrNull;
        } else {
            parameterizedType = null;
        }
        if (parameterizedType != null) {
            type = parameterizedType.getRawType();
        } else {
            type = null;
        }
        if (!Intrinsics.areEqual(type, Continuation.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "continuationType.actualTypeArguments");
        Object single = ArraysKt___ArraysKt.single(actualTypeArguments);
        if (single instanceof WildcardType) {
            wildcardType = (WildcardType) single;
        } else {
            wildcardType = null;
        }
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) ArraysKt___ArraysKt.first(lowerBounds);
    }

    @Override // kotlin.reflect.KCallable
    public R call(@NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return (R) getCaller().call(args);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(@NotNull Map<KParameter, ? extends Object> args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (isAnnotationConstructor()) {
            return (R) m28704a(args);
        }
        return callDefaultMethod$kotlin_reflection(args, null);
    }

    public final R callDefaultMethod$kotlin_reflection(@NotNull Map<KParameter, ? extends Object> args, @Nullable Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(args, "args");
        List<KParameter> parameters = getParameters();
        boolean z = false;
        if (parameters.isEmpty()) {
            try {
                return (R) getCaller().call(isSuspend() ? new Continuation[]{continuation} : new Continuation[0]);
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] m28701d = m28701d();
        if (isSuspend()) {
            m28701d[parameters.size()] = continuation;
        }
        int i = 0;
        for (KParameter kParameter : parameters) {
            if (args.containsKey(kParameter)) {
                m28701d[kParameter.getIndex()] = args.get(kParameter);
            } else if (kParameter.isOptional()) {
                int i2 = (i / 32) + size;
                Object obj = m28701d[i2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                m28701d[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!kParameter.isVararg()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            if (kParameter.getKind() == KParameter.Kind.VALUE) {
                i++;
            }
        }
        if (!z) {
            try {
                Caller<?> caller = getCaller();
                Object[] copyOf = Arrays.copyOf(m28701d, size);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                return (R) caller.call(copyOf);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller != null) {
            try {
                return (R) defaultCaller.call(m28701d);
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
    }

    /* renamed from: d */
    public final Object[] m28701d() {
        return (Object[]) ((Object[]) this.f68383e.invoke()).clone();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        Object invoke = this.f68379a.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "_annotations()");
        return (List) invoke;
    }

    @NotNull
    public abstract Caller<?> getCaller();

    @NotNull
    public abstract KDeclarationContainerImpl getContainer();

    @Nullable
    public abstract Caller<?> getDefaultCaller();

    @NotNull
    public abstract CallableMemberDescriptor getDescriptor();

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KParameter> getParameters() {
        Object invoke = this.f68380b.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "_parameters()");
        return (List) invoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public KType getReturnType() {
        Object invoke = this.f68381c.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "_returnType()");
        return (KType) invoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        Object invoke = this.f68382d.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "_typeParameters()");
        return (List) invoke;
    }

    @Override // kotlin.reflect.KCallable
    @Nullable
    public KVisibility getVisibility() {
        DescriptorVisibility visibility = getDescriptor().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "descriptor.visibility");
        return UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        if (getDescriptor().getModality() == Modality.ABSTRACT) {
            return true;
        }
        return false;
    }

    public final boolean isAnnotationConstructor() {
        if (Intrinsics.areEqual(getName(), "<init>") && getContainer().getJClass().isAnnotation()) {
            return true;
        }
        return false;
    }

    public abstract boolean isBound();

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        if (getDescriptor().getModality() == Modality.FINAL) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        if (getDescriptor().getModality() == Modality.OPEN) {
            return true;
        }
        return false;
    }
}
