package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.layout.a */
/* loaded from: classes2.dex */
public final class C3489a implements SubcomposeSlotReusePolicy {

    /* renamed from: a */
    public final int f30257a;

    public C3489a(int i) {
        this.f30257a = i;
    }

    @Override // androidx.compose.p003ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        return true;
    }

    @Override // androidx.compose.p003ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        if (slotIds.size() > this.f30257a) {
            Iterator<Object> it = slotIds.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                i++;
                if (i > this.f30257a) {
                    it.remove();
                }
            }
        }
    }
}