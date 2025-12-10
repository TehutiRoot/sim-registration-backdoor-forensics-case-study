package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.p005os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {

    /* renamed from: k */
    public static final FontProviderHelper f35159k = new FontProviderHelper();

    /* loaded from: classes2.dex */
    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {

        /* renamed from: a */
        public final long f35160a;

        /* renamed from: b */
        public long f35161b;

        public ExponentialBackoffRetryPolicy(long j) {
            this.f35160a = j;
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
            if (this.f35161b == 0) {
                this.f35161b = SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f35161b;
            if (uptimeMillis > this.f35160a) {
                return -1L;
            }
            return Math.min(Math.max(uptimeMillis, 1000L), this.f35160a - uptimeMillis);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public static class FontProviderHelper {
        @Nullable
        public Typeface buildTypeface(@NonNull Context context, @NonNull FontsContractCompat.FontInfo fontInfo) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.buildTypeface(context, null, new FontsContractCompat.FontInfo[]{fontInfo});
        }

        @NonNull
        public FontsContractCompat.FontFamilyResult fetchFonts(@NonNull Context context, @NonNull FontRequest fontRequest) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.fetchFonts(context, null, fontRequest);
        }

        public void registerObserver(@NonNull Context context, @NonNull Uri uri, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void unregisterObserver(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class RetryPolicy {
        public abstract long getRetryDelay();
    }

    /* renamed from: androidx.emoji2.text.FontRequestEmojiCompatConfig$a */
    /* loaded from: classes2.dex */
    public static class C4524a implements EmojiCompat.MetadataRepoLoader {

        /* renamed from: a */
        public final Context f35162a;

        /* renamed from: b */
        public final FontRequest f35163b;

        /* renamed from: c */
        public final FontProviderHelper f35164c;

        /* renamed from: d */
        public final Object f35165d = new Object();

        /* renamed from: e */
        public Handler f35166e;

        /* renamed from: f */
        public Executor f35167f;

        /* renamed from: g */
        public ThreadPoolExecutor f35168g;

        /* renamed from: h */
        public RetryPolicy f35169h;

        /* renamed from: i */
        public EmojiCompat.MetadataRepoLoaderCallback f35170i;

        /* renamed from: j */
        public ContentObserver f35171j;

        /* renamed from: k */
        public Runnable f35172k;

        /* renamed from: androidx.emoji2.text.FontRequestEmojiCompatConfig$a$a */
        /* loaded from: classes2.dex */
        public class C4525a extends ContentObserver {
            public C4525a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                C4524a.this.m54764c();
            }
        }

        public C4524a(Context context, FontRequest fontRequest, FontProviderHelper fontProviderHelper) {
            Preconditions.checkNotNull(context, "Context cannot be null");
            Preconditions.checkNotNull(fontRequest, "FontRequest cannot be null");
            this.f35162a = context.getApplicationContext();
            this.f35163b = fontRequest;
            this.f35164c = fontProviderHelper;
        }

        /* renamed from: a */
        public final void m54766a() {
            synchronized (this.f35165d) {
                try {
                    this.f35170i = null;
                    ContentObserver contentObserver = this.f35171j;
                    if (contentObserver != null) {
                        this.f35164c.unregisterObserver(this.f35162a, contentObserver);
                        this.f35171j = null;
                    }
                    Handler handler = this.f35166e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f35172k);
                    }
                    this.f35166e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f35168g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f35167f = null;
                    this.f35168g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        public void m54765b() {
            synchronized (this.f35165d) {
                try {
                    if (this.f35170i == null) {
                        return;
                    }
                    try {
                        FontsContractCompat.FontInfo m54763d = m54763d();
                        int resultCode = m54763d.getResultCode();
                        if (resultCode == 2) {
                            synchronized (this.f35165d) {
                                RetryPolicy retryPolicy = this.f35169h;
                                if (retryPolicy != null) {
                                    long retryDelay = retryPolicy.getRetryDelay();
                                    if (retryDelay >= 0) {
                                        m54762e(m54763d.getUri(), retryDelay);
                                        return;
                                    }
                                }
                            }
                        }
                        if (resultCode == 0) {
                            TraceCompat.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface buildTypeface = this.f35164c.buildTypeface(this.f35162a, m54763d);
                            ByteBuffer mmap = TypefaceCompatUtil.mmap(this.f35162a, null, m54763d.getUri());
                            if (mmap != null && buildTypeface != null) {
                                MetadataRepo create = MetadataRepo.create(buildTypeface, mmap);
                                TraceCompat.endSection();
                                synchronized (this.f35165d) {
                                    EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = this.f35170i;
                                    if (metadataRepoLoaderCallback != null) {
                                        metadataRepoLoaderCallback.onLoaded(create);
                                    }
                                }
                                m54766a();
                                return;
                            }
                            throw new RuntimeException("Unable to open file.");
                        }
                        throw new RuntimeException("fetchFonts result is not OK. (" + resultCode + ")");
                    } catch (Throwable th2) {
                        synchronized (this.f35165d) {
                            try {
                                EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = this.f35170i;
                                if (metadataRepoLoaderCallback2 != null) {
                                    metadataRepoLoaderCallback2.onFailed(th2);
                                }
                                m54766a();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        /* renamed from: c */
        public void m54764c() {
            synchronized (this.f35165d) {
                try {
                    if (this.f35170i == null) {
                        return;
                    }
                    if (this.f35167f == null) {
                        ThreadPoolExecutor m31621c = AbstractC10113dw.m31621c("emojiCompat");
                        this.f35168g = m31621c;
                        this.f35167f = m31621c;
                    }
                    this.f35167f.execute(new Runnable() { // from class: b40
                        {
                            FontRequestEmojiCompatConfig.C4524a.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            FontRequestEmojiCompatConfig.C4524a.this.m54765b();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: d */
        public final FontsContractCompat.FontInfo m54763d() {
            try {
                FontsContractCompat.FontFamilyResult fetchFonts = this.f35164c.fetchFonts(this.f35162a, this.f35163b);
                if (fetchFonts.getStatusCode() == 0) {
                    FontsContractCompat.FontInfo[] fonts = fetchFonts.getFonts();
                    if (fonts != null && fonts.length != 0) {
                        return fonts[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + fetchFonts.getStatusCode() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* renamed from: e */
        public final void m54762e(Uri uri, long j) {
            synchronized (this.f35165d) {
                try {
                    Handler handler = this.f35166e;
                    if (handler == null) {
                        handler = AbstractC10113dw.m31619e();
                        this.f35166e = handler;
                    }
                    if (this.f35171j == null) {
                        C4525a c4525a = new C4525a(handler);
                        this.f35171j = c4525a;
                        this.f35164c.registerObserver(this.f35162a, uri, c4525a);
                    }
                    if (this.f35172k == null) {
                        this.f35172k = new Runnable() { // from class: c40
                            {
                                FontRequestEmojiCompatConfig.C4524a.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FontRequestEmojiCompatConfig.C4524a.this.m54764c();
                            }
                        };
                    }
                    handler.postDelayed(this.f35172k, j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: f */
        public void m54761f(Executor executor) {
            synchronized (this.f35165d) {
                this.f35167f = executor;
            }
        }

        /* renamed from: g */
        public void m54760g(RetryPolicy retryPolicy) {
            synchronized (this.f35165d) {
                this.f35169h = retryPolicy;
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            Preconditions.checkNotNull(metadataRepoLoaderCallback, "LoaderCallback cannot be null");
            synchronized (this.f35165d) {
                this.f35170i = metadataRepoLoaderCallback;
            }
            m54764c();
        }
    }

    public FontRequestEmojiCompatConfig(@NonNull Context context, @NonNull FontRequest fontRequest) {
        super(new C4524a(context, fontRequest, f35159k));
    }

    @NonNull
    @Deprecated
    public FontRequestEmojiCompatConfig setHandler(@Nullable Handler handler) {
        if (handler == null) {
            return this;
        }
        setLoadingExecutor(AbstractC10113dw.m31622b(handler));
        return this;
    }

    @NonNull
    public FontRequestEmojiCompatConfig setLoadingExecutor(@NonNull Executor executor) {
        ((C4524a) getMetadataRepoLoader()).m54761f(executor);
        return this;
    }

    @NonNull
    public FontRequestEmojiCompatConfig setRetryPolicy(@Nullable RetryPolicy retryPolicy) {
        ((C4524a) getMetadataRepoLoader()).m54760g(retryPolicy);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public FontRequestEmojiCompatConfig(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontProviderHelper fontProviderHelper) {
        super(new C4524a(context, fontRequest, fontProviderHelper));
    }
}
