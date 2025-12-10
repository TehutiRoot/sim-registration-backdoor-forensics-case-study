package coil;

import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import coil.EventListener;
import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.top_up.TopUpMixpanel;

@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 +2\u00020\u0001:\u0002+,J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J*\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0010H\u0017J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0017J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0017H\u0017J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001cH\u0017J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001fH\u0017J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H\u0017J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020%H\u0017J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020%H\u0017J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)H\u0017J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0003"}, m28850d2 = {"Lcoil/EventListener;", "Lcoil/request/ImageRequest$Listener;", "decodeEnd", "", "request", "Lcoil/request/ImageRequest;", "decoder", "Lcoil/decode/Decoder;", "options", "Lcoil/request/Options;", "result", "Lcoil/decode/DecodeResult;", "decodeStart", "fetchEnd", "fetcher", "Lcoil/fetch/Fetcher;", "Lcoil/fetch/FetchResult;", "fetchStart", "keyEnd", "output", "", "keyStart", "input", "", "mapEnd", "mapStart", "onCancel", "onError", "Lcoil/request/ErrorResult;", Constant.ServiceAPIName.onStart, "onSuccess", "Lcoil/request/SuccessResult;", "resolveSizeEnd", "size", "Lcoil/size/Size;", "resolveSizeStart", "transformEnd", "Landroid/graphics/Bitmap;", "transformStart", "transitionEnd", "transition", "Lcoil/transition/Transition;", "transitionStart", "Companion", "Factory", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface EventListener extends ImageRequest.Listener {
    @NotNull
    public static final Companion Companion = Companion.f40396a;
    @JvmField
    @NotNull
    public static final EventListener NONE = new EventListener() { // from class: coil.EventListener$Companion$NONE$1
        @Override // coil.EventListener
        public /* synthetic */ void decodeEnd(ImageRequest imageRequest, Decoder decoder, Options options, DecodeResult decodeResult) {
            AbstractC1179QS.m66587a(this, imageRequest, decoder, options, decodeResult);
        }

        @Override // coil.EventListener
        public /* synthetic */ void decodeStart(ImageRequest imageRequest, Decoder decoder, Options options) {
            AbstractC1179QS.m66586b(this, imageRequest, decoder, options);
        }

        @Override // coil.EventListener
        public /* synthetic */ void fetchEnd(ImageRequest imageRequest, Fetcher fetcher, Options options, FetchResult fetchResult) {
            AbstractC1179QS.m66585c(this, imageRequest, fetcher, options, fetchResult);
        }

        @Override // coil.EventListener
        public /* synthetic */ void fetchStart(ImageRequest imageRequest, Fetcher fetcher, Options options) {
            AbstractC1179QS.m66584d(this, imageRequest, fetcher, options);
        }

        @Override // coil.EventListener
        public /* synthetic */ void keyEnd(ImageRequest imageRequest, String str) {
            AbstractC1179QS.m66583e(this, imageRequest, str);
        }

        @Override // coil.EventListener
        public /* synthetic */ void keyStart(ImageRequest imageRequest, Object obj) {
            AbstractC1179QS.m66582f(this, imageRequest, obj);
        }

        @Override // coil.EventListener
        public /* synthetic */ void mapEnd(ImageRequest imageRequest, Object obj) {
            AbstractC1179QS.m66581g(this, imageRequest, obj);
        }

        @Override // coil.EventListener
        public /* synthetic */ void mapStart(ImageRequest imageRequest, Object obj) {
            AbstractC1179QS.m66580h(this, imageRequest, obj);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onCancel(ImageRequest imageRequest) {
            AbstractC1179QS.m66579i(this, imageRequest);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onError(ImageRequest imageRequest, ErrorResult errorResult) {
            AbstractC1179QS.m66578j(this, imageRequest, errorResult);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onStart(ImageRequest imageRequest) {
            AbstractC1179QS.m66577k(this, imageRequest);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
            AbstractC1179QS.m66576l(this, imageRequest, successResult);
        }

        @Override // coil.EventListener
        public /* synthetic */ void resolveSizeEnd(ImageRequest imageRequest, Size size) {
            AbstractC1179QS.m66575m(this, imageRequest, size);
        }

        @Override // coil.EventListener
        public /* synthetic */ void resolveSizeStart(ImageRequest imageRequest) {
            AbstractC1179QS.m66574n(this, imageRequest);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transformEnd(ImageRequest imageRequest, Bitmap bitmap) {
            AbstractC1179QS.m66573o(this, imageRequest, bitmap);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transformStart(ImageRequest imageRequest, Bitmap bitmap) {
            AbstractC1179QS.m66572p(this, imageRequest, bitmap);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transitionEnd(ImageRequest imageRequest, Transition transition) {
            AbstractC1179QS.m66571q(this, imageRequest, transition);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transitionStart(ImageRequest imageRequest, Transition transition) {
            AbstractC1179QS.m66570r(this, imageRequest, transition);
        }
    };

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, m28850d2 = {"Lcoil/EventListener$Companion;", "", "()V", TopUpMixpanel.OFFER_NONE, "Lcoil/EventListener;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f40396a = new Companion();
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @WorkerThread
        @Deprecated
        public static void decodeEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Decoder decoder, @NotNull Options options, @Nullable DecodeResult decodeResult) {
            AbstractC1179QS.m66569s(eventListener, imageRequest, decoder, options, decodeResult);
        }

        @WorkerThread
        @Deprecated
        public static void decodeStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Decoder decoder, @NotNull Options options) {
            AbstractC1179QS.m66568t(eventListener, imageRequest, decoder, options);
        }

        @WorkerThread
        @Deprecated
        public static void fetchEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Fetcher fetcher, @NotNull Options options, @Nullable FetchResult fetchResult) {
            AbstractC1179QS.m66567u(eventListener, imageRequest, fetcher, options, fetchResult);
        }

        @WorkerThread
        @Deprecated
        public static void fetchStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Fetcher fetcher, @NotNull Options options) {
            AbstractC1179QS.m66566v(eventListener, imageRequest, fetcher, options);
        }

        @MainThread
        @Deprecated
        public static void keyEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @Nullable String str) {
            AbstractC1179QS.m66565w(eventListener, imageRequest, str);
        }

        @MainThread
        @Deprecated
        public static void keyStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Object obj) {
            AbstractC1179QS.m66564x(eventListener, imageRequest, obj);
        }

        @MainThread
        @Deprecated
        public static void mapEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Object obj) {
            AbstractC1179QS.m66563y(eventListener, imageRequest, obj);
        }

        @MainThread
        @Deprecated
        public static void mapStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Object obj) {
            AbstractC1179QS.m66562z(eventListener, imageRequest, obj);
        }

        @MainThread
        @Deprecated
        public static void onCancel(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest) {
            AbstractC1179QS.m66597A(eventListener, imageRequest);
        }

        @MainThread
        @Deprecated
        public static void onError(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull ErrorResult errorResult) {
            AbstractC1179QS.m66596B(eventListener, imageRequest, errorResult);
        }

        @MainThread
        @Deprecated
        public static void onStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest) {
            AbstractC1179QS.m66595C(eventListener, imageRequest);
        }

        @MainThread
        @Deprecated
        public static void onSuccess(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult) {
            AbstractC1179QS.m66594D(eventListener, imageRequest, successResult);
        }

        @MainThread
        @Deprecated
        public static void resolveSizeEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Size size) {
            AbstractC1179QS.m66593E(eventListener, imageRequest, size);
        }

        @MainThread
        @Deprecated
        public static void resolveSizeStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest) {
            AbstractC1179QS.m66592F(eventListener, imageRequest);
        }

        @WorkerThread
        @Deprecated
        public static void transformEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Bitmap bitmap) {
            AbstractC1179QS.m66591G(eventListener, imageRequest, bitmap);
        }

        @WorkerThread
        @Deprecated
        public static void transformStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Bitmap bitmap) {
            AbstractC1179QS.m66590H(eventListener, imageRequest, bitmap);
        }

        @MainThread
        @Deprecated
        public static void transitionEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Transition transition) {
            AbstractC1179QS.m66589I(eventListener, imageRequest, transition);
        }

        @MainThread
        @Deprecated
        public static void transitionStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Transition transition) {
            AbstractC1179QS.m66588J(eventListener, imageRequest, transition);
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m28850d2 = {"Lcoil/EventListener$Factory;", "", "create", "Lcoil/EventListener;", "request", "Lcoil/request/ImageRequest;", "Companion", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public interface Factory {
        @NotNull
        public static final Companion Companion = Companion.f40397a;
        @JvmField
        @NotNull
        public static final Factory NONE = new Factory() { // from class: RS
            @Override // coil.EventListener.Factory
            public final EventListener create(ImageRequest imageRequest) {
                return AbstractC1314SS.m66327a(imageRequest);
            }
        };

        @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, m28850d2 = {"Lcoil/EventListener$Factory$Companion;", "", "()V", TopUpMixpanel.OFFER_NONE, "Lcoil/EventListener$Factory;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ Companion f40397a = new Companion();
        }

        @NotNull
        EventListener create(@NotNull ImageRequest imageRequest);
    }

    @WorkerThread
    void decodeEnd(@NotNull ImageRequest imageRequest, @NotNull Decoder decoder, @NotNull Options options, @Nullable DecodeResult decodeResult);

    @WorkerThread
    void decodeStart(@NotNull ImageRequest imageRequest, @NotNull Decoder decoder, @NotNull Options options);

    @WorkerThread
    void fetchEnd(@NotNull ImageRequest imageRequest, @NotNull Fetcher fetcher, @NotNull Options options, @Nullable FetchResult fetchResult);

    @WorkerThread
    void fetchStart(@NotNull ImageRequest imageRequest, @NotNull Fetcher fetcher, @NotNull Options options);

    @MainThread
    void keyEnd(@NotNull ImageRequest imageRequest, @Nullable String str);

    @MainThread
    void keyStart(@NotNull ImageRequest imageRequest, @NotNull Object obj);

    @MainThread
    void mapEnd(@NotNull ImageRequest imageRequest, @NotNull Object obj);

    @MainThread
    void mapStart(@NotNull ImageRequest imageRequest, @NotNull Object obj);

    @Override // coil.request.ImageRequest.Listener
    @MainThread
    void onCancel(@NotNull ImageRequest imageRequest);

    @Override // coil.request.ImageRequest.Listener
    @MainThread
    void onError(@NotNull ImageRequest imageRequest, @NotNull ErrorResult errorResult);

    @Override // coil.request.ImageRequest.Listener
    @MainThread
    void onStart(@NotNull ImageRequest imageRequest);

    @Override // coil.request.ImageRequest.Listener
    @MainThread
    void onSuccess(@NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult);

    @MainThread
    void resolveSizeEnd(@NotNull ImageRequest imageRequest, @NotNull Size size);

    @MainThread
    void resolveSizeStart(@NotNull ImageRequest imageRequest);

    @WorkerThread
    void transformEnd(@NotNull ImageRequest imageRequest, @NotNull Bitmap bitmap);

    @WorkerThread
    void transformStart(@NotNull ImageRequest imageRequest, @NotNull Bitmap bitmap);

    @MainThread
    void transitionEnd(@NotNull ImageRequest imageRequest, @NotNull Transition transition);

    @MainThread
    void transitionStart(@NotNull ImageRequest imageRequest, @NotNull Transition transition);
}
