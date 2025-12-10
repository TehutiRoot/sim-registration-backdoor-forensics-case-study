package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class DeserializedDescriptorResolver$createKotlinPackagePartScope$2 extends Lambda implements Function0<Collection<? extends Name>> {
    public static final DeserializedDescriptorResolver$createKotlinPackagePartScope$2 INSTANCE = new DeserializedDescriptorResolver$createKotlinPackagePartScope$2();

    public DeserializedDescriptorResolver$createKotlinPackagePartScope$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Collection<? extends Name> invoke() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
}