package p000;

import org.bson.codecs.pojo.InstanceCreator;
import org.bson.codecs.pojo.InstanceCreatorFactory;

/* renamed from: ff0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C19952ff0 implements InstanceCreatorFactory {

    /* renamed from: a */
    public final C0971Nz f61921a;

    public C19952ff0(C0971Nz c0971Nz) {
        this.f61921a = c0971Nz;
    }

    @Override // org.bson.codecs.pojo.InstanceCreatorFactory
    public InstanceCreator create() {
        return new C20125gf0(this.f61921a);
    }
}