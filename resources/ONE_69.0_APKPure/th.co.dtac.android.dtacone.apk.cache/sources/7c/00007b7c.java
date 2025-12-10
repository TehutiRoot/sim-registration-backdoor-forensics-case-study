package co.omise.android.config;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m29142d2 = {"Lco/omise/android/config/UiCustomizationBuilder;", "", "()V", "darkThemeConfig", "Lco/omise/android/config/ThemeConfig;", "defaultThemeConfig", "monoChromeThemeConfig", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lco/omise/android/config/UiCustomization;", "setDarkTheme", "themeConfig", "setDefaultTheme", "setMonoChromeTheme", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes.dex */
public final class UiCustomizationBuilder {
    @NotNull
    private ThemeConfig defaultThemeConfig = new ThemeConfig(null, null, null, null, 15, null);
    @NotNull
    private ThemeConfig darkThemeConfig = new ThemeConfig(null, null, null, null, 15, null);
    @NotNull
    private ThemeConfig monoChromeThemeConfig = new ThemeConfig(null, null, null, null, 15, null);

    @NotNull
    public final UiCustomization build() {
        com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization = new com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization();
        LabelCustomization labelCustomization = this.defaultThemeConfig.getLabelCustomization();
        if (labelCustomization != null) {
            uiCustomization.setLabelCustomization(labelCustomization.getLabelCustomization$sdk_productionRelease());
        }
        ToolbarCustomization toolbarCustomization = this.defaultThemeConfig.getToolbarCustomization();
        if (toolbarCustomization != null) {
            uiCustomization.setToolbarCustomization(toolbarCustomization.getToolbarCustomization$sdk_productionRelease());
        }
        TextBoxCustomization textBoxCustomization = this.defaultThemeConfig.getTextBoxCustomization();
        if (textBoxCustomization != null) {
            uiCustomization.setTextBoxCustomization(textBoxCustomization.getTextBoxCustomization$sdk_productionRelease());
        }
        for (Map.Entry<ButtonType, ButtonCustomization> entry : this.defaultThemeConfig.getButtonCustomizations().entrySet()) {
            uiCustomization.setButtonCustomization(entry.getValue().getButtonCustomization$sdk_productionRelease(), entry.getKey().getValue());
        }
        com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization2 = new com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization();
        LabelCustomization labelCustomization2 = this.darkThemeConfig.getLabelCustomization();
        if (labelCustomization2 != null) {
            uiCustomization2.setLabelCustomization(labelCustomization2.getLabelCustomization$sdk_productionRelease());
        }
        ToolbarCustomization toolbarCustomization2 = this.darkThemeConfig.getToolbarCustomization();
        if (toolbarCustomization2 != null) {
            uiCustomization2.setToolbarCustomization(toolbarCustomization2.getToolbarCustomization$sdk_productionRelease());
        }
        TextBoxCustomization textBoxCustomization2 = this.darkThemeConfig.getTextBoxCustomization();
        if (textBoxCustomization2 != null) {
            uiCustomization2.setTextBoxCustomization(textBoxCustomization2.getTextBoxCustomization$sdk_productionRelease());
        }
        for (Map.Entry<ButtonType, ButtonCustomization> entry2 : this.darkThemeConfig.getButtonCustomizations().entrySet()) {
            uiCustomization2.setButtonCustomization(entry2.getValue().getButtonCustomization$sdk_productionRelease(), entry2.getKey().getValue());
        }
        com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization3 = new com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization();
        LabelCustomization labelCustomization3 = this.monoChromeThemeConfig.getLabelCustomization();
        if (labelCustomization3 != null) {
            uiCustomization3.setLabelCustomization(labelCustomization3.getLabelCustomization$sdk_productionRelease());
        }
        ToolbarCustomization toolbarCustomization3 = this.monoChromeThemeConfig.getToolbarCustomization();
        if (toolbarCustomization3 != null) {
            uiCustomization3.setToolbarCustomization(toolbarCustomization3.getToolbarCustomization$sdk_productionRelease());
        }
        TextBoxCustomization textBoxCustomization3 = this.monoChromeThemeConfig.getTextBoxCustomization();
        if (textBoxCustomization3 != null) {
            uiCustomization3.setTextBoxCustomization(textBoxCustomization3.getTextBoxCustomization$sdk_productionRelease());
        }
        for (Map.Entry<ButtonType, ButtonCustomization> entry3 : this.monoChromeThemeConfig.getButtonCustomizations().entrySet()) {
            uiCustomization3.setButtonCustomization(entry3.getValue().getButtonCustomization$sdk_productionRelease(), entry3.getKey().getValue());
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UiCustomizationType.DEFAULT.getValue(), uiCustomization);
        hashMap.put(UiCustomizationType.DARK.getValue(), uiCustomization2);
        hashMap.put(UiCustomizationType.MONOCHROME.getValue(), uiCustomization3);
        return new UiCustomization(hashMap);
    }

    @NotNull
    public final UiCustomizationBuilder setDarkTheme(@NotNull ThemeConfig themeConfig) {
        Intrinsics.checkNotNullParameter(themeConfig, "themeConfig");
        this.darkThemeConfig = themeConfig;
        return this;
    }

    @NotNull
    public final UiCustomizationBuilder setDefaultTheme(@NotNull ThemeConfig themeConfig) {
        Intrinsics.checkNotNullParameter(themeConfig, "themeConfig");
        this.defaultThemeConfig = themeConfig;
        return this;
    }

    @NotNull
    public final UiCustomizationBuilder setMonoChromeTheme(@NotNull ThemeConfig themeConfig) {
        Intrinsics.checkNotNullParameter(themeConfig, "themeConfig");
        this.monoChromeThemeConfig = themeConfig;
        return this;
    }
}