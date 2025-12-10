package th.p047co.dtac.android.dtacone.manager.messaging;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p046rx.Observable;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002 \u0004*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, m28850d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic$unsubscribeByTopicObs$2 */
/* loaded from: classes7.dex */
public final class FirebaseMessagingTopic$unsubscribeByTopicObs$2 extends Lambda implements Function1<String, Observable<? extends Task<Void>>> {
    final /* synthetic */ FirebaseMessagingTopic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseMessagingTopic$unsubscribeByTopicObs$2(FirebaseMessagingTopic firebaseMessagingTopic) {
        super(1);
        this.this$0 = firebaseMessagingTopic;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends Task<Void>> invoke(@Nullable String str) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = this.this$0.f84959a;
        if (str == null) {
            str = "";
        }
        return Observable.just(firebaseMessaging.unsubscribeFromTopic(str));
    }
}
