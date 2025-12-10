package androidx.camera.core;

import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.apache.commons.cli.HelpFormatter;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CameraXConfig implements TargetConfig<CameraX> {

    /* renamed from: b */
    public static final Config.Option f10769b = Config.Option.create("camerax.core.appConfig.cameraFactoryProvider", CameraFactory.Provider.class);

    /* renamed from: c */
    public static final Config.Option f10770c = Config.Option.create("camerax.core.appConfig.deviceSurfaceManagerProvider", CameraDeviceSurfaceManager.Provider.class);

    /* renamed from: d */
    public static final Config.Option f10771d = Config.Option.create("camerax.core.appConfig.useCaseConfigFactoryProvider", UseCaseConfigFactory.Provider.class);

    /* renamed from: e */
    public static final Config.Option f10772e = Config.Option.create("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: f */
    public static final Config.Option f10773f = Config.Option.create("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: g */
    public static final Config.Option f10774g = Config.Option.create("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: h */
    public static final Config.Option f10775h = Config.Option.create("camerax.core.appConfig.availableCamerasLimiter", CameraSelector.class);

    /* renamed from: a */
    public final OptionsBundle f10776a;

    /* loaded from: classes.dex */
    public static final class Builder implements TargetConfig.Builder<CameraX, Builder> {

        /* renamed from: a */
        public final MutableOptionsBundle f10777a;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
            this(MutableOptionsBundle.create());
        }

        /* renamed from: a */
        private MutableConfig m63284a() {
            return this.f10777a;
        }

        @NonNull
        public static Builder fromConfig(@NonNull CameraXConfig cameraXConfig) {
            return new Builder(MutableOptionsBundle.from((Config) cameraXConfig));
        }

        @NonNull
        public CameraXConfig build() {
            return new CameraXConfig(OptionsBundle.from(this.f10777a));
        }

        @NonNull
        public Builder setAvailableCamerasLimiter(@NonNull CameraSelector cameraSelector) {
            m63284a().insertOption(CameraXConfig.f10775h, cameraSelector);
            return this;
        }

        @NonNull
        public Builder setCameraExecutor(@NonNull Executor executor) {
            m63284a().insertOption(CameraXConfig.f10772e, executor);
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setCameraFactoryProvider(@NonNull CameraFactory.Provider provider) {
            m63284a().insertOption(CameraXConfig.f10769b, provider);
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDeviceSurfaceManagerProvider(@NonNull CameraDeviceSurfaceManager.Provider provider) {
            m63284a().insertOption(CameraXConfig.f10770c, provider);
            return this;
        }

        @NonNull
        public Builder setMinimumLoggingLevel(@IntRange(from = 3, m64742to = 6) int i) {
            m63284a().insertOption(CameraXConfig.f10774g, Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder setSchedulerHandler(@NonNull Handler handler) {
            m63284a().insertOption(CameraXConfig.f10773f, handler);
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setUseCaseConfigFactoryProvider(@NonNull UseCaseConfigFactory.Provider provider) {
            m63284a().insertOption(CameraXConfig.f10771d, provider);
            return this;
        }

        public Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.f10777a = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(CameraX.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            setTargetClass(CameraX.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetClass(@NonNull Class<CameraX> cls) {
            m63284a().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (m63284a().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + HelpFormatter.DEFAULT_OPT_PREFIX + UUID.randomUUID());
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetName(@NonNull String str) {
            m63284a().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface Provider {
        @NonNull
        CameraXConfig getCameraXConfig();
    }

    public CameraXConfig(OptionsBundle optionsBundle) {
        this.f10776a = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ boolean containsOption(Config.Option option) {
        return AbstractC19252bs1.m51810a(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        AbstractC19252bs1.m51809b(this, str, optionMatcher);
    }

    @Nullable
    public CameraSelector getAvailableCamerasLimiter(@Nullable CameraSelector cameraSelector) {
        return (CameraSelector) this.f10776a.retrieveOption(f10775h, cameraSelector);
    }

    @Nullable
    public Executor getCameraExecutor(@Nullable Executor executor) {
        return (Executor) this.f10776a.retrieveOption(f10772e, executor);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraFactory.Provider getCameraFactoryProvider(@Nullable CameraFactory.Provider provider) {
        return (CameraFactory.Provider) this.f10776a.retrieveOption(f10769b, provider);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Config getConfig() {
        return this.f10776a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraDeviceSurfaceManager.Provider getDeviceSurfaceManagerProvider(@Nullable CameraDeviceSurfaceManager.Provider provider) {
        return (CameraDeviceSurfaceManager.Provider) this.f10776a.retrieveOption(f10770c, provider);
    }

    public int getMinimumLoggingLevel() {
        return ((Integer) this.f10776a.retrieveOption(f10774g, 3)).intValue();
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return AbstractC19252bs1.m51808c(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Set getPriorities(Config.Option option) {
        return AbstractC19252bs1.m51807d(this, option);
    }

    @Nullable
    public Handler getSchedulerHandler(@Nullable Handler handler) {
        return (Handler) this.f10776a.retrieveOption(f10773f, handler);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ Class<CameraX> getTargetClass() {
        return YQ1.m65362a(this);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ String getTargetName() {
        return YQ1.m65360c(this);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfigFactory.Provider getUseCaseConfigFactoryProvider(@Nullable UseCaseConfigFactory.Provider provider) {
        return (UseCaseConfigFactory.Provider) this.f10776a.retrieveOption(f10771d, provider);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Set listOptions() {
        return AbstractC19252bs1.m51806e(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOption(Config.Option option) {
        return AbstractC19252bs1.m51805f(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
        return AbstractC19252bs1.m51803h(this, option, optionPriority);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ Class<CameraX> getTargetClass(Class<CameraX> cls) {
        return YQ1.m65361b(this, cls);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ String getTargetName(String str) {
        return YQ1.m65359d(this, str);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return AbstractC19252bs1.m51804g(this, option, obj);
    }
}
