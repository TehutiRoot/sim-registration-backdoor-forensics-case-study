package p000;

import io.realm.BaseRealm;
import io.realm.RealmModel;
import io.realm.internal.OsSet;
import java.util.ArrayList;

/* renamed from: ot1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C21552ot1 extends AbstractC22835wH1 {

    /* renamed from: d */
    public final Class f76511d;

    public C21552ot1(OsSet osSet, BaseRealm baseRealm, Class cls) {
        super(osSet, baseRealm);
        this.f76511d = cls;
    }

    @Override // p000.AbstractC22835wH1
    /* renamed from: b */
    public RealmModel mo765a(int i) {
        return this.f108392b.m30098j(this.f76511d, this.f108391a.getRow(i), false, new ArrayList());
    }
}