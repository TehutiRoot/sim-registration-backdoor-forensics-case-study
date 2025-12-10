package th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.Data;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostGetPropositionResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "kotlin.jvm.PlatformType", "response", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostGetPropositionResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository$getPre2postGetProposition$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostRepository$getPre2postGetProposition$1 extends Lambda implements Function1<OnePre2PostGetPropositionResponse, List<? extends PropositionListItem>> {
    public static final OnePre2PostRepository$getPre2postGetProposition$1 INSTANCE = new OnePre2PostRepository$getPre2postGetProposition$1();

    public OnePre2PostRepository$getPre2postGetProposition$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<PropositionListItem> invoke(@NotNull OnePre2PostGetPropositionResponse response) {
        List<PropositionListItem> propositionList;
        Intrinsics.checkNotNullParameter(response, "response");
        Data data = response.getData();
        return (data == null || (propositionList = data.getPropositionList()) == null) ? CollectionsKt__CollectionsKt.emptyList() : propositionList;
    }
}