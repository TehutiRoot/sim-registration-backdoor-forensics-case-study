package th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.OneCommonPackageResponse;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/OneCommonPackageResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository$oneCommonGetPackage$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostRepository$oneCommonGetPackage$1 extends Lambda implements Function1<OneCommonPackageResponse, List<? extends PriceplanListItem>> {
    public static final OnePre2PostRepository$oneCommonGetPackage$1 INSTANCE = new OnePre2PostRepository$oneCommonGetPackage$1();

    public OnePre2PostRepository$oneCommonGetPackage$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<PriceplanListItem> invoke(@NotNull OneCommonPackageResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<PriceplanListItem> data = it.getData();
        return data == null ? CollectionsKt__CollectionsKt.emptyList() : data;
    }
}