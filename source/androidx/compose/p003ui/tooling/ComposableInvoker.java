package androidx.compose.p003ui.tooling;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.tooling.PreviewLogger;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\t2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0015\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000e0\t\"\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001c\u001a\u0004\u0018\u00010\u0001*\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00072\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010$¨\u0006%"}, m28850d2 = {"Landroidx/compose/ui/tooling/ComposableInvoker;", "", "<init>", "()V", "", "className", "methodName", "Landroidx/compose/runtime/Composer;", "composer", "", "args", "", "invokeComposable", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)V", "Ljava/lang/Class;", "methodTypes", "actualTypes", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "([Ljava/lang/Class;[Ljava/lang/Class;)Z", "Ljava/lang/reflect/Method;", "e", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "d", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;", OperatorName.FILL_NON_ZERO, "(Ljava/lang/Class;)Ljava/lang/Object;", "instance", OperatorName.NON_STROKING_GRAY, "(Ljava/lang/reflect/Method;Ljava/lang/Object;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)Ljava/lang/Object;", "", "realValueParams", "thisParams", PDPageLabelRange.STYLE_LETTERS_LOWER, "(II)I", OperatorName.CURVE_TO, "(I)I", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Deprecated(message = "Use androidx.compose.runtime.reflect.ComposableMethodInvoker instead")
@ExperimentalComposeUiApi
@SourceDebugExtension({"SMAP\nComposableInvoker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableInvoker.kt\nandroidx/compose/ui/tooling/ComposableInvoker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n63#1:250\n11425#2:219\n11536#2,4:220\n1282#2,2:227\n11653#2,9:235\n13579#2:244\n13580#2:246\n11662#2:247\n1735#2,6:257\n1726#3,3:224\n1549#3:229\n1620#3,3:230\n1549#3:251\n1620#3,3:252\n37#4,2:233\n37#4,2:248\n37#4,2:255\n1#5:245\n*S KotlinDebug\n*F\n+ 1 ComposableInvoker.kt\nandroidx/compose/ui/tooling/ComposableInvoker\n*L\n78#1:250\n41#1:219\n41#1:220,4\n54#1:227,2\n76#1:235,9\n76#1:244\n76#1:246\n76#1:247\n122#1:257,6\n42#1:224,3\n63#1:229\n63#1:230,3\n78#1:251\n78#1:252,3\n63#1:233,2\n76#1:248,2\n78#1:255,2\n76#1:245\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.ComposableInvoker */
/* loaded from: classes2.dex */
public final class ComposableInvoker {
    public static final int $stable = 0;
    @NotNull
    public static final ComposableInvoker INSTANCE = new ComposableInvoker();

    /* renamed from: a */
    public final int m58965a(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil((i + i2) / 10.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final boolean m58964b(Class[] clsArr, Class[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        ArrayList<Boolean> arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Boolean.valueOf(clsArr[i].isAssignableFrom(clsArr2[i2])));
            i++;
            i2++;
        }
        if (!arrayList.isEmpty()) {
            for (Boolean bool : arrayList) {
                if (!bool.booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public final int m58963c(int i) {
        return (int) Math.ceil(i / 31.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.reflect.Method m58962d(java.lang.Class r9, java.lang.String r10, java.lang.Object... r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r2 = r11.length     // Catch: java.lang.ReflectiveOperationException -> L75
            int r2 = r8.m58965a(r2, r1)     // Catch: java.lang.ReflectiveOperationException -> L75
            kotlin.jvm.internal.SpreadBuilder r3 = new kotlin.jvm.internal.SpreadBuilder     // Catch: java.lang.ReflectiveOperationException -> L75
            r4 = 3
            r3.<init>(r4)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.ReflectiveOperationException -> L75
            r4.<init>()     // Catch: java.lang.ReflectiveOperationException -> L75
            int r5 = r11.length     // Catch: java.lang.ReflectiveOperationException -> L75
            r6 = 0
        L14:
            if (r6 >= r5) goto L28
            r7 = r11[r6]     // Catch: java.lang.ReflectiveOperationException -> L75
            if (r7 == 0) goto L1f
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.ReflectiveOperationException -> L75
            goto L20
        L1f:
            r7 = r0
        L20:
            if (r7 == 0) goto L25
            r4.add(r7)     // Catch: java.lang.ReflectiveOperationException -> L75
        L25:
            int r6 = r6 + 1
            goto L14
        L28:
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Object[] r11 = r4.toArray(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            r3.addSpread(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Class<androidx.compose.runtime.Composer> r11 = androidx.compose.runtime.Composer.class
            r3.add(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.ReflectiveOperationException -> L75
            kotlin.ranges.IntRange r2 = kotlin.ranges.AbstractC11719c.until(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.ReflectiveOperationException -> L75
            r5 = 10
            int r5 = p000.AbstractC10176es.collectionSizeOrDefault(r2, r5)     // Catch: java.lang.ReflectiveOperationException -> L75
            r4.<init>(r5)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ReflectiveOperationException -> L75
        L4b:
            boolean r5 = r2.hasNext()     // Catch: java.lang.ReflectiveOperationException -> L75
            if (r5 == 0) goto L5b
            r5 = r2
            kotlin.collections.IntIterator r5 = (kotlin.collections.IntIterator) r5     // Catch: java.lang.ReflectiveOperationException -> L75
            r5.nextInt()     // Catch: java.lang.ReflectiveOperationException -> L75
            r4.add(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            goto L4b
        L5b:
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Object[] r11 = r4.toArray(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            r3.addSpread(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            int r11 = r3.size()     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Object[] r11 = r3.toArray(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Class[] r11 = (java.lang.Class[]) r11     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.reflect.Method r11 = r8.m58961e(r9, r10, r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            goto Lb7
        L75:
            java.lang.reflect.Method[] r11 = r9.getDeclaredMethods()     // Catch: java.lang.ReflectiveOperationException -> Lb3
            java.lang.String r2 = "declaredMethods"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)     // Catch: java.lang.ReflectiveOperationException -> Lb3
            int r2 = r11.length     // Catch: java.lang.ReflectiveOperationException -> Lb3
            r3 = 0
        L80:
            if (r3 >= r2) goto Lb6
            r4 = r11[r3]     // Catch: java.lang.ReflectiveOperationException -> Lb3
            java.lang.String r5 = r4.getName()     // Catch: java.lang.ReflectiveOperationException -> Lb3
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r10)     // Catch: java.lang.ReflectiveOperationException -> Lb3
            if (r5 != 0) goto Lb5
            java.lang.String r5 = r4.getName()     // Catch: java.lang.ReflectiveOperationException -> Lb3
            java.lang.String r6 = "it.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> Lb3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.ReflectiveOperationException -> Lb3
            r6.<init>()     // Catch: java.lang.ReflectiveOperationException -> Lb3
            r6.append(r10)     // Catch: java.lang.ReflectiveOperationException -> Lb3
            r7 = 45
            r6.append(r7)     // Catch: java.lang.ReflectiveOperationException -> Lb3
            java.lang.String r6 = r6.toString()     // Catch: java.lang.ReflectiveOperationException -> Lb3
            r7 = 2
            boolean r5 = p000.AbstractC20204hN1.startsWith$default(r5, r6, r1, r7, r0)     // Catch: java.lang.ReflectiveOperationException -> Lb3
            if (r5 == 0) goto Lb0
            goto Lb5
        Lb0:
            int r3 = r3 + 1
            goto L80
        Lb3:
            goto Lb6
        Lb5:
            r0 = r4
        Lb6:
            r11 = r0
        Lb7:
            if (r11 == 0) goto Lba
            return r11
        Lba:
            java.lang.NoSuchMethodException r11 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = r9.getName()
            r0.append(r9)
            r9 = 46
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = r0.toString()
            r11.<init>(r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.tooling.ComposableInvoker.m58962d(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.reflect.Method");
    }

    /* renamed from: e */
    public final Method m58961e(Class cls, String str, Class... clsArr) {
        Method method;
        Class[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = declaredMethods[i];
            if (!Intrinsics.areEqual(str, method2.getName())) {
                String name = method2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "it.name");
                if (!AbstractC20204hN1.startsWith$default(name, str + '-', false, 2, null)) {
                    continue;
                    i++;
                }
            }
            ComposableInvoker composableInvoker = INSTANCE;
            Class<?>[] parameterTypes = method2.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
            if (composableInvoker.m58964b(parameterTypes, clsArr2)) {
                method = method2;
                break;
            }
            i++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    /* renamed from: f */
    public final Object m58960f(Class cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return Boolean.FALSE;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    return Float.valueOf(0.0f);
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                break;
        }
        return null;
    }

    /* renamed from: g */
    public final Object m58959g(Method method, Object obj, Composer composer, Object... objArr) {
        int i;
        int i2;
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "parameterTypes");
        int i3 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (Intrinsics.areEqual(parameterTypes[length], Composer.class)) {
                    i3 = length;
                    break;
                } else if (i4 < 0) {
                    break;
                } else {
                    length = i4;
                }
            }
        }
        if (obj != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i5 = i3 + 1;
        int m58965a = m58965a(i3, i) + i5;
        int length2 = method.getParameterTypes().length;
        if (length2 != m58965a) {
            i2 = m58963c(i3);
        } else {
            i2 = 0;
        }
        if (i2 + m58965a == length2) {
            Object[] objArr2 = new Object[length2];
            for (int i6 = 0; i6 < length2; i6++) {
                if (i6 >= 0 && i6 < i3) {
                    if (i6 >= 0 && i6 <= ArraysKt___ArraysKt.getLastIndex(objArr)) {
                        obj2 = objArr[i6];
                    } else {
                        ComposableInvoker composableInvoker = INSTANCE;
                        Class<?> cls = method.getParameterTypes()[i6];
                        Intrinsics.checkNotNullExpressionValue(cls, "parameterTypes[idx]");
                        obj2 = composableInvoker.m58960f(cls);
                    }
                } else if (i6 == i3) {
                    obj2 = composer;
                } else if (i5 <= i6 && i6 < m58965a) {
                    obj2 = 0;
                } else if (m58965a <= i6 && i6 < length2) {
                    obj2 = 2097151;
                } else {
                    throw new IllegalStateException("Unexpected index".toString());
                }
                objArr2[i6] = obj2;
            }
            return method.invoke(obj, Arrays.copyOf(objArr2, length2));
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    public final void invokeComposable(@NotNull String className, @NotNull String methodName, @NotNull Composer composer, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            Class<?> composableClass = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(composableClass, "composableClass");
            Method m58962d = m58962d(composableClass, methodName, Arrays.copyOf(args, args.length));
            m58962d.setAccessible(true);
            if (Modifier.isStatic(m58962d.getModifiers())) {
                m58959g(m58962d, null, composer, Arrays.copyOf(args, args.length));
            } else {
                m58959g(m58962d, composableClass.getConstructor(null).newInstance(null), composer, Arrays.copyOf(args, args.length));
            }
        } catch (ReflectiveOperationException e) {
            PreviewLogger.Companion companion = PreviewLogger.Companion;
            PreviewLogger.Companion.logWarning$ui_tooling_release$default(companion, "Failed to invoke Composable Method '" + className + '.' + methodName + CoreConstants.SINGLE_QUOTE_CHAR, null, 2, null);
            throw e;
        }
    }
}
