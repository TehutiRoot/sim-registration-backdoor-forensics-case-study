package co.omise.android.p009ui;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import co.omise.android.AuthorizingPaymentURLVerifier;
import co.omise.android.ThreeDS2ServiceWrapper;
import co.omise.android.api.Client;
import co.omise.android.config.UiCustomization;
import com.netcetera.threeds.sdk.ThreeDS2ServiceInstance;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28850d2 = {"Lco/omise/android/ui/AuthorizingPaymentViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "activity", "Landroid/app/Activity;", "urlVerifier", "Lco/omise/android/AuthorizingPaymentURLVerifier;", "uiCustomization", "Lco/omise/android/config/UiCustomization;", "passedThreeDSRequestorAppURL", "", "(Landroid/app/Activity;Lco/omise/android/AuthorizingPaymentURLVerifier;Lco/omise/android/config/UiCustomization;Ljava/lang/String;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.AuthorizingPaymentViewModelFactory */
/* loaded from: classes3.dex */
public final class AuthorizingPaymentViewModelFactory implements ViewModelProvider.Factory {
    @NotNull
    private final Activity activity;
    @NotNull
    private final String passedThreeDSRequestorAppURL;
    @NotNull
    private final UiCustomization uiCustomization;
    @NotNull
    private final AuthorizingPaymentURLVerifier urlVerifier;

    public AuthorizingPaymentViewModelFactory(@NotNull Activity activity, @NotNull AuthorizingPaymentURLVerifier urlVerifier, @NotNull UiCustomization uiCustomization, @NotNull String passedThreeDSRequestorAppURL) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(urlVerifier, "urlVerifier");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(passedThreeDSRequestorAppURL, "passedThreeDSRequestorAppURL");
        this.activity = activity;
        this.urlVerifier = urlVerifier;
        this.uiCustomization = uiCustomization;
        this.passedThreeDSRequestorAppURL = passedThreeDSRequestorAppURL;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return U22.m66144b(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Client client = new Client("");
        Application application = this.activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        ThreeDS2Service threeDS2Service = ThreeDS2ServiceInstance.get();
        Intrinsics.checkNotNullExpressionValue(threeDS2Service, "get()");
        return new AuthorizingPaymentViewModel(client, this.urlVerifier, new ThreeDS2ServiceWrapper(application, threeDS2Service, this.uiCustomization.getUiCustomizationMap$sdk_productionRelease()), this.passedThreeDSRequestorAppURL, null, 16, null);
    }
}
