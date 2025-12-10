package th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackage;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.search.OnePostpaidRetailerSearchPackageGroupResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "kotlin.jvm.PlatformType", "response", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/search/OnePostpaidRetailerSearchPackageGroupResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository$searchPackageGroupRetailerPre2PostByRefAPI$1 */
/* loaded from: classes10.dex */
public final class C15068x608c56b0 extends Lambda implements Function1<OnePostpaidRetailerSearchPackageGroupResponse, OnePostpaidSearchPackage> {
    public static final C15068x608c56b0 INSTANCE = new C15068x608c56b0();

    public C15068x608c56b0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnePostpaidSearchPackage invoke(@NotNull OnePostpaidRetailerSearchPackageGroupResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return response.getData();
    }
}