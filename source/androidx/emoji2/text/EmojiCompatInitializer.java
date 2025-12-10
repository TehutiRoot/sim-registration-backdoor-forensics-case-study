package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.p005os.TraceCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    /* loaded from: classes2.dex */
    public class C4519a implements DefaultLifecycleObserver {

        /* renamed from: a */
        public final /* synthetic */ Lifecycle f35148a;

        public C4519a(Lifecycle lifecycle) {
            EmojiCompatInitializer.this = r1;
            this.f35148a = lifecycle;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            AbstractC17181zE.m123a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            AbstractC17181zE.m122b(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            AbstractC17181zE.m121c(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
            EmojiCompatInitializer.this.m54771b();
            this.f35148a.removeObserver(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            AbstractC17181zE.m119e(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            AbstractC17181zE.m118f(this, lifecycleOwner);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    /* loaded from: classes2.dex */
    public static class C4520b extends EmojiCompat.Config {
        public C4520b(Context context) {
            super(new C4521c(context));
            setMetadataLoadStrategy(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    /* loaded from: classes2.dex */
    public static class C4521c implements EmojiCompat.MetadataRepoLoader {

        /* renamed from: a */
        public final Context f35150a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c$a */
        /* loaded from: classes2.dex */
        public class C4522a extends EmojiCompat.MetadataRepoLoaderCallback {

            /* renamed from: a */
            public final /* synthetic */ EmojiCompat.MetadataRepoLoaderCallback f35151a;

            /* renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f35152b;

            public C4522a(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
                C4521c.this = r1;
                this.f35151a = metadataRepoLoaderCallback;
                this.f35152b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public void onFailed(Throwable th2) {
                try {
                    this.f35151a.onFailed(th2);
                } finally {
                    this.f35152b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public void onLoaded(MetadataRepo metadataRepo) {
                try {
                    this.f35151a.onLoaded(metadataRepo);
                } finally {
                    this.f35152b.shutdown();
                }
            }
        }

        public C4521c(Context context) {
            this.f35150a = context.getApplicationContext();
        }

        /* renamed from: a */
        public static /* synthetic */ void m54770a(C4521c c4521c, EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
            c4521c.m54768c(metadataRepoLoaderCallback, threadPoolExecutor);
        }

        /* renamed from: b */
        public void m54768c(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
            try {
                FontRequestEmojiCompatConfig create = DefaultEmojiCompatConfig.create(this.f35150a);
                if (create != null) {
                    create.setLoadingExecutor(threadPoolExecutor);
                    create.getMetadataRepoLoader().load(new C4522a(metadataRepoLoaderCallback, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th2) {
                metadataRepoLoaderCallback.onFailed(th2);
                threadPoolExecutor.shutdown();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            final ThreadPoolExecutor m31621c = AbstractC10113dw.m31621c("EmojiCompatInitializer");
            m31621c.execute(new Runnable() { // from class: hR
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.C4521c.m54770a(EmojiCompatInitializer.C4521c.this, metadataRepoLoaderCallback, m31621c);
                }
            });
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$d */
    /* loaded from: classes2.dex */
    public static class RunnableC4523d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                TraceCompat.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.isConfigured()) {
                    EmojiCompat.get().load();
                }
            } finally {
                TraceCompat.endSection();
            }
        }
    }

    /* renamed from: a */
    public void m54772a(Context context) {
        Lifecycle lifecycle = ((LifecycleOwner) AppInitializer.getInstance(context).initializeComponent(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new C4519a(lifecycle));
    }

    /* renamed from: b */
    public void m54771b() {
        AbstractC10113dw.m31619e().postDelayed(new RunnableC4523d(), 500L);
    }

    @Override // androidx.startup.Initializer
    @NonNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // androidx.startup.Initializer
    @NonNull
    public Boolean create(@NonNull Context context) {
        EmojiCompat.init(new C4520b(context));
        m54772a(context);
        return Boolean.TRUE;
    }
}
