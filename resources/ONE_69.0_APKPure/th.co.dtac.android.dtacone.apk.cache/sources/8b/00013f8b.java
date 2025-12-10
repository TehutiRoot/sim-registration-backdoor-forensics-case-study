package th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.Data;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.ListStaffResponse;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.PermissionsItem;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.StaffsItem;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/ListStaffResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneStaffViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneStaffViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel$callGetListStaff$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,307:1\n1855#2:308\n766#2:309\n857#2,2:310\n1549#2:312\n1620#2,3:313\n1856#2:316\n*S KotlinDebug\n*F\n+ 1 OneStaffViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel$callGetListStaff$1\n*L\n83#1:308\n85#1:309\n85#1:310,2\n85#1:312\n85#1:313,3\n83#1:316\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel$callGetListStaff$1 */
/* loaded from: classes10.dex */
public final class OneStaffViewModel$callGetListStaff$1 extends Lambda implements Function1<ListStaffResponse, ListStaffResponse> {
    public static final OneStaffViewModel$callGetListStaff$1 INSTANCE = new OneStaffViewModel$callGetListStaff$1();

    public OneStaffViewModel$callGetListStaff$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ListStaffResponse invoke(@NotNull ListStaffResponse it) {
        List<StaffsItem> staffs;
        List<String> arrayList;
        Intrinsics.checkNotNullParameter(it, "it");
        Data data = it.getData();
        if (data != null && (staffs = data.getStaffs()) != null) {
            for (StaffsItem staffsItem : staffs) {
                List<PermissionsItem> permissions = staffsItem.getPermissions();
                if (permissions != null) {
                    ArrayList<PermissionsItem> arrayList2 = new ArrayList();
                    for (Object obj : permissions) {
                        if (AbstractC19741eO1.equals(((PermissionsItem) obj).getAllow(), "Y", true)) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(arrayList2, 10));
                    for (PermissionsItem permissionsItem : arrayList2) {
                        String name = permissionsItem.getName();
                        if (name == null) {
                            name = "";
                        }
                        arrayList3.add(name);
                    }
                    arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
                    if (arrayList != null) {
                        staffsItem.setListPermission(arrayList);
                    }
                }
                arrayList = new ArrayList<>();
                staffsItem.setListPermission(arrayList);
            }
        }
        return it;
    }
}