package th.p047co.dtac.android.dtacone.manager.messaging;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p046rx.Observable;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;
import th.p047co.dtac.android.dtacone.model.messaging.FirebaseSubscribeTopic;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/messaging/FirebaseMessagingTopic;", "", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "rtrRepository", "<init>", "(Lcom/google/firebase/messaging/FirebaseMessaging;Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;)V", "", "topic", "", "subscribe", "(Ljava/lang/String;)V", "Lrx/Observable;", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "unsubscribeByTopicObs", "(Ljava/lang/String;)Lrx/Observable;", "unsubscribeAllTopic", "()Lrx/Observable;", "unsubscribe", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/messaging/FirebaseMessaging;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "kotlin.jvm.PlatformType", OperatorName.CURVE_TO, "Ljava/lang/String;", "TAG", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFirebaseMessagingTopic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseMessagingTopic.kt\nth/co/dtac/android/dtacone/manager/messaging/FirebaseMessagingTopic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic */
/* loaded from: classes7.dex */
public class FirebaseMessagingTopic {
    public static final int $stable = 8;

    /* renamed from: a */
    public final FirebaseMessaging f84959a;

    /* renamed from: b */
    public final RtrRepository f84960b;

    /* renamed from: c */
    public final String f84961c;

    @Inject
    public FirebaseMessagingTopic(@NotNull FirebaseMessaging firebaseMessaging, @NotNull RtrRepository rtrRepository) {
        Intrinsics.checkNotNullParameter(firebaseMessaging, "firebaseMessaging");
        Intrinsics.checkNotNullParameter(rtrRepository, "rtrRepository");
        this.f84959a = firebaseMessaging;
        this.f84960b = rtrRepository;
        this.f84961c = FirebaseMessagingTopic.class.getSimpleName();
    }

