package co.omise.android.config;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\r"}, m29142d2 = {"Lco/omise/android/config/ButtonCustomizationBuilder;", "Lco/omise/android/config/CustomizationBuilder;", "Lco/omise/android/config/ButtonCustomization;", "()V", "backgroundColor", "", "cornerRadius", "", "Ljava/lang/Integer;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "textColor", "textFontName", "textFontSize", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ButtonCustomizationBuilder extends CustomizationBuilder<ButtonCustomization> {
    @Nullable
    private String backgroundColor;
    @Nullable
    private Integer cornerRadius;

    @NotNull
    public final ButtonCustomizationBuilder backgroundColor(@NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.backgroundColor = backgroundColor;
        return this;
    }

    @NotNull
    public final ButtonCustomizationBuilder cornerRadius(int i) {
        this.cornerRadius = Integer.valueOf(i);
        return this;
    }

    @NotNull
    public final ButtonCustomizationBuilder textColor(@NotNull String textColor) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        setTextColor(textColor);
        return this;
    }

    @NotNull
    public final ButtonCustomizationBuilder textFontName(@NotNull String textFontName) {
        Intrinsics.checkNotNullParameter(textFontName, "textFontName");
        setTextFontName(textFontName);
        return this;
    }

    @NotNull
    public final ButtonCustomizationBuilder textFontSize(int i) {
        setTextFontSize(Integer.valueOf(i));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // co.omise.android.config.CustomizationBuilder
    @NotNull
    public ButtonCustomization build() {
        com.netcetera.threeds.sdk.api.p018ui.logic.ButtonCustomization buttonCustomization = new com.netcetera.threeds.sdk.api.p018ui.logic.ButtonCustomization();
        Integer num = this.cornerRadius;
        if (num != null) {
            buttonCustomization.setCornerRadius(num.intValue());
        }
        String str = this.backgroundColor;
        if (str != null) {
            buttonCustomization.setBackgroundColor(str);
        }
        String textColor = getTextColor();
        if (textColor != null) {
            buttonCustomization.setTextColor(textColor);
        }
        Integer textFontSize = getTextFontSize();
        if (textFontSize != null) {
            buttonCustomization.setTextFontSize(textFontSize.intValue());
        }
        String textFontName = getTextFontName();
        if (textFontName != null) {
            buttonCustomization.setTextFontName(textFontName);
        }
        return new ButtonCustomization(buttonCustomization);
    }
}