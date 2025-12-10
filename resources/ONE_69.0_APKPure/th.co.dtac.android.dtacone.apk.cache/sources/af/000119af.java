package th.p047co.dtac.android.dtacone.manager.messaging;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p046rx.Observable;

@Metadata(m29143d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002 \u0004*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b \u0004*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\t"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "", "", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic$unsubscribeAllTopic$4 */
/* loaded from: classes7.dex */
public final class FirebaseMessagingTopic$unsubscribeAllTopic$4 extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, Observable<? extends Task<Void>>> {
    final /* synthetic */ FirebaseMessagingTopic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseMessagingTopic$unsubscribeAllTopic$4(FirebaseMessagingTopic firebaseMessagingTopic) {
        super(1);
        this.this$0 = firebaseMessagingTopic;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Observable<? extends Task<Void>> invoke(Map.Entry<? extends String, ? extends Object> entry) {
        return invoke2((Map.Entry<String, ? extends Object>) entry);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Observable<? extends Task<Void>> invoke2(Map.Entry<String, ? extends Object> entry) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = this.this$0.f85069a;
        return Observable.just(firebaseMessaging.unsubscribeFromTopic(entry.getKey()));
    }
}