package p000;

import com.bumptech.glide.util.Util;
import java.util.Queue;

/* renamed from: Ka */
/* loaded from: classes3.dex */
public abstract class AbstractC0739Ka {

    /* renamed from: a */
    public final Queue f3354a = Util.createQueue(20);

    /* renamed from: a */
    public abstract InterfaceC18293Pl1 mo50388a();

    /* renamed from: b */
    public InterfaceC18293Pl1 m67705b() {
        InterfaceC18293Pl1 interfaceC18293Pl1 = (InterfaceC18293Pl1) this.f3354a.poll();
        if (interfaceC18293Pl1 == null) {
            return mo50388a();
        }
        return interfaceC18293Pl1;
    }

    /* renamed from: c */
    public void m67704c(InterfaceC18293Pl1 interfaceC18293Pl1) {
        if (this.f3354a.size() < 20) {
            this.f3354a.offer(interfaceC18293Pl1);
        }
    }
}