package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public interface SourceFile {
    public static final SourceFile NO_SOURCE_FILE = new C11736a();

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.SourceFile$a */
    /* loaded from: classes6.dex */
    public static class C11736a implements SourceFile {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceFile
        public String getName() {
            return null;
        }
    }

    @Nullable
    String getName();
}