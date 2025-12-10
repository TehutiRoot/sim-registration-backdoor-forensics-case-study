package kotlin.reflect.jvm.internal.impl.descriptors;

import ch.qos.logback.core.joran.action.Action;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public enum ClassKind {
    CLASS(Action.CLASS_ATTRIBUTE),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");
    
    @Nullable
    private final String codeRepresentation;

    ClassKind(String str) {
        this.codeRepresentation = str;
    }

    public final boolean isSingleton() {
        if (this != OBJECT && this != ENUM_ENTRY) {
            return false;
        }
        return true;
    }
}