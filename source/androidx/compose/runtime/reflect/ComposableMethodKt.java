package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0016\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u001a\u0010\u0015\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0014\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m28850d2 = {"", "realValueParams", "thisParams", PDPageLabelRange.STYLE_LETTERS_LOWER, "(II)I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)I", "Ljava/lang/reflect/Method;", "Landroidx/compose/runtime/reflect/ComposableInfo;", OperatorName.CURVE_TO, "(Ljava/lang/reflect/Method;)Landroidx/compose/runtime/reflect/ComposableInfo;", "Ljava/lang/Class;", "", "d", "(Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/compose/runtime/reflect/ComposableMethod;", "asComposableMethod", "(Ljava/lang/reflect/Method;)Landroidx/compose/runtime/reflect/ComposableMethod;", "", "methodName", "", "args", "getDeclaredComposableMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Landroidx/compose/runtime/reflect/ComposableMethod;", "runtime_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposableMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,219:1\n185#1:232\n185#1:239\n185#1:246\n1735#2,6:220\n1549#3:226\n1620#3,3:227\n1549#3:233\n1620#3,3:234\n1549#3:240\n1620#3,3:241\n1549#3:247\n1620#3,3:248\n37#4,2:230\n37#4,2:237\n37#4,2:244\n37#4,2:251\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n201#1:232\n210#1:239\n211#1:246\n57#1:220,6\n185#1:226\n185#1:227,3\n201#1:233\n201#1:234,3\n210#1:240\n210#1:241,3\n211#1:247\n211#1:248,3\n185#1:230,2\n201#1:237,2\n210#1:244,2\n211#1:251,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposableMethodKt {
    /* renamed from: a */
    public static final int m59949a(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil((i + i2) / 10.0d);
    }

    @Nullable
    public static final ComposableMethod asComposableMethod(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        ComposableInfo m59947c = m59947c(method);
        if (m59947c.isComposable()) {
            return new ComposableMethod(method, m59947c);
        }
        return null;
    }

    /* renamed from: b */
    public static final int m59948b(int i) {
        return (int) Math.ceil(i / 31.0d);
    }

    /* renamed from: c */
    public static final ComposableInfo m59947c(Method method) {
        int i;
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "parameterTypes");
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (Intrinsics.areEqual(parameterTypes[length], Composer.class)) {
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        length = -1;
        boolean z = false;
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int m59949a = m59949a(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i3 = length + 1 + m59949a;
        int length2 = method.getParameterTypes().length;
        if (length2 != i3) {
            i = m59948b(length);
        } else {
            i = 0;
        }
        if (i3 + i == length2) {
            z = true;
        }
        return new ComposableInfo(z, length, m59949a, i);
    }

    /* renamed from: d */
    public static final Object m59946d(Class cls) {
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

    @NotNull
    public static final ComposableMethod getDeclaredComposableMethod(@NotNull Class<?> cls, @NotNull String methodName, @NotNull Class<?>... args) throws NoSuchMethodException {
        Method method;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(args, "args");
        int m59949a = m59949a(args.length, 0);
        try {
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            spreadBuilder.addSpread(args);
            spreadBuilder.add(Composer.class);
            Class cls2 = Integer.TYPE;
            IntRange until = AbstractC11719c.until(0, m59949a);
            ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                arrayList.add(cls2);
            }
            spreadBuilder.addSpread(arrayList.toArray(new Class[0]));
            method = cls.getDeclaredMethod(methodName, (Class[]) spreadBuilder.toArray(new Class[spreadBuilder.size()]));
        } catch (ReflectiveOperationException unused) {
            int m59948b = m59948b(args.length);
            try {
                SpreadBuilder spreadBuilder2 = new SpreadBuilder(4);
                spreadBuilder2.addSpread(args);
                spreadBuilder2.add(Composer.class);
                Class cls3 = Integer.TYPE;
                IntRange until2 = AbstractC11719c.until(0, m59949a);
                ArrayList arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(until2, 10));
                Iterator<Integer> it2 = until2.iterator();
                while (it2.hasNext()) {
                    ((IntIterator) it2).nextInt();
                    arrayList2.add(cls3);
                }
                spreadBuilder2.addSpread(arrayList2.toArray(new Class[0]));
                Class cls4 = Integer.TYPE;
                IntRange until3 = AbstractC11719c.until(0, m59948b);
                ArrayList arrayList3 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(until3, 10));
                Iterator<Integer> it3 = until3.iterator();
                while (it3.hasNext()) {
                    ((IntIterator) it3).nextInt();
                    arrayList3.add(cls4);
                }
                spreadBuilder2.addSpread(arrayList3.toArray(new Class[0]));
                method = cls.getDeclaredMethod(methodName, (Class[]) spreadBuilder2.toArray(new Class[spreadBuilder2.size()]));
            } catch (ReflectiveOperationException unused2) {
                method = null;
            }
        }
        if (method != null) {
            ComposableMethod asComposableMethod = asComposableMethod(method);
            Intrinsics.checkNotNull(asComposableMethod);
            return asComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + methodName);
    }
}
