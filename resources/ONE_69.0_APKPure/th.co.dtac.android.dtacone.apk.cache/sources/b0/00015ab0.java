package th.p047co.dtac.android.dtacone.viewmodel.postpaid_registration;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.postpaid.Tabs;
import th.p047co.dtac.android.dtacone.model.postpaid.packages.TabPackage;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/postpaid/packages/TabPackage;", "kotlin.jvm.PlatformType", "t", "Lth/co/dtac/android/dtacone/model/postpaid/Tabs;", "p", "Ljava/util/ArrayList;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.PostpaidPackageSetViewModel$getPackageSet$1 */
/* loaded from: classes9.dex */
public final class PostpaidPackageSetViewModel$getPackageSet$1 extends Lambda implements Function2<Tabs, ArrayList<Object>, TabPackage> {
    public static final PostpaidPackageSetViewModel$getPackageSet$1 INSTANCE = new PostpaidPackageSetViewModel$getPackageSet$1();

    public PostpaidPackageSetViewModel$getPackageSet$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TabPackage invoke(Tabs tabs, ArrayList<Object> p) {
        String tabName = tabs.getTabName();
        Intrinsics.checkNotNullExpressionValue(p, "p");
        return new TabPackage(tabName, p);
    }
}