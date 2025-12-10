package co.omise.android.extensions;

import co.omise.android.api.Client;
import co.omise.android.api.RequestListener;
import co.omise.android.models.Token;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a4\u0010\u0007\u001a\u00020\b*\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m29142d2 = {"retrieveToken", "Lco/omise/android/models/Token;", "client", "Lco/omise/android/api/Client;", "tokenID", "", "(Lco/omise/android/api/Client;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeTokenUntilChargeStatusChanged", "", "id", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lco/omise/android/api/RequestListener;", "interval", "", "timeout", "sdk_productionRelease"}, m29141k = 2, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ClientExtensionsKt {

    /* renamed from: co.omise.android.extensions.ClientExtensionsKt$a */
    /* loaded from: classes.dex */
    public static final class C5510a extends SuspendLambda implements Function2 {

        /* renamed from: a */
        int f40243a;

        /* renamed from: b */
        private /* synthetic */ Object f40244b;

        /* renamed from: c */
        final /* synthetic */ long f40245c;

        /* renamed from: d */
        final /* synthetic */ RequestListener f40246d;

        /* renamed from: e */
        final /* synthetic */ long f40247e;

        /* renamed from: f */
        final /* synthetic */ Client f40248f;

        /* renamed from: g */
        final /* synthetic */ String f40249g;

        /* renamed from: co.omise.android.extensions.ClientExtensionsKt$a$a */
        /* loaded from: classes.dex */
        public static final class C5511a extends SuspendLambda implements Function2 {

            /* renamed from: a */
            int f40250a;

            /* renamed from: b */
            final /* synthetic */ Deferred f40251b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5511a(Deferred deferred, Continuation continuation) {
                super(2, continuation);
                this.f40251b = deferred;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C5511a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C5511a(this.f40251b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                int i = this.f40250a;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Deferred deferred = this.f40251b;
                    this.f40250a = 1;
                    obj = deferred.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return obj;
            }
        }

        /* renamed from: co.omise.android.extensions.ClientExtensionsKt$a$b */
        /* loaded from: classes.dex */
        public static final class C5512b extends SuspendLambda implements Function2 {

            /* renamed from: a */
            Object f40252a;

            /* renamed from: b */
            int f40253b;

            /* renamed from: c */
            final /* synthetic */ Ref.BooleanRef f40254c;

            /* renamed from: d */
            final /* synthetic */ long f40255d;

            /* renamed from: e */
            final /* synthetic */ Ref.ObjectRef f40256e;

            /* renamed from: f */
            final /* synthetic */ Client f40257f;

            /* renamed from: g */
            final /* synthetic */ String f40258g;

            /* renamed from: h */
            final /* synthetic */ RequestListener f40259h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5512b(Ref.BooleanRef booleanRef, long j, Ref.ObjectRef objectRef, Client client, String str, RequestListener requestListener, Continuation continuation) {
                super(2, continuation);
                this.f40254c = booleanRef;
                this.f40255d = j;
                this.f40256e = objectRef;
                this.f40257f = client;
                this.f40258g = str;
                this.f40259h = requestListener;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C5512b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C5512b(this.f40254c, this.f40255d, this.f40256e, this.f40257f, this.f40258g, this.f40259h, continuation);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
                */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:20:0x004e). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    r0 = 0
                    java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
                    int r2 = r8.f40253b
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L24
                    if (r2 == r4) goto L20
                    if (r2 != r3) goto L18
                    java.lang.Object r2 = r8.f40252a
                    kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L4e
                L18:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L20:
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L3d
                L24:
                    kotlin.ResultKt.throwOnFailure(r9)
                L27:
                    kotlin.jvm.internal.Ref$BooleanRef r9 = r8.f40254c
                    boolean r2 = r9.element
                    if (r2 == 0) goto L30
                    r9.element = r0
                    goto L3d
                L30:
                    long r6 = r8.f40255d
                    r8.f40252a = r5
                    r8.f40253b = r4
                    java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
                    if (r9 != r1) goto L3d
                    return r1
                L3d:
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r8.f40256e
                    co.omise.android.api.Client r9 = r8.f40257f
                    java.lang.String r6 = r8.f40258g
                    r8.f40252a = r2
                    r8.f40253b = r3
                    java.lang.Object r9 = co.omise.android.extensions.ClientExtensionsKt.access$retrieveToken(r9, r6, r8)
                    if (r9 != r1) goto L4e
                    return r1
                L4e:
                    r2.element = r9
                    kotlin.jvm.internal.Ref$ObjectRef r9 = r8.f40256e
                    T r9 = r9.element
                    if (r9 == 0) goto L27
                    co.omise.android.models.ChargeStatus[] r9 = new co.omise.android.models.ChargeStatus[r3]
                    co.omise.android.models.ChargeStatus$Unknown r2 = co.omise.android.models.ChargeStatus.Unknown.INSTANCE
                    r9[r0] = r2
                    co.omise.android.models.ChargeStatus$Pending r2 = co.omise.android.models.ChargeStatus.Pending.INSTANCE
                    r9[r4] = r2
                    java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.listOf(r9)
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r8.f40256e
                    T r2 = r2.element
                    co.omise.android.models.Token r2 = (co.omise.android.models.Token) r2
                    if (r2 == 0) goto L71
                    co.omise.android.models.ChargeStatus r2 = r2.getChargeStatus()
                    goto L72
                L71:
                    r2 = r5
                L72:
                    boolean r9 = kotlin.collections.CollectionsKt___CollectionsKt.contains(r9, r2)
                    if (r9 != 0) goto L27
                    kotlin.jvm.internal.Ref$ObjectRef r9 = r8.f40256e
                    T r9 = r9.element
                    co.omise.android.models.Token r9 = (co.omise.android.models.Token) r9
                    if (r9 == 0) goto L87
                    co.omise.android.api.RequestListener r0 = r8.f40259h
                    r0.onRequestSucceed(r9)
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                L87:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: co.omise.android.extensions.ClientExtensionsKt.C5510a.C5512b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5510a(long j, RequestListener requestListener, long j2, Client client, String str, Continuation continuation) {
            super(2, continuation);
            this.f40245c = j;
            this.f40246d = requestListener;
            this.f40247e = j2;
            this.f40248f = client;
            this.f40249g = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5510a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5510a c5510a = new C5510a(this.f40245c, this.f40246d, this.f40247e, this.f40248f, this.f40249g, continuation);
            c5510a.f40244b = obj;
            return c5510a;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
                int r1 = r13.f40243a
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r13.f40244b
                kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
                kotlin.ResultKt.throwOnFailure(r14)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L13
                goto L6a
            L13:
                goto L5f
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.f40244b
                r3 = r14
                kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
                kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
                r14.<init>()
                kotlin.jvm.internal.Ref$BooleanRef r5 = new kotlin.jvm.internal.Ref$BooleanRef
                r5.<init>()
                r5.element = r2
                co.omise.android.extensions.ClientExtensionsKt$a$b r1 = new co.omise.android.extensions.ClientExtensionsKt$a$b
                long r6 = r13.f40247e
                co.omise.android.api.Client r9 = r13.f40248f
                java.lang.String r10 = r13.f40249g
                co.omise.android.api.RequestListener r11 = r13.f40246d
                r12 = 0
                r4 = r1
                r8 = r14
                r4.<init>(r5, r6, r8, r9, r10, r11, r12)
                r7 = 3
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = r1
                kotlinx.coroutines.Deferred r1 = kotlinx.coroutines.BuildersKt.async$default(r3, r4, r5, r6, r7, r8)
                long r3 = r13.f40245c     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5d
                co.omise.android.extensions.ClientExtensionsKt$a$a r5 = new co.omise.android.extensions.ClientExtensionsKt$a$a     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5d
                r6 = 0
                r5.<init>(r1, r6)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5d
                r13.f40244b = r14     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5d
                r13.f40243a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5d
                java.lang.Object r14 = kotlinx.coroutines.TimeoutKt.withTimeout(r3, r5, r13)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5d
                if (r14 != r0) goto L6a
                return r0
            L5d:
                r0 = r14
            L5f:
                T r14 = r0.element
                co.omise.android.models.Token r14 = (co.omise.android.models.Token) r14
                if (r14 == 0) goto L6a
                co.omise.android.api.RequestListener r0 = r13.f40246d
                r0.onRequestSucceed(r14)
            L6a:
                kotlin.Unit r14 = kotlin.Unit.INSTANCE
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: co.omise.android.extensions.ClientExtensionsKt.C5510a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: co.omise.android.extensions.ClientExtensionsKt$b */
    /* loaded from: classes.dex */
    public static final class C5513b extends ContinuationImpl {

        /* renamed from: a */
        /* synthetic */ Object f40260a;

        /* renamed from: b */
        int f40261b;

        public C5513b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40260a = obj;
            this.f40261b |= Integer.MIN_VALUE;
            return ClientExtensionsKt.retrieveToken(null, null, this);
        }
    }

    public static final void observeTokenUntilChargeStatusChanged(@NotNull Client client, @NotNull String id2, @NotNull RequestListener<Token> listener, long j, long j2) {
        Intrinsics.checkNotNullParameter(client, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(listener, "listener");
        AbstractC1539Vc.m65885e(GlobalScope.INSTANCE, null, null, new C5510a(j2, listener, j, client, id2, null), 3, null);
    }

    public static /* synthetic */ void observeTokenUntilChargeStatusChanged$default(Client client, String str, RequestListener requestListener, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 3000;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = 30000;
        }
        observeTokenUntilChargeStatusChanged(client, str, requestListener, j3, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object retrieveToken(co.omise.android.api.Client r4, java.lang.String r5, kotlin.coroutines.Continuation<? super co.omise.android.models.Token> r6) {
        /*
            boolean r0 = r6 instanceof co.omise.android.extensions.ClientExtensionsKt.C5513b
            if (r0 == 0) goto L13
            r0 = r6
            co.omise.android.extensions.ClientExtensionsKt$b r0 = (co.omise.android.extensions.ClientExtensionsKt.C5513b) r0
            int r1 = r0.f40261b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40261b = r1
            goto L18
        L13:
            co.omise.android.extensions.ClientExtensionsKt$b r0 = new co.omise.android.extensions.ClientExtensionsKt$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f40260a
            java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r2 = r0.f40261b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L29 co.omise.android.models.APIError -> L2b
            goto L4a
        L29:
            r4 = move-exception
            goto L4d
        L2b:
            r4 = move-exception
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            co.omise.android.models.Token$GetTokenRequestBuilder r6 = new co.omise.android.models.Token$GetTokenRequestBuilder     // Catch: java.lang.Throwable -> L29 co.omise.android.models.APIError -> L2b
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L29 co.omise.android.models.APIError -> L2b
            co.omise.android.api.Request r5 = r6.build()     // Catch: java.lang.Throwable -> L29 co.omise.android.models.APIError -> L2b
            r0.f40261b = r3     // Catch: java.lang.Throwable -> L29 co.omise.android.models.APIError -> L2b
            java.lang.Object r6 = r4.send(r5, r0)     // Catch: java.lang.Throwable -> L29 co.omise.android.models.APIError -> L2b
            if (r6 != r1) goto L4a
            return r1
        L4a:
            co.omise.android.models.Token r6 = (co.omise.android.models.Token) r6     // Catch: java.lang.Throwable -> L29 co.omise.android.models.APIError -> L2b
            goto L5c
        L4d:
            throw r4
        L4e:
            java.lang.String r5 = r4.getCode()
            java.lang.String r6 = "search_unavailable"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L5d
            r6 = 0
        L5c:
            return r6
        L5d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: co.omise.android.extensions.ClientExtensionsKt.retrieveToken(co.omise.android.api.Client, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}