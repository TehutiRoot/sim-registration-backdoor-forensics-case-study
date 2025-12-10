package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,610:1\n460#2,11:611\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n85#1:611,11\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotStateObserver$sendNotifications$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$sendNotifications$1(SnapshotStateObserver snapshotStateObserver) {
        super(0);
        this.this$0 = snapshotStateObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableVector mutableVector;
        boolean z;
        boolean m59895b;
        MutableVector mutableVector2;
        do {
            mutableVector = this.this$0.f28768f;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (mutableVector) {
                try {
                    z = snapshotStateObserver.f28765c;
                    if (!z) {
                        snapshotStateObserver.f28765c = true;
                        mutableVector2 = snapshotStateObserver.f28768f;
                        int size = mutableVector2.getSize();
                        if (size <= 0) {
                            snapshotStateObserver.f28765c = false;
                        } else {
                            Object[] content = mutableVector2.getContent();
                            int i = 0;
                            do {
                                ((SnapshotStateObserver.ObservedScopeMap) content[i]).m59884g();
                                i++;
                            } while (i < size);
                            snapshotStateObserver.f28765c = false;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m59895b = this.this$0.m59895b();
        } while (m59895b);
    }
}
