package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class JvmFlags {
    @NotNull
    public static final JvmFlags INSTANCE = new JvmFlags();

    /* renamed from: a */
    public static final Flags.BooleanFlagField f69569a = Flags.FlagField.booleanFirst();

    /* renamed from: b */
    public static final Flags.BooleanFlagField f69570b;

    /* renamed from: c */
    public static final Flags.BooleanFlagField f69571c;

    static {
        Flags.BooleanFlagField booleanFirst = Flags.FlagField.booleanFirst();
        f69570b = booleanFirst;
        f69571c = Flags.FlagField.booleanAfter(booleanFirst);
    }

    public final Flags.BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return f69569a;
    }
}
