package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.layout.SubcomposeSlotReusePolicy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.layout.b */
/* loaded from: classes2.dex */
public final class C3490b implements SubcomposeSlotReusePolicy {

    /* renamed from: a */
    public static final C3490b f30258a = new C3490b();

    @Override // androidx.compose.p003ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        return false;
    }

    @Override // androidx.compose.p003ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        slotIds.clear();
    }
}