package kotlin.reflect.full;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class Java8RepeatableContainerLoader {

    /* renamed from: a */
    public static final Java8RepeatableContainerLoader f68384a = new Java8RepeatableContainerLoader();

    /* renamed from: b */
    public static Cache f68385b;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lkotlin/reflect/full/Java8RepeatableContainerLoader$Cache;", "", "Ljava/lang/Class;", "", "repeatableClass", "Ljava/lang/reflect/Method;", "valueMethod", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Method;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Class;", "getRepeatableClass", "()Ljava/lang/Class;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/reflect/Method;", "getValueMethod", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final class Cache {

        /* renamed from: a */
        public final Class f68386a;

        /* renamed from: b */
        public final Method f68387b;

        public Cache(@Nullable Class<? extends Annotation> cls, @Nullable Method method) {
            this.f68386a = cls;
            this.f68387b = method;
        }

        @Nullable
        public final Class<? extends Annotation> getRepeatableClass() {
            return this.f68386a;
        }

        @Nullable
        public final Method getValueMethod() {
            return this.f68387b;
        }
    }

    /* renamed from: a */
    public final Cache m29009a() {
        try {
            Class<?> cls = Class.forName("java.lang.annotation.Repeatable");
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
            return new Cache(cls, cls.getMethod("value", null));
        } catch (ClassNotFoundException unused) {
            return new Cache(null, null);
        }
    }

    /* renamed from: b */
    public final Class m29008b(Class klass) {
        Annotation annotation;
        Method valueMethod;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Cache cache = f68385b;
        if (cache == null) {
            synchronized (this) {
                cache = f68385b;
                if (cache == null) {
                    cache = f68384a.m29009a();
                    f68385b = cache;
                }
            }
        }
        Class<? extends Annotation> repeatableClass = cache.getRepeatableClass();
        if (repeatableClass == null || (annotation = klass.getAnnotation(repeatableClass)) == null || (valueMethod = cache.getValueMethod()) == null) {
            return null;
        }
        Object invoke = valueMethod.invoke(annotation, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
        return (Class) invoke;
    }
}