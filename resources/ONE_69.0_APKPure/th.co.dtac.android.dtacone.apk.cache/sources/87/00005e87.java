package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ<\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\r\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0\r8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m29142d2 = {"Landroidx/compose/runtime/reflect/ComposableMethod;", "", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "Landroidx/compose/runtime/reflect/ComposableInfo;", "composableInfo", "<init>", "(Ljava/lang/reflect/Method;Landroidx/compose/runtime/reflect/ComposableInfo;)V", "asMethod", "()Ljava/lang/reflect/Method;", "Landroidx/compose/runtime/Composer;", "composer", "instance", "", "args", "invoke", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/reflect/Method;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/reflect/ComposableInfo;", "getParameterCount", "parameterCount", "Ljava/lang/reflect/Parameter;", "getParameters", "()[Ljava/lang/reflect/Parameter;", "parameters", "Ljava/lang/Class;", "getParameterTypes", "()[Ljava/lang/Class;", "parameterTypes", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposableMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n1549#2:220\n1620#2,3:221\n1804#2,4:224\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n143#1:220\n143#1:221,3\n144#1:224,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposableMethod {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Method f28766a;

    /* renamed from: b */
    public final ComposableInfo f28767b;

    public ComposableMethod(@NotNull Method method, @NotNull ComposableInfo composableInfo) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(composableInfo, "composableInfo");
        this.f28766a = method;
        this.f28767b = composableInfo;
    }

    @NotNull
    public final Method asMethod() {
        return this.f28766a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ComposableMethod) {
            return Intrinsics.areEqual(this.f28766a, ((ComposableMethod) obj).f28766a);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.f28767b.getRealParamsCount();
    }

    @NotNull
    public final Class<?>[] getParameterTypes() {
        Class<?>[] parameterTypes = this.f28766a.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "method.parameterTypes");
        return (Class[]) ArraysKt___ArraysJvmKt.copyOfRange(parameterTypes, 0, this.f28767b.getRealParamsCount());
    }

    @NotNull
    public final Parameter[] getParameters() {
        Parameter[] parameters;
        parameters = this.f28766a.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "method.parameters");
        return (Parameter[]) ArraysKt___ArraysJvmKt.copyOfRange(parameters, 0, this.f28767b.getRealParamsCount());
    }

    public int hashCode() {
        return this.f28766a.hashCode();
    }

    @Nullable
    public final Object invoke(@NotNull Composer composer, @Nullable Object obj, @NotNull Object... args) {
        Object obj2;
        int i;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(args, "args");
        ComposableInfo composableInfo = this.f28767b;
        int component2 = composableInfo.component2();
        int component3 = composableInfo.component3();
        int component4 = composableInfo.component4();
        int length = this.f28766a.getParameterTypes().length;
        int i2 = component2 + 1;
        int i3 = component3 + i2;
        Object[] objArr = new Integer[component4];
        for (int i4 = 0; i4 < component4; i4++) {
            int i5 = i4 * 31;
            IntRange until = AbstractC11695c.until(i5, Math.min(i5 + 31, component2));
            ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                if (nextInt < args.length && args[nextInt] != null) {
                    i = 0;
                } else {
                    i = 1;
                }
                arrayList.add(Integer.valueOf(i));
            }
            int i6 = 0;
            int i7 = 0;
            for (Object obj3 : arrayList) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                i6 |= ((Number) obj3).intValue() << i7;
                i7 = i8;
            }
            objArr[i4] = Integer.valueOf(i6);
        }
        Object[] objArr2 = new Object[length];
        for (int i9 = 0; i9 < length; i9++) {
            if (i9 >= 0 && i9 < component2) {
                if (i9 >= 0 && i9 <= ArraysKt___ArraysKt.getLastIndex(args)) {
                    obj2 = args[i9];
                } else {
                    Class<?> cls = this.f28766a.getParameterTypes()[i9];
                    Intrinsics.checkNotNullExpressionValue(cls, "method.parameterTypes[idx]");
                    obj2 = ComposableMethodKt.m59896d(cls);
                }
            } else if (i9 == component2) {
                obj2 = composer;
            } else if (i9 == i2 || (component2 + 2 <= i9 && i9 < i3)) {
                obj2 = 0;
            } else if (i3 <= i9 && i9 < length) {
                obj2 = objArr[i9 - i3];
            } else {
                throw new IllegalStateException("Unexpected index".toString());
            }
            objArr2[i9] = obj2;
        }
        return this.f28766a.invoke(obj, Arrays.copyOf(objArr2, length));
    }
}