package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;

/* renamed from: h82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20161h82 extends AbstractRunnableC20849l82 {

    /* renamed from: b */
    public final ArrayList f62411b;

    /* renamed from: c */
    public final /* synthetic */ zaaw f62412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20161h82(zaaw zaawVar, ArrayList arrayList) {
        super(zaawVar, null);
        this.f62412c = zaawVar;
        this.f62411b = arrayList;
    }

    @Override // p000.AbstractRunnableC20849l82
    /* renamed from: a */
    public final void mo26556a() {
        zabi zabiVar;
        IAccountAccessor iAccountAccessor;
        zabi zabiVar2;
        zaaw zaawVar = this.f62412c;
        zabiVar = zaawVar.f44843a;
        zabiVar.f44903n.f44880p = zaaw.m48529q(zaawVar);
        ArrayList arrayList = this.f62411b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zaaw zaawVar2 = this.f62412c;
            iAccountAccessor = zaawVar2.f44857o;
            zabiVar2 = zaawVar2.f44843a;
            ((Api.Client) arrayList.get(i)).getRemoteService(iAccountAccessor, zabiVar2.f44903n.f44880p);
        }
    }
}
