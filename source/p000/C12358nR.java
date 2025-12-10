package p000;

import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.NodeList;

/* renamed from: nR */
/* loaded from: classes6.dex */
public final class C12358nR implements Incomplete {

    /* renamed from: a */
    public final boolean f72223a;

    public C12358nR(boolean z) {
        this.f72223a = z;
    }

    @Override // kotlinx.coroutines.Incomplete
    public NodeList getList() {
        return null;
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return this.f72223a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (isActive()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
