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
    public class C4501a implements DefaultLifecycleObserver {

        /* renamed from: a */
        public final /* synthetic */ Lifecycle f35236a;

        public C4501a(Lifecycle lifecycle) {
            this.f35236a = lifecycle;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            AbstractC0015AE.m69306a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            AbstractC0015AE.m69305b(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            AbstractC0015AE.m69304c(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
            EmojiCompatInitializer.this.m54721b();
            this.f35236a.removeObserver(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            AbstractC0015AE.m69302e(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            AbstractC0015AE.m69301f(this, lifecycleOwner);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    /* loaded from: classes2.dex */
    public static class C4502b extends EmojiCompat.Config {
        public C4502b(Context context) {
            super(new C4503c(context));
            setMetadataLoadStrategy(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    /* loaded from: classes2.dex */
    public static class C4503c implements EmojiCompat.MetadataRepoLoader {

        /* renamed from: a */
        public final Context f35238a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c$a */
        /* loaded from: classes2.dex */
        public class C4504a extends EmojiCompat.MetadataRepoLoaderCallback {

            /* renamed from: a */
            public final /* synthetic */ EmojiCompat.MetadataRepoLoaderCallback f35239a;

            /* renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f35240b;

            public C4504a(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
                this.f35239a = metadataRepoLoaderCallback;
                this.f35240b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public void onFailed(Throwable th2) {
                try {
                    this.f35239a.onFailed(th2);
                } finally {
                    this.f35240b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public void onLoaded(MetadataRepo metadataRepo) {
                try {
                    this.f35239a.onLoaded(metadataRepo);
                } finally {
                    this.f35240b.shutdown();
                }
            }
        }

        public C4503c(Context context) {
            this.f35238a = context.getApplicationContext();
        }

        /* renamed from: b */
        public void m54718c(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
            try {
                FontRequestEmojiCompatConfig create = DefaultEmojiCompatConfig.create(this.f35238a);
                if (create != null) {
                    create.setLoadingExecutor(threadPoolExecutor);
                    create.getMetadataRepoLoader().load(new C4504a(metadataRepoLoaderCallback, threadPoolExecutor));
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
            final ThreadPoolExecutor m31752c = AbstractC10104dw.m31752c("EmojiCompatInitializer");
            m31752c.execute(new Runnable() { // from class: lR
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.C4503c.this.m54718c(metadataRepoLoaderCallback, m31752c);
                }
            });
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$d */
    /* loaded from: classes2.dex */
    public static class RunnableC4505d implements Runnable {
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
    public void m54722a(Context context) {
        Lifecycle lifecycle = ((LifecycleOwner) AppInitializer.getInstance(context).initializeComponent(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new C4501a(lifecycle));
    }

    /* renamed from: b */
    public void m54721b() {
        AbstractC10104dw.m31750e().postDelayed(new RunnableC4505d(), 500L);
    }

    @Override // androidx.startup.Initializer
    @NonNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @NonNull
    public Boolean create(@NonNull Context context) {
        EmojiCompat.init(new C4502b(context));
        m54722a(context);
        return Boolean.TRUE;
    }
}