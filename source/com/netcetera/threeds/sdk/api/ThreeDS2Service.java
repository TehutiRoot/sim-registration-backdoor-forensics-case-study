package com.netcetera.threeds.sdk.api;

import android.content.Context;
import com.netcetera.threeds.sdk.api.configparameters.ConfigParameters;
import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException;
import com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException;
import com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException;
import com.netcetera.threeds.sdk.api.info.SDKInfo;
import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import com.netcetera.threeds.sdk.api.security.Warning;
import com.netcetera.threeds.sdk.api.transaction.Transaction;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface ThreeDS2Service {

    /* loaded from: classes5.dex */
    public interface InitializationCallback {
        void onCompleted();

        void onError(Throwable th2);
    }

    void cleanup(Context context) throws SDKNotInitializedException;

    Transaction createTransaction(String str, String str2) throws InvalidInputException, SDKNotInitializedException, SDKRuntimeException;

    SDKInfo getSDKInfo() throws SDKNotInitializedException, SDKRuntimeException;

    String getSDKVersion() throws SDKNotInitializedException, SDKRuntimeException;

    List<Warning> getWarnings() throws SDKNotInitializedException;

    @Deprecated
    void initialize(Context context, ConfigParameters configParameters, String str, UiCustomization uiCustomization) throws InvalidInputException, SDKAlreadyInitializedException, SDKRuntimeException;

    void initialize(Context context, ConfigParameters configParameters, String str, Map<UiCustomization.UiCustomizationType, UiCustomization> map) throws InvalidInputException, SDKAlreadyInitializedException, SDKRuntimeException;

    void initialize(Context context, ConfigParameters configParameters, String str, Map<UiCustomization.UiCustomizationType, UiCustomization> map, InitializationCallback initializationCallback);
}
