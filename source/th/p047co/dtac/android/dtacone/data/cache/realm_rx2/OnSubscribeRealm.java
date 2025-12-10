package th.p047co.dtac.android.dtacone.data.cache.realm_rx2;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.OnSubscribeRealm;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH¦\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/cache/realm_rx2/OnSubscribeRealm;", "T", "Lio/reactivex/ObservableOnSubscribe;", "Lio/realm/RealmConfiguration;", "configuration", "<init>", "(Lio/realm/RealmConfiguration;)V", "Lio/reactivex/ObservableEmitter;", "emitter", "", "subscribe", "(Lio/reactivex/ObservableEmitter;)V", "Lio/realm/Realm;", "realm", "get", "(Lio/realm/Realm;)Ljava/lang/Object;", "Lio/reactivex/disposables/Disposable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lio/reactivex/ObservableEmitter;)Lio/reactivex/disposables/Disposable;", "object", OperatorName.FILL_NON_ZERO, "(Ljava/lang/Object;)V", "", "e", "(Ljava/lang/Throwable;)V", "d", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/realm/RealmConfiguration;", "", "Ljava/util/List;", "emitters", "Ljava/util/concurrent/atomic/AtomicBoolean;", OperatorName.CURVE_TO, "Ljava/util/concurrent/atomic/AtomicBoolean;", "canceled", "", "Ljava/lang/Object;", "lock", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.data.cache.realm_rx2.OnSubscribeRealm */
/* loaded from: classes7.dex */
public abstract class OnSubscribeRealm<T> implements ObservableOnSubscribe<T> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RealmConfiguration f83445a;

    /* renamed from: b */
    public final List f83446b;

    /* renamed from: c */
    public final AtomicBoolean f83447c;

    /* renamed from: d */
    public final Object f83448d;

    public OnSubscribeRealm(@NotNull RealmConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f83445a = configuration;
        this.f83446b = new ArrayList();
        this.f83447c = new AtomicBoolean();
        this.f83448d = new Object();
    }

    /* renamed from: a */
    public static /* synthetic */ void m19561a(OnSubscribeRealm onSubscribeRealm, ObservableEmitter observableEmitter) {
        m19559c(onSubscribeRealm, observableEmitter);
    }

    /* renamed from: c */
    public static final void m19559c(OnSubscribeRealm this$0, ObservableEmitter emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        synchronized (this$0.f83448d) {
            try {
                this$0.f83446b.remove(emitter);
                if (this$0.f83446b.isEmpty()) {
                    this$0.f83447c.set(true);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final Disposable m19560b(final ObservableEmitter observableEmitter) {
        Disposable fromAction = Disposables.fromAction(new Action() { // from class: yK0
            {
                OnSubscribeRealm.this = this;
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                OnSubscribeRealm.m19561a(OnSubscribeRealm.this, observableEmitter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(fromAction, "fromAction {\n           …}\n            }\n        }");
        return fromAction;
    }

    /* renamed from: d */
    public final void m19558d() {
        int size = this.f83446b.size();
        for (int i = 0; i < size; i++) {
            ((ObservableEmitter) this.f83446b.get(i)).onComplete();
        }
    }

    /* renamed from: e */
    public final void m19557e(Throwable th2) {
        int size = this.f83446b.size();
        for (int i = 0; i < size; i++) {
            ((ObservableEmitter) this.f83446b.get(i)).onError(th2);
        }
    }

    /* renamed from: f */
    public final void m19556f(Object obj) {
        int size = this.f83446b.size();
        for (int i = 0; i < size; i++) {
            Intrinsics.checkNotNull(obj);
            ((ObservableEmitter) this.f83446b.get(i)).onNext(obj);
        }
    }

    public abstract T get(@Nullable Realm realm);

    /* JADX WARN: Removed duplicated region for block: B:90:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0094  */
    @Override // io.reactivex.ObservableOnSubscribe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void subscribe(@org.jetbrains.annotations.NotNull io.reactivex.ObservableEmitter<T> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "emitter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Object r0 = r6.f83448d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.f83447c     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L29
            java.util.List r2 = r6.f83446b     // Catch: java.lang.Throwable -> L26
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L29
            io.reactivex.disposables.Disposable r1 = r6.m19560b(r7)     // Catch: java.lang.Throwable -> L26
            r7.setDisposable(r1)     // Catch: java.lang.Throwable -> L26
            java.util.List r1 = r6.f83446b     // Catch: java.lang.Throwable -> L26
            r1.add(r7)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return
        L26:
            r7 = move-exception
            goto L9d
        L29:
            if (r1 == 0) goto L2d
            monitor-exit(r0)
            return
        L2d:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            java.util.List r0 = r6.f83446b
            r0.add(r7)
            io.realm.RealmConfiguration r7 = r6.f83445a
            io.realm.Realm r7 = io.realm.Realm.getInstance(r7)
            r0 = 0
            r1 = 1
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f83447c     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            boolean r3 = r3.get()     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            if (r3 != 0) goto L62
            r7.beginTransaction()     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            java.lang.Object r2 = r6.get(r7)     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            if (r2 == 0) goto L5f
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f83447c     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            boolean r3 = r3.get()     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            if (r3 != 0) goto L5f
            r7.commitTransaction()     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            goto L62
        L5b:
            r3 = move-exception
            goto L64
        L5d:
            r3 = move-exception
            goto L6c
        L5f:
            r7.cancelTransaction()     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
        L62:
            r3 = 0
            goto L7a
        L64:
            r7.cancelTransaction()
            r6.m19557e(r3)
        L6a:
            r3 = 1
            goto L7a
        L6c:
            r7.cancelTransaction()
            io.realm.exceptions.RealmException r4 = new io.realm.exceptions.RealmException
            java.lang.String r5 = "Error during transaction."
            r4.<init>(r5, r3)
            r6.m19557e(r4)
            goto L6a
        L7a:
            if (r2 == 0) goto L89
            java.util.concurrent.atomic.AtomicBoolean r4 = r6.f83447c
            boolean r4 = r4.get()
            if (r4 != 0) goto L89
            if (r3 != 0) goto L89
            r6.m19556f(r2)
        L89:
            r7.close()     // Catch: io.realm.exceptions.RealmException -> L8e
            r1 = r3
            goto L92
        L8e:
            r7 = move-exception
            r6.m19557e(r7)
        L92:
            if (r1 != 0) goto L97
            r6.m19558d()
        L97:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f83447c
            r7.set(r0)
            return
        L9d:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.data.cache.realm_rx2.OnSubscribeRealm.subscribe(io.reactivex.ObservableEmitter):void");
    }
}
