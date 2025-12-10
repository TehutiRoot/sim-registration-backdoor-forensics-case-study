package p000;

import com.bumptech.glide.util.Util;
import java.util.Queue;

/* renamed from: Ka */
/* loaded from: classes3.dex */
public abstract class AbstractC0748Ka {

    /* renamed from: a */
    public final Queue f3220a = Util.createQueue(20);

    /* renamed from: a */
    public abstract InterfaceC18444Sk1 mo50391a();

    /* renamed from: b */
    public InterfaceC18444Sk1 m67608b() {
        InterfaceC18444Sk1 interfaceC18444Sk1 = (InterfaceC18444Sk1) this.f3220a.poll();
        if (interfaceC18444Sk1 == null) {
            return mo50391a();
        }
        return interfaceC18444Sk1;
    }

    /* renamed from: c */
    public void m67607c(InterfaceC18444Sk1 interfaceC18444Sk1) {
        if (this.f3220a.size() < 20) {
            this.f3220a.offer(interfaceC18444Sk1);
        }
    }
}
