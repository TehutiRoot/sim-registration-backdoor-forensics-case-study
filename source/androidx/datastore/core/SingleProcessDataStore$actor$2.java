package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import androidx.datastore.core.SingleProcessDataStore;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, m28850d2 = {"<anonymous>", "", "T", NotificationCompat.CATEGORY_MESSAGE, "Landroidx/datastore/core/SingleProcessDataStore$Message;", "ex", ""}, m28849k = 3, m28848mv = {1, 5, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$actor$2 extends Lambda implements Function2<SingleProcessDataStore.Message, Throwable, Unit> {
    public static final SingleProcessDataStore$actor$2 INSTANCE = new SingleProcessDataStore$actor$2();

    public SingleProcessDataStore$actor$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(SingleProcessDataStore.Message message, Throwable th2) {
        invoke2(message, th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SingleProcessDataStore.Message msg, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg instanceof SingleProcessDataStore.Message.Update) {
            CompletableDeferred ack = ((SingleProcessDataStore.Message.Update) msg).getAck();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            ack.completeExceptionally(th2);
        }
    }
}
