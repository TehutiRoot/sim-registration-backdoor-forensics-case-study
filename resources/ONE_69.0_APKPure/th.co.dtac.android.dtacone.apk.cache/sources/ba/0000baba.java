package com.netcetera.threeds.sdk.api.info;

import java.util.Date;
import java.util.List;

/* loaded from: classes5.dex */
public interface SDKInfo {
    Date getLicenseExpiryDate();

    List<SchemeInfo> getSchemeConfigurations();
}