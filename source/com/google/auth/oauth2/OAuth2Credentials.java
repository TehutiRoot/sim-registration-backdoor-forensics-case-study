package com.google.auth.oauth2;

import com.google.api.client.util.Clock;
import com.google.auth.Credentials;
import com.google.auth.RequestMetadataCallback;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public class OAuth2Credentials extends Credentials {
    static final Duration DEFAULT_EXPIRATION_MARGIN;
    static final Duration DEFAULT_REFRESH_MARGIN;
    private static final ImmutableMap<String, List<String>> EMPTY_EXTRA_HEADERS;
    private static final long serialVersionUID = 4556936364828217687L;
    private transient List<CredentialsChangedListener> changeListeners;
    @VisibleForTesting
    transient Clock clock;
    @VisibleForTesting
    private final Duration expirationMargin;
    @VisibleForTesting
    final Object lock;
    @VisibleForTesting
    private final Duration refreshMargin;
    @VisibleForTesting
    transient RunnableC7352d refreshTask;
    private volatile OAuthValue value;

    /* loaded from: classes4.dex */
    public enum CacheState {
        FRESH,
        STALE,
        EXPIRED
    }

    /* loaded from: classes4.dex */
    public interface CredentialsChangedListener {
        void onChanged(OAuth2Credentials oAuth2Credentials) throws IOException;
    }

    /* loaded from: classes4.dex */
    public static class OAuthValue implements Serializable {
        private final Map<String, List<String>> requestMetadata;
        private final AccessToken temporaryAccess;

        private OAuthValue(AccessToken accessToken, Map<String, List<String>> map) {
            this.temporaryAccess = accessToken;
            this.requestMetadata = map;
        }

        public static OAuthValue create(AccessToken accessToken, Map<String, List<String>> map) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            return new OAuthValue(accessToken, builder.put("Authorization", ImmutableList.m40997of("Bearer " + accessToken.getTokenValue())).putAll(map).build());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OAuthValue)) {
                return false;
            }
            OAuthValue oAuthValue = (OAuthValue) obj;
            if (!Objects.equals(this.requestMetadata, oAuthValue.requestMetadata) || !Objects.equals(this.temporaryAccess, oAuthValue.temporaryAccess)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(this.temporaryAccess, this.requestMetadata);
        }
    }

    /* renamed from: com.google.auth.oauth2.OAuth2Credentials$a */
    /* loaded from: classes4.dex */
    public class CallableC7349a implements Callable {
        public CallableC7349a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public OAuthValue call() {
            return OAuthValue.create(OAuth2Credentials.this.refreshAccessToken(), OAuth2Credentials.this.getAdditionalHeaders());
        }
    }

    /* renamed from: com.google.auth.oauth2.OAuth2Credentials$b */
    /* loaded from: classes4.dex */
    public static class C7350b {

        /* renamed from: a */
        public final RunnableC7352d f52485a;

        /* renamed from: b */
        public final boolean f52486b;

        public C7350b(RunnableC7352d runnableC7352d, boolean z) {
            this.f52485a = runnableC7352d;
            this.f52486b = z;
        }

        /* renamed from: b */
        public void m41636b(Executor executor) {
            if (this.f52486b) {
                executor.execute(this.f52485a);
            }
        }
    }

    /* renamed from: com.google.auth.oauth2.OAuth2Credentials$c */
    /* loaded from: classes4.dex */
    public static class C7351c implements FutureCallback {

        /* renamed from: a */
        public final RequestMetadataCallback f52487a;

        public C7351c(RequestMetadataCallback requestMetadataCallback) {
            this.f52487a = requestMetadataCallback;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        /* renamed from: a */
        public void onSuccess(OAuthValue oAuthValue) {
            this.f52487a.onSuccess(oAuthValue.requestMetadata);
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(Throwable th2) {
            if (th2 instanceof ExecutionException) {
                th2 = th2.getCause();
            }
            this.f52487a.onFailure(th2);
        }
    }

    /* renamed from: com.google.auth.oauth2.OAuth2Credentials$d */
    /* loaded from: classes4.dex */
    public class RunnableC7352d extends AbstractFuture implements Runnable {

        /* renamed from: h */
        public final ListenableFutureTask f52488h;

        /* renamed from: i */
        public final RunnableC7354e f52489i;

        /* renamed from: com.google.auth.oauth2.OAuth2Credentials$d$a */
        /* loaded from: classes4.dex */
        public class C7353a implements FutureCallback {

            /* renamed from: a */
            public final /* synthetic */ OAuth2Credentials f52491a;

            public C7353a(OAuth2Credentials oAuth2Credentials) {
                this.f52491a = oAuth2Credentials;
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            /* renamed from: a */
            public void onSuccess(OAuthValue oAuthValue) {
                RunnableC7352d.this.set(oAuthValue);
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(Throwable th2) {
                RunnableC7352d.this.setException(th2);
            }
        }

        public RunnableC7352d(ListenableFutureTask listenableFutureTask, RunnableC7354e runnableC7354e) {
            this.f52488h = listenableFutureTask;
            this.f52489i = runnableC7354e;
            listenableFutureTask.addListener(runnableC7354e, MoreExecutors.directExecutor());
            Futures.addCallback(listenableFutureTask, new C7353a(OAuth2Credentials.this), MoreExecutors.directExecutor());
        }

        /* renamed from: B */
        public ListenableFutureTask m41633B() {
            return this.f52488h;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f52488h.run();
        }
    }

    /* renamed from: com.google.auth.oauth2.OAuth2Credentials$e */
    /* loaded from: classes4.dex */
    public class RunnableC7354e implements Runnable {

        /* renamed from: a */
        public ListenableFutureTask f52493a;

        public RunnableC7354e(ListenableFutureTask listenableFutureTask) {
            this.f52493a = listenableFutureTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            OAuth2Credentials.this.finishRefreshAsync(this.f52493a);
        }
    }

    static {
        Duration ofMinutes;
        Duration ofMinutes2;
        Duration plusSeconds;
        ofMinutes = Duration.ofMinutes(3L);
        DEFAULT_EXPIRATION_MARGIN = ofMinutes;
        ofMinutes2 = Duration.ofMinutes(3L);
        plusSeconds = ofMinutes2.plusSeconds(45L);
        DEFAULT_REFRESH_MARGIN = plusSeconds;
        EMPTY_EXTRA_HEADERS = ImmutableMap.m40976of();
    }

    public OAuth2Credentials() {
        this(null);
    }

    private ListenableFuture<OAuthValue> asyncFetch(Executor executor) {
        C7350b c7350b;
        CacheState state = getState();
        CacheState cacheState = CacheState.FRESH;
        if (state == cacheState) {
            return Futures.immediateFuture(this.value);
        }
        synchronized (this.lock) {
            try {
                if (getState() != cacheState) {
                    c7350b = getOrCreateRefreshTask();
                } else {
                    c7350b = null;
                }
            } finally {
            }
        }
        if (c7350b != null) {
            c7350b.m41636b(executor);
        }
        synchronized (this.lock) {
            try {
                if (getState() != CacheState.EXPIRED) {
                    return Futures.immediateFuture(this.value);
                } else if (c7350b != null) {
                    return c7350b.f52485a;
                } else {
                    return Futures.immediateFailedFuture(new IllegalStateException("Credentials expired, but there is no task to refresh"));
                }
            } finally {
            }
        }
    }

    public static OAuth2Credentials create(AccessToken accessToken) {
        return newBuilder().setAccessToken(accessToken).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r2.m41633B() == r5) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void finishRefreshAsync(com.google.common.util.concurrent.ListenableFuture<com.google.auth.oauth2.OAuth2Credentials.OAuthValue> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            r1 = 0
            java.lang.Object r2 = com.google.common.util.concurrent.Futures.getDone(r5)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L40
            com.google.auth.oauth2.OAuth2Credentials$OAuthValue r2 = (com.google.auth.oauth2.OAuth2Credentials.OAuthValue) r2     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L40
            r4.value = r2     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L40
            java.util.List<com.google.auth.oauth2.OAuth2Credentials$CredentialsChangedListener> r2 = r4.changeListeners     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L40
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L40
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L40
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L40
            com.google.auth.oauth2.OAuth2Credentials$CredentialsChangedListener r3 = (com.google.auth.oauth2.OAuth2Credentials.CredentialsChangedListener) r3     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L40
            r3.onChanged(r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L40
            goto L12
        L22:
            r2 = move-exception
            goto L33
        L24:
            com.google.auth.oauth2.OAuth2Credentials$d r2 = r4.refreshTask     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L4b
            com.google.common.util.concurrent.ListenableFutureTask r2 = r2.m41633B()     // Catch: java.lang.Throwable -> L31
            if (r2 != r5) goto L4b
        L2e:
            r4.refreshTask = r1     // Catch: java.lang.Throwable -> L31
            goto L4b
        L31:
            r5 = move-exception
            goto L4d
        L33:
            com.google.auth.oauth2.OAuth2Credentials$d r3 = r4.refreshTask     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L3f
            com.google.common.util.concurrent.ListenableFutureTask r3 = r3.m41633B()     // Catch: java.lang.Throwable -> L31
            if (r3 != r5) goto L3f
            r4.refreshTask = r1     // Catch: java.lang.Throwable -> L31
        L3f:
            throw r2     // Catch: java.lang.Throwable -> L31
        L40:
            com.google.auth.oauth2.OAuth2Credentials$d r2 = r4.refreshTask     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L4b
            com.google.common.util.concurrent.ListenableFutureTask r2 = r2.m41633B()     // Catch: java.lang.Throwable -> L31
            if (r2 != r5) goto L4b
            goto L2e
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.auth.oauth2.OAuth2Credentials.finishRefreshAsync(com.google.common.util.concurrent.ListenableFuture):void");
    }

    public static <T> T getFromServiceLoader(Class<? extends T> cls, T t) {
        return (T) Iterables.getFirst(ServiceLoader.load(cls), t);
    }

    private C7350b getOrCreateRefreshTask() {
        synchronized (this.lock) {
            try {
                RunnableC7352d runnableC7352d = this.refreshTask;
                if (runnableC7352d != null) {
                    return new C7350b(runnableC7352d, false);
                }
                ListenableFutureTask create = ListenableFutureTask.create(new CallableC7349a());
                RunnableC7352d runnableC7352d2 = new RunnableC7352d(create, new RunnableC7354e(create));
                this.refreshTask = runnableC7352d2;
                return new C7350b(runnableC7352d2, true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private CacheState getState() {
        Duration ofMillis;
        int compareTo;
        int compareTo2;
        OAuthValue oAuthValue = this.value;
        if (oAuthValue == null) {
            return CacheState.EXPIRED;
        }
        Date expirationTime = oAuthValue.temporaryAccess.getExpirationTime();
        if (expirationTime != null) {
            ofMillis = Duration.ofMillis(expirationTime.getTime() - this.clock.currentTimeMillis());
            compareTo = ofMillis.compareTo(this.expirationMargin);
            if (compareTo > 0) {
                compareTo2 = ofMillis.compareTo(this.refreshMargin);
                if (compareTo2 <= 0) {
                    return CacheState.STALE;
                }
                return CacheState.FRESH;
            }
            return CacheState.EXPIRED;
        }
        return CacheState.FRESH;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static <T> T newInstance(String str) throws IOException, ClassNotFoundException {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new IOException(e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.clock = Clock.SYSTEM;
        this.refreshTask = null;
    }

    private static <T> T unwrapDirectFuture(ListenableFuture<T> listenableFuture) throws IOException {
        try {
            return listenableFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while asynchronously refreshing the access token", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException("Unexpected error refreshing access token", cause);
            }
            throw ((IOException) cause);
        }
    }

    public final void addChangeListener(CredentialsChangedListener credentialsChangedListener) {
        synchronized (this.lock) {
            try {
                if (this.changeListeners == null) {
                    this.changeListeners = new ArrayList();
                }
                this.changeListeners.add(credentialsChangedListener);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OAuth2Credentials)) {
            return false;
        }
        return Objects.equals(this.value, ((OAuth2Credentials) obj).value);
    }

    public final AccessToken getAccessToken() {
        OAuthValue oAuthValue = this.value;
        if (oAuthValue != null) {
            return oAuthValue.temporaryAccess;
        }
        return null;
    }

    public Map<String, List<String>> getAdditionalHeaders() {
        return EMPTY_EXTRA_HEADERS;
    }

    @Override // com.google.auth.Credentials
    public String getAuthenticationType() {
        return "OAuth2";
    }

    @VisibleForTesting
    public Duration getExpirationMargin() {
        return this.expirationMargin;
    }

    @VisibleForTesting
    public Duration getRefreshMargin() {
        return this.refreshMargin;
    }

    @Override // com.google.auth.Credentials
    public void getRequestMetadata(URI uri, Executor executor, RequestMetadataCallback requestMetadataCallback) {
        Futures.addCallback(asyncFetch(executor), new C7351c(requestMetadataCallback), MoreExecutors.directExecutor());
    }

    @Nullable
    public Map<String, List<String>> getRequestMetadataInternal() {
        OAuthValue oAuthValue = this.value;
        if (oAuthValue != null) {
            return oAuthValue.requestMetadata;
        }
        return null;
    }

    @Override // com.google.auth.Credentials
    public boolean hasRequestMetadata() {
        return true;
    }

    @Override // com.google.auth.Credentials
    public boolean hasRequestMetadataOnly() {
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    @Override // com.google.auth.Credentials
    public void refresh() throws IOException {
        C7350b orCreateRefreshTask = getOrCreateRefreshTask();
        orCreateRefreshTask.m41636b(MoreExecutors.directExecutor());
        unwrapDirectFuture(orCreateRefreshTask.f52485a);
    }

    public AccessToken refreshAccessToken() throws IOException {
        throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    public void refreshIfExpired() throws IOException {
        unwrapDirectFuture(asyncFetch(MoreExecutors.directExecutor()));
    }

    public final void removeChangeListener(CredentialsChangedListener credentialsChangedListener) {
        synchronized (this.lock) {
            try {
                List<CredentialsChangedListener> list = this.changeListeners;
                if (list != null) {
                    list.remove(credentialsChangedListener);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        Map map;
        AccessToken accessToken;
        OAuthValue oAuthValue = this.value;
        if (oAuthValue != null) {
            map = oAuthValue.requestMetadata;
            accessToken = oAuthValue.temporaryAccess;
        } else {
            map = null;
            accessToken = null;
        }
        return MoreObjects.toStringHelper(this).add("requestMetadata", map).add("temporaryAccess", accessToken).toString();
    }

    public OAuth2Credentials(AccessToken accessToken) {
        this(accessToken, DEFAULT_REFRESH_MARGIN, DEFAULT_EXPIRATION_MARGIN);
    }

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public AccessToken f52481a;

        /* renamed from: b */
        public Duration f52482b;

        /* renamed from: c */
        public Duration f52483c;

        public Builder() {
            this.f52482b = OAuth2Credentials.DEFAULT_REFRESH_MARGIN;
            this.f52483c = OAuth2Credentials.DEFAULT_EXPIRATION_MARGIN;
        }

        public OAuth2Credentials build() {
            return new OAuth2Credentials(this.f52481a, this.f52482b, this.f52483c);
        }

        public AccessToken getAccessToken() {
            return this.f52481a;
        }

        public Duration getExpirationMargin() {
            return this.f52483c;
        }

        public Duration getRefreshMargin() {
            return this.f52482b;
        }

        @CanIgnoreReturnValue
        public Builder setAccessToken(AccessToken accessToken) {
            this.f52481a = accessToken;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setExpirationMargin(Duration duration) {
            this.f52483c = duration;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRefreshMargin(Duration duration) {
            this.f52482b = duration;
            return this;
        }

        public Builder(OAuth2Credentials oAuth2Credentials) {
            this.f52482b = OAuth2Credentials.DEFAULT_REFRESH_MARGIN;
            this.f52483c = OAuth2Credentials.DEFAULT_EXPIRATION_MARGIN;
            this.f52481a = oAuth2Credentials.getAccessToken();
            this.f52482b = oAuth2Credentials.refreshMargin;
            this.f52483c = oAuth2Credentials.expirationMargin;
        }
    }

    public OAuth2Credentials(AccessToken accessToken, Duration duration, Duration duration2) {
        boolean isNegative;
        boolean isNegative2;
        this.lock = new byte[0];
        this.value = null;
        this.clock = Clock.SYSTEM;
        if (accessToken != null) {
            this.value = OAuthValue.create(accessToken, EMPTY_EXTRA_HEADERS);
        }
        this.refreshMargin = AbstractC23116yJ0.m310a(Preconditions.checkNotNull(duration, "refreshMargin"));
        isNegative = duration.isNegative();
        Preconditions.checkArgument(!isNegative, "refreshMargin can't be negative");
        this.expirationMargin = AbstractC23116yJ0.m310a(Preconditions.checkNotNull(duration2, "expirationMargin"));
        isNegative2 = duration2.isNegative();
        Preconditions.checkArgument(!isNegative2, "expirationMargin can't be negative");
    }

    @Override // com.google.auth.Credentials
    public Map<String, List<String>> getRequestMetadata(URI uri) throws IOException {
        return ((OAuthValue) unwrapDirectFuture(asyncFetch(MoreExecutors.directExecutor()))).requestMetadata;
    }
}
