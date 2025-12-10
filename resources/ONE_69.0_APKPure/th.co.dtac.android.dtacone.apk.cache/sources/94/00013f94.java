package th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/OneStaffDetailResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneStaffViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneStaffViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel$callGetStaffPermission$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1549#2:308\n1620#2,3:309\n1#3:312\n*S KotlinDebug\n*F\n+ 1 OneStaffViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel$callGetStaffPermission$1\n*L\n258#1:308\n258#1:309,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel$callGetStaffPermission$1 */
/* loaded from: classes10.dex */
public final class OneStaffViewModel$callGetStaffPermission$1 extends Lambda implements Function1<OneStaffDetailResponse, OneStaffDetailResponse> {
    final /* synthetic */ OneStaffViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffViewModel$callGetStaffPermission$1(OneStaffViewModel oneStaffViewModel) {
        super(1);
        this.this$0 = oneStaffViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r2 == null) goto L20;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse invoke(@org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse r6) {
        /*
            r5 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            th.co.dtac.android.dtacone.view.appOne.staff.model.detail.Data r0 = r6.getData()
            java.lang.String r1 = ""
            if (r0 != 0) goto Le
            goto L50
        Le:
            th.co.dtac.android.dtacone.view.appOne.staff.model.detail.Data r2 = r6.getData()
            if (r2 == 0) goto L48
            java.util.List r2 = r2.getPermissions()
            if (r2 == 0) goto L48
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.AbstractC10172es.collectionSizeOrDefault(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r2.next()
            th.co.dtac.android.dtacone.view.appOne.staff.model.detail.PermissionsItem r4 = (th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.PermissionsItem) r4
            java.lang.String r4 = r4.getName()
            if (r4 != 0) goto L3e
            r4 = r1
        L3e:
            r3.add(r4)
            goto L2b
        L42:
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.toMutableList(r3)
            if (r2 != 0) goto L4d
        L48:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L4d:
            r0.setListPermission(r2)
        L50:
            th.co.dtac.android.dtacone.view.appOne.staff.model.detail.Data r0 = r6.getData()
            if (r0 == 0) goto L6d
            th.co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel r2 = r5.this$0
            java.lang.String r3 = r0.getUserId()
            if (r3 == 0) goto L6a
            th.co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository r2 = th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel.access$getRepository$p(r2)
            java.lang.String r2 = r2.decryptCBC(r3)
            if (r2 != 0) goto L69
            goto L6a
        L69:
            r1 = r2
        L6a:
            r0.setMobileNumber(r1)
        L6d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel$callGetStaffPermission$1.invoke(th.co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse):th.co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse");
    }
}