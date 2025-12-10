package p000;

import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.NodeList;

/* renamed from: rR */
/* loaded from: classes6.dex */
public final class C13252rR implements Incomplete {

    /* renamed from: a */
    public final boolean f77511a;

    public C13252rR(boolean z) {
        this.f77511a = z;
    }

    @Override // kotlinx.coroutines.Incomplete
    public NodeList getList() {
        return null;
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return this.f77511a;
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