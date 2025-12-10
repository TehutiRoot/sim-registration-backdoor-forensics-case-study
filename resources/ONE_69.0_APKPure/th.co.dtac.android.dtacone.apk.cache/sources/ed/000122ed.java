package th.p047co.dtac.android.dtacone.presenter.cli;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.WhatNewCollection;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/cli/CliPresenter;", "Lth/co/dtac/android/dtacone/presenter/IPresenter;", "callCli", "", "checkForceUpdate", "InteractorView", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.cli.CliPresenter */
/* loaded from: classes8.dex */
public interface CliPresenter extends IPresenter {

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/cli/CliPresenter$InteractorView;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "minBuildVersion", "", "whatNew", "Lth/co/dtac/android/dtacone/model/WhatNewCollection;", "minBuildVersionError", "onCallCliFail", "onCallCliSuccess", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.cli.CliPresenter$InteractorView */
    /* loaded from: classes8.dex */
    public interface InteractorView extends IPresenter.IView {
        void minBuildVersion(@NotNull WhatNewCollection whatNewCollection);

        void minBuildVersionError();

        void onCallCliFail();

        void onCallCliSuccess(@NotNull String str);
    }

    void callCli();

    void checkForceUpdate();
}