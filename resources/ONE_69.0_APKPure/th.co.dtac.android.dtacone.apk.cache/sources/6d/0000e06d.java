package kotlin.reflect.jvm.internal.impl.platform;

import ch.qos.logback.core.CoreConstants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public abstract class SimplePlatform {

    /* renamed from: a */
    public final String f69723a;

    /* renamed from: b */
    public final TargetPlatformVersion f69724b;

    @NotNull
    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    @NotNull
    public TargetPlatformVersion getTargetPlatformVersion() {
        return this.f69724b;
    }

    @NotNull
    public String toString() {
        String targetName = getTargetName();
        if (targetName.length() > 0) {
            return this.f69723a + " (" + targetName + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return this.f69723a;
    }
}