package kotlinx.serialization.internal;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&¨\u0006\u0007"}, m28850d2 = {"Lkotlinx/serialization/internal/SerializerCache;", "T", "", "get", "Lkotlinx/serialization/KSerializer;", Action.KEY_ATTRIBUTE, "Lkotlin/reflect/KClass;", "kotlinx-serialization-core"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
/* loaded from: classes6.dex */
public interface SerializerCache<T> {
    @Nullable
    KSerializer<T> get(@NotNull KClass<Object> kClass);
}
