package co.omise.android.config;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m29142d2 = {"Lco/omise/android/config/ToolbarCustomizationBuilder;", "Lco/omise/android/config/CustomizationBuilder;", "Lco/omise/android/config/ToolbarCustomization;", "()V", "backgroundColor", "", "buttonText", "headerText", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "textColor", "textFontName", "textFontSize", "", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ToolbarCustomizationBuilder extends CustomizationBuilder<ToolbarCustomization> {
    @Nullable
    private String backgroundColor;
    @Nullable
    private String buttonText;
    @Nullable
    private String headerText;

    @NotNull
    public final ToolbarCustomizationBuilder backgroundColor(@NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.backgroundColor = backgroundColor;
        return this;
    }

    @NotNull
    public final ToolbarCustomizationBuilder buttonText(@NotNull String buttonText) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.buttonText = buttonText;
        return this;
    }

    @NotNull
    public final ToolbarCustomizationBuilder headerText(@NotNull String headerText) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        this.headerText = headerText;
        return this;
    }

    @NotNull
    public final ToolbarCustomizationBuilder textColor(@NotNull String textColor) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        setTextColor(textColor);
        return this;
    }

    @NotNull
    public final ToolbarCustomizationBuilder textFontName(@NotNull String textFontName) {
        Intrinsics.checkNotNullParameter(textFontName, "textFontName");
        setTextFontName(textFontName);
        return this;
    }

    @NotNull
    public final ToolbarCustomizationBuilder textFontSize(int i) {
        setTextFontSize(Integer.valueOf(i));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // co.omise.android.config.CustomizationBuilder
    @NotNull
    public ToolbarCustomization build() {
        com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization = new com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization();
        String str = this.headerText;
        if (str != null) {
            toolbarCustomization.setHeaderText(str);
        }
        String str2 = this.buttonText;
        if (str2 != null) {
            toolbarCustomization.setButtonText(str2);
        }
        String str3 = this.backgroundColor;
        if (str3 != null) {
            toolbarCustomization.setBackgroundColor(str3);
        }
        String textColor = getTextColor();
        if (textColor != null) {
            toolbarCustomization.setTextColor(textColor);
        }
        Integer textFontSize = getTextFontSize();
        if (textFontSize != null) {
            toolbarCustomization.setTextFontSize(textFontSize.intValue());
        }
        String textFontName = getTextFontName();
        if (textFontName != null) {
            toolbarCustomization.setTextFontName(textFontName);
        }
        return new ToolbarCustomization(toolbarCustomization);
    }
}