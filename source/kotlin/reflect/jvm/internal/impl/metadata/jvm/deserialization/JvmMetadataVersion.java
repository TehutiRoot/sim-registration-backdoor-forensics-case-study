package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class JvmMetadataVersion extends BinaryVersion {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final JvmMetadataVersion INSTANCE;
    @JvmField
    @NotNull
    public static final JvmMetadataVersion INSTANCE_NEXT;
    @JvmField
    @NotNull
    public static final JvmMetadataVersion INVALID_VERSION;

    /* renamed from: f */
    public final boolean f69576f;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(1, 8, 0);
        INSTANCE = jvmMetadataVersion;
        INSTANCE_NEXT = jvmMetadataVersion.next();
        INVALID_VERSION = new JvmMetadataVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(@NotNull int[] versionArray, boolean z) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        this.f69576f = z;
    }

    /* renamed from: a */
    public final boolean m28025a(JvmMetadataVersion jvmMetadataVersion) {
        if ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0) {
            return false;
        }
        return !m28024b(jvmMetadataVersion);
    }

    /* renamed from: b */
    public final boolean m28024b(JvmMetadataVersion jvmMetadataVersion) {
        if (getMajor() > jvmMetadataVersion.getMajor()) {
            return true;
        }
        if (getMajor() >= jvmMetadataVersion.getMajor() && getMinor() > jvmMetadataVersion.getMinor()) {
            return true;
        }
        return false;
    }

    public final boolean isCompatible(@NotNull JvmMetadataVersion metadataVersionFromLanguageVersion) {
        Intrinsics.checkNotNullParameter(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (getMajor() == 2 && getMinor() == 0) {
            JvmMetadataVersion jvmMetadataVersion = INSTANCE;
            if (jvmMetadataVersion.getMajor() == 1 && jvmMetadataVersion.getMinor() == 8) {
                return true;
            }
        }
        return m28025a(metadataVersionFromLanguageVersion.lastSupportedVersionWithThisLanguageVersion(this.f69576f));
    }

    public final boolean isStrictSemantics() {
        return this.f69576f;
    }

    @NotNull
    public final JvmMetadataVersion lastSupportedVersionWithThisLanguageVersion(boolean z) {
        JvmMetadataVersion jvmMetadataVersion;
        if (z) {
            jvmMetadataVersion = INSTANCE;
        } else {
            jvmMetadataVersion = INSTANCE_NEXT;
        }
        if (!jvmMetadataVersion.m28024b(this)) {
            return this;
        }
        return jvmMetadataVersion;
    }

    @NotNull
    public final JvmMetadataVersion next() {
        if (getMajor() == 1 && getMinor() == 9) {
            return new JvmMetadataVersion(2, 0, 0);
        }
        return new JvmMetadataVersion(getMajor(), getMinor() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(@NotNull int... numbers) {
        this(numbers, false);
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }
}
