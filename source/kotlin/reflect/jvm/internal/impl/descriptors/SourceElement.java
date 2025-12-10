package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface SourceElement {
    public static final SourceElement NO_SOURCE = new C11759a();

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.SourceElement$a */
    /* loaded from: classes6.dex */
    public static class C11759a implements SourceElement {
        /* renamed from: a */
        public static /* synthetic */ void m28554a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        public SourceFile getContainingFile() {
            SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
            if (sourceFile == null) {
                m28554a(0);
            }
            return sourceFile;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    @NotNull
    SourceFile getContainingFile();
}
