package p000;

import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Set;

/* renamed from: YT */
/* loaded from: classes.dex */
public class C1758YT implements CameraConfig {

    /* renamed from: b */
    public static final Config.Option f7769b = Config.Option.create("camerax.extensions.extensionMode", Integer.TYPE);

    /* renamed from: a */
    public final Config f7770a;

    /* renamed from: YT$a */
    /* loaded from: classes.dex */
    public static final class C1759a implements CameraConfig.Builder {

        /* renamed from: a */
        public final MutableOptionsBundle f7771a = MutableOptionsBundle.create();

        /* renamed from: a */
        public C1758YT m65349a() {
            return new C1758YT(this.f7771a);
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        /* renamed from: b */
        public C1759a setCompatibilityId(Identifier identifier) {
            this.f7771a.insertOption(CameraConfig.OPTION_COMPATIBILITY_ID, identifier);
            return this;
        }

        /* renamed from: c */
        public C1759a m65347c(int i) {
            this.f7771a.insertOption(C1758YT.f7769b, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        /* renamed from: d */
        public C1759a setSessionProcessor(SessionProcessor sessionProcessor) {
            this.f7771a.insertOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        /* renamed from: e */
        public C1759a setUseCaseCombinationRequiredRule(int i) {
            this.f7771a.insertOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        /* renamed from: f */
        public C1759a setUseCaseConfigFactory(UseCaseConfigFactory useCaseConfigFactory) {
            this.f7771a.insertOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, useCaseConfigFactory);
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        /* renamed from: g */
        public C1759a setZslDisabled(boolean z) {
            this.f7771a.insertOption(CameraConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z));
            return this;
        }
    }

    public C1758YT(Config config) {
        this.f7770a = config;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ boolean containsOption(Config.Option option) {
        return AbstractC19252bs1.m51810a(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        AbstractC19252bs1.m51809b(this, str, optionMatcher);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public Identifier getCompatibilityId() {
        return (Identifier) retrieveOption(CameraConfig.OPTION_COMPATIBILITY_ID);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public Config getConfig() {
        return this.f7770a;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return AbstractC19252bs1.m51808c(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Set getPriorities(Config.Option option) {
        return AbstractC19252bs1.m51807d(this, option);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public /* synthetic */ SessionProcessor getSessionProcessor() {
        return AbstractC11673kj.m28866a(this);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public /* synthetic */ int getUseCaseCombinationRequiredRule() {
        return AbstractC11673kj.m28864c(this);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public /* synthetic */ UseCaseConfigFactory getUseCaseConfigFactory() {
        return AbstractC11673kj.m28863d(this);
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

    @Override // androidx.camera.core.impl.CameraConfig
    public /* synthetic */ SessionProcessor getSessionProcessor(SessionProcessor sessionProcessor) {
        return AbstractC11673kj.m28865b(this, sessionProcessor);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return AbstractC19252bs1.m51804g(this, option, obj);
    }
}
