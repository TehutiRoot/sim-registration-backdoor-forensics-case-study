package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import java.io.File;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, m28850d2 = {"<anonymous>", "Ljava/io/File;", "T"}, m28849k = 3, m28848mv = {1, 5, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$file$2 extends Lambda implements Function0<File> {
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$file$2(SingleProcessDataStore<T> singleProcessDataStore) {
        super(0);
        this.this$0 = singleProcessDataStore;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final File invoke() {
        Function0 function0;
        function0 = this.this$0.f34610a;
        File file = (File) function0.invoke();
        String it = file.getAbsolutePath();
        SingleProcessDataStore.Companion companion = SingleProcessDataStore.Companion;
        synchronized (companion.getActiveFilesLock$datastore_core()) {
            if (!companion.getActiveFiles$datastore_core().contains(it)) {
                Set<String> activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                activeFiles$datastore_core.add(it);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return file;
    }
}
