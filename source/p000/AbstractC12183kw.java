package p000;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.utils.ResolutionSelectorUtil;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import java.util.Objects;

/* renamed from: kw */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC12183kw {
    /* renamed from: a */
    public static boolean m26584a(Config.OptionPriority optionPriority, Config.OptionPriority optionPriority2) {
        Config.OptionPriority optionPriority3 = Config.OptionPriority.ALWAYS_OVERRIDE;
        if (optionPriority == optionPriority3 && optionPriority2 == optionPriority3) {
            return true;
        }
        Config.OptionPriority optionPriority4 = Config.OptionPriority.REQUIRED;
        if (optionPriority == optionPriority4 && optionPriority2 == optionPriority4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Config m26583b(Config config, Config config2) {
        MutableOptionsBundle create;
        if (config == null && config2 == null) {
            return OptionsBundle.emptyBundle();
        }
        if (config2 != null) {
            create = MutableOptionsBundle.from(config2);
        } else {
            create = MutableOptionsBundle.create();
        }
        if (config != null) {
            for (Config.Option<?> option : config.listOptions()) {
                m26582c(create, config2, config, option);
            }
        }
        return OptionsBundle.from(create);
    }

    /* renamed from: c */
    public static void m26582c(MutableOptionsBundle mutableOptionsBundle, Config config, Config config2, Config.Option option) {
        if (Objects.equals(option, ImageOutputConfig.OPTION_RESOLUTION_SELECTOR)) {
            mutableOptionsBundle.insertOption(option, config2.getOptionPriority(option), ResolutionSelectorUtil.overrideResolutionSelectors((ResolutionSelector) config.retrieveOption(option, null), (ResolutionSelector) config2.retrieveOption(option, null)));
            return;
        }
        mutableOptionsBundle.insertOption(option, config2.getOptionPriority(option), config2.retrieveOption(option));
    }
}
