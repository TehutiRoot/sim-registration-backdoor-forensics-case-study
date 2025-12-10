package p000;

import java.util.Iterator;

/* renamed from: QM2 */
/* loaded from: classes3.dex */
public final class QM2 extends WM2 {

    /* renamed from: b */
    public final /* synthetic */ PM2 f5215b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QM2(PM2 pm2) {
        super(pm2, null);
        this.f5215b = pm2;
    }

    @Override // p000.WM2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new RM2(this.f5215b, null);
    }

    public /* synthetic */ QM2(PM2 pm2, OM2 om2) {
        this(pm2);
    }
}