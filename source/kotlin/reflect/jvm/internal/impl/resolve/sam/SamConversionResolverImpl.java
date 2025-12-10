package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {

    /* renamed from: a */
    public final Iterable f69929a;

    /* renamed from: b */
    public final CacheWithNullableValues f69930b;

    public SamConversionResolverImpl(@NotNull StorageManager storageManager, @NotNull Iterable<? extends Object> samWithReceiverResolvers) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f69929a = samWithReceiverResolvers;
        this.f69930b = storageManager.createCacheWithNullableValues();
    }
}
