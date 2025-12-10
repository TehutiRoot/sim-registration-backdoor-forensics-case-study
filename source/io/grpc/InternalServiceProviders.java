package io.grpc;

import com.google.common.annotations.VisibleForTesting;
import io.grpc.ServiceProviders;
import java.util.List;

@Internal
/* loaded from: classes5.dex */
public final class InternalServiceProviders {

    /* loaded from: classes5.dex */
    public interface PriorityAccessor<T> extends ServiceProviders.PriorityAccessor<T> {
    }

    @VisibleForTesting
    public static <T> Iterable<T> getCandidatesViaHardCoded(Class<T> cls, Iterable<Class<?>> iterable) {
        return ServiceProviders.m30323b(cls, iterable);
    }

    @VisibleForTesting
    public static <T> Iterable<T> getCandidatesViaServiceLoader(Class<T> cls, ClassLoader classLoader) {
        return ServiceProviders.m30322c(cls, classLoader);
    }

    public static boolean isAndroid(ClassLoader classLoader) {
        return ServiceProviders.m30321d(classLoader);
    }

    public static <T> T load(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, PriorityAccessor<T> priorityAccessor) {
        return (T) ServiceProviders.m30320e(cls, iterable, classLoader, priorityAccessor);
    }

    public static <T> List<T> loadAll(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, PriorityAccessor<T> priorityAccessor) {
        return ServiceProviders.m30319f(cls, iterable, classLoader, priorityAccessor);
    }
}
