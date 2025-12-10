package p000;

import org.bson.codecs.pojo.InstanceCreator;
import org.bson.codecs.pojo.InstanceCreatorFactory;

/* renamed from: Ze0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18873Ze0 implements InstanceCreatorFactory {

    /* renamed from: a */
    public final C0982Nz f8088a;

    public C18873Ze0(C0982Nz c0982Nz) {
        this.f8088a = c0982Nz;
    }

    @Override // org.bson.codecs.pojo.InstanceCreatorFactory
    public InstanceCreator create() {
        return new C19035af0(this.f8088a);
    }
}
