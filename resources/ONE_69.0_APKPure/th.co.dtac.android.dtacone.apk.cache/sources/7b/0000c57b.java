package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;

/* renamed from: e92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19698e92 extends AbstractRunnableC20390i92 {

    /* renamed from: b */
    public final ArrayList f61490b;

    /* renamed from: c */
    public final /* synthetic */ zaaw f61491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19698e92(zaaw zaawVar, ArrayList arrayList) {
        super(zaawVar, null);
        this.f61491c = zaawVar;
        this.f61490b = arrayList;
    }

    @Override // p000.AbstractRunnableC20390i92
    /* renamed from: a */
    public final void mo31032a() {
        zabi zabiVar;
        IAccountAccessor iAccountAccessor;
        zabi zabiVar2;
        zaaw zaawVar = this.f61491c;
        zabiVar = zaawVar.f44855a;
        zabiVar.f44915n.f44892p = zaaw.m48526q(zaawVar);
        ArrayList arrayList = this.f61490b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zaaw zaawVar2 = this.f61491c;
            iAccountAccessor = zaawVar2.f44869o;
            zabiVar2 = zaawVar2.f44855a;
            ((Api.Client) arrayList.get(i)).getRemoteService(iAccountAccessor, zabiVar2.f44915n.f44892p);
        }
    }
}