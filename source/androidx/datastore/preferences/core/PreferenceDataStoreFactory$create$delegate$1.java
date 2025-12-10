package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p023io.FilesKt__UtilsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m28850d2 = {"<anonymous>", "Ljava/io/File;"}, m28849k = 3, m28848mv = {1, 5, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class PreferenceDataStoreFactory$create$delegate$1 extends Lambda implements Function0<File> {
    final /* synthetic */ Function0<File> $produceFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreFactory$create$delegate$1(Function0<? extends File> function0) {
        super(0);
        this.$produceFile = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final File invoke() {
        File invoke = this.$produceFile.invoke();
        String extension = FilesKt__UtilsKt.getExtension(invoke);
        PreferencesSerializer preferencesSerializer = PreferencesSerializer.INSTANCE;
        if (Intrinsics.areEqual(extension, preferencesSerializer.getFileExtension())) {
            return invoke;
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + preferencesSerializer.getFileExtension()).toString());
    }
}
