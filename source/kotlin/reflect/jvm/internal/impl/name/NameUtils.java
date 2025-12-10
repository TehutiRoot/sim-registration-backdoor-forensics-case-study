package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class NameUtils {
    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    /* renamed from: a */
    public static final Regex f69606a = new Regex("[^\\p{L}\\p{Digit}]");

    @JvmStatic
    @NotNull
    public static final Name contextReceiverName(int i) {
        Name identifier = Name.identifier("_context_receiver_" + i);
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(\"_context_receiver_$index\")");
        return identifier;
    }

    @JvmStatic
    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f69606a.replace(name, "_");
    }
}
