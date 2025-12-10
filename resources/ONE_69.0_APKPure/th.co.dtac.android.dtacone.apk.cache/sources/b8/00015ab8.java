package th.p047co.dtac.android.dtacone.viewmodel.postpaid_registration;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p046rx.subscriptions.CompositeSubscription;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Lrx/subscriptions/CompositeSubscription;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.PostpaidPackageSetViewModel$subscription$2 */
/* loaded from: classes9.dex */
public final class PostpaidPackageSetViewModel$subscription$2 extends Lambda implements Function0<CompositeSubscription> {
    public static final PostpaidPackageSetViewModel$subscription$2 INSTANCE = new PostpaidPackageSetViewModel$subscription$2();

    public PostpaidPackageSetViewModel$subscription$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CompositeSubscription invoke() {
        return new CompositeSubscription();
    }
}