package com.google.firebase.p015ml.vision.barcode.internal;

import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.firebase.ml.vision.barcode.internal.zzi */
/* loaded from: classes4.dex */
public interface zzi extends IInterface {
    IBarcodeDetector newBarcodeDetector(BarcodeDetectorOptionsParcel barcodeDetectorOptionsParcel) throws RemoteException;
}
