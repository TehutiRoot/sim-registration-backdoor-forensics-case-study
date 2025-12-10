package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import java.io.File;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, m28850d2 = {"<anonymous>", "", "T", "it", ""}, m28849k = 3, m28848mv = {1, 5, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$actor$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$1(SingleProcessDataStore<T> singleProcessDataStore) {
        super(1);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th2) {
        File m56287b;
        MutableStateFlow mutableStateFlow;
        if (th2 != null) {
            mutableStateFlow = this.this$0.f34617h;
            mutableStateFlow.setValue(new C19278c10(th2));
        }
        SingleProcessDataStore.Companion companion = SingleProcessDataStore.Companion;
        Object activeFilesLock$datastore_core = companion.getActiveFilesLock$datastore_core();
        SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
        synchronized (activeFilesLock$datastore_core) {
            Set<String> activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
            m56287b = singleProcessDataStore.m56287b();
            activeFiles$datastore_core.remove(m56287b.getAbsolutePath());
            Unit unit = Unit.INSTANCE;
        }
    }
}
