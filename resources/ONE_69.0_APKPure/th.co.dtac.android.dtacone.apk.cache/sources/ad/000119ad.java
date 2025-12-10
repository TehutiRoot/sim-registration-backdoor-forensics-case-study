package th.p047co.dtac.android.dtacone.manager.messaging;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.messaging.FirebaseRel;
import th.p047co.dtac.android.dtacone.model.messaging.FirebaseSubscribeTopic;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00012\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "", "", "", "it", "Lth/co/dtac/android/dtacone/model/messaging/FirebaseSubscribeTopic;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic$unsubscribeAllTopic$2 */
/* loaded from: classes7.dex */
public final class FirebaseMessagingTopic$unsubscribeAllTopic$2 extends Lambda implements Function1<FirebaseSubscribeTopic, Set<? extends Map.Entry<? extends String, ? extends Object>>> {
    public static final FirebaseMessagingTopic$unsubscribeAllTopic$2 INSTANCE = new FirebaseMessagingTopic$unsubscribeAllTopic$2();

    public FirebaseMessagingTopic$unsubscribeAllTopic$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Set<Map.Entry<String, Object>> invoke(FirebaseSubscribeTopic firebaseSubscribeTopic) {
        FirebaseRel rel;
        Map<String, Object> topics;
        if (firebaseSubscribeTopic == null || (rel = firebaseSubscribeTopic.getRel()) == null || (topics = rel.getTopics()) == null) {
            return null;
        }
        return topics.entrySet();
    }
}