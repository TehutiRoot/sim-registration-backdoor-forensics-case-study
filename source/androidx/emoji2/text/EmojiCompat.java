package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.DefaultEmojiCompatConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@AnyThread
/* loaded from: classes2.dex */
public class EmojiCompat {
    public static final String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";
    public static final int EMOJI_FALLBACK = 2;
    public static final int EMOJI_SUPPORTED = 1;
    public static final int EMOJI_UNSUPPORTED = 0;
    public static final int LOAD_STATE_DEFAULT = 3;
    public static final int LOAD_STATE_FAILED = 2;
    public static final int LOAD_STATE_LOADING = 0;
    public static final int LOAD_STATE_SUCCEEDED = 1;
    public static final int LOAD_STRATEGY_DEFAULT = 0;
    public static final int LOAD_STRATEGY_MANUAL = 1;
    public static final int REPLACE_STRATEGY_ALL = 1;
    public static final int REPLACE_STRATEGY_DEFAULT = 0;
    public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;

    /* renamed from: o */
    public static final Object f35113o = new Object();

    /* renamed from: p */
    public static final Object f35114p = new Object();

    /* renamed from: q */
    public static volatile EmojiCompat f35115q;

    /* renamed from: r */
    public static volatile boolean f35116r;

    /* renamed from: b */
    public final Set f35118b;

    /* renamed from: e */
    public final C4517b f35121e;

    /* renamed from: f */
    public final MetadataRepoLoader f35122f;

    /* renamed from: g */
    public final SpanFactory f35123g;

    /* renamed from: h */
    public final boolean f35124h;

    /* renamed from: i */
    public final boolean f35125i;

    /* renamed from: j */
    public final int[] f35126j;

    /* renamed from: k */
    public final boolean f35127k;

    /* renamed from: l */
    public final int f35128l;

    /* renamed from: m */
    public final int f35129m;

    /* renamed from: n */
    public final GlyphChecker f35130n;

    /* renamed from: a */
    public final ReadWriteLock f35117a = new ReentrantReadWriteLock();

    /* renamed from: c */
    public volatile int f35119c = 3;

    /* renamed from: d */
    public final Handler f35120d = new Handler(Looper.getMainLooper());

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public @interface CodepointSequenceMatchResult {
    }

    /* loaded from: classes2.dex */
    public static abstract class Config {

        /* renamed from: a */
        public final MetadataRepoLoader f35131a;

        /* renamed from: b */
        public SpanFactory f35132b;

        /* renamed from: c */
        public boolean f35133c;

        /* renamed from: d */
        public boolean f35134d;

        /* renamed from: e */
        public int[] f35135e;

        /* renamed from: f */
        public Set f35136f;

        /* renamed from: g */
        public boolean f35137g;

        /* renamed from: h */
        public int f35138h = -16711936;

        /* renamed from: i */
        public int f35139i = 0;

        /* renamed from: j */
        public GlyphChecker f35140j = new C4528a();

        public Config(@NonNull MetadataRepoLoader metadataRepoLoader) {
            Preconditions.checkNotNull(metadataRepoLoader, "metadataLoader cannot be null.");
            this.f35131a = metadataRepoLoader;
        }

        @NonNull
        public final MetadataRepoLoader getMetadataRepoLoader() {
            return this.f35131a;
        }

        @NonNull
        public Config registerInitCallback(@NonNull InitCallback initCallback) {
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            if (this.f35136f == null) {
                this.f35136f = new ArraySet();
            }
            this.f35136f.add(initCallback);
            return this;
        }

        @NonNull
        public Config setEmojiSpanIndicatorColor(@ColorInt int i) {
            this.f35138h = i;
            return this;
        }

        @NonNull
        public Config setEmojiSpanIndicatorEnabled(boolean z) {
            this.f35137g = z;
            return this;
        }

        @NonNull
        public Config setGlyphChecker(@NonNull GlyphChecker glyphChecker) {
            Preconditions.checkNotNull(glyphChecker, "GlyphChecker cannot be null");
            this.f35140j = glyphChecker;
            return this;
        }

