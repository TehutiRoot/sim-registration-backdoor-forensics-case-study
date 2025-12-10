package com.netcetera.threeds.sdk.infrastructure;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import kotlin.text.Typography;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
abstract class getThreeDSRequestorAppURL {
    private static int ThreeDS2Service = 1;
    public static char[] get;
    private static final Logger valueOf;
    private static int values;

    static {
        values();
        valueOf = LoggerFactory.getLogger(getThreeDSRequestorAppURL.class);
        int i = values + 37;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    public static getTransactionStatus ThreeDS2ServiceInstance(getTransactionStatus gettransactionstatus, getTransactionStatus gettransactionstatus2) {
        showProgress values2;
        hideProgress valueOf2;
        hideProgress hideprogress;
        if (gettransactionstatus == null) {
            int i = ThreeDS2Service;
            int i2 = i + 93;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                if (gettransactionstatus2 != null) {
                    int i3 = i + 27;
                    values = i3 % 128;
                    if (i3 % 2 == 0) {
                        return gettransactionstatus2;
                    }
                    throw null;
                }
            } else {
                throw null;
            }
        }
        if (gettransactionstatus != null) {
            ThreeDS2Service = (values + 121) % 128;
            if (gettransactionstatus2 == null) {
                return gettransactionstatus;
            }
        }
        if (gettransactionstatus != null) {
            int i4 = ThreeDS2Service + 87;
            values = i4 % 128;
            if (i4 % 2 == 0) {
                if (gettransactionstatus2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(gettransactionstatus.ThreeDS2Service());
                    arrayList.addAll(gettransactionstatus2.ThreeDS2Service());
                    if (gettransactionstatus.values().ThreeDS2ServiceInstance()) {
                        ThreeDS2Service = (values + 55) % 128;
                        values2 = gettransactionstatus.values();
                    } else {
                        values2 = gettransactionstatus2.values();
                    }
                    showProgress showprogress = values2;
                    if (gettransactionstatus.valueOf().valueOf()) {
                        valueOf2 = gettransactionstatus.valueOf();
                    } else {
                        valueOf2 = gettransactionstatus2.valueOf();
                    }
                    hideProgress hideprogress2 = valueOf2;
                    if (gettransactionstatus.get().valueOf()) {
                        hideprogress = gettransactionstatus.get();
                    } else {
                        hideprogress = gettransactionstatus2.get();
                    }
                    getTransactionStatus gettransactionstatus3 = new getTransactionStatus((String) C9669om.ThreeDS2Service(gettransactionstatus.ThreeDS2ServiceInstance(), gettransactionstatus2.ThreeDS2ServiceInstance()), arrayList, showprogress, hideprogress2, hideprogress);
                    ThreeDS2Service = (values + 65) % 128;
                    return gettransactionstatus3;
                }
            } else {
                throw null;
            }
        }
        getTransactionStatus gettransactionstatus4 = new getTransactionStatus("", new ArrayList(), showProgress.get(), hideProgress.values(), hideProgress.values());
        values = (ThreeDS2Service + 43) % 128;
        return gettransactionstatus4;
    }

    public static void values() {
        get = new char[]{'*', '{', Typography.cent, 's', 'j', 148, 148, 150, 'q', 't', Typography.cent, 's', 'i', 144, 145, 142, 146, 145, Ascii.MAX};
    }
}