    /* renamed from: a */
    public static /* synthetic */ Set m19270a(Function1 function1, Object obj) {
        return m19260k(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m19269b(Function1 function1, Object obj) {
        return m19256o(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19268c(Function1 function1, Object obj) {
        m19254q(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m19265f(FirebaseMessagingTopic firebaseMessagingTopic) {
        m19257n(firebaseMessagingTopic);
    }

    /* renamed from: g */
    public static /* synthetic */ void m19264g(FirebaseMessagingTopic firebaseMessagingTopic, String str) {
        m19253r(firebaseMessagingTopic, str);
    }

    /* renamed from: i */
    public static /* synthetic */ Boolean m19262i(Function1 function1, Object obj) {
        return m19261j(function1, obj);
    }

    /* renamed from: j */
    public static final Boolean m19261j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final Set m19260k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Set) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final Observable m19259l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Observable) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final Observable m19258m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Observable) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m19257n(FirebaseMessagingTopic this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.f84961c;
    }

    /* renamed from: o */
    public static final Boolean m19256o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final Observable m19255p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Observable) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m19254q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m19253r(FirebaseMessagingTopic this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str2 = this$0.f84961c;
        StringBuilder sb = new StringBuilder();
        sb.append("unsubscribe: ");
        sb.append(str);
    }

    public final void subscribe(@Nullable String str) {
        if (str != null && str.length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("subscribe: ");
            sb.append(str);
            if (str != null) {
                this.f84959a.subscribeToTopic(str);
            }
        }
    }

    public final void unsubscribe(@Nullable String str) {
        if (str != null && str.length() != 0) {
            FirebaseMessaging firebaseMessaging = this.f84959a;
            if (str == null) {
                str = "";
            }
            firebaseMessaging.unsubscribeFromTopic(str);
        }
    }

    @NotNull
    public final Observable<Task<Void>> unsubscribeAllTopic() {
        Observable<FirebaseSubscribeTopic> allTopicSubscribe = this.f84960b.getAllTopicSubscribe();
        final FirebaseMessagingTopic$unsubscribeAllTopic$1 firebaseMessagingTopic$unsubscribeAllTopic$1 = FirebaseMessagingTopic$unsubscribeAllTopic$1.INSTANCE;
        Observable<FirebaseSubscribeTopic> filter = allTopicSubscribe.filter(new Func1() { // from class: W10
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return FirebaseMessagingTopic.m19262i(firebaseMessagingTopic$unsubscribeAllTopic$1, obj);
            }
        });
        final FirebaseMessagingTopic$unsubscribeAllTopic$2 firebaseMessagingTopic$unsubscribeAllTopic$2 = FirebaseMessagingTopic$unsubscribeAllTopic$2.INSTANCE;
        Observable<R> map = filter.map(new Func1() { // from class: X10
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return FirebaseMessagingTopic.m19270a(firebaseMessagingTopic$unsubscribeAllTopic$2, obj);
            }
        });
        final FirebaseMessagingTopic$unsubscribeAllTopic$3 firebaseMessagingTopic$unsubscribeAllTopic$3 = FirebaseMessagingTopic$unsubscribeAllTopic$3.INSTANCE;
        Observable flatMap = map.flatMap(new Func1() { // from class: Y10
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19259l;
                m19259l = FirebaseMessagingTopic.m19259l(Function1.this, obj);
                return m19259l;
            }
        });
        final FirebaseMessagingTopic$unsubscribeAllTopic$4 firebaseMessagingTopic$unsubscribeAllTopic$4 = new FirebaseMessagingTopic$unsubscribeAllTopic$4(this);
        Observable<Task<Void>> onErrorResumeNext = flatMap.flatMap(new Func1() { // from class: Z10
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19258m;
                m19258m = FirebaseMessagingTopic.m19258m(Function1.this, obj);
                return m19258m;
            }
        }).doOnCompleted(new Action0() { // from class: a20
            {
                FirebaseMessagingTopic.this = this;
            }

            @Override // p046rx.functions.Action0
            public final void call() {
                FirebaseMessagingTopic.m19265f(FirebaseMessagingTopic.this);
            }
        }).onErrorResumeNext(Observable.empty());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "fun unsubscribeAllTopic(…Observable.empty())\n    }");
        return onErrorResumeNext;
    }

    @NotNull
    public final Observable<Task<Void>> unsubscribeByTopicObs(@Nullable final String str) {
        Observable just = Observable.just(str);
        final FirebaseMessagingTopic$unsubscribeByTopicObs$1 firebaseMessagingTopic$unsubscribeByTopicObs$1 = FirebaseMessagingTopic$unsubscribeByTopicObs$1.INSTANCE;
        Observable filter = just.filter(new Func1() { // from class: S10
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return FirebaseMessagingTopic.m19269b(firebaseMessagingTopic$unsubscribeByTopicObs$1, obj);
            }
        });
        final FirebaseMessagingTopic$unsubscribeByTopicObs$2 firebaseMessagingTopic$unsubscribeByTopicObs$2 = new FirebaseMessagingTopic$unsubscribeByTopicObs$2(this);
        Observable flatMap = filter.flatMap(new Func1() { // from class: T10
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19255p;
                m19255p = FirebaseMessagingTopic.m19255p(Function1.this, obj);
                return m19255p;
            }
        });
        final FirebaseMessagingTopic$unsubscribeByTopicObs$3 firebaseMessagingTopic$unsubscribeByTopicObs$3 = new FirebaseMessagingTopic$unsubscribeByTopicObs$3(this);
        Observable<Task<Void>> doOnCompleted = flatMap.doOnError(new Action1() { // from class: U10
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                FirebaseMessagingTopic.m19268c(firebaseMessagingTopic$unsubscribeByTopicObs$3, obj);
            }
        }).doOnCompleted(new Action0() { // from class: V10
            {
                FirebaseMessagingTopic.this = this;
            }

            @Override // p046rx.functions.Action0
            public final void call() {
                FirebaseMessagingTopic.m19264g(FirebaseMessagingTopic.this, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnCompleted, "fun unsubscribeByTopicOb…bscribe: $topic\") }\n    }");
        return doOnCompleted;
    }
}
