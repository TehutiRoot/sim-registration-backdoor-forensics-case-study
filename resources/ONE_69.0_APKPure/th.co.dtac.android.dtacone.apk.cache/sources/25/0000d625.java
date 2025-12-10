package io.realm.kotlin;

import ch.qos.logback.core.CoreConstants;
import io.realm.BaseRealm;
import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import io.realm.internal.async.RealmThreadPoolExecutor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\u0007\u001a\u001e\u0010\b\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\t\u001a(\u0010\b\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086\b¢\u0006\u0002\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b\u001aB\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019*\u00020\u0003\u001a\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00010\u001b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m29142d2 = {"createEmbeddedObject", "T", "Lio/realm/RealmModel;", "Lio/realm/Realm;", "parentObject", "parentProperty", "", "(Lio/realm/Realm;Lio/realm/RealmModel;Ljava/lang/String;)Lio/realm/RealmModel;", "createObject", "(Lio/realm/Realm;)Lio/realm/RealmModel;", "primaryKeyValue", "", "(Lio/realm/Realm;Ljava/lang/Object;)Lio/realm/RealmModel;", "delete", "", "executeTransactionAwait", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", "transaction", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "realm", "(Lio/realm/Realm;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toflow", "Lkotlinx/coroutines/flow/Flow;", "where", "Lio/realm/RealmQuery;", "realm-kotlin-extensions_baseRelease"}, m29141k = 2, m29140mv = {1, 6, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class RealmExtensionsKt {
    public static final /* synthetic */ <T extends RealmModel> T createEmbeddedObject(Realm realm, RealmModel parentObject, String parentProperty) {
        Intrinsics.checkNotNullParameter(realm, "<this>");
        Intrinsics.checkNotNullParameter(parentObject, "parentObject");
        Intrinsics.checkNotNullParameter(parentProperty, "parentProperty");
        Intrinsics.reifiedOperationMarker(4, "T");
        T t = (T) realm.createEmbeddedObject(RealmModel.class, parentObject, parentProperty);
        Intrinsics.checkNotNullExpressionValue(t, "this.createEmbeddedObjec…ntObject, parentProperty)");
        return t;
    }

    public static final /* synthetic */ <T extends RealmModel> T createObject(Realm realm) {
        Intrinsics.checkNotNullParameter(realm, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        T t = (T) realm.createObject(RealmModel.class);
        Intrinsics.checkNotNullExpressionValue(t, "this.createObject(T::class.java)");
        return t;
    }

    public static final /* synthetic */ <T extends RealmModel> void delete(Realm realm) {
        Intrinsics.checkNotNullParameter(realm, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        realm.delete(RealmModel.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object executeTransactionAwait(@org.jetbrains.annotations.NotNull io.realm.Realm r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super io.realm.Realm, kotlin.Unit> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1
            if (r0 == 0) goto L13
            r0 = r7
            io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1 r0 = (io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1 r0 = new io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            io.realm.Realm r4 = (io.realm.Realm) r4
            kotlin.ResultKt.throwOnFailure(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2 r7 = new io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2
            r2 = 0
            r7.<init>(r4, r6, r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r5, r7, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r4.refresh()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.kotlin.RealmExtensionsKt.executeTransactionAwait(io.realm.Realm, kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object executeTransactionAwait$default(Realm realm, CoroutineContext coroutineContext, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            RealmThreadPoolExecutor WRITE_EXECUTOR = BaseRealm.WRITE_EXECUTOR;
            Intrinsics.checkNotNullExpressionValue(WRITE_EXECUTOR, "WRITE_EXECUTOR");
            coroutineContext = ExecutorsKt.from((ExecutorService) WRITE_EXECUTOR);
        }
        return executeTransactionAwait(realm, coroutineContext, function1, continuation);
    }

    @NotNull
    public static final Flow<Realm> toflow(@NotNull Realm realm) {
        Intrinsics.checkNotNullParameter(realm, "<this>");
        Flow<Realm> from = realm.getConfiguration().getFlowFactory().from(realm);
        Intrinsics.checkNotNullExpressionValue(from, "configuration.flowFactory.from(this)");
        return from;
    }

    public static final /* synthetic */ <T extends RealmModel> RealmQuery<T> where(Realm realm) {
        Intrinsics.checkNotNullParameter(realm, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        RealmQuery<T> where = realm.where(RealmModel.class);
        Intrinsics.checkNotNullExpressionValue(where, "this.where(T::class.java)");
        return where;
    }

    public static final /* synthetic */ <T extends RealmModel> T createObject(Realm realm, Object obj) {
        Intrinsics.checkNotNullParameter(realm, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        T t = (T) realm.createObject(RealmModel.class, obj);
        Intrinsics.checkNotNullExpressionValue(t, "this.createObject(T::class.java, primaryKeyValue)");
        return t;
    }
}