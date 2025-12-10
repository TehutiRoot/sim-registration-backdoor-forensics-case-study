package kotlinx.coroutines.internal;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CopyableThrowable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0082\u0010¢\u0006\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017*(\b\u0002\u0010\u0019\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001a"}, m28850d2 = {"", ExifInterface.LONGITUDE_EAST, "exception", "tryCopyException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Class;)Lkotlin/jvm/functions/Function1;", "block", "e", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "", "defaultValue", "d", "(Ljava/lang/Class;I)I", "accumulator", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "throwableFields", "Lkotlinx/coroutines/internal/CtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "ctorCache", "Ctor", "kotlinx-coroutines-core"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n11335#3:118\n11670#3,3:119\n12904#3,3:136\n1963#4,14:122\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n45#1:118\n45#1:119,3\n82#1:136,3\n63#1:122,14\n*E\n"})
/* loaded from: classes6.dex */
public final class ExceptionsConstructorKt {

    /* renamed from: a */
    public static final int f70991a = m26850d(Throwable.class, -1);

    /* renamed from: b */
    public static final CtorCache f70992b;

    static {
        CtorCache ctorCache;
        try {
            if (FastServiceLoaderKt.getANDROID_DETECTED()) {
                ctorCache = P32.f4629a;
            } else {
                ctorCache = ClassValueCtorCache.f70981a;
            }
        } catch (Throwable unused) {
            ctorCache = P32.f4629a;
        }
        f70992b = ctorCache;
    }

    /* renamed from: a */
    public static final Function1 m26853a(Class cls) {
        Object obj;
        Function1 function1;
        Pair m28844to;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = ExceptionsConstructorKt$createConstructor$nullResult$1.INSTANCE;
        if (f70991a != m26850d(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            obj = null;
            if (i >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 != 0) {
                if (length2 != 1) {
                    if (length2 != 2) {
                        m28844to = TuplesKt.m28844to(null, -1);
                    } else if (Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) {
                        m28844to = TuplesKt.m28844to(m26849e(new ExceptionsConstructorKt$createConstructor$1$1(constructor)), 3);
                    } else {
                        m28844to = TuplesKt.m28844to(null, -1);
                    }
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    if (Intrinsics.areEqual(cls2, String.class)) {
                        m28844to = TuplesKt.m28844to(m26849e(new ExceptionsConstructorKt$createConstructor$1$2(constructor)), 2);
                    } else if (Intrinsics.areEqual(cls2, Throwable.class)) {
                        m28844to = TuplesKt.m28844to(m26849e(new ExceptionsConstructorKt$createConstructor$1$3(constructor)), 1);
                    } else {
                        m28844to = TuplesKt.m28844to(null, -1);
                    }
                }
            } else {
                m28844to = TuplesKt.m28844to(m26849e(new ExceptionsConstructorKt$createConstructor$1$4(constructor)), 0);
            }
            arrayList.add(m28844to);
            i++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Pair) obj).getSecond()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((Pair) next).getSecond()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null && (function1 = (Function1) pair.getFirst()) != null) {
            return function1;
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    public static final /* synthetic */ Function1 access$createConstructor(Class cls) {
        return m26853a(cls);
    }

    /* renamed from: b */
    public static final int m26852b(Class cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    /* renamed from: c */
    public static /* synthetic */ int m26851c(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m26852b(cls, i);
    }

    /* renamed from: d */
    public static final int m26850d(Class cls, int i) {
        Integer m74087constructorimpl;
        JvmClassMappingKt.getKotlinClass(cls);
        try {
            Result.Companion companion = Result.Companion;
            m74087constructorimpl = Result.m74087constructorimpl(Integer.valueOf(m26851c(cls, 0, 1, null)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th2));
        }
        Integer valueOf = Integer.valueOf(i);
        if (Result.m74093isFailureimpl(m74087constructorimpl)) {
            m74087constructorimpl = valueOf;
        }
        return ((Number) m74087constructorimpl).intValue();
    }

    /* renamed from: e */
    public static final Function1 m26849e(Function1 function1) {
        return new ExceptionsConstructorKt$safeCtor$1(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E extends Throwable> E tryCopyException(@NotNull E e) {
        Object m74087constructorimpl;
        if (e instanceof CopyableThrowable) {
            try {
                Result.Companion companion = Result.Companion;
                m74087constructorimpl = Result.m74087constructorimpl(((CopyableThrowable) e).createCopy());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m74093isFailureimpl(m74087constructorimpl)) {
                m74087constructorimpl = null;
            }
            return (E) m74087constructorimpl;
        }
        return (E) f70992b.get(e.getClass()).invoke(e);
    }
}
