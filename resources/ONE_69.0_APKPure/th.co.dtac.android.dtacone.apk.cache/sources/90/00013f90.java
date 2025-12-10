package th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/OneStaffDetailResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneStaffViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneStaffViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel$callGetStaffDetail$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n766#2:308\n857#2,2:309\n1549#2:311\n1620#2,3:312\n1#3:315\n*S KotlinDebug\n*F\n+ 1 OneStaffViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel$callGetStaffDetail$1\n*L\n119#1:308\n119#1:309,2\n119#1:311\n119#1:312,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel$callGetStaffDetail$1 */
/* loaded from: classes10.dex */
public final class OneStaffViewModel$callGetStaffDetail$1 extends Lambda implements Function1<OneStaffDetailResponse, OneStaffDetailResponse> {
    final /* synthetic */ OneStaffViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffViewModel$callGetStaffDetail$1(OneStaffViewModel oneStaffViewModel) {
        super(1);
        this.this$0 = oneStaffViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r2 == null) goto L31;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse invoke(@org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse r9) {
        /*
            r8 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            th.co.dtac.android.dtacone.view.appOne.staff.model.detail.Data r0 = r9.getData()
            java.lang.String r1 = ""
            if (r0 != 0) goto Le
            goto L77
        Le:
            th.co.dtac.android.dtacone.view.appOne.staff.model.detail.Data r2 = r9.getData()
            if (r2 == 0) goto L6f
            java.util.List r2 = r2.getPermissions()
            if (r2 == 0) goto L6f
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r2.next()
            r5 = r4
            th.co.dtac.android.dtacone.view.appOne.staff.model.detail.PermissionsItem r5 = (th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.PermissionsItem) r5
            java.lang.String r5 = r5.getAllow()
            java.lang.String r6 = "Y"
            r7 = 1
            boolean r5 = p000.AbstractC19741eO1.equals(r5, r6, r7)
            if (r5 == 0) goto L25
            r3.add(r4)
            goto L25
        L43:
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.AbstractC10172es.collectionSizeOrDefault(r3, r4)
            r2.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L52:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r4 = r3.next()
            th.co.dtac.android.dtacone.view.appOne.staff.model.detail.PermissionsItem r4 = (th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.PermissionsItem) r4
            java.lang.String r4 = r4.getName()
            if (r4 != 0) goto L65
            r4 = r1
        L65:
            r2.add(r4)
            goto L52
        L69:
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.toMutableList(r2)
            if (r2 != 0) goto L74
        L6f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L74:
            r0.setListPermission(r2)
        L77:
            th.co.dtac.android.dtacone.view.appOne.staff.model.detail.Data r0 = r9.getData()
            if (r0 == 0) goto L94
            th.co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel r2 = r8.this$0
            java.lang.String r3 = r0.getUserId()
            if (r3 == 0) goto L91
            th.co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository r2 = th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel.access$getRepository$p(r2)
            java.lang.String r2 = r2.decryptCBC(r3)
            if (r2 != 0) goto L90
            goto L91
        L90:
            r1 = r2
        L91:
            r0.setMobileNumber(r1)
        L94:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel$callGetStaffDetail$1.invoke(th.co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse):th.co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse");
    }
}