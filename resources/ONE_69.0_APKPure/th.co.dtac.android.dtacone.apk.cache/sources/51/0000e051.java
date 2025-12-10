package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class JvmFlags {
    @NotNull
    public static final JvmFlags INSTANCE = new JvmFlags();

    /* renamed from: a */
    public static final Flags.BooleanFlagField f69603a = Flags.FlagField.booleanFirst();

    /* renamed from: b */
    public static final Flags.BooleanFlagField f69604b;

    /* renamed from: c */
    public static final Flags.BooleanFlagField f69605c;

    static {
        Flags.BooleanFlagField booleanFirst = Flags.FlagField.booleanFirst();
        f69604b = booleanFirst;
        f69605c = Flags.FlagField.booleanAfter(booleanFirst);
    }

    public final Flags.BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return f69603a;
    }
}