        @NonNull
        public Config setMetadataLoadStrategy(int i) {
            this.f35139i = i;
            return this;
        }

        @NonNull
        public Config setReplaceAll(boolean z) {
            this.f35133c = z;
            return this;
        }

        @NonNull
        public Config setSpanFactory(@NonNull SpanFactory spanFactory) {
            this.f35132b = spanFactory;
            return this;
        }

        @NonNull
        public Config setUseEmojiAsDefaultStyle(boolean z) {
            return setUseEmojiAsDefaultStyle(z, null);
        }

        @NonNull
        public Config unregisterInitCallback(@NonNull InitCallback initCallback) {
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            Set set = this.f35136f;
            if (set != null) {
                set.remove(initCallback);
            }
            return this;
        }

        @NonNull
        public Config setUseEmojiAsDefaultStyle(boolean z, @Nullable List<Integer> list) {
            this.f35134d = z;
            if (z && list != null) {
                this.f35135e = new int[list.size()];
                int i = 0;
                for (Integer num : list) {
                    this.f35135e[i] = num.intValue();
                    i++;
                }
                Arrays.sort(this.f35135e);
            } else {
                this.f35135e = null;
            }
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public static class DefaultSpanFactory implements SpanFactory {
        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        @NonNull
        @RequiresApi(19)
        public EmojiSpan createSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer);
        }
    }

    /* loaded from: classes2.dex */
    public interface GlyphChecker {
        boolean hasGlyph(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3);
    }

    /* loaded from: classes2.dex */
    public static abstract class InitCallback {
        public void onFailed(@Nullable Throwable th2) {
        }

        public void onInitialized() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public @interface LoadStrategy {
    }

