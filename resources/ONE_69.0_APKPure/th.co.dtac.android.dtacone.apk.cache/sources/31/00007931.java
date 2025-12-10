package p000;

import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Set;

/* renamed from: cU */
/* loaded from: classes.dex */
public class C5435cU implements CameraConfig {

    /* renamed from: b */
    public static final Config.Option f39434b = Config.Option.create("camerax.extensions.extensionMode", Integer.TYPE);

    /* renamed from: a */
    public final Config f39435a;

    /* renamed from: cU$a */
    /* loaded from: classes.dex */
    public static final class C5436a implements CameraConfig.Builder {

        /* renamed from: a */
        public final MutableOptionsBundle f39436a = MutableOptionsBundle.create();

        /* renamed from: a */
        public C5435cU m51688a() {
            return new C5435cU(this.f39436a);
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        /* renamed from: b */
        public C5436a setCompatibilityId(Identifier identifier) {
            this.f39436a.insertOption(CameraConfig.OPTION_COMPATIBILITY_ID, identifier);
            return this;
        }

        /* renamed from: c */
        public C5436a m51686c(int i) {
            this.f39436a.insertOption(C5435cU.f39434b, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        /* renamed from: d */
        public C5436a setSessionProcessor(SessionProcessor sessionProcessor) {
            this.f39436a.insertOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        /* renamed from: e */
        public C5436a setUseCaseCombinationRequiredRule(int i) {
            this.f39436a.insertOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        /* renamed from: f */
        public C5436a setUseCaseConfigFactory(UseCaseConfigFactory useCaseConfigFactory) {
            this.f39436a.insertOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, useCaseConfigFactory);
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        /* renamed from: g */
        public C5436a setZslDisabled(boolean z) {
            this.f39436a.insertOption(CameraConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z));
            return this;
        }
    }

    public C5435cU(Config config) {
        this.f39435a = config;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ boolean containsOption(Config.Option option) {
        return AbstractC18893Ys1.m65346a(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        AbstractC18893Ys1.m65345b(this, str, optionMatcher);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public Identifier getCompatibilityId() {
        return (Identifier) retrieveOption(CameraConfig.OPTION_COMPATIBILITY_ID);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public Config getConfig() {
        return this.f39435a;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return AbstractC18893Ys1.m65344c(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Set getPriorities(Config.Option option) {
        return AbstractC18893Ys1.m65343d(this, option);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public /* synthetic */ SessionProcessor getSessionProcessor() {
        return AbstractC11649kj.m29160a(this);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public /* synthetic */ int getUseCaseCombinationRequiredRule() {
        return AbstractC11649kj.m29158c(this);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public /* synthetic */ UseCaseConfigFactory getUseCaseConfigFactory() {
        return AbstractC11649kj.m29157d(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Set listOptions() {
        return AbstractC18893Ys1.m65342e(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOption(Config.Option option) {
        return AbstractC18893Ys1.m65341f(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
        return AbstractC18893Ys1.m65339h(this, option, optionPriority);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public /* synthetic */ SessionProcessor getSessionProcessor(SessionProcessor sessionProcessor) {
        return AbstractC11649kj.m29159b(this, sessionProcessor);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return AbstractC18893Ys1.m65340g(this, option, obj);
    }
}