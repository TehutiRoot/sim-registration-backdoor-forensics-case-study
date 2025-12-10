package th.p047co.dtac.android.dtacone.manager.messaging;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p046rx.Observable;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\u0010\u0000\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, m28850d2 = {"<anonymous>", "Lrx/Observable;", "", "", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic$unsubscribeAllTopic$3 */
/* loaded from: classes7.dex */
public final class FirebaseMessagingTopic$unsubscribeAllTopic$3 extends Lambda implements Function1<Set<? extends Map.Entry<? extends String, ? extends Object>>, Observable<? extends Map.Entry<? extends String, ? extends Object>>> {
    public static final FirebaseMessagingTopic$unsubscribeAllTopic$3 INSTANCE = new FirebaseMessagingTopic$unsubscribeAllTopic$3();

    public FirebaseMessagingTopic$unsubscribeAllTopic$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Observable<? extends Map.Entry<? extends String, ? extends Object>> invoke(Set<? extends Map.Entry<? extends String, ? extends Object>> set) {
        return invoke2((Set<? extends Map.Entry<String, ? extends Object>>) set);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Observable<? extends Map.Entry<String, Object>> invoke2(@Nullable Set<? extends Map.Entry<String, ? extends Object>> set) {
        return Observable.from(set);
    }
}