    /* loaded from: classes2.dex */
    public interface MetadataRepoLoader {
        void load(@NonNull MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    /* loaded from: classes2.dex */
    public static abstract class MetadataRepoLoaderCallback {
        public abstract void onFailed(@Nullable Throwable th2);

        public abstract void onLoaded(@NonNull MetadataRepo metadataRepo);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public @interface ReplaceStrategy {
    }

    /* loaded from: classes2.dex */
    public interface SpanFactory {
        @NonNull
        @RequiresApi(19)
        EmojiSpan createSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    /* renamed from: androidx.emoji2.text.EmojiCompat$a */
    /* loaded from: classes2.dex */
    public static final class C4515a extends C4517b {

        /* renamed from: b */
        public volatile C4529b f35141b;

        /* renamed from: c */
        public volatile MetadataRepo f35142c;

        /* renamed from: androidx.emoji2.text.EmojiCompat$a$a */
        /* loaded from: classes2.dex */
        public class C4516a extends MetadataRepoLoaderCallback {
            public C4516a() {
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public void onFailed(Throwable th2) {
                C4515a.this.f35144a.m54784e(th2);
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public void onLoaded(MetadataRepo metadataRepo) {
                C4515a.this.m54782j(metadataRepo);
            }
        }

        public C4515a(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.C4517b
        /* renamed from: a */
        public String mo54781a() {
            String sourceSha = this.f35142c.getMetadataList().sourceSha();
            if (sourceSha == null) {
                return "";
            }
            return sourceSha;
        }

        @Override // androidx.emoji2.text.EmojiCompat.C4517b
        /* renamed from: b */
        public int mo54780b(CharSequence charSequence, int i) {
            return this.f35141b.m54736b(charSequence, i);
        }

        @Override // androidx.emoji2.text.EmojiCompat.C4517b
        /* renamed from: c */
        public int mo54779c(CharSequence charSequence, int i) {
            return this.f35141b.m54734d(charSequence, i);
        }

        @Override // androidx.emoji2.text.EmojiCompat.C4517b
        /* renamed from: d */
        public int mo54778d(CharSequence charSequence, int i) {
            return this.f35141b.m54733e(charSequence, i);
        }

        @Override // androidx.emoji2.text.EmojiCompat.C4517b
        /* renamed from: e */
        public boolean mo54777e(CharSequence charSequence) {
            if (this.f35141b.m54735c(charSequence) == 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.EmojiCompat.C4517b
        /* renamed from: f */
        public boolean mo54776f(CharSequence charSequence, int i) {
            if (this.f35141b.m54734d(charSequence, i) == 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.EmojiCompat.C4517b
        /* renamed from: g */
        public void mo54775g() {
            try {
                this.f35144a.f35122f.load(new C4516a());
            } catch (Throwable th2) {
                this.f35144a.m54784e(th2);
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.C4517b
        /* renamed from: h */
        public CharSequence mo54774h(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f35141b.m54726l(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.EmojiCompat.C4517b
        /* renamed from: i */
        public void mo54773i(EditorInfo editorInfo) {
            editorInfo.extras.putInt(EmojiCompat.EDITOR_INFO_METAVERSION_KEY, this.f35142c.m54758b());
            editorInfo.extras.putBoolean(EmojiCompat.EDITOR_INFO_REPLACE_ALL_KEY, this.f35144a.f35124h);
        }

        /* renamed from: j */
        public void m54782j(MetadataRepo metadataRepo) {
            if (metadataRepo == null) {
                this.f35144a.m54784e(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f35142c = metadataRepo;
            MetadataRepo metadataRepo2 = this.f35142c;
            SpanFactory spanFactory = this.f35144a.f35123g;
            GlyphChecker glyphChecker = this.f35144a.f35130n;
            EmojiCompat emojiCompat = this.f35144a;
            this.f35141b = new C4529b(metadataRepo2, spanFactory, glyphChecker, emojiCompat.f35125i, emojiCompat.f35126j, AbstractC11533jR.m29213a());
            this.f35144a.m54783f();
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompat$b */
    /* loaded from: classes2.dex */
    public static class C4517b {

        /* renamed from: a */
        public final EmojiCompat f35144a;

        public C4517b(EmojiCompat emojiCompat) {
            this.f35144a = emojiCompat;
        }

        /* renamed from: a */
        public abstract String mo54781a();

        /* renamed from: b */
        public abstract int mo54780b(CharSequence charSequence, int i);

        /* renamed from: c */
        public abstract int mo54779c(CharSequence charSequence, int i);

        /* renamed from: d */
        public abstract int mo54778d(CharSequence charSequence, int i);

        /* renamed from: e */
        public abstract boolean mo54777e(CharSequence charSequence);

        /* renamed from: f */
        public abstract boolean mo54776f(CharSequence charSequence, int i);

        /* renamed from: g */
        public abstract void mo54775g();

        /* renamed from: h */
        public abstract CharSequence mo54774h(CharSequence charSequence, int i, int i2, int i3, boolean z);

        /* renamed from: i */
        public abstract void mo54773i(EditorInfo editorInfo);
    }

    /* renamed from: androidx.emoji2.text.EmojiCompat$c */
    /* loaded from: classes2.dex */
    public static class RunnableC4518c implements Runnable {

        /* renamed from: a */
        public final List f35145a;

        /* renamed from: b */
        public final Throwable f35146b;

        /* renamed from: c */
        public final int f35147c;

        public RunnableC4518c(InitCallback initCallback, int i) {
            this(Arrays.asList((InitCallback) Preconditions.checkNotNull(initCallback, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f35145a.size();
            int i = 0;
            if (this.f35147c != 1) {
                while (i < size) {
                    ((InitCallback) this.f35145a.get(i)).onFailed(this.f35146b);
                    i++;
                }
                return;
            }
            while (i < size) {
                ((InitCallback) this.f35145a.get(i)).onInitialized();
                i++;
            }
        }

        public RunnableC4518c(Collection collection, int i) {
            this(collection, i, null);
        }

        public RunnableC4518c(Collection collection, int i, Throwable th2) {
            Preconditions.checkNotNull(collection, "initCallbacks cannot be null");
            this.f35145a = new ArrayList(collection);
            this.f35147c = i;
            this.f35146b = th2;
        }
    }

    public EmojiCompat(Config config) {
        this.f35124h = config.f35133c;
        this.f35125i = config.f35134d;
        this.f35126j = config.f35135e;
        this.f35127k = config.f35137g;
        this.f35128l = config.f35138h;
        this.f35122f = config.f35131a;
        this.f35129m = config.f35139i;
        this.f35130n = config.f35140j;
        ArraySet arraySet = new ArraySet();
        this.f35118b = arraySet;
        SpanFactory spanFactory = config.f35132b;
        this.f35123g = spanFactory == null ? new DefaultSpanFactory() : spanFactory;
        Set set = config.f35136f;
        if (set != null && !set.isEmpty()) {
            arraySet.addAll(config.f35136f);
        }
        this.f35121e = new C4515a(this);
        m54785d();
    }

    @NonNull
    public static EmojiCompat get() {
        EmojiCompat emojiCompat;
        boolean z;
        synchronized (f35113o) {
            emojiCompat = f35115q;
            if (emojiCompat != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return emojiCompat;
    }

    public static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, boolean z) {
        return C4529b.m54732f(inputConnection, editable, i, i2, z);
    }

    public static boolean handleOnKeyDown(@NonNull Editable editable, int i, @NonNull KeyEvent keyEvent) {
        return C4529b.m54731g(editable, i, keyEvent);
    }

    @Nullable
    public static EmojiCompat init(@NonNull Context context) {
        return init(context, null);
    }

    public static boolean isConfigured() {
        if (f35115q != null) {
            return true;
        }
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static EmojiCompat reset(@NonNull Config config) {
        EmojiCompat emojiCompat;
        synchronized (f35113o) {
            emojiCompat = new EmojiCompat(config);
            f35115q = emojiCompat;
        }
        return emojiCompat;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static void skipDefaultConfigurationLookup(boolean z) {
        synchronized (f35114p) {
            f35116r = z;
        }
    }

    /* renamed from: c */
    public final boolean m54786c() {
        if (getLoadState() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m54785d() {
        this.f35117a.writeLock().lock();
        try {
            if (this.f35129m == 0) {
                this.f35119c = 0;
            }
            this.f35117a.writeLock().unlock();
            if (getLoadState() == 0) {
                this.f35121e.mo54775g();
            }
        } catch (Throwable th2) {
            this.f35117a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: e */
    public void m54784e(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f35117a.writeLock().lock();
        try {
            this.f35119c = 2;
            arrayList.addAll(this.f35118b);
            this.f35118b.clear();
            this.f35117a.writeLock().unlock();
            this.f35120d.post(new RunnableC4518c(arrayList, this.f35119c, th2));
        } catch (Throwable th3) {
            this.f35117a.writeLock().unlock();
            throw th3;
        }
    }

    /* renamed from: f */
    public void m54783f() {
        ArrayList arrayList = new ArrayList();
        this.f35117a.writeLock().lock();
        try {
            this.f35119c = 1;
            arrayList.addAll(this.f35118b);
            this.f35118b.clear();
            this.f35117a.writeLock().unlock();
            this.f35120d.post(new RunnableC4518c(arrayList, this.f35119c));
        } catch (Throwable th2) {
            this.f35117a.writeLock().unlock();
            throw th2;
        }
    }

    @NonNull
    public String getAssetSignature() {
        Preconditions.checkState(m54786c(), "Not initialized yet");
        return this.f35121e.mo54781a();
    }

    public int getEmojiEnd(@NonNull CharSequence charSequence, @IntRange(from = 0) int i) {
        Preconditions.checkState(m54786c(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        return this.f35121e.mo54780b(charSequence, i);
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence, @IntRange(from = 0) int i) {
        Preconditions.checkState(m54786c(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.f35121e.mo54779c(charSequence, i);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getEmojiSpanIndicatorColor() {
        return this.f35128l;
    }

    public int getEmojiStart(@NonNull CharSequence charSequence, @IntRange(from = 0) int i) {
        Preconditions.checkState(m54786c(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        return this.f35121e.mo54778d(charSequence, i);
    }

    public int getLoadState() {
        this.f35117a.readLock().lock();
        try {
            return this.f35119c;
        } finally {
            this.f35117a.readLock().unlock();
        }
    }

    @Deprecated
    public boolean hasEmojiGlyph(@NonNull CharSequence charSequence) {
        Preconditions.checkState(m54786c(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.f35121e.mo54777e(charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isEmojiSpanIndicatorEnabled() {
        return this.f35127k;
    }

    public void load() {
        boolean z = true;
        if (this.f35129m != 1) {
            z = false;
        }
        Preconditions.checkState(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m54786c()) {
            return;
        }
        this.f35117a.writeLock().lock();
        try {
            if (this.f35119c == 0) {
                return;
            }
            this.f35119c = 0;
            this.f35117a.writeLock().unlock();
            this.f35121e.mo54775g();
        } finally {
            this.f35117a.writeLock().unlock();
        }
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence) {
        return process(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public void registerInitCallback(@NonNull InitCallback initCallback) {
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.f35117a.writeLock().lock();
        try {
            if (this.f35119c != 1 && this.f35119c != 2) {
                this.f35118b.add(initCallback);
                this.f35117a.writeLock().unlock();
            }
            this.f35120d.post(new RunnableC4518c(initCallback, this.f35119c));
            this.f35117a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f35117a.writeLock().unlock();
            throw th2;
        }
    }

    public void unregisterInitCallback(@NonNull InitCallback initCallback) {
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.f35117a.writeLock().lock();
        try {
            this.f35118b.remove(initCallback);
        } finally {
            this.f35117a.writeLock().unlock();
        }
    }

    public void updateEditorInfo(@NonNull EditorInfo editorInfo) {
        if (m54786c() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f35121e.mo54773i(editorInfo);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static EmojiCompat init(@NonNull Context context, @Nullable DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory defaultEmojiCompatConfigFactory) {
        EmojiCompat emojiCompat;
        if (f35116r) {
            return f35115q;
        }
        if (defaultEmojiCompatConfigFactory == null) {
            defaultEmojiCompatConfigFactory = new DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory(null);
        }
        Config create = defaultEmojiCompatConfigFactory.create(context);
        synchronized (f35114p) {
            try {
                if (!f35116r) {
                    if (create != null) {
                        init(create);
                    }
                    f35116r = true;
                }
                emojiCompat = f35115q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return emojiCompat;
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        return process(charSequence, i, i2, Integer.MAX_VALUE);
    }

    @Deprecated
    public boolean hasEmojiGlyph(@NonNull CharSequence charSequence, @IntRange(from = 0) int i) {
        Preconditions.checkState(m54786c(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.f35121e.mo54776f(charSequence, i);
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
        return process(charSequence, i, i2, i3, 0);
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, int i4) {
        boolean z;
        Preconditions.checkState(m54786c(), "Not initialized yet");
        Preconditions.checkArgumentNonnegative(i, "start cannot be negative");
        Preconditions.checkArgumentNonnegative(i2, "end cannot be negative");
        Preconditions.checkArgumentNonnegative(i3, "maxEmojiCount cannot be negative");
        Preconditions.checkArgument(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        Preconditions.checkArgument(i <= charSequence.length(), "start should be < than charSequence length");
        Preconditions.checkArgument(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.f35124h : false;
        } else {
            z = true;
        }
        return this.f35121e.mo54774h(charSequence, i, i2, i3, z);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static EmojiCompat reset(@Nullable EmojiCompat emojiCompat) {
        EmojiCompat emojiCompat2;
        synchronized (f35113o) {
            f35115q = emojiCompat;
            emojiCompat2 = f35115q;
        }
        return emojiCompat2;
    }

    @NonNull
    public static EmojiCompat init(@NonNull Config config) {
        EmojiCompat emojiCompat = f35115q;
        if (emojiCompat == null) {
            synchronized (f35113o) {
                try {
                    emojiCompat = f35115q;
                    if (emojiCompat == null) {
                        emojiCompat = new EmojiCompat(config);
                        f35115q = emojiCompat;
                    }
                } finally {
                }
            }
        }
        return emojiCompat;
    }
}